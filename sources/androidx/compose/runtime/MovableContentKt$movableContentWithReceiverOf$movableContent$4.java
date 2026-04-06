package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;

@Metadata
final class MovableContentKt$movableContentWithReceiverOf$movableContent$4 implements Function3<Object[], Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function6 f14726z;

    public final void b(Object[] objArr, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-346590649, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:248)");
        }
        this.f14726z.l(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Object[]) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
