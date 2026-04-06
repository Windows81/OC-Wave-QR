package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends Lambda implements Function3<SnackbarData, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 f7555z = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    public ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    public final void b(SnackbarData snackbarData, Composer composer, int i2) {
        int i3;
        SnackbarData snackbarData2 = snackbarData;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? composer2.W(snackbarData) : composer2.l(snackbarData) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(996639038, i3, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:154)");
            }
            SnackbarKt.d(snackbarData, (Modifier) null, false, (Shape) null, 0, 0, 0, 0.0f, composer, i3 & 14, 254);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
