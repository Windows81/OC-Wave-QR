package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class UtilsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f23339a = Constraints.f19137b.c(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final SizeResolver f23340b = SizeResolvers.a(Size.f23704d);

    public static final float a(long j2, float f2) {
        return RangesKt.n(f2, (float) Constraints.m(j2), (float) Constraints.k(j2));
    }

    public static final float b(long j2, float f2) {
        return RangesKt.n(f2, (float) Constraints.n(j2), (float) Constraints.l(j2));
    }

    public static final Modifier c(Modifier modifier, String str) {
        return str != null ? SemanticsModifierKt.d(modifier, false, new UtilsKt$contentDescription$1(str), 1, (Object) null) : modifier;
    }

    public static final long d() {
        return f23339a;
    }

    public static final boolean e(long j2) {
        return ((double) androidx.compose.ui.geometry.Size.i(j2)) >= 0.5d && ((double) androidx.compose.ui.geometry.Size.g(j2)) >= 0.5d;
    }

    public static final ImageRequest f(Object obj, Composer composer, int i2) {
        composer.f(1087186730);
        if (ComposerKt.P()) {
            ComposerKt.Y(1087186730, i2, -1, "coil.compose.requestOf (utils.kt:31)");
        }
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.S();
            return imageRequest;
        }
        Context context = (Context) composer.C(AndroidCompositionLocals_androidKt.g());
        composer.f(375474364);
        boolean W = composer.W(context) | composer.W(obj);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new ImageRequest.Builder(context).b(obj).a();
            composer.N(g2);
        }
        ImageRequest imageRequest2 = (ImageRequest) g2;
        composer.S();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.S();
        return imageRequest2;
    }

    public static final ImageRequest g(Object obj, ContentScale contentScale, Composer composer, int i2) {
        SizeResolver sizeResolver;
        composer.f(1677680258);
        if (ComposerKt.P()) {
            ComposerKt.Y(1677680258, i2, -1, "coil.compose.requestOfWithSizeResolver (utils.kt:50)");
        }
        boolean z2 = obj instanceof ImageRequest;
        if (z2) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (imageRequest.q().m() != null) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                composer.S();
                return imageRequest;
            }
        }
        composer.f(-679565543);
        if (Intrinsics.d(contentScale, ContentScale.f17026a.f())) {
            sizeResolver = f23340b;
        } else {
            composer.f(-679565452);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new ConstraintsSizeResolver();
                composer.N(g2);
            }
            sizeResolver = (ConstraintsSizeResolver) g2;
            composer.S();
        }
        composer.S();
        if (z2) {
            composer.f(-679565365);
            composer.f(-679565358);
            boolean W = composer.W(obj) | composer.W(sizeResolver);
            Object g3 = composer.g();
            if (W || g3 == Composer.f14567a.a()) {
                g3 = ImageRequest.R((ImageRequest) obj, (Context) null, 1, (Object) null).k(sizeResolver).a();
                composer.N(g3);
            }
            ImageRequest imageRequest2 = (ImageRequest) g3;
            composer.S();
            composer.S();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.S();
            return imageRequest2;
        }
        composer.f(-679565199);
        Context context = (Context) composer.C(AndroidCompositionLocals_androidKt.g());
        composer.f(-679565153);
        boolean W2 = composer.W(context) | composer.W(obj) | composer.W(sizeResolver);
        Object g4 = composer.g();
        if (W2 || g4 == Composer.f14567a.a()) {
            g4 = new ImageRequest.Builder(context).b(obj).k(sizeResolver).a();
            composer.N(g4);
        }
        ImageRequest imageRequest3 = (ImageRequest) g4;
        composer.S();
        composer.S();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.S();
        return imageRequest3;
    }

    public static final long h(long j2) {
        return IntSizeKt.a(MathKt.d(androidx.compose.ui.geometry.Size.i(j2)), MathKt.d(androidx.compose.ui.geometry.Size.g(j2)));
    }

    public static final Scale i(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.f17026a;
        return Intrinsics.d(contentScale, companion.d()) ? true : Intrinsics.d(contentScale, companion.e()) ? Scale.FIT : Scale.FILL;
    }

    public static final Size j(long j2) {
        if (Constraints.p(j2)) {
            return null;
        }
        return new Size(Constraints.h(j2) ? Dimensions.a(Constraints.l(j2)) : Dimension.Undefined.f23692a, Constraints.g(j2) ? Dimensions.a(Constraints.k(j2)) : Dimension.Undefined.f23692a);
    }
}
