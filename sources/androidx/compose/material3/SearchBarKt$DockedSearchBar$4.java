package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class SearchBarKt$DockedSearchBar$4 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f10838A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f10839B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ MutableInteractionSource J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10840z;

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1275782414, i3, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:2049)");
            }
            SearchBarDefaults.f10786a.e(this.f10838A, this.f10839B, this.C, this.D, this.E, SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), this.F, this.G, this.H, this.I, this.f10840z.c(), this.J, composer, 196608, 384, 0);
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
