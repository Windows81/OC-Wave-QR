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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1  reason: invalid class name */
public final class ToggleableKt$triStateToggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f5432A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5433B;
    public final /* synthetic */ Role C;
    public final /* synthetic */ Function0 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Indication f5434z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$triStateToggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(Indication indication, ToggleableState toggleableState, boolean z2, Role role, Function0 function0) {
        super(3);
        this.f5434z = indication;
        this.f5432A = toggleableState;
        this.f5433B = z2;
        this.C = role;
        this.D = function0;
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
        Modifier o0 = IndicationKt.b(Modifier.f15489d, mutableInteractionSource, this.f5434z).o0(new TriStateToggleableElement(this.f5432A, mutableInteractionSource, (IndicationNodeFactory) null, this.f5433B, this.C, this.D, (DefaultConstructorMarker) null));
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
