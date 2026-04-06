package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.view.m  reason: case insensitive filesystem */
public final /* synthetic */ class C0364m implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f20429z;

    public /* synthetic */ C0364m(View view) {
        this.f20429z = view;
    }

    public final void run() {
        ((InputMethodManager) this.f20429z.getContext().getSystemService("input_method")).showSoftInput(this.f20429z, 0);
    }
}
