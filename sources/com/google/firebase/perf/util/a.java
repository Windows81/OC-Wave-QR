package com.google.firebase.perf.util;

import android.view.View;
import android.view.ViewTreeObserver;

public final /* synthetic */ class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f31139A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FirstDrawDoneListener f31140z;

    public /* synthetic */ a(FirstDrawDoneListener firstDrawDoneListener, View view) {
        this.f31140z = firstDrawDoneListener;
        this.f31139A = view;
    }

    public final void onGlobalLayout() {
        this.f31140z.b(this.f31139A);
    }
}
