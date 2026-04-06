package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$items$10 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object[] f5007A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f5008z;

    public final void b(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = (composer.W(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.i(i2) ? 32 : 16;
        }
        if (composer.E((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2101296000, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:480)");
            }
            this.f5008z.j(lazyStaggeredGridItemScope, this.f5007A[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
