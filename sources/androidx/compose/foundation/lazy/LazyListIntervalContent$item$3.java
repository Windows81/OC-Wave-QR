package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListIntervalContent$item$3 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f4364z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListIntervalContent$item$3(Function3 function3) {
        super(4);
        this.f4364z = function3;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= composer.W(lazyItemScope) ? 4 : 2;
        }
        if (composer.E((i3 & 131) != 130, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1010194746, i3, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:59)");
            }
            this.f4364z.d(lazyItemScope, composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
