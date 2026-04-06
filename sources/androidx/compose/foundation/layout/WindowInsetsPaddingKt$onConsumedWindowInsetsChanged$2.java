package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f4263z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2(Function1 function1) {
        super(3);
        this.f4263z = function1;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-1608161351);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1608161351, i2, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:141)");
        }
        boolean W = composer.W(this.f4263z);
        Function1 function1 = this.f4263z;
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new ConsumedInsetsModifier(function1);
            composer.N(g2);
        }
        ConsumedInsetsModifier consumedInsetsModifier = (ConsumedInsetsModifier) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return consumedInsetsModifier;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
