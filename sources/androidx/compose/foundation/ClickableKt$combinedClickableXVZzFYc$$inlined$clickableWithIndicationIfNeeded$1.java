package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1  reason: invalid class name */
public final class ClickableKt$combinedClickableXVZzFYc$$inlined$clickableWithIndicationIfNeeded$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f3007A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f3008B;
    public final /* synthetic */ Role C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Indication f3009z;

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
        Modifier o0 = IndicationKt.b(Modifier.f15489d, mutableInteractionSource, this.f3009z).o0(new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) null, this.f3007A, this.f3008B, this.C, this.D, this.E, this.F, this.G, true, (DefaultConstructorMarker) null));
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
