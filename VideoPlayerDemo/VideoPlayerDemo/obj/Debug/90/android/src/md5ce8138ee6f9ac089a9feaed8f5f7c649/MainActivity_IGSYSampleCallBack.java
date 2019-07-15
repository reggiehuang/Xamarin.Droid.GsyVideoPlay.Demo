package md5ce8138ee6f9ac089a9feaed8f5f7c649;


public class MainActivity_IGSYSampleCallBack
	extends com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepared:(Ljava/lang/String;[Ljava/lang/Object;)V:GetOnPrepared_Ljava_lang_String_arrayLjava_lang_Object_Handler\n" +
			"n_onEnterFullscreen:(Ljava/lang/String;[Ljava/lang/Object;)V:GetOnEnterFullscreen_Ljava_lang_String_arrayLjava_lang_Object_Handler\n" +
			"n_onAutoComplete:(Ljava/lang/String;[Ljava/lang/Object;)V:GetOnAutoComplete_Ljava_lang_String_arrayLjava_lang_Object_Handler\n" +
			"n_onClickStartError:(Ljava/lang/String;[Ljava/lang/Object;)V:GetOnClickStartError_Ljava_lang_String_arrayLjava_lang_Object_Handler\n" +
			"n_onQuitFullscreen:(Ljava/lang/String;[Ljava/lang/Object;)V:GetOnQuitFullscreen_Ljava_lang_String_arrayLjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("VideoPlayerDemo.MainActivity+IGSYSampleCallBack, VideoPlayerDemo", MainActivity_IGSYSampleCallBack.class, __md_methods);
	}


	public MainActivity_IGSYSampleCallBack ()
	{
		super ();
		if (getClass () == MainActivity_IGSYSampleCallBack.class)
			mono.android.TypeManager.Activate ("VideoPlayerDemo.MainActivity+IGSYSampleCallBack, VideoPlayerDemo", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_IGSYSampleCallBack (com.shuyu.gsyvideoplayer.utils.OrientationUtils p0, com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer p1)
	{
		super ();
		if (getClass () == MainActivity_IGSYSampleCallBack.class)
			mono.android.TypeManager.Activate ("VideoPlayerDemo.MainActivity+IGSYSampleCallBack, VideoPlayerDemo", "Com.Shuyu.Gsyvideoplayer.Utils.OrientationUtils, Ijkplayer.Droid.UI:Com.Shuyu.Gsyvideoplayer.Video.StandardGSYVideoPlayer, Ijkplayer.Droid.UI", this, new java.lang.Object[] { p0, p1 });
	}


	public void onPrepared (java.lang.String p0, java.lang.Object[] p1)
	{
		n_onPrepared (p0, p1);
	}

	private native void n_onPrepared (java.lang.String p0, java.lang.Object[] p1);


	public void onEnterFullscreen (java.lang.String p0, java.lang.Object[] p1)
	{
		n_onEnterFullscreen (p0, p1);
	}

	private native void n_onEnterFullscreen (java.lang.String p0, java.lang.Object[] p1);


	public void onAutoComplete (java.lang.String p0, java.lang.Object[] p1)
	{
		n_onAutoComplete (p0, p1);
	}

	private native void n_onAutoComplete (java.lang.String p0, java.lang.Object[] p1);


	public void onClickStartError (java.lang.String p0, java.lang.Object[] p1)
	{
		n_onClickStartError (p0, p1);
	}

	private native void n_onClickStartError (java.lang.String p0, java.lang.Object[] p1);


	public void onQuitFullscreen (java.lang.String p0, java.lang.Object[] p1)
	{
		n_onQuitFullscreen (p0, p1);
	}

	private native void n_onQuitFullscreen (java.lang.String p0, java.lang.Object[] p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
