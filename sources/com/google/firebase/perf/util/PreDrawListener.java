package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class PreDrawListener implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: A  reason: collision with root package name */
    public final AtomicReference f31123A;

    /* renamed from: B  reason: collision with root package name */
    public final Runnable f31124B;
    public final Runnable C;

    /* renamed from: z  reason: collision with root package name */
    public final Handler f31125z = new Handler(Looper.getMainLooper());

    public PreDrawListener(View view, Runnable runnable, Runnable runnable2) {
        this.f31123A = new AtomicReference(view);
        this.f31124B = runnable;
        this.C = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new PreDrawListener(view, runnable, runnable2));
    }

    public boolean onPreDraw() {
        View view = (View) this.f31123A.getAndSet((Object) null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f31125z.post(this.f31124B);
        this.f31125z.postAtFrontOfQueue(this.C);
        return true;
    }
}
