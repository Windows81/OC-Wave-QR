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
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ClickableKt$clickable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f3019A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f3020B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f3021z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$2(boolean z2, String str, Role role, Function0 function0) {
        super(3);
        this.f3021z = z2;
        this.f3019A = str;
        this.f3020B = role;
        this.C = function0;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.X(-756081143);
        if (ComposerKt.P()) {
            ComposerKt.Y(-756081143, i2, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:120)");
        }
        Indication indication = (Indication) composer.C(IndicationKt.a());
        if (indication instanceof IndicationNodeFactory) {
            composer.X(617653824);
            composer.M();
            mutableInteractionSource = null;
        } else {
            composer.X(617786442);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = InteractionSourceKt.a();
                composer.N(g2);
            }
            mutableInteractionSource = (MutableInteractionSource) g2;
            composer.M();
        }
        Modifier c2 = ClickableKt.c(Modifier.f15489d, mutableInteractionSource, indication, this.f3021z, this.f3019A, this.f3020B, this.C);
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
