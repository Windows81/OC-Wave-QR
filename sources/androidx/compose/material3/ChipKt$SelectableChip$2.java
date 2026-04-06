package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class ChipKt$SelectableChip$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f9430A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9431B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ TextStyle D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ PaddingValues I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectableChipColors f9432z;

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-990050154, i3, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2019)");
            }
            ChipKt.c(this.C, this.D, this.f9432z.a(this.f9430A, this.f9431B), this.E, this.F, this.G, this.f9432z.b(this.f9430A, this.f9431B), this.f9432z.c(this.f9430A, this.f9431B), this.H, this.I, composer, 0);
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
