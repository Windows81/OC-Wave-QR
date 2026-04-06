package androidx.core.splashscreen;

import android.view.View;
import androidx.core.splashscreen.SplashScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SplashScreen$Impl$setOnExitAnimationListener$2 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen.Impl f20056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SplashScreenViewProvider f20057b;

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.i(view, "view");
        if (view.isAttachedToWindow()) {
            view.removeOnLayoutChangeListener(this);
            if (!this.f20056a.f().a()) {
                this.f20056a.d(this.f20057b);
            } else {
                this.f20056a.f20053c = this.f20057b;
            }
        }
    }
}
