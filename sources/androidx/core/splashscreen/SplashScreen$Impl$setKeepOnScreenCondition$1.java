package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.splashscreen.SplashScreen;
import kotlin.Metadata;

@Metadata
public final class SplashScreen$Impl$setKeepOnScreenCondition$1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f20054A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SplashScreen.Impl f20055z;

    public boolean onPreDraw() {
        if (this.f20055z.f().a()) {
            return false;
        }
        this.f20054A.getViewTreeObserver().removeOnPreDrawListener(this);
        SplashScreenViewProvider b2 = this.f20055z.f20053c;
        if (b2 == null) {
            return true;
        }
        this.f20055z.d(b2);
        return true;
    }
}
