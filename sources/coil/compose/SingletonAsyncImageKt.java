package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SingletonAsyncImageKt {
    public static final void a(Object obj, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, boolean z2, EqualityDelegate equalityDelegate, Composer composer, int i3, int i4, int i5) {
        Composer composer2 = composer;
        int i6 = i3;
        int i7 = i4;
        int i8 = i5;
        composer2.f(1451072229);
        Modifier modifier2 = (i8 & 4) != 0 ? Modifier.f15489d : modifier;
        Function1 a2 = (i8 & 8) != 0 ? AsyncImagePainter.U.a() : function1;
        Function1 function13 = (i8 & 16) != 0 ? null : function12;
        Alignment e2 = (i8 & 32) != 0 ? Alignment.f15444a.e() : alignment;
        ContentScale d2 = (i8 & 64) != 0 ? ContentScale.f17026a.d() : contentScale;
        float f3 = (i8 & 128) != 0 ? 1.0f : f2;
        ColorFilter colorFilter2 = (i8 & 256) != 0 ? null : colorFilter;
        int b2 = (i8 & 512) != 0 ? DrawScope.f16288g.b() : i2;
        boolean z3 = (i8 & 1024) != 0 ? true : z2;
        EqualityDelegate a3 = (i8 & 2048) != 0 ? EqualityDelegateKt.a() : equalityDelegate;
        if (ComposerKt.P()) {
            ComposerKt.Y(1451072229, i6, i7, "coil.compose.AsyncImage (SingletonAsyncImage.kt:161)");
        }
        int i9 = i6 << 3;
        int i10 = i7 << 3;
        AsyncImageKt.b(obj, str, ImageLoaderProvidableCompositionLocal.d(LocalImageLoaderKt.a(), composer2, 6), modifier2, a2, function13, e2, d2, f3, colorFilter2, b2, z3, a3, composer, (i6 & 112) | 520 | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9) | (i9 & 1879048192), ((i6 >> 27) & 14) | (i10 & 112) | (i10 & 896), 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.S();
    }
}
