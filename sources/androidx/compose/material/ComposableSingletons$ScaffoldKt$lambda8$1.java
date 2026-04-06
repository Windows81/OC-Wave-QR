package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-8$1  reason: invalid class name */
public final class ComposableSingletons$ScaffoldKt$lambda8$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ScaffoldKt$lambda8$1 f7552z = new ComposableSingletons$ScaffoldKt$lambda8$1();

    public ComposableSingletons$ScaffoldKt$lambda8$1() {
        super(2);
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-900670499, i2, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-8.<anonymous> (Scaffold.kt:310)");
            }
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
