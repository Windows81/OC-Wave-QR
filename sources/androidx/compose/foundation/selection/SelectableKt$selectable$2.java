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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectableKt$selectable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5420A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f5421B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5422z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectable$2(boolean z2, boolean z3, Role role, Function0 function0) {
        super(3);
        this.f5422z = z2;
        this.f5420A = z3;
        this.f5421B = role;
        this.C = function0;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.X(-2124609672);
        if (ComposerKt.P()) {
            ComposerKt.Y(-2124609672, i2, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
        }
        Indication indication = (Indication) composer.C(IndicationKt.a());
        if (indication instanceof IndicationNodeFactory) {
            composer.X(-1412174474);
            composer.M();
            mutableInteractionSource = null;
        } else {
            composer.X(-1412041856);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = InteractionSourceKt.a();
                composer.N(g2);
            }
            mutableInteractionSource = (MutableInteractionSource) g2;
            composer.M();
        }
        Modifier a2 = SelectableKt.a(Modifier.f15489d, this.f5422z, mutableInteractionSource, indication, this.f5420A, this.f5421B, this.C);
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
