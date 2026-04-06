package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements Function6<Float, Color, Color, Float, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8764A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f8765B;
    public final /* synthetic */ TextFieldColors C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ InteractionSource F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Shape I;
    public final /* synthetic */ TextFieldType J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ PaddingValues M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ Function2 O;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8766z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8769a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.TextFieldType[] r0 = androidx.compose.material.TextFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.TextFieldType r1 = androidx.compose.material.TextFieldType.Filled     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.TextFieldType r1 = androidx.compose.material.TextFieldType.Outlined     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f8769a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3(Function2 function2, Function2 function22, String str, TextFieldColors textFieldColors, boolean z2, boolean z3, InteractionSource interactionSource, Function2 function23, Function2 function24, Shape shape, TextFieldType textFieldType, Function2 function25, boolean z4, PaddingValues paddingValues, boolean z5, Function2 function26) {
        super(6);
        this.f8766z = function2;
        this.f8764A = function22;
        this.f8765B = str;
        this.C = textFieldColors;
        this.D = z2;
        this.E = z3;
        this.F = interactionSource;
        this.G = function23;
        this.H = function24;
        this.I = shape;
        this.J = textFieldType;
        this.K = function25;
        this.L = z4;
        this.M = paddingValues;
        this.N = z5;
        this.O = function26;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(float r22, long r23, long r25, float r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r21 = this;
            r0 = r21
            r9 = r22
            r10 = r27
            r15 = r28
            r1 = r29
            r2 = r1 & 6
            if (r2 != 0) goto L_0x0019
            boolean r2 = r15.h(r9)
            if (r2 == 0) goto L_0x0016
            r2 = 4
            goto L_0x0017
        L_0x0016:
            r2 = 2
        L_0x0017:
            r2 = r2 | r1
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            r3 = r1 & 48
            r7 = r23
            if (r3 != 0) goto L_0x002c
            boolean r3 = r15.j(r7)
            if (r3 == 0) goto L_0x0029
            r3 = 32
            goto L_0x002b
        L_0x0029:
            r3 = 16
        L_0x002b:
            r2 = r2 | r3
        L_0x002c:
            r3 = r1 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x003f
            r3 = r25
            boolean r5 = r15.j(r3)
            if (r5 == 0) goto L_0x003b
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x003d
        L_0x003b:
            r5 = 128(0x80, float:1.794E-43)
        L_0x003d:
            r2 = r2 | r5
            goto L_0x0041
        L_0x003f:
            r3 = r25
        L_0x0041:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0051
            boolean r1 = r15.h(r10)
            if (r1 == 0) goto L_0x004e
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0050
        L_0x004e:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0050:
            r2 = r2 | r1
        L_0x0051:
            r13 = r2
            r1 = r13 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            r6 = 1
            if (r1 == r2) goto L_0x005b
            r1 = r6
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            r2 = r13 & 1
            boolean r1 = r15.E(r1, r2)
            if (r1 == 0) goto L_0x023f
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0073
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)"
            r5 = 225557475(0xd71bbe3, float:7.449002E-31)
            androidx.compose.runtime.ComposerKt.Y(r5, r13, r1, r2)
        L_0x0073:
            kotlin.jvm.functions.Function2 r5 = r0.f8766z
            r2 = 54
            if (r5 != 0) goto L_0x0086
            r3 = -1572254148(0xffffffffa2494e3c, float:-2.7281997E-18)
            r15.X(r3)
            r28.M()
            r12 = r2
            r14 = r6
            r7 = 0
            goto L_0x00ab
        L_0x0086:
            r1 = -1572254147(0xffffffffa2494e3d, float:-2.7281999E-18)
            r15.X(r1)
            boolean r1 = r0.N
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 r11 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
            r18 = r1
            r1 = r11
            r12 = r2
            r2 = r22
            r3 = r25
            r14 = r6
            r6 = r18
            r7 = r23
            r1.<init>(r2, r3, r5, r6, r7)
            r1 = -1865025495(0xffffffff90d5f829, float:-8.439604E-29)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r14, r11, r15, r12)
            r28.M()
            r7 = r1
        L_0x00ab:
            kotlin.jvm.functions.Function2 r1 = r0.f8764A
            if (r1 == 0) goto L_0x00d9
            java.lang.String r1 = r0.f8765B
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00d9
            r1 = 0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d9
            r1 = -1571270300(0xffffffffa2585164, float:-2.9316546E-18)
            r15.X(r1)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 r1 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
            androidx.compose.material.TextFieldColors r2 = r0.C
            boolean r3 = r0.D
            kotlin.jvm.functions.Function2 r4 = r0.f8764A
            r1.<init>(r10, r2, r3, r4)
            r2 = -413527723(0xffffffffe75a1155, float:-1.0297956E24)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r2, r14, r1, r15, r12)
            r28.M()
            r8 = r1
            goto L_0x00e3
        L_0x00d9:
            r1 = -1570844268(0xffffffffa25ed194, float:-3.019756E-18)
            r15.X(r1)
            r28.M()
            r8 = 0
        L_0x00e3:
            androidx.compose.material.TextFieldColors r1 = r0.C
            boolean r2 = r0.D
            boolean r3 = r0.E
            androidx.compose.foundation.interaction.InteractionSource r4 = r0.F
            r6 = 0
            r5 = r28
            androidx.compose.runtime.State r1 = r1.d(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r1 = r1.v()
            kotlin.jvm.functions.Function2 r3 = r0.G
            if (r3 != 0) goto L_0x010b
            r1 = -1570655509(0xffffffffa261b2eb, float:-3.0587904E-18)
            r15.X(r1)
            r28.M()
            r10 = 0
            goto L_0x0121
        L_0x010b:
            r4 = -1570655508(0xffffffffa261b2ec, float:-3.0587907E-18)
            r15.X(r4)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1 r4 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
            r4.<init>(r1, r3)
            r1 = -1165144581(0xffffffffba8d4dfb, float:-0.0010780686)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r14, r4, r15, r12)
            r28.M()
            r10 = r1
        L_0x0121:
            androidx.compose.material.TextFieldColors r1 = r0.C
            boolean r2 = r0.D
            boolean r3 = r0.E
            androidx.compose.foundation.interaction.InteractionSource r4 = r0.F
            r6 = 0
            r5 = r28
            androidx.compose.runtime.State r1 = r1.g(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r1 = r1.v()
            kotlin.jvm.functions.Function2 r3 = r0.H
            if (r3 != 0) goto L_0x0149
            r1 = -1570361846(0xffffffffa2662e0a, float:-3.1195185E-18)
            r15.X(r1)
            r28.M()
            r6 = 0
            goto L_0x015f
        L_0x0149:
            r4 = -1570361845(0xffffffffa2662e0b, float:-3.1195187E-18)
            r15.X(r4)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 r4 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
            r4.<init>(r1, r3)
            r1 = 1694126319(0x64fa50ef, float:3.6940143E22)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r14, r4, r15, r12)
            r28.M()
            r6 = r1
        L_0x015f:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material.TextFieldColors r2 = r0.C
            boolean r3 = r0.D
            r4 = 0
            androidx.compose.runtime.State r2 = r2.a(r3, r15, r4)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.Color r2 = (androidx.compose.ui.graphics.Color) r2
            long r2 = r2.v()
            androidx.compose.ui.graphics.Shape r5 = r0.I
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.BackgroundKt.a(r1, r2, r5)
            androidx.compose.material.TextFieldType r2 = r0.J
            int[] r3 = androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.WhenMappings.f8769a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r14) goto L_0x0213
            r5 = 2
            if (r2 == r5) goto L_0x0194
            r1 = -1568043975(0xffffffffa2898c39, float:-3.728239E-18)
            r15.X(r1)
            r28.M()
            goto L_0x0235
        L_0x0194:
            r2 = -1569502122(0xffffffffa2734c56, float:-3.2973053E-18)
            r15.X(r2)
            java.lang.Object r2 = r28.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r5.a()
            if (r2 != r11) goto L_0x01b9
            androidx.compose.ui.geometry.Size$Companion r2 = androidx.compose.ui.geometry.Size.f15876b
            long r19 = r2.b()
            androidx.compose.ui.geometry.Size r2 = androidx.compose.ui.geometry.Size.c(r19)
            r4 = 0
            r11 = 2
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r2, r4, r11, r4)
            r15.N(r2)
        L_0x01b9:
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1 r4 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
            androidx.compose.foundation.layout.PaddingValues r11 = r0.M
            kotlin.jvm.functions.Function2 r3 = r0.O
            r4.<init>(r2, r11, r3)
            r3 = -1212965554(0xffffffffb7b39d4e, float:-2.1411714E-5)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r14, r4, r15, r12)
            kotlin.jvm.functions.Function2 r3 = r0.K
            boolean r12 = r0.L
            r4 = r13 & 14
            r14 = 4
            if (r4 != r14) goto L_0x01d6
            r14 = 1
            goto L_0x01d7
        L_0x01d6:
            r14 = 0
        L_0x01d7:
            java.lang.Object r4 = r28.g()
            if (r14 != 0) goto L_0x01e3
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x01eb
        L_0x01e3:
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1 r4 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
            r4.<init>(r9, r2)
            r15.N(r4)
        L_0x01eb:
            r14 = r4
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            androidx.compose.foundation.layout.PaddingValues r5 = r0.M
            int r2 = r13 << 21
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r4
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r13 = r2 | r4
            r16 = 0
            r2 = r3
            r3 = r8
            r4 = r7
            r17 = r5
            r5 = r10
            r7 = r12
            r8 = r22
            r9 = r14
            r10 = r11
            r11 = r17
            r12 = r28
            r14 = r16
            androidx.compose.material.OutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r28.M()
            goto L_0x0235
        L_0x0213:
            r2 = -1570081481(0xffffffffa26a7537, float:-3.1774967E-18)
            r15.X(r2)
            kotlin.jvm.functions.Function2 r2 = r0.K
            boolean r11 = r0.L
            androidx.compose.foundation.layout.PaddingValues r12 = r0.M
            int r3 = r13 << 21
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r3 & r4
            r3 = r7
            r4 = r8
            r5 = r10
            r7 = r11
            r8 = r22
            r9 = r12
            r10 = r28
            r11 = r13
            androidx.compose.material.TextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r28.M()
        L_0x0235:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0242
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0242
        L_0x023f:
            r28.B()
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.b(float, long, long, float, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b(((Number) obj).floatValue(), ((Color) obj2).v(), ((Color) obj3).v(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
        return Unit.f40552a;
    }
}
