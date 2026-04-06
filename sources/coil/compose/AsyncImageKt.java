package coil.compose;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.SizeResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AsyncImageKt {
    public static final void a(AsyncImageState asyncImageState, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, boolean z2, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Modifier modifier2 = modifier;
        ContentScale contentScale2 = contentScale;
        int i7 = i3;
        Composer q2 = composer.q(-421592773);
        int i8 = 4;
        if ((i7 & 14) == 0) {
            i5 = (q2.W(asyncImageState) ? 4 : 2) | i7;
        } else {
            AsyncImageState asyncImageState2 = asyncImageState;
            i5 = i7;
        }
        String str2 = str;
        if ((i7 & 112) == 0) {
            i5 |= q2.W(str2) ? 32 : 16;
        }
        if ((i7 & 896) == 0) {
            i5 |= q2.W(modifier2) ? 256 : 128;
        }
        Function1 function13 = function1;
        if ((i7 & 7168) == 0) {
            i5 |= q2.l(function13) ? 2048 : 1024;
        }
        Function1 function14 = function12;
        if ((i7 & 57344) == 0) {
            i5 |= q2.l(function14) ? 16384 : 8192;
        }
        Alignment alignment2 = alignment;
        if ((i7 & 458752) == 0) {
            i5 |= q2.W(alignment2) ? 131072 : 65536;
        }
        if ((i7 & 3670016) == 0) {
            i5 |= q2.W(contentScale2) ? 1048576 : 524288;
        }
        float f3 = f2;
        if ((i7 & 29360128) == 0) {
            i5 |= q2.h(f3) ? 8388608 : 4194304;
        }
        if ((234881024 & i7) == 0) {
            i5 |= q2.W(colorFilter) ? 67108864 : 33554432;
        } else {
            ColorFilter colorFilter2 = colorFilter;
        }
        int i9 = i2;
        if ((i7 & 1879048192) == 0) {
            i5 |= q2.i(i9) ? 536870912 : 268435456;
        }
        boolean z3 = z2;
        if ((i4 & 14) == 0) {
            if (!q2.d(z3)) {
                i8 = 2;
            }
            i6 = i4 | i8;
        } else {
            i6 = i4;
        }
        if ((i5 & 1533916891) == 306783378 && (i6 & 11) == 2 && q2.t()) {
            q2.B();
        } else {
            if (ComposerKt.P()) {
                ComposerKt.Y(-421592773, i5, i6, "coil.compose.AsyncImage (AsyncImage.kt:213)");
            }
            ImageRequest g2 = UtilsKt.g(asyncImageState.b(), contentScale2, q2, ((i5 >> 15) & 112) | 8);
            int i10 = i5 >> 3;
            int i11 = (i10 & 896) | 72 | (i10 & 7168);
            int i12 = i5 >> 6;
            int i13 = i12 & 57344;
            int i14 = i6;
            int i15 = i5;
            int i16 = i12;
            AsyncImagePainter c2 = AsyncImagePainterKt.c(g2, asyncImageState.a(), function1, function12, contentScale, i2, asyncImageState.c(), q2, i11 | i13 | ((i5 >> 12) & 458752), 0);
            SizeResolver K = g2.K();
            int i17 = i16;
            c(K instanceof ConstraintsSizeResolver ? modifier2.o0((Modifier) K) : modifier2, c2, str, alignment, contentScale, f2, colorFilter, z2, q2, ((i15 << 3) & 896) | (i17 & 7168) | i13 | (i17 & 458752) | (i17 & 3670016) | ((i14 << 21) & 29360128));
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            AsyncImageKt$AsyncImage$1 asyncImageKt$AsyncImage$1 = r0;
            AsyncImageKt$AsyncImage$1 asyncImageKt$AsyncImage$12 = new AsyncImageKt$AsyncImage$1(asyncImageState, str, modifier, function1, function12, alignment, contentScale, f2, colorFilter, i2, z2, i3, i4);
            x2.a(asyncImageKt$AsyncImage$1);
        }
    }

    public static final void b(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, boolean z2, EqualityDelegate equalityDelegate, Composer composer, int i3, int i4, int i5) {
        int i6 = i3;
        int i7 = i4;
        int i8 = i5;
        composer.f(2032051394);
        Modifier.Companion companion = (i8 & 8) != 0 ? Modifier.f15489d : modifier;
        Function1 a2 = (i8 & 16) != 0 ? AsyncImagePainter.U.a() : function1;
        Function1 function13 = (i8 & 32) != 0 ? null : function12;
        Alignment e2 = (i8 & 64) != 0 ? Alignment.f15444a.e() : alignment;
        ContentScale d2 = (i8 & 128) != 0 ? ContentScale.f17026a.d() : contentScale;
        float f3 = (i8 & 256) != 0 ? 1.0f : f2;
        ColorFilter colorFilter2 = (i8 & 512) != 0 ? null : colorFilter;
        int b2 = (i8 & 1024) != 0 ? DrawScope.f16288g.b() : i2;
        boolean z3 = (i8 & 2048) != 0 ? true : z2;
        EqualityDelegate a3 = (i8 & 4096) != 0 ? EqualityDelegateKt.a() : equalityDelegate;
        if (ComposerKt.P()) {
            ComposerKt.Y(2032051394, i6, i7, "coil.compose.AsyncImage (AsyncImage.kt:157)");
        }
        AsyncImageState asyncImageState = new AsyncImageState(obj, a3, imageLoader);
        int i9 = i6 & 112;
        int i10 = i6 >> 3;
        a(asyncImageState, str, companion, a2, function13, e2, d2, f3, colorFilter2, b2, z3, composer, (i10 & 234881024) | i9 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | ((i7 << 27) & 1879048192), (i7 >> 3) & 14);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.S();
    }

    public static final void c(Modifier modifier, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, boolean z2, Composer composer, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        boolean z3 = z2;
        int i4 = i2;
        Composer q2 = composer.q(777774312);
        if ((i4 & 14) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 112) == 0) {
            i3 |= q2.W(asyncImagePainter) ? 32 : 16;
        } else {
            AsyncImagePainter asyncImagePainter2 = asyncImagePainter;
        }
        if ((i4 & 896) == 0) {
            i3 |= q2.W(str2) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i3 |= q2.W(alignment) ? 2048 : 1024;
        } else {
            Alignment alignment2 = alignment;
        }
        if ((57344 & i4) == 0) {
            i3 |= q2.W(contentScale) ? 16384 : 8192;
        } else {
            ContentScale contentScale2 = contentScale;
        }
        float f3 = f2;
        if ((458752 & i4) == 0) {
            i3 |= q2.h(f3) ? 131072 : 65536;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((3670016 & i4) == 0) {
            i3 |= q2.W(colorFilter2) ? 1048576 : 524288;
        }
        if ((29360128 & i4) == 0) {
            i3 |= q2.d(z3) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) != 4793490 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(777774312, i3, -1, "coil.compose.Content (AsyncImage.kt:259)");
            }
            Modifier c2 = UtilsKt.c(modifier2, str2);
            if (z3) {
                c2 = ClipKt.b(c2);
            }
            Modifier o0 = c2.o0(new ContentPainterElement(asyncImagePainter, alignment, contentScale, f2, colorFilter));
            AsyncImageKt$Content$2 asyncImageKt$Content$2 = AsyncImageKt$Content$2.f23276a;
            q2.f(544976794);
            int a2 = ComposablesKt.a(q2, 0);
            Modifier e2 = ComposedModifierKt.e(q2, o0);
            CompositionLocalMap I = q2.I();
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            q2.f(1405779621);
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(new AsyncImageKt$Content$$inlined$Layout$1(a3));
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, asyncImageKt$Content$2, companion.c());
            Updater.g(b2, I, companion.e());
            Updater.g(b2, e2, companion.d());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            q2.T();
            q2.S();
            q2.S();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AsyncImageKt$Content$3(modifier, asyncImagePainter, str, alignment, contentScale, f2, colorFilter, z2, i2));
        }
    }
}
