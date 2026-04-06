package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$itemsIndexed$5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f4562A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function5 f4563z;

    public final void b(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = (composer.W(lazyGridItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.i(i2) ? 32 : 16;
        }
        if (composer.E((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1229287273, i4, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:579)");
            }
            this.f4563z.n(lazyGridItemScope, Integer.valueOf(i2), this.f4562A.get(i2), composer, Integer.valueOf(i4 & 126));
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
