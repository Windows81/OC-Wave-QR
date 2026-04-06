package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class BottomSheetScaffoldKt$BottomSheetScaffold$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9274A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f9275B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ float I;
    public final /* synthetic */ float J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Function3 L;
    public final /* synthetic */ Function3 M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f9276z;

    public static final float e(BottomSheetScaffoldState bottomSheetScaffoldState) {
        return bottomSheetScaffoldState.a().u();
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(999829022, i3, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:140)");
            }
            SheetState a2 = this.f9276z.a();
            Function2 function2 = this.f9274A;
            final Function3 function3 = this.f9275B;
            final float f2 = this.C;
            ComposableLambda e2 = ComposableLambdaKt.e(-519581786, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-519581786, i2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:142)");
                        }
                        function3.d(PaddingKt.e(0.0f, 0.0f, 0.0f, f2, 7, (Object) null), composer, 0);
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
            }, composer2, 54);
            final BottomSheetScaffoldState bottomSheetScaffoldState = this.f9276z;
            final float f3 = this.C;
            final float f4 = this.D;
            final boolean z2 = this.E;
            final Shape shape = this.F;
            final long j2 = this.G;
            long j3 = this.H;
            float f5 = this.I;
            SheetState sheetState = a2;
            ComposableLambda composableLambda = e2;
            Function2 function22 = function2;
            final float f6 = f5;
            final long j4 = j3;
            final float f7 = this.J;
            final Function2 function23 = this.K;
            final Function3 function32 = this.L;
            ComposableLambda e3 = ComposableLambdaKt.e(-815624571, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3 = i2;
                    if (composer.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-815624571, i3, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:147)");
                        }
                        BottomSheetScaffoldKt.k(bottomSheetScaffoldState.a(), f3, f4, z2, shape, j2, j4, f6, f7, function23, function32, composer, 0, 0);
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
            }, composer2, 54);
            final Function3 function33 = this.M;
            final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.f9276z;
            ComposableLambda e4 = ComposableLambdaKt.e(-1111667356, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1111667356, i2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:143)");
                        }
                        function33.d(bottomSheetScaffoldState2.b(), composer, 0);
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
            }, composer2, 54);
            boolean W = composer2.W(this.f9276z);
            BottomSheetScaffoldState bottomSheetScaffoldState3 = this.f9276z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new Q(bottomSheetScaffoldState3);
                composer2.N(g2);
            }
            BottomSheetScaffoldKt.i(function22, composableLambda, e3, e4, (Function0) g2, sheetState, composer, 3504);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
