package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class MovableContentKt$movableContentOf$movableContent$1 implements Function3 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f14715z;

    public final void b(Void voidR, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-703201834, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
        }
        this.f14715z.m(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Void) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
