package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f6717A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f6718z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(Function0 function0, boolean z2) {
        super(3);
        this.f6718z = function0;
        this.f6717A = z2;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-196777734);
        if (ComposerKt.P()) {
            ComposerKt.Y(-196777734, i2, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:133)");
        }
        long b2 = ((TextSelectionColors) composer.C(TextSelectionColorsKt.b())).b();
        boolean j2 = composer.j(b2) | composer.W(this.f6718z) | composer.d(this.f6717A);
        Function0 function0 = this.f6718z;
        boolean z2 = this.f6717A;
        Object g2 = composer.g();
        if (j2 || g2 == Composer.f14567a.a()) {
            g2 = new AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(b2, function0, z2);
            composer.N(g2);
        }
        Modifier c2 = DrawModifierKt.c(modifier, (Function1) g2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return c2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
