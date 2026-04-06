package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7377A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7378B;
    public final /* synthetic */ float C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Shape G;
    public final /* synthetic */ float H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ Function3 K;
    public final /* synthetic */ Function3 L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f7379z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, Function2 function2, Function2 function22, float f2, int i2, Function3 function3, boolean z2, Shape shape, float f3, long j2, long j3, Function3 function32, Function3 function33) {
        super(2);
        this.f7379z = bottomSheetScaffoldState;
        this.f7377A = function2;
        this.f7378B = function22;
        this.C = f2;
        this.D = i2;
        this.E = function3;
        this.F = z2;
        this.G = shape;
        this.H = f3;
        this.I = j2;
        this.J = j3;
        this.K = function32;
        this.L = function33;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.runtime.Composer r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r10 = r23
            r1 = r24
            r2 = r1 & 3
            r3 = 2
            r4 = 1
            if (r2 == r3) goto L_0x000e
            r2 = r4
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r3 = r1 & 1
            boolean r2 = r10.E(r2, r3)
            if (r2 == 0) goto L_0x00b0
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)"
            r5 = -131096268(0xfffffffff82fa134, float:-1.4248774E34)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r3)
        L_0x0026:
            androidx.compose.material.BottomSheetScaffoldState r1 = r0.f7379z
            androidx.compose.material.BottomSheetState r9 = r1.a()
            kotlin.jvm.functions.Function2 r1 = r0.f7377A
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$1 r2 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$1
            kotlin.jvm.functions.Function3 r3 = r0.E
            float r5 = r0.C
            r2.<init>(r3, r5)
            r3 = 1143451324(0x4427aebc, float:670.7302)
            r5 = 54
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r4, r2, r10, r5)
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$2 r3 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$2
            boolean r12 = r0.F
            androidx.compose.material.BottomSheetScaffoldState r13 = r0.f7379z
            float r14 = r0.C
            androidx.compose.ui.graphics.Shape r15 = r0.G
            float r6 = r0.H
            long r7 = r0.I
            long r4 = r0.J
            kotlin.jvm.functions.Function3 r11 = r0.K
            r21 = r11
            r11 = r3
            r16 = r6
            r17 = r7
            r19 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r21)
            r4 = 1856649243(0x6eaa381b, float:2.634014E28)
            r5 = 1
            r6 = 54
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r5, r3, r10, r6)
            kotlin.jvm.functions.Function2 r4 = r0.f7378B
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$3 r7 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$3
            kotlin.jvm.functions.Function3 r8 = r0.L
            androidx.compose.material.BottomSheetScaffoldState r11 = r0.f7379z
            r7.<init>(r8, r11)
            r8 = -1011922215(0xffffffffc3af4ad9, float:-350.58475)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r5, r7, r10, r6)
            float r6 = r0.C
            androidx.compose.material.BottomSheetScaffoldState r7 = r0.f7379z
            boolean r7 = r10.W(r7)
            androidx.compose.material.BottomSheetScaffoldState r8 = r0.f7379z
            java.lang.Object r11 = r23.g()
            if (r7 != 0) goto L_0x0092
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r11 != r7) goto L_0x009a
        L_0x0092:
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$4$1 r11 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$4$1
            r11.<init>(r8)
            r10.N(r11)
        L_0x009a:
            r7 = r11
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            int r8 = r0.D
            r11 = 25008(0x61b0, float:3.5044E-41)
            r10 = r23
            androidx.compose.material.BottomSheetScaffoldKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00b3
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00b3
        L_0x00b0:
            r23.B()
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.b(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
