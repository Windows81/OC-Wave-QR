package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class TabRowKt$PrimaryTabRow$1 implements Function3<TabIndicatorScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f11300z;

    public final void b(TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composer.W(tabIndicatorScope) : composer.l(tabIndicatorScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (composer.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1338273762, i3, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:155)");
            }
            TabRowDefaults.f11293a.c(tabIndicatorScope.a(Modifier.f15489d, this.f11300z, true), Dp.f19144A.c(), 0.0f, 0, (Shape) null, composer, 196656, 28);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((TabIndicatorScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
