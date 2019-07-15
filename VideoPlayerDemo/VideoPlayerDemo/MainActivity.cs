 using System;
using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Content.Res;
using Android.Graphics;
using Android.OS;
using Android.Runtime;
using Android.Support.Design.Widget;
using Android.Support.V7.App;
using Android.Views;
using Android.Widget;
using Com.Shuyu.Gsyvideoplayer.Builder;
using Com.Shuyu.Gsyvideoplayer.Listener;
using Com.Shuyu.Gsyvideoplayer.Utils;
using Com.Shuyu.Gsyvideoplayer.Video;
using Com.Shuyu.Gsyvideoplayer.Video.Base;
using VideoPlayerDemo.Listener;

using Toolbar = Android.Support.V7.Widget.Toolbar;
namespace VideoPlayerDemo
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme.NoActionBar", ConfigurationChanges = ConfigChanges.Orientation | ConfigChanges.KeyboardHidden | ConfigChanges.ScreenSize)] //, MainLauncher = true
    public class MainActivity : AppCompatActivity, View.IOnClickListener, ILockClickListener, IGSYVideoProgressListener
    {

        private static bool isPlay;
        private static bool isPause;
        private static bool isSamll;

        private  OrientationUtils orientationUtils;
        private  StandardGSYVideoPlayer detailPlayer;
        private  AppBarLayout appBar;

        private static  FloatingActionButton fab;
        private static CoordinatorLayout root;
     

        private IAppBarStateChangeListener appBarStateChangeListener;

        private CollapsingToolbarLayout toolBarLayout;

        private static AppBarStateChangeListener.State curState;
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            try
            {
                SetContentView(Resource.Layout.activity_main);

                InitView();


                string url = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";

                //增加封面
                ImageView imageView = new ImageView(this);
                imageView.SetScaleType(ImageView.ScaleType.CenterCrop);

                ResolveNormalVideoUI();

                //外部辅助的旋转，帮助全屏
                orientationUtils = new OrientationUtils(this, detailPlayer);
                //初始化不打开外部的旋转
                orientationUtils.Enable = false;//.setEnable(false);


                appBarStateChangeListener = new IAppBarStateChangeListener(orientationUtils, detailPlayer,this);
                GSYVideoOptionBuilder gsyVideoOption = new GSYVideoOptionBuilder();
                gsyVideoOption.SetThumbImageView(imageView)
                  .SetIsTouchWiget(true)
                  .SetRotateViewAuto(false)
                  .SetLockLand(false)
                  .SetShowFullAnimation(false)
                  .SetNeedLockFull(true)
                  .SetSeekRatio(1)
                  .SetUrl(url)
                  .SetCacheWithPlay(false)
                  .SetVideoTitle("测试视频")
                  .SetVideoAllCallBack(new IGSYSampleCallBack(orientationUtils, detailPlayer))
                  .SetLockClickListener(this)
                  .SetGSYVideoProgressListener(this)
                  .Build(detailPlayer);

                detailPlayer.FullscreenButton.Click += (sender, e) =>
                {
                    try
                    {
                        //直接横屏
                        orientationUtils.ResolveByClick();

                        //第一个true是否需要隐藏actionbar，第二个true是否需要隐藏statusbar
                        detailPlayer.StartWindowFullscreen(this, true, true);
                    }
                    catch (Exception ex)
                    {
                        Debuger.PrintfLog(" Fullscreen-- " + ex.ToString());
                    }

                };
                //detailPlayer..setLinkScroll(true);
            }
            catch (Exception e)
            {
                Debuger.PrintfLog(" OnCreate-- " + e.ToString());
            }
      
        }


        private void InitView()
        {
            Toolbar toolbar = (Toolbar)FindViewById(Resource.Id.toolbar);
            detailPlayer = FindViewById<StandardGSYVideoPlayer>(Resource.Id.detail_player);
            root = (CoordinatorLayout)FindViewById(Resource.Id.root_layout);

            SetSupportActionBar(toolbar);
            toolBarLayout = (CollapsingToolbarLayout)FindViewById(Resource.Id.toolbar_layout);
            toolBarLayout.Title = "";//.setTitle(getTitle());

            fab = (FloatingActionButton)FindViewById(Resource.Id.fab);
            fab.SetOnClickListener(this);
            appBar = (AppBarLayout)FindViewById(Resource.Id.app_bar);
            appBar.AddOnOffsetChangedListener(appBarStateChangeListener);
        }


        public void OnClick(View v)
        {
            detailPlayer.StartPlayLogic();
            root.RemoveView(fab);
        }

        public override void OnBackPressed()
        {

            if (orientationUtils != null)
            {
                orientationUtils.BackToProtVideo();
            }

            //if (GSYVideoManager.backFromWindowFull(this))
            //{
            //    return;
            //}

            base.OnBackPressed();
        }



        private void ResolveNormalVideoUI()
        {
            //增加title
            detailPlayer.TitleTextView.Visibility = ViewStates.Gone;//.getTitleTextView().setVisibility(View.GONE);
            detailPlayer.BackButton.Visibility = ViewStates.Gone;//.getBackButton().setVisibility(View.GONE);
        }

        private GSYVideoPlayer GetCurPlay()
        {
            if (detailPlayer.FullWindowPlayer != null)
            {
                return detailPlayer.FullWindowPlayer;// getFullWindowPlayer();
            }
            return detailPlayer;
        }

        protected override void OnPause()
        {
            GetCurPlay().OnVideoPause();
            base.OnPause();
            isPause = true;
        }

        protected override void OnResume()
        {
            GetCurPlay().OnVideoResume();
            appBar.AddOnOffsetChangedListener(appBarStateChangeListener);
            base.OnResume();
            isPause = false;
        }


        protected override void OnDestroy()
        {
            base.OnDestroy();
            if (isPlay)
            {
                GetCurPlay().Release();
            }
            if (orientationUtils != null)
                orientationUtils.ReleaseListener();
        }


        public override void OnConfigurationChanged(Configuration newConfig)
        {
            base.OnConfigurationChanged(newConfig);

            try
            {
                //如果旋转了就全屏
                if (isPlay && !isPause)
                {
                    detailPlayer.OnConfigurationChanged(this, newConfig, orientationUtils, true, true);
                }
            }
            catch (Exception e)
            {
                Debuger.PrintfLog(" OnConfigurationChanged-- " + e.ToString());
            }
           
        }

        public void OnClick(View view, bool @lock)
        {

            if (orientationUtils != null)
            {
                //配合下方的onConfigurationChanged
                orientationUtils.Enable = !@lock;//.setEnable(!lock) ;
            }
        }

        public void OnProgress(int progress, int secProgress, int currentPosition, int duration)
        {
            Debuger.PrintfLog(" progress " + progress + " secProgress " + secProgress + " currentPosition " + currentPosition + " duration " + duration);
        }

        public class IGSYSampleCallBack : GSYSampleCallBack
        {
            private OrientationUtils _orientationUtils;
            private StandardGSYVideoPlayer _detailPlayer;
            public IGSYSampleCallBack(OrientationUtils Utils, StandardGSYVideoPlayer player)
            {
                _orientationUtils = Utils;
                _detailPlayer = player;
            }
            public override void OnPrepared(string url, Java.Lang.Object[] objects)
            {
                Debuger.PrintfError("***** onPrepared **** " + objects[0]);
                Debuger.PrintfError("***** onPrepared **** " + objects[1]);
                base.OnPrepared(url, objects);
                //开始播放了才能旋转和全屏
                _orientationUtils.Enable = true;//.setEnable(true);
                isPlay = true;
                root.RemoveView(fab);
            }

            public override void OnEnterFullscreen(string url, Java.Lang.Object[] objects)
            {
                base.OnEnterFullscreen(url, objects);
                Debuger.PrintfError("***** onEnterFullscreen **** " + objects[0]);//title
                Debuger.PrintfError("***** onEnterFullscreen **** " + objects[1]);//当前全屏player
            }

            public override void OnAutoComplete(string url, Java.Lang.Object[] objects)
            {
                base.OnAutoComplete(url, objects);
            }

            public override void OnClickStartError(string url, Java.Lang.Object[] objects)
            {
                base.OnClickStartError(url, objects);
            }

            public override void OnQuitFullscreen(string url, Java.Lang.Object[] objects)
            {
                base.OnQuitFullscreen(url, objects);
                Debuger.PrintfError("***** onQuitFullscreen **** " + objects[0]);//title
                Debuger.PrintfError("***** onQuitFullscreen **** " + objects[1]);//当前非全屏player
                if (_orientationUtils != null)
                {
                    _orientationUtils.BackToProtVideo();
                }
            }
        }

        public class IAppBarStateChangeListener : AppBarStateChangeListener
        {
            private OrientationUtils _orientationUtils;
            private StandardGSYVideoPlayer _detailPlayer;

            private Context _context;
            public IAppBarStateChangeListener(OrientationUtils Utils, StandardGSYVideoPlayer player, Context ct)
            {
                _orientationUtils = Utils;
                _detailPlayer = player;
                _context = ct;
            }

            public override void OnStateChanged(AppBarLayout appBarLayout, State state)
            {
                if (state == AppBarStateChangeListener.State.EXPANDED)
                {
                    //展开状态
                    curState = state;
                    //toolBarLayout.setTitle("");
                }
                else if (state == AppBarStateChangeListener.State.COLLAPSED)
                {
                    //折叠状态
                    //如果是小窗口就不需要处理
                    // toolBarLayout.setTitle("Title");
                    if (!isSamll && isPlay)
                    {
                        isSamll = true;
                        int size = CommonUtil.Dip2px(_context, 150);
                        _detailPlayer.ShowSmallVideo(new Point(size, size), true, true);
                        _orientationUtils.Enable = false;//.etEnable(false);
                    }
                    curState = state;
                }
                else
                {
                    if (curState == AppBarStateChangeListener.State.COLLAPSED)
                    {
                        //由折叠变为中间状态
                        //toolBarLayout.setTitle("");
                        if (isSamll)
                        {
                            isSamll = false;
                            _orientationUtils.Enable = false;//.setEnable(true);
                                                            //必须
                                                            //    detailPlayer.postDelayed(new Runnable() {
                                                            //    @Override
                                                            //    public void run()
                                                            //    {
                                                            //        detailPlayer.hideSmallVideo();
                                                            //    }
                                                            //}, 50);
                        }
                    }
                    curState = state;
                    //中间状态
                }
            }
        }
    }
}

