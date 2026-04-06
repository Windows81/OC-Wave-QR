package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class TabRowKt$TabRow$1 implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f11322z;

    public final void b(List list, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(906699528, i2, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:1340)");
        }
        if (this.f11322z < list.size()) {
            composer.X(436390614);
            TabRowDefaults tabRowDefaults = TabRowDefaults.f11293a;
            tabRowDefaults.e(tabRowDefaults.h(Modifier.f15489d, (TabPosition) list.get(this.f11322z)), 0.0f, 0, composer, 3072, 6);
            composer.M();
        } else {
            composer.X(436548218);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((List) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
