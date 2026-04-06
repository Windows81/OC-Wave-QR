package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class TabRowKt$SecondaryScrollableTabRow$3 implements Function3<TabIndicatorScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f11320z;

    public final void b(TabIndicatorScope tabIndicatorScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.W(tabIndicatorScope) : composer.l(tabIndicatorScope) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(407893741, i2, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:1229)");
            }
            TabRowDefaults.f11293a.e(tabIndicatorScope.a(Modifier.f15489d, this.f11320z, false), 0.0f, 0, composer, 3072, 6);
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
