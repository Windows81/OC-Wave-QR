package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyGridIntervalContent$item$4 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f4590z;

    public final void b(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= composer.W(lazyGridItemScope) ? 4 : 2;
        }
        if (composer.E((i3 & 131) != 130, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-34608120, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
            }
            this.f4590z.d(lazyGridItemScope, composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
