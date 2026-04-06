package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;

public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Context f22813A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f22814z;

    public /* synthetic */ c(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f22814z = profileInstallerInitializer;
        this.f22813A = context;
    }

    public final void doFrame(long j2) {
        this.f22814z.h(this.f22813A, j2);
    }
}
