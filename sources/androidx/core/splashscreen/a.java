package androidx.core.splashscreen;

import androidx.core.splashscreen.SplashScreen;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SplashScreen.OnExitAnimationListener f20070A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SplashScreenViewProvider f20071z;

    public /* synthetic */ a(SplashScreenViewProvider splashScreenViewProvider, SplashScreen.OnExitAnimationListener onExitAnimationListener) {
        this.f20071z = splashScreenViewProvider;
        this.f20070A = onExitAnimationListener;
    }

    public final void run() {
        SplashScreen.Impl.e(this.f20071z, this.f20070A);
    }
}
