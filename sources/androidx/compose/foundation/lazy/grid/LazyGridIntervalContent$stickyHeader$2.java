package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyGridIntervalContent$stickyHeader$2 extends Lambda implements Function3<LazyGridItemScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4592A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f4593z;

    public final void b(LazyGridItemScope lazyGridItemScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.W(lazyGridItemScope) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2045010142, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
            }
            this.f4593z.j(lazyGridItemScope, Integer.valueOf(this.f4592A), composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((LazyGridItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
