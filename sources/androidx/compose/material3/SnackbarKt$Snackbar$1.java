package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SnackbarKt$Snackbar$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11187A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11188B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11189z;

    public SnackbarKt$Snackbar$1(boolean z2, Function2 function2, Function2 function22, Function2 function23, long j2, long j3) {
        this.f11189z = z2;
        this.f11187A = function2;
        this.f11188B = function22;
        this.C = function23;
        this.D = j2;
        this.E = j3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1343524879, i2, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:118)");
            }
            SnackbarTokens snackbarTokens = SnackbarTokens.f14050a;
            TextStyle e2 = TypographyKt.e(snackbarTokens.i(), composer, 6);
            final TextStyle e3 = TypographyKt.e(snackbarTokens.b(), composer, 6);
            ProvidedValue d2 = TextKt.q().d(e2);
            final boolean z2 = this.f11189z;
            final Function2 function2 = this.f11187A;
            final Function2 function22 = this.f11188B;
            final Function2 function23 = this.C;
            final long j2 = this.D;
            final long j3 = this.E;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(969655473, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(969655473, i2, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:121)");
                        }
                        if (!z2 || function2 == null) {
                            composer.X(-168976609);
                            SnackbarKt.g(function22, function2, function23, e3, j2, j3, composer, 0);
                            composer.M();
                        } else {
                            composer.X(-168990288);
                            SnackbarKt.e(function22, function2, function23, e3, j2, j3, composer, 0);
                            composer.M();
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
