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
final class ClickableKt$combinedClickable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f3024A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f3025B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Function0 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f3026z;

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.X(-1534186401);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1534186401, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:264)");
        }
        Indication indication = (Indication) composer.C(IndicationKt.a());
        if (indication instanceof IndicationNodeFactory) {
            composer.X(-1726068379);
            composer.M();
            mutableInteractionSource = null;
        } else {
            composer.X(-1725935761);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = InteractionSourceKt.a();
                composer.N(g2);
            }
            mutableInteractionSource = (MutableInteractionSource) g2;
            composer.M();
        }
        Modifier g3 = ClickableKt.g(Modifier.f15489d, mutableInteractionSource, indication, this.f3026z, this.f3024A, this.f3025B, this.C, this.D, this.E, this.F, this.G);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return g3;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
