package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CanvasKt {
    public static final void a(Modifier modifier, String str, Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1162737955);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function1) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1162737955, i3, -1, "androidx.compose.foundation.Canvas (Canvas.kt:60)");
            }
            Modifier b2 = DrawModifierKt.b(modifier, function1);
            boolean z2 = (i3 & 112) == 32;
            Object g2 = q2.g();
            if (z2 || g2 == Composer.f14567a.a()) {
                g2 = new CanvasKt$Canvas$2$1(str);
                q2.N(g2);
            }
            SpacerKt.a(SemanticsModifierKt.d(b2, false, (Function1) g2, 1, (Object) null), q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new CanvasKt$Canvas$3(modifier, str, function1, i2));
        }
    }

    public static final void b(Modifier modifier, Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function1) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-932836462, i3, -1, "androidx.compose.foundation.Canvas (Canvas.kt:40)");
            }
            SpacerKt.a(DrawModifierKt.b(modifier, function1), q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new CanvasKt$Canvas$1(modifier, function1, i2));
        }
    }
}
