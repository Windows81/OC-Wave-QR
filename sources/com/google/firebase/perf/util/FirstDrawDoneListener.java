package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {

    /* renamed from: A  reason: collision with root package name */
    public final AtomicReference f31116A;

    /* renamed from: B  reason: collision with root package name */
    public final Runnable f31117B;

    /* renamed from: z  reason: collision with root package name */
    public final Handler f31118z = new Handler(Looper.getMainLooper());

    /* renamed from: com.google.firebase.perf.util.FirstDrawDoneListener$1  reason: invalid class name */
    public class AnonymousClass1 implements View.OnAttachStateChangeListener {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ FirstDrawDoneListener f31119z;

        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(this.f31119z);
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public FirstDrawDoneListener(View view, Runnable runnable) {
        this.f31116A = new AtomicReference(view);
        this.f31117B = runnable;
    }

    public static void c(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new FirstDrawDoneListener(view, runnable));
    }

    public final /* synthetic */ void b(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    public void onDraw() {
        View view = (View) this.f31116A.getAndSet((Object) null);
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, view));
            this.f31118z.postAtFrontOfQueue(this.f31117B);
        }
    }
}
