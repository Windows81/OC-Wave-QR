package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 f5471z = new AndroidCursorHandle_androidKt$drawCursorHandle$1();

    public AndroidCursorHandle_androidKt$drawCursorHandle$1() {
        super(3);
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-2126899193);
        if (ComposerKt.P()) {
            ComposerKt.Y(-2126899193, i2, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
        }
        long b2 = ((TextSelectionColors) composer.C(TextSelectionColorsKt.b())).b();
        Modifier.Companion companion = Modifier.f15489d;
        boolean j2 = composer.j(b2);
        Object g2 = composer.g();
        if (j2 || g2 == Composer.f14567a.a()) {
            g2 = new AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(b2);
            composer.N(g2);
        }
        Modifier o0 = modifier.o0(DrawModifierKt.c(companion, (Function1) g2));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return o0;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
