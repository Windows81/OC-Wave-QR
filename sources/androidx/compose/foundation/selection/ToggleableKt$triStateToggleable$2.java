package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class ToggleableKt$triStateToggleable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5441A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f5442B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f5443z;

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.X(-1808118329);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1808118329, i2, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:308)");
        }
        Indication indication = (Indication) composer.C(IndicationKt.a());
        if (indication instanceof IndicationNodeFactory) {
            composer.X(-1060119816);
            composer.M();
            mutableInteractionSource = null;
        } else {
            composer.X(-1059987198);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = InteractionSourceKt.a();
                composer.N(g2);
            }
            mutableInteractionSource = (MutableInteractionSource) g2;
            composer.M();
        }
        Modifier e2 = ToggleableKt.e(Modifier.f15489d, this.f5443z, mutableInteractionSource, indication, this.f5441A, this.f5442B, this.C);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return e2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
