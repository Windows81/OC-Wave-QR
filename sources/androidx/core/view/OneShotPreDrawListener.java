package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public ViewTreeObserver f20244A;

    /* renamed from: B  reason: collision with root package name */
    public final Runnable f20245B;

    /* renamed from: z  reason: collision with root package name */
    public final View f20246z;

    public OneShotPreDrawListener(View view, Runnable runnable) {
        this.f20246z = view;
        this.f20244A = view.getViewTreeObserver();
        this.f20245B = runnable;
    }

    public static OneShotPreDrawListener a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
            view.addOnAttachStateChangeListener(oneShotPreDrawListener);
            return oneShotPreDrawListener;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        if (this.f20244A.isAlive()) {
            this.f20244A.removeOnPreDrawListener(this);
        } else {
            this.f20246z.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f20246z.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f20245B.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f20244A = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
