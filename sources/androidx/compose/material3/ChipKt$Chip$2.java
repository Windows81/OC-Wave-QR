package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class ChipKt$Chip$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f9421A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f9422B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ ChipColors E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;
    public final /* synthetic */ PaddingValues H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9423z;

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-70915349, i3, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1970)");
            }
            ChipKt.e(this.f9423z, this.f9421A, this.f9422B, this.C, (Function2) null, this.D, this.E.a(this.F), this.E.b(this.F), this.G, this.H, composer, 24576);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
