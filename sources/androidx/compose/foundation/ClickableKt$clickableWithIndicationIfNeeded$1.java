package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ClickableKt$clickableWithIndicationIfNeeded$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f3022A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Indication f3023z;

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
        Modifier o0 = IndicationKt.b(Modifier.f15489d, mutableInteractionSource, this.f3023z).o0((Modifier) this.f3022A.m(mutableInteractionSource, (Object) null));
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
