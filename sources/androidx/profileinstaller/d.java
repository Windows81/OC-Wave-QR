package androidx.profileinstaller;

import android.content.Context;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f22815z;

    public /* synthetic */ d(Context context) {
        this.f22815z = context;
    }

    public final void run() {
        ProfileInstallerInitializer.k(this.f22815z);
    }
}
