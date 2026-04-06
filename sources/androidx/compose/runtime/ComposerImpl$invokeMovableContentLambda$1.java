package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ComposerImpl$invokeMovableContentLambda$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f14607A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MovableContent f14608z;

    public ComposerImpl$invokeMovableContentLambda$1(MovableContent movableContent, Object obj) {
        this.f14608z = movableContent;
        this.f14607A = obj;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(316014703, i2, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
            }
            this.f14608z.a().d(this.f14607A, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
