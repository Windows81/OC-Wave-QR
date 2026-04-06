package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class MovableContentKt$movableContentWithReceiverOf$movableContent$1 implements Function3<Object, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f14723z;

    public final void b(Object obj, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.W(obj) : composer.l(obj) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(668517896, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:171)");
            }
            this.f14723z.d(obj, composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
