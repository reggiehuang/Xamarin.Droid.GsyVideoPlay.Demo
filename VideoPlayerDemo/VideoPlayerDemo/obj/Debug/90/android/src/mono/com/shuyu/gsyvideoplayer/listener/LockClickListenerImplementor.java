package mono.com.shuyu.gsyvideoplayer.listener;


public class LockClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.listener.LockClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;Z)V:GetOnClick_Landroid_view_View_ZHandler:Com.Shuyu.Gsyvideoplayer.Listener.ILockClickListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Listener.ILockClickListenerImplementor, Ijkplayer.Droid.UI", LockClickListenerImplementor.class, __md_methods);
	}


	public LockClickListenerImplementor ()
	{
		super ();
		if (getClass () == LockClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Listener.ILockClickListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0, boolean p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.view.View p0, boolean p1);

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
