package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class ViewPropertyAnimatorCompat {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f20294a;

    public static class Api21Impl {
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f20294a = new WeakReference(view);
    }

    public ViewPropertyAnimatorCompat b(float f2) {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f20294a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public ViewPropertyAnimatorCompat f(long j2) {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat g(Interpolator interpolator) {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat h(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.f20294a.get();
        if (view != null) {
            i(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    public final void i(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    viewPropertyAnimatorListener.a(view);
                }

                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorListener.b(view);
                }

                public void onAnimationStart(Animator animator) {
                    viewPropertyAnimatorListener.c(view);
                }
            });
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public ViewPropertyAnimatorCompat j(long j2) {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat k(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new C0373w(viewPropertyAnimatorUpdateListener, view) : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat m(float f2) {
        View view = (View) this.f20294a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
