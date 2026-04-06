package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;

@Metadata
final class MovableContentKt$movableContentWithReceiverOf$4 implements Function6<Object, Object, Object, Object, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MovableContent f14722z;

    public final void b(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i2) {
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
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? composer.W(obj4) : composer.l(obj4) ? 2048 : 1024;
        }
        if (composer.E((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(572330192, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:252)");
            }
            composer.V(this.f14722z, new Object[]{obj, obj2, obj3, obj4});
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
        return Unit.f40552a;
    }
}
