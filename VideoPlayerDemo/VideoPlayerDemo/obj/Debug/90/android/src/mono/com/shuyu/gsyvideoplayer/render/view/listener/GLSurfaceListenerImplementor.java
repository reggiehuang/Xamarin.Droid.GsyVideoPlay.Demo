package mono.com.shuyu.gsyvideoplayer.render.view.listener;


public class GLSurfaceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.render.view.listener.GLSurfaceListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSurfaceAvailable:(Landroid/view/Surface;)V:GetOnSurfaceAvailable_Landroid_view_Surface_Handler:Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGLSurfaceListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGLSurfaceListenerImplementor, Ijkplayer.Droid.UI", GLSurfaceListenerImplementor.class, __md_methods);
	}


	public GLSurfaceListenerImplementor ()
	{
		super ();
		if (getClass () == GLSurfaceListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGLSurfaceListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void onSurfaceAvailable (android.view.Surface p0)
	{
		n_onSurfaceAvailable (p0);
	}

	private native void n_onSurfaceAvailable (android.view.Surface p0);

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
