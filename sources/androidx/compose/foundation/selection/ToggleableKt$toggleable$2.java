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
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ToggleableKt$toggleable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5438A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f5439B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5440z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleable$2(boolean z2, boolean z3, Role role, Function1 function1) {
        super(3);
        this.f5440z = z2;
        this.f5438A = z3;
        this.f5439B = role;
        this.C = function1;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.X(290332169);
        if (ComposerKt.P()) {
            ComposerKt.Y(290332169, i2, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:74)");
        }
        Indication indication = (Indication) composer.C(IndicationKt.a());
        if (indication instanceof IndicationNodeFactory) {
            composer.X(-2130062114);
            composer.M();
            mutableInteractionSource = null;
        } else {
            composer.X(-2129929496);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = InteractionSourceKt.a();
                composer.N(g2);
            }
            mutableInteractionSource = (MutableInteractionSource) g2;
            composer.M();
        }
        Modifier a2 = ToggleableKt.a(Modifier.f15489d, this.f5440z, mutableInteractionSource, indication, this.f5438A, this.f5439B, this.C);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
