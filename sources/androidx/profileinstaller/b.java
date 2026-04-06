package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f22810A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f22811B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f22812z;

    public /* synthetic */ b(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i2, Object obj) {
        this.f22812z = diagnosticsCallback;
        this.f22810A = i2;
        this.f22811B = obj;
    }

    public final void run() {
        this.f22812z.b(this.f22810A, this.f22811B);
    }
}
