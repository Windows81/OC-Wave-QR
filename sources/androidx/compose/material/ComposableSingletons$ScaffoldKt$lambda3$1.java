package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$ScaffoldKt$lambda3$1 extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ScaffoldKt$lambda3$1 f7547z = new ComposableSingletons$ScaffoldKt$lambda3$1();

    public ComposableSingletons$ScaffoldKt$lambda3$1() {
        super(3);
    }

    public final void b(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.W(snackbarHostState) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2086581188, i2, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:183)");
            }
            SnackbarHostKt.b(snackbarHostState, (Modifier) null, (Function3) null, composer, i2 & 14, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
