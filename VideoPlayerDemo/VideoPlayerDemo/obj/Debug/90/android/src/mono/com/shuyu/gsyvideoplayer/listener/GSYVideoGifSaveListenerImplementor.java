package mono.com.shuyu.gsyvideoplayer.listener;


public class GSYVideoGifSaveListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.listener.GSYVideoGifSaveListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_process:(II)V:GetProcess_IIHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoGifSaveListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_result:(ZLjava/io/File;)V:GetResult_ZLjava_io_File_Handler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoGifSaveListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoGifSaveListenerImplementor, Ijkplayer.Droid.UI", GSYVideoGifSaveListenerImplementor.class, __md_methods);
	}


	public GSYVideoGifSaveListenerImplementor ()
	{
		super ();
		if (getClass () == GSYVideoGifSaveListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoGifSaveListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void process (int p0, int p1)
	{
		n_process (p0, p1);
	}

	private native void n_process (int p0, int p1);


	public void result (boolean p0, java.io.File p1)
	{
		n_result (p0, p1);
	}

	private native void n_result (boolean p0, java.io.File p1);

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
