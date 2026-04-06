package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.Coil;
import coil.ImageLoader;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
@Deprecated
public final class ImageLoaderProvidableCompositionLocal {

    /* renamed from: a  reason: collision with root package name */
    public final ProvidableCompositionLocal f23310a;

    public static ProvidableCompositionLocal a(ProvidableCompositionLocal providableCompositionLocal) {
        return providableCompositionLocal;
    }

    public static /* synthetic */ ProvidableCompositionLocal b(ProvidableCompositionLocal providableCompositionLocal, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            providableCompositionLocal = CompositionLocalKt.j(AnonymousClass1.f23311z);
        }
        return a(providableCompositionLocal);
    }

    public static boolean c(ProvidableCompositionLocal providableCompositionLocal, Object obj) {
        return (obj instanceof ImageLoaderProvidableCompositionLocal) && Intrinsics.d(providableCompositionLocal, ((ImageLoaderProvidableCompositionLocal) obj).g());
    }

    public static final ImageLoader d(ProvidableCompositionLocal providableCompositionLocal, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-617597678, i2, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        ImageLoader imageLoader = (ImageLoader) composer.C(providableCompositionLocal);
        if (imageLoader == null) {
            imageLoader = Coil.a((Context) composer.C(AndroidCompositionLocals_androidKt.g()));
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return imageLoader;
    }

    public static int e(ProvidableCompositionLocal providableCompositionLocal) {
        return providableCompositionLocal.hashCode();
    }

    public static String f(ProvidableCompositionLocal providableCompositionLocal) {
        return "ImageLoaderProvidableCompositionLocal(delegate=" + providableCompositionLocal + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f23310a, obj);
    }

    public final /* synthetic */ ProvidableCompositionLocal g() {
        return this.f23310a;
    }

    public int hashCode() {
        return e(this.f23310a);
    }

    public String toString() {
        return f(this.f23310a);
    }
}
