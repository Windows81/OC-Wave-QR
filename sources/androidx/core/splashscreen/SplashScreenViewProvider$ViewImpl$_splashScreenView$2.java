package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.splashscreen.SplashScreenViewProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SplashScreenViewProvider$ViewImpl$_splashScreenView$2 extends Lambda implements Function0<ViewGroup> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SplashScreenViewProvider.ViewImpl f20066z;

    /* renamed from: b */
    public final ViewGroup invoke() {
        View inflate = View.inflate(this.f20066z.a(), R.layout.f20049a, (ViewGroup) null);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
