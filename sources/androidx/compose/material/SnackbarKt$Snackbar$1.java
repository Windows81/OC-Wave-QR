package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SnackbarKt$Snackbar$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8478A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8479B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8480z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(Function2 function2, Function2 function22, boolean z2) {
        super(2);
        this.f8480z = function2;
        this.f8478A = function22;
        this.f8479B = z2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2084221700, i2, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:102)");
            }
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(ContentAlpha.f7561a.c(composer, 6)));
            final Function2 function2 = this.f8480z;
            final Function2 function22 = this.f8478A;
            final boolean z2 = this.f8479B;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(1939362236, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1939362236, i2, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:103)");
                        }
                        TextStyle b2 = MaterialTheme.f7937a.c(composer, 6).b();
                        final Function2 function2 = function2;
                        final Function2 function22 = function22;
                        final boolean z2 = z2;
                        TextKt.a(b2, ComposableLambdaKt.e(225114541, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                if (composer.E((i2 & 3) != 2, i2 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(225114541, i2, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:105)");
                                    }
                                    if (function2 == null) {
                                        composer.X(1850968129);
                                        SnackbarKt.e(function22, composer, 0);
                                        composer.M();
                                    } else if (z2) {
                                        composer.X(1850970222);
                                        SnackbarKt.a(function22, function2, composer, 0);
                                        composer.M();
                                    } else {
                                        composer.X(1850972359);
                                        SnackbarKt.b(function22, function2, composer, 0);
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
                        }, composer, 54), composer, 48);
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
