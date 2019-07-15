package mono.com.shuyu.gsyvideoplayer.utils;


public class NetInfoModule_NetChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.shuyu.gsyvideoplayer.utils.NetInfoModule.NetChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_changed:(Ljava/lang/String;)V:GetChanged_Ljava_lang_String_Handler:Com.Shuyu.Gsyvideoplayer.Utils.NetInfoModule/INetChangeListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Shuyu.Gsyvideoplayer.Utils.NetInfoModule+INetChangeListenerImplementor, Ijkplayer.Droid.UI", NetInfoModule_NetChangeListenerImplementor.class, __md_methods);
	}


	public NetInfoModule_NetChangeListenerImplementor ()
	{
		super ();
		if (getClass () == NetInfoModule_NetChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Shuyu.Gsyvideoplayer.Utils.NetInfoModule+INetChangeListenerImplementor, Ijkplayer.Droid.UI", "", this, new java.lang.Object[] {  });
	}


	public void changed (java.lang.String p0)
	{
		n_changed (p0);
	}

	private native void n_changed (java.lang.String p0);

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
