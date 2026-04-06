package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ComposableSingletons$TabRowKt$lambda$303717663$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$TabRowKt$lambda$303717663$1 f9609z = new ComposableSingletons$TabRowKt$lambda$303717663$1();

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(303717663, i2, -1, "androidx.compose.material3.ComposableSingletons$TabRowKt.lambda$303717663.<anonymous> (TabRow.kt:336)");
            }
            DividerKt.e((Modifier) null, 0.0f, 0, composer, 0, 7);
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
