package mono.com.shuyu.gsyvideoplayer.listener;


public class GSYVideoShotListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.listener.GSYVideoShotListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getBitmap:(Landroid/graphics/Bitmap;)V:GetGetBitmap_Landroid_graphics_Bitmap_Handler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoShotListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoShotListenerImplementor, Ijkplayer.Droid.UI", GSYVideoShotListenerImplementor.class, __md_methods);
	}


	public GSYVideoShotListenerImplementor ()
	{
		super ();
		if (getClass () == GSYVideoShotListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoShotListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void getBitmap (android.graphics.Bitmap p0)
	{
		n_getBitmap (p0);
	}

	private native void n_getBitmap (android.graphics.Bitmap p0);

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
