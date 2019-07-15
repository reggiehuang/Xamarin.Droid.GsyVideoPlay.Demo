using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Content.Res;
using Android.OS;
using Android.Runtime;
using Android.Support.V7.App;
using Android.Views;
using Android.Widget;
using Com.Shuyu.Gsyvideoplayer.Utils;

namespace VideoPlayerDemo
{
    [Activity(Label = "VideoActivity", ConfigurationChanges = ConfigChanges.Orientation | ConfigChanges.KeyboardHidden | ConfigChanges.ScreenSize, MainLauncher = true)]
    public class VideoActivity : AppCompatActivity
    {
        private bool isPlay;
        private bool isPause;
        Com.Shuyu.Gsyvideoplayer.Utils.OrientationUtils orientationUtils;
        Com.Shuyu.Gsyvideoplayer.Video.StandardGSYVideoPlayer player;
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.LinearVideoLayout);
            player = FindViewById<Com.Shuyu.Gsyvideoplayer.Video.StandardGSYVideoPlayer>(Resource.Id.video_player);
            orientationUtils = new Com.Shuyu.Gsyvideoplayer.Utils.OrientationUtils(this, player);

            player.FullscreenButton.Click += (sender, e) =>
            {

                try
                {
                    //直接横屏
                    orientationUtils.ResolveByClick();

                    //第一个true是否需要隐藏actionbar，第二个true是否需要隐藏statusbar
                    player.StartWindowFullscreen(this, true, true);
                }
                catch (Exception ex)
                {
                    Debuger.PrintfLog(" Fullscreen-- " + ex.ToString());
                }
            };

            string url = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";

            ImageView imageView = new ImageView(this);
            imageView.SetScaleType(ImageView.ScaleType.CenterCrop);
            imageView.SetImageURI(Android.Net.Uri.Parse(" "));
            player.ThumbImageView = imageView;
            player.SetUp(url, true, "测试");
            player.StartPlayLogic();
            isPlay = true;
            isPause = false;
        }

        public override void OnConfigurationChanged(Configuration newConfig)
        {
            base.OnConfigurationChanged(newConfig);
            try
            {
                //如果旋转了就全屏
                if (isPlay && !isPause)
                {
                    player.OnConfigurationChanged(this, newConfig, orientationUtils, true, true);
                }
            }
            catch (Exception e)
            {
                Debuger.PrintfLog(" OnConfigurationChanged-- " + e.ToString());
            }
        }
    }
}