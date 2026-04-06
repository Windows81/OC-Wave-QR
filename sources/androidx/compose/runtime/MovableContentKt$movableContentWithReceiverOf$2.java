package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
final class MovableContentKt$movableContentWithReceiverOf$2 implements Function4<Object, Object, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MovableContent f14720z;

    public final void b(Object obj, Object obj2, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composer.W(obj) : composer.l(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composer.W(obj2) : composer.l(obj2) ? 32 : 16;
        }
        if (composer.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1349529900, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
            }
            composer.V(this.f14720z, TuplesKt.a(obj, obj2));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
