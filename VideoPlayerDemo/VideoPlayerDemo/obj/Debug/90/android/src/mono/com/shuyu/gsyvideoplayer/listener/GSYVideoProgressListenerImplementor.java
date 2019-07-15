package mono.com.shuyu.gsyvideoplayer.listener;


public class GSYVideoProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.listener.GSYVideoProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgress:(IIII)V:GetOnProgress_IIIIHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoProgressListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoProgressListenerImplementor, Ijkplayer.Droid.UI", GSYVideoProgressListenerImplementor.class, __md_methods);
	}


	public GSYVideoProgressListenerImplementor ()
	{
		super ();
		if (getClass () == GSYVideoProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoProgressListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void onProgress (int p0, int p1, int p2, int p3)
	{
		n_onProgress (p0, p1, p2, p3);
	}

	private native void n_onProgress (int p0, int p1, int p2, int p3);

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
