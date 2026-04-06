package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class IndicationKt$indication$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f3091A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Indication f3092z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(Indication indication, InteractionSource interactionSource) {
        super(3);
        this.f3092z = indication;
        this.f3091A = interactionSource;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-353972293);
        if (ComposerKt.P()) {
            ComposerKt.Y(-353972293, i2, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
        }
        IndicationInstance a2 = this.f3092z.a(this.f3091A, composer, 0);
        boolean W = composer.W(a2);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new IndicationModifier(a2);
            composer.N(g2);
        }
        IndicationModifier indicationModifier = (IndicationModifier) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return indicationModifier;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
