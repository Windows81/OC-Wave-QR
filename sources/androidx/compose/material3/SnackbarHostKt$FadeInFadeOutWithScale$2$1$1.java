package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11165A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f11166z;

    public SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(Function3 function3, SnackbarData snackbarData) {
        this.f11166z = function3;
        this.f11165A = snackbarData;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1893791890, i2, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:382)");
            }
            Function3 function3 = this.f11166z;
            SnackbarData snackbarData = this.f11165A;
            Intrinsics.f(snackbarData);
            function3.d(snackbarData, composer, 0);
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
