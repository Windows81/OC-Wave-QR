package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

@Metadata
public final class BadgeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7280a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f7281b = Dp.m((float) 8);

    /* renamed from: c  reason: collision with root package name */
    public static final long f7282c = TextUnitKt.i(10);

    /* renamed from: d  reason: collision with root package name */
    public static final float f7283d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f7284e = Dp.m(-Dp.m((float) 6));

    /* renamed from: f  reason: collision with root package name */
    public static final float f7285f;

    static {
        float f2 = (float) 4;
        f7280a = Dp.m(f2);
        f7283d = Dp.m(f2);
        f7285f = Dp.m(-Dp.m(f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r17, long r18, long r20, kotlin.jvm.functions.Function3 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r7 = r24
            r0 = 1133484502(0x438f99d6, float:287.20184)
            r1 = r23
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r25 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r7 | 6
            r5 = r4
            r4 = r17
            goto L_0x002a
        L_0x0016:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x0027
            r4 = r17
            boolean r5 = r1.W(r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r7
            goto L_0x002a
        L_0x0027:
            r4 = r17
            r5 = r7
        L_0x002a:
            r6 = r7 & 48
            if (r6 != 0) goto L_0x0041
            r6 = r25 & 2
            r8 = r18
            if (r6 != 0) goto L_0x003d
            boolean r6 = r1.j(r8)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r5 = r5 | r6
            goto L_0x0043
        L_0x0041:
            r8 = r18
        L_0x0043:
            r6 = r7 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r25 & 4
            r10 = r20
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.j(r10)
            if (r6 == 0) goto L_0x0056
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r6
            goto L_0x005c
        L_0x005a:
            r10 = r20
        L_0x005c:
            r6 = r25 & 8
            if (r6 == 0) goto L_0x0065
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r12 = r22
            goto L_0x0077
        L_0x0065:
            r12 = r7 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0062
            r12 = r22
            boolean r13 = r1.l(r12)
            if (r13 == 0) goto L_0x0074
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r5 = r5 | r13
        L_0x0077:
            r13 = r5 & 1171(0x493, float:1.641E-42)
            r14 = 1170(0x492, float:1.64E-42)
            r15 = 1
            if (r13 == r14) goto L_0x0080
            r13 = r15
            goto L_0x0081
        L_0x0080:
            r13 = 0
        L_0x0081:
            r14 = r5 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x01cd
            r1.p()
            r13 = r7 & 1
            r14 = 0
            if (r13 == 0) goto L_0x00a9
            boolean r13 = r1.J()
            if (r13 == 0) goto L_0x0098
            goto L_0x00a9
        L_0x0098:
            r1.B()
            r2 = r25 & 2
            if (r2 == 0) goto L_0x00a1
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a1:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x00a7
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a7:
            r2 = r4
            goto L_0x00d2
        L_0x00a9:
            if (r2 == 0) goto L_0x00ae
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00af
        L_0x00ae:
            r2 = r4
        L_0x00af:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x00c0
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r8 = 6
            androidx.compose.material.Colors r4 = r4.a(r1, r8)
            long r8 = r4.d()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c0:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x00cf
            int r4 = r5 >> 3
            r4 = r4 & 14
            long r10 = androidx.compose.material.ColorsKt.b(r8, r1, r4)
            r4 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r4
        L_0x00cf:
            if (r6 == 0) goto L_0x00d2
            r12 = r14
        L_0x00d2:
            r1.U()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x00e1
            r4 = -1
            java.lang.String r6 = "androidx.compose.material.Badge (Badge.kt:129)"
            androidx.compose.runtime.ComposerKt.Y(r0, r5, r4, r6)
        L_0x00e1:
            if (r12 == 0) goto L_0x00e6
            float r0 = f7281b
            goto L_0x00e8
        L_0x00e6:
            float r0 = f7280a
        L_0x00e8:
            androidx.compose.foundation.shape.RoundedCornerShape r4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r0)
            float r5 = (float) r3
            float r0 = r0 * r5
            float r5 = androidx.compose.ui.unit.Dp.m(r0)
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.a(r2, r5, r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.a(r0, r8, r4)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.ClipKt.a(r0, r4)
            float r4 = f7283d
            r5 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.k(r0, r4, r5, r3, r14)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r3 = r3.i()
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r4 = r4.b()
            r5 = 54
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.RowKt.b(r4, r3, r1, r5)
            r4 = 0
            int r4 = androidx.compose.runtime.ComposablesKt.a(r1, r4)
            androidx.compose.runtime.CompositionLocalMap r6 = r1.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r1, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r13.a()
            androidx.compose.runtime.Applier r16 = r1.v()
            if (r16 != 0) goto L_0x0137
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0137:
            r1.s()
            boolean r16 = r1.n()
            if (r16 == 0) goto L_0x0144
            r1.y(r14)
            goto L_0x0147
        L_0x0144:
            r1.K()
        L_0x0147:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r5 = r13.c()
            androidx.compose.runtime.Updater.g(r14, r3, r5)
            kotlin.jvm.functions.Function2 r3 = r13.e()
            androidx.compose.runtime.Updater.g(r14, r6, r3)
            kotlin.jvm.functions.Function2 r3 = r13.b()
            boolean r5 = r14.n()
            if (r5 != 0) goto L_0x0171
            java.lang.Object r5 = r14.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            if (r5 != 0) goto L_0x017f
        L_0x0171:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r14.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14.A(r4, r3)
        L_0x017f:
            kotlin.jvm.functions.Function2 r3 = r13.d()
            androidx.compose.runtime.Updater.g(r14, r0, r3)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            if (r12 == 0) goto L_0x01b5
            r3 = 1448027890(0x564f26f2, float:5.6941544E13)
            r1.X(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r4 = androidx.compose.ui.graphics.Color.h(r10)
            androidx.compose.runtime.ProvidedValue r3 = r3.d(r4)
            androidx.compose.material.BadgeKt$Badge$1$1 r4 = new androidx.compose.material.BadgeKt$Badge$1$1
            r4.<init>(r12, r0)
            r0 = 1784526485(0x6a5db695, float:6.7008706E25)
            r5 = 54
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r15, r4, r1, r5)
            int r4 = androidx.compose.runtime.ProvidedValue.f14769i
            r4 = r4 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r3, r0, r1, r4)
            r1.M()
            goto L_0x01be
        L_0x01b5:
            r0 = 1448293126(0x56533306, float:5.8054024E13)
            r1.X(r0)
            r1.M()
        L_0x01be:
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ca
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ca:
            r4 = r10
            r6 = r12
            goto L_0x01d2
        L_0x01cd:
            r1.B()
            r2 = r4
            goto L_0x01ca
        L_0x01d2:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x01e7
            androidx.compose.material.BadgeKt$Badge$2 r11 = new androidx.compose.material.BadgeKt$Badge$2
            r0 = r11
            r1 = r2
            r2 = r8
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r10.a(r11)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BadgeKt.a(androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function3 r17, androidx.compose.ui.Modifier r18, kotlin.jvm.functions.Function3 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r1 = r17
            r3 = r19
            r4 = r21
            r0 = 859805272(0x333f9658, float:4.460739E-8)
            r2 = r20
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r5 = r22 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0025
            boolean r5 = r2.l(r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r4
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x002f
            r5 = r5 | 48
        L_0x002c:
            r7 = r18
            goto L_0x0041
        L_0x002f:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r18
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r5 = r5 | r8
        L_0x0041:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x0048
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0048:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r2.l(r3)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r5 = r5 | r8
        L_0x0058:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            r10 = 0
            if (r8 == r9) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = r10
        L_0x0062:
            r9 = r5 & 1
            boolean r8 = r2.E(r8, r9)
            if (r8 == 0) goto L_0x0214
            if (r6 == 0) goto L_0x006f
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0070
        L_0x006f:
            r6 = r7
        L_0x0070:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x007c
            r7 = -1
            java.lang.String r8 = "androidx.compose.material.BadgedBox (Badge.kt:61)"
            androidx.compose.runtime.ComposerKt.Y(r0, r5, r7, r8)
        L_0x007c:
            androidx.compose.material.BadgeKt$BadgedBox$2 r0 = androidx.compose.material.BadgeKt$BadgedBox$2.f7293a
            int r7 = androidx.compose.runtime.ComposablesKt.a(r2, r10)
            androidx.compose.runtime.CompositionLocalMap r8 = r2.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r2, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r11.a()
            androidx.compose.runtime.Applier r13 = r2.v()
            if (r13 != 0) goto L_0x0099
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0099:
            r2.s()
            boolean r13 = r2.n()
            if (r13 == 0) goto L_0x00a6
            r2.y(r12)
            goto L_0x00a9
        L_0x00a6:
            r2.K()
        L_0x00a9:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r2)
            kotlin.jvm.functions.Function2 r13 = r11.c()
            androidx.compose.runtime.Updater.g(r12, r0, r13)
            kotlin.jvm.functions.Function2 r0 = r11.e()
            androidx.compose.runtime.Updater.g(r12, r8, r0)
            kotlin.jvm.functions.Function2 r0 = r11.b()
            boolean r8 = r12.n()
            if (r8 != 0) goto L_0x00d3
            java.lang.Object r8 = r12.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r13)
            if (r8 != 0) goto L_0x00e1
        L_0x00d3:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.N(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.A(r7, r0)
        L_0x00e1:
            kotlin.jvm.functions.Function2 r0 = r11.d()
            androidx.compose.runtime.Updater.g(r12, r9, r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r7 = "anchor"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.layout.LayoutIdKt.b(r0, r7)
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r9 = r8.e()
            int r12 = r5 << 3
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | 54
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.g(r9, r10)
            int r13 = androidx.compose.runtime.ComposablesKt.a(r2, r10)
            androidx.compose.runtime.CompositionLocalMap r14 = r2.I()
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.ComposedModifierKt.e(r2, r7)
            kotlin.jvm.functions.Function0 r15 = r11.a()
            androidx.compose.runtime.Applier r16 = r2.v()
            if (r16 != 0) goto L_0x0119
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0119:
            r2.s()
            boolean r16 = r2.n()
            if (r16 == 0) goto L_0x0126
            r2.y(r15)
            goto L_0x0129
        L_0x0126:
            r2.K()
        L_0x0129:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r2)
            kotlin.jvm.functions.Function2 r10 = r11.c()
            androidx.compose.runtime.Updater.g(r15, r9, r10)
            kotlin.jvm.functions.Function2 r9 = r11.e()
            androidx.compose.runtime.Updater.g(r15, r14, r9)
            kotlin.jvm.functions.Function2 r9 = r11.b()
            boolean r10 = r15.n()
            if (r10 != 0) goto L_0x0153
            java.lang.Object r10 = r15.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r14)
            if (r10 != 0) goto L_0x0161
        L_0x0153:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r15.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r15.A(r10, r9)
        L_0x0161:
            kotlin.jvm.functions.Function2 r9 = r11.d()
            androidx.compose.runtime.Updater.g(r15, r7, r9)
            androidx.compose.foundation.layout.BoxScopeInstance r7 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r9 = r12 >> 6
            r9 = r9 & 112(0x70, float:1.57E-43)
            r9 = r9 | 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.d(r7, r2, r9)
            r2.T()
            java.lang.String r9 = "badge"
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.LayoutIdKt.b(r0, r9)
            int r5 = r5 << 9
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | 6
            androidx.compose.ui.Alignment r8 = r8.o()
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.g(r8, r9)
            int r9 = androidx.compose.runtime.ComposablesKt.a(r2, r9)
            androidx.compose.runtime.CompositionLocalMap r10 = r2.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r2, r0)
            kotlin.jvm.functions.Function0 r12 = r11.a()
            androidx.compose.runtime.Applier r13 = r2.v()
            if (r13 != 0) goto L_0x01a8
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01a8:
            r2.s()
            boolean r13 = r2.n()
            if (r13 == 0) goto L_0x01b5
            r2.y(r12)
            goto L_0x01b8
        L_0x01b5:
            r2.K()
        L_0x01b8:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r2)
            kotlin.jvm.functions.Function2 r13 = r11.c()
            androidx.compose.runtime.Updater.g(r12, r8, r13)
            kotlin.jvm.functions.Function2 r8 = r11.e()
            androidx.compose.runtime.Updater.g(r12, r10, r8)
            kotlin.jvm.functions.Function2 r8 = r11.b()
            boolean r10 = r12.n()
            if (r10 != 0) goto L_0x01e2
            java.lang.Object r10 = r12.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r13)
            if (r10 != 0) goto L_0x01f0
        L_0x01e2:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.N(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.A(r9, r8)
        L_0x01f0:
            kotlin.jvm.functions.Function2 r8 = r11.d()
            androidx.compose.runtime.Updater.g(r12, r0, r8)
            int r0 = r5 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.d(r7, r2, r0)
            r2.T()
            r2.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0218
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0218
        L_0x0214:
            r2.B()
            r6 = r7
        L_0x0218:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.x()
            if (r7 == 0) goto L_0x0230
            androidx.compose.material.BadgeKt$BadgedBox$3 r8 = new androidx.compose.material.BadgeKt$BadgedBox$3
            r0 = r8
            r1 = r17
            r2 = r6
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BadgeKt.b(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float d() {
        return f7285f;
    }

    public static final float e() {
        return f7280a;
    }

    public static final float f() {
        return f7284e;
    }
}
