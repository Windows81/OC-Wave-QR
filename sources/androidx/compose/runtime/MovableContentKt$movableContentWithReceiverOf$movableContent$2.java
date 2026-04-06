package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

@Metadata
final class MovableContentKt$movableContentWithReceiverOf$movableContent$2 implements Function3<Pair<Object, Object>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f14724z;

    public final void b(Pair pair, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.W(pair) : composer.l(pair) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-95003188, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:196)");
            }
            this.f14724z.j(pair.e(), pair.f(), composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Pair) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
