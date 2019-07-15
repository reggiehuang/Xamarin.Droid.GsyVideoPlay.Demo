package mono.com.shuyu.gsyvideoplayer.render.view.listener;


public class IGSYSurfaceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSurfaceAvailable:(Landroid/view/Surface;)V:GetOnSurfaceAvailable_Landroid_view_Surface_Handler:Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYSurfaceListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onSurfaceDestroyed:(Landroid/view/Surface;)Z:GetOnSurfaceDestroyed_Landroid_view_Surface_Handler:Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYSurfaceListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onSurfaceSizeChanged:(Landroid/view/Surface;II)V:GetOnSurfaceSizeChanged_Landroid_view_Surface_IIHandler:Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYSurfaceListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onSurfaceUpdated:(Landroid/view/Surface;)V:GetOnSurfaceUpdated_Landroid_view_Surface_Handler:Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYSurfaceListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYSurfaceListenerImplementor, Ijkplayer.Droid.UI", IGSYSurfaceListenerImplementor.class, __md_methods);
	}


	public IGSYSurfaceListenerImplementor ()
	{
		super ();
		if (getClass () == IGSYSurfaceListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYSurfaceListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void onSurfaceAvailable (android.view.Surface p0)
	{
		n_onSurfaceAvailable (p0);
	}

	private native void n_onSurfaceAvailable (android.view.Surface p0);


	public boolean onSurfaceDestroyed (android.view.Surface p0)
	{
		return n_onSurfaceDestroyed (p0);
	}

	private native boolean n_onSurfaceDestroyed (android.view.Surface p0);


	public void onSurfaceSizeChanged (android.view.Surface p0, int p1, int p2)
	{
		n_onSurfaceSizeChanged (p0, p1, p2);
	}

	private native void n_onSurfaceSizeChanged (android.view.Surface p0, int p1, int p2);


	public void onSurfaceUpdated (android.view.Surface p0)
	{
		n_onSurfaceUpdated (p0);
	}

	private native void n_onSurfaceUpdated (android.view.Surface p0);

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
