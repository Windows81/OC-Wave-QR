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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1  reason: invalid class name */
public final class ToggleableKt$toggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5426A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5427B;
    public final /* synthetic */ Role C;
    public final /* synthetic */ Function1 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Indication f5428z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(Indication indication, boolean z2, boolean z3, Role role, Function1 function1) {
        super(3);
        this.f5428z = indication;
        this.f5426A = z2;
        this.f5427B = z3;
        this.C = role;
        this.D = function1;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-1525724089);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1525724089, i2, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = InteractionSourceKt.a();
            composer.N(g2);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) g2;
        Modifier o0 = IndicationKt.b(Modifier.f15489d, mutableInteractionSource, this.f5428z).o0(new ToggleableElement(this.f5426A, mutableInteractionSource, (IndicationNodeFactory) null, this.f5427B, this.C, this.D, (DefaultConstructorMarker) null));
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
