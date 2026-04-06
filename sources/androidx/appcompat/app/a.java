package androidx.appcompat.app;

import android.content.Context;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f697z;

    public /* synthetic */ a(Context context) {
        this.f697z = context;
    }

    public final void run() {
        AppCompatDelegate.v(this.f697z);
    }
}
