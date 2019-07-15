using System;
using Android.Support.Design.Widget;


namespace VideoPlayerDemo.Listener
{
    public abstract class AppBarStateChangeListener : AppBarLayout.IOnOffsetChangedListener
    {
        public enum State
        {
            EXPANDED,
            COLLAPSED,
            IDLE
        }

        private State mCurrentState = State.IDLE;

        public IntPtr Handle
        {
            get { return IntPtr.Zero; }
        }


        public void OnOffsetChanged(AppBarLayout appBarLayout, int i)
        {
            if (i == 0)
            {
                if (mCurrentState != State.EXPANDED)
                {
                    OnStateChanged(appBarLayout, State.EXPANDED);
                }
                mCurrentState = State.EXPANDED;
            }
            else if (Math.Abs(i) >= appBarLayout.TotalScrollRange)
            {
                if (mCurrentState != State.COLLAPSED)
                {
                    OnStateChanged(appBarLayout, State.COLLAPSED);
                }
                mCurrentState = State.COLLAPSED;
            }
            else
            {
                if (mCurrentState != State.IDLE)
                {
                    OnStateChanged(appBarLayout, State.IDLE);
                }
                mCurrentState = State.IDLE;
            }
            appBarLayout.AddOnOffsetChangedListener(this);
        }

        public void Dispose()
        {
            return;
        }

        public abstract void OnStateChanged(AppBarLayout appBarLayout, State state);
    }
}