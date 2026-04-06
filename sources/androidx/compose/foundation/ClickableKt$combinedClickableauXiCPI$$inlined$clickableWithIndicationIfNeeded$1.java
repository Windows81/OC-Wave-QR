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
/* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1  reason: invalid class name */
public final class ClickableKt$combinedClickableauXiCPI$$inlined$clickableWithIndicationIfNeeded$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f3010A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f3011B;
    public final /* synthetic */ Role C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Indication f3012z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickableauXiCPI$$inlined$clickableWithIndicationIfNeeded$1(Indication indication, boolean z2, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, boolean z3) {
        super(3);
        this.f3012z = indication;
        this.f3010A = z2;
        this.f3011B = str;
        this.C = role;
        this.D = function0;
        this.E = str2;
        this.F = function02;
        this.G = function03;
        this.H = z3;
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
        Modifier o0 = IndicationKt.b(Modifier.f15489d, mutableInteractionSource, this.f3012z).o0(new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) null, this.f3010A, this.f3011B, this.C, this.D, this.E, this.F, this.G, this.H, (DefaultConstructorMarker) null));
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
