package mono.com.shuyu.gsyvideoplayer.render.view.listener;


public class GSYVideoGLRenderErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.render.view.listener.GSYVideoGLRenderErrorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Lcom/shuyu/gsyvideoplayer/render/glrender/GSYVideoGLViewBaseRender;Ljava/lang/String;IZ)V:GetOnError_Lcom_shuyu_gsyvideoplayer_render_glrender_GSYVideoGLViewBaseRender_Ljava_lang_String_IZHandler:Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYVideoGLRenderErrorListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYVideoGLRenderErrorListenerImplementor, Ijkplayer.Droid.UI", GSYVideoGLRenderErrorListenerImplementor.class, __md_methods);
	}


	public GSYVideoGLRenderErrorListenerImplementor ()
	{
		super ();
		if (getClass () == GSYVideoGLRenderErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Render.View.Listener.IGSYVideoGLRenderErrorListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void onError (com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender p0, java.lang.String p1, int p2, boolean p3)
	{
		n_onError (p0, p1, p2, p3);
	}

	private native void n_onError (com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender p0, java.lang.String p1, int p2, boolean p3);

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
