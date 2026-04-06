package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AlertDialogKt$AlertDialogImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9146A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9147B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ long D;
    public final /* synthetic */ float E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9148z;

    public AlertDialogKt$AlertDialogImpl$1(Function2 function2, Function2 function22, Function2 function23, Shape shape, long j2, float f2, long j3, long j4, long j5, Function2 function24, Function2 function25) {
        this.f9148z = function2;
        this.f9146A = function22;
        this.f9147B = function23;
        this.C = shape;
        this.D = j2;
        this.E = f2;
        this.F = j3;
        this.G = j4;
        this.H = j5;
        this.I = function24;
        this.J = function25;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(527420759, i3, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:266)");
            }
            final Function2 function2 = this.I;
            final Function2 function22 = this.J;
            AlertDialogKt.f(ComposableLambdaKt.e(1367541877, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1367541877, i2, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:268)");
                        }
                        float p2 = AlertDialogKt.f9127c;
                        float o2 = AlertDialogKt.f9128d;
                        final Function2 function2 = function2;
                        final Function2 function22 = function22;
                        AlertDialogKt.h(p2, o2, ComposableLambdaKt.e(-459506658, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                boolean z2 = false;
                                if ((i2 & 3) != 2) {
                                    z2 = true;
                                }
                                if (composer.E(z2, i2 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(-459506658, i2, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:272)");
                                    }
                                    Function2 function2 = function2;
                                    if (function2 == null) {
                                        composer.X(-1102039173);
                                    } else {
                                        composer.X(795734342);
                                        function2.m(composer, 0);
                                    }
                                    composer.M();
                                    function22.m(composer, 0);
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
                        }, composer, 54), composer, 438);
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
            }, composer2, 54), (Modifier) null, this.f9148z, this.f9146A, this.f9147B, this.C, this.D, this.E, ColorSchemeKt.k(DialogTokens.f13036a.a(), composer2, 6), this.F, this.G, this.H, composer, 6, 0, 2);
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
