package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

@Metadata
final class MovableContentKt$movableContentOf$4 implements Function5<Object, Object, Object, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MovableContent f14713z;

    public final void b(Object obj, Object obj2, Object obj3, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composer.W(obj) : composer.l(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composer.W(obj2) : composer.l(obj2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? composer.W(obj3) : composer.l(obj3) ? 256 : 128;
        }
        if (composer.E((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1477386365, i3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
            }
            composer.V(this.f14713z, new Triple(obj, obj2, obj3));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
        return Unit.f40552a;
    }
}
