package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.size.Size;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

@Metadata
public final class AsyncImagePainterKt {

    /* renamed from: a  reason: collision with root package name */
    public static final AsyncImagePainterKt$fakeTransitionTarget$1 f23294a = new AsyncImagePainterKt$fakeTransitionTarget$1();

    public static final AsyncImagePainter c(Object obj, ImageLoader imageLoader, Function1 function1, Function1 function12, ContentScale contentScale, int i2, EqualityDelegate equalityDelegate, Composer composer, int i3, int i4) {
        int i5 = i3;
        composer.f(1645646697);
        Function1 a2 = (i4 & 4) != 0 ? AsyncImagePainter.U.a() : function1;
        Function1 function13 = (i4 & 8) != 0 ? null : function12;
        ContentScale d2 = (i4 & 16) != 0 ? ContentScale.f17026a.d() : contentScale;
        int b2 = (i4 & 32) != 0 ? DrawScope.f16288g.b() : i2;
        EqualityDelegate a3 = (i4 & 64) != 0 ? EqualityDelegateKt.a() : equalityDelegate;
        if (ComposerKt.P()) {
            ComposerKt.Y(1645646697, i5, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:166)");
        }
        Object obj2 = obj;
        ImageLoader imageLoader2 = imageLoader;
        AsyncImagePainter d3 = d(new AsyncImageState(obj, a3, imageLoader), a2, function13, d2, b2, composer, (i5 >> 3) & 65520);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.S();
        return d3;
    }

    public static final AsyncImagePainter d(AsyncImageState asyncImageState, Function1 function1, Function1 function12, ContentScale contentScale, int i2, Composer composer, int i3) {
        composer.f(952940650);
        if (ComposerKt.P()) {
            ComposerKt.Y(952940650, i3, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:199)");
        }
        ImageRequest f2 = UtilsKt.f(asyncImageState.b(), composer, 8);
        h(f2);
        composer.f(294038899);
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new AsyncImagePainter(f2, asyncImageState.a());
            composer.N(g2);
        }
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) g2;
        composer.S();
        asyncImagePainter.L(function1);
        asyncImagePainter.G(function12);
        asyncImagePainter.D(contentScale);
        asyncImagePainter.E(i2);
        asyncImagePainter.I(((Boolean) composer.C(InspectionModeKt.a())).booleanValue());
        asyncImagePainter.F(asyncImageState.a());
        asyncImagePainter.J(f2);
        asyncImagePainter.h();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.S();
        return asyncImagePainter;
    }

    public static final Size e(long j2) {
        if (j2 == androidx.compose.ui.geometry.Size.f15876b.a()) {
            return Size.f23704d;
        }
        if (!UtilsKt.e(j2)) {
            return null;
        }
        float i2 = androidx.compose.ui.geometry.Size.i(j2);
        Dimension a2 = (Float.isInfinite(i2) || Float.isNaN(i2)) ? Dimension.Undefined.f23692a : Dimensions.a(MathKt.d(androidx.compose.ui.geometry.Size.i(j2)));
        float g2 = androidx.compose.ui.geometry.Size.g(j2);
        return new Size(a2, (Float.isInfinite(g2) || Float.isNaN(g2)) ? Dimension.Undefined.f23692a : Dimensions.a(MathKt.d(androidx.compose.ui.geometry.Size.g(j2))));
    }

    public static final Void f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    public static /* synthetic */ Void g(String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return f(str, str2);
    }

    public static final void h(ImageRequest imageRequest) {
        Object m2 = imageRequest.m();
        if (m2 instanceof ImageRequest.Builder) {
            f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        } else if (m2 instanceof ImageBitmap) {
            g("ImageBitmap", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (m2 instanceof ImageVector) {
            g("ImageVector", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (m2 instanceof Painter) {
            g("Painter", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (imageRequest.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
