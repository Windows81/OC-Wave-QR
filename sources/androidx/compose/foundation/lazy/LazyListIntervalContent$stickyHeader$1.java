package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
final class LazyListIntervalContent$stickyHeader$1 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4365A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f4366z;

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.W(lazyItemScope) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1491981087, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:73)");
            }
            this.f4366z.j(lazyItemScope, Integer.valueOf(this.f4365A), composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
