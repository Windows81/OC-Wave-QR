package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.splashscreen.SplashScreen;
import kotlin.Metadata;

@Metadata
public final class SplashScreen$Impl31$setKeepOnScreenCondition$1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f20061A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SplashScreen.Impl31 f20062z;

    public boolean onPreDraw() {
        if (this.f20062z.f().a()) {
            return false;
        }
        this.f20061A.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
