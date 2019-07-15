package mono.com.shuyu.gsyvideoplayer.listener;


public class GSYMediaPlayerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAutoCompletion:()V:GetOnAutoCompletionHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onBackFullscreen:()V:GetOnBackFullscreenHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onBufferingUpdate:(I)V:GetOnBufferingUpdate_IHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onCompletion:()V:GetOnCompletionHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onError:(II)V:GetOnError_IIHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onInfo:(II)V:GetOnInfo_IIHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onPrepared:()V:GetOnPreparedHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onSeekComplete:()V:GetOnSeekCompleteHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onVideoPause:()V:GetOnVideoPauseHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onVideoResume:()V:GetOnVideoResumeHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onVideoResume:(Z)V:GetOnVideoResumeBoolean_ZHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onVideoSizeChanged:()V:GetOnVideoSizeChangedHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerImplementor, Ijkplayer.Droid.UI", GSYMediaPlayerListenerImplementor.class, __md_methods);
	}


	public GSYMediaPlayerListenerImplementor ()
	{
		super ();
		if (getClass () == GSYMediaPlayerListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYMediaPlayerListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void onAutoCompletion ()
	{
		n_onAutoCompletion ();
	}

	private native void n_onAutoCompletion ();


	public void onBackFullscreen ()
	{
		n_onBackFullscreen ();
	}

	private native void n_onBackFullscreen ();


	public void onBufferingUpdate (int p0)
	{
		n_onBufferingUpdate (p0);
	}

	private native void n_onBufferingUpdate (int p0);


	public void onCompletion ()
	{
		n_onCompletion ();
	}

	private native void n_onCompletion ();


	public void onError (int p0, int p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (int p0, int p1);


	public void onInfo (int p0, int p1)
	{
		n_onInfo (p0, p1);
	}

	private native void n_onInfo (int p0, int p1);


	public void onPrepared ()
	{
		n_onPrepared ();
	}

	private native void n_onPrepared ();


	public void onSeekComplete ()
	{
		n_onSeekComplete ();
	}

	private native void n_onSeekComplete ();


	public void onVideoPause ()
	{
		n_onVideoPause ();
	}

	private native void n_onVideoPause ();


	public void onVideoResume ()
	{
		n_onVideoResume ();
	}

	private native void n_onVideoResume ();


	public void onVideoResume (boolean p0)
	{
		n_onVideoResume (p0);
	}

	private native void n_onVideoResume (boolean p0);


	public void onVideoSizeChanged ()
	{
		n_onVideoSizeChanged ();
	}

	private native void n_onVideoSizeChanged ();

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
