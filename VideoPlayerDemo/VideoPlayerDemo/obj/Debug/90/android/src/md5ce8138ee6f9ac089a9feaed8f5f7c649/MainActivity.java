package md5ce8138ee6f9ac089a9feaed8f5f7c649;


public class MainActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener,
		com.shuyu.gsyvideoplayer.listener.LockClickListener,
		com.shuyu.gsyvideoplayer.listener.GSYVideoProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onClick:(Landroid/view/View;Z)V:GetOnClick_Landroid_view_View_ZHandler:Com.Shuyu.Gsyvideoplayer.Listener.ILockClickListenerInvoker, Ijkplayer.Droid.UI\n" +
			"n_onProgress:(IIII)V:GetOnProgress_IIIIHandler:Com.Shuyu.Gsyvideoplayer.Listener.IGSYVideoProgressListenerInvoker, Ijkplayer.Droid.UI\n" +
			"";
		mono.android.Runtime.register ("VideoPlayerDemo.MainActivity, VideoPlayerDemo", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("VideoPlayerDemo.MainActivity, VideoPlayerDemo", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);


	public void onClick (android.view.View p0, boolean p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.view.View p0, boolean p1);


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
