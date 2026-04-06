package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class RadioButtonKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8220a = Dp.m((float) 24);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8221b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f8222c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f8223d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f8224e = Dp.m((float) 12);

    /* renamed from: f  reason: collision with root package name */
    public static final float f8225f;

    static {
        float f2 = (float) 2;
        f8221b = Dp.m(f2);
        float m2 = Dp.m((float) 20);
        f8222c = m2;
        f8223d = Dp.m(m2 / f2);
        f8225f = Dp.m(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r27, kotlin.jvm.functions.Function0 r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.foundation.interaction.MutableInteractionSource r31, androidx.compose.material.RadioButtonColors r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r7 = r27
            r8 = r28
            r9 = r34
            r0 = 1314435585(0x4e58b201, float:9.0888608E8)
            r1 = r33
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r35 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r9 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r6.d(r7)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r9
            goto L_0x0026
        L_0x0025:
            r1 = r9
        L_0x0026:
            r2 = r35 & 2
            if (r2 == 0) goto L_0x002d
            r1 = r1 | 48
            goto L_0x003d
        L_0x002d:
            r2 = r9 & 48
            if (r2 != 0) goto L_0x003d
            boolean r2 = r6.l(r8)
            if (r2 == 0) goto L_0x003a
            r2 = 32
            goto L_0x003c
        L_0x003a:
            r2 = 16
        L_0x003c:
            r1 = r1 | r2
        L_0x003d:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x0046
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0043:
            r3 = r29
            goto L_0x0058
        L_0x0046:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r29
            boolean r4 = r6.W(r3)
            if (r4 == 0) goto L_0x0055
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r1 = r1 | r4
        L_0x0058:
            r4 = r35 & 8
            if (r4 == 0) goto L_0x0061
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x005e:
            r10 = r30
            goto L_0x0073
        L_0x0061:
            r10 = r9 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x005e
            r10 = r30
            boolean r11 = r6.d(r10)
            if (r11 == 0) goto L_0x0070
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r1 = r1 | r11
        L_0x0073:
            r11 = r35 & 16
            if (r11 == 0) goto L_0x007c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0079:
            r12 = r31
            goto L_0x008e
        L_0x007c:
            r12 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0079
            r12 = r31
            boolean r13 = r6.W(r12)
            if (r13 == 0) goto L_0x008b
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r1 = r1 | r13
        L_0x008e:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r9
            if (r13 != 0) goto L_0x00a8
            r13 = r35 & 32
            if (r13 != 0) goto L_0x00a2
            r13 = r32
            boolean r14 = r6.W(r13)
            if (r14 == 0) goto L_0x00a4
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00a2:
            r13 = r32
        L_0x00a4:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00a6:
            r1 = r1 | r14
            goto L_0x00aa
        L_0x00a8:
            r13 = r32
        L_0x00aa:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            r5 = 0
            r16 = 1
            if (r14 == r15) goto L_0x00b9
            r14 = r16
            goto L_0x00ba
        L_0x00b9:
            r14 = r5
        L_0x00ba:
            r15 = r1 & 1
            boolean r14 = r6.E(r14, r15)
            if (r14 == 0) goto L_0x01f8
            r6.p()
            r14 = r9 & 1
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = 0
            if (r14 == 0) goto L_0x00e3
            boolean r14 = r6.J()
            if (r14 == 0) goto L_0x00d4
            goto L_0x00e3
        L_0x00d4:
            r6.B()
            r2 = r35 & 32
            if (r2 == 0) goto L_0x00dd
            r1 = r1 & r20
        L_0x00dd:
            r4 = r3
            r3 = r10
            r17 = r12
        L_0x00e1:
            r2 = r13
            goto L_0x0117
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00e9
        L_0x00e8:
            r2 = r3
        L_0x00e9:
            if (r4 == 0) goto L_0x00ee
            r3 = r16
            goto L_0x00ef
        L_0x00ee:
            r3 = r10
        L_0x00ef:
            if (r11 == 0) goto L_0x00f3
            r4 = r15
            goto L_0x00f4
        L_0x00f3:
            r4 = r12
        L_0x00f4:
            r10 = r35 & 32
            if (r10 == 0) goto L_0x0113
            androidx.compose.material.RadioButtonDefaults r10 = androidx.compose.material.RadioButtonDefaults.f8219a
            r18 = 3072(0xc00, float:4.305E-42)
            r19 = 7
            r11 = 0
            r13 = 0
            r16 = 0
            r15 = r16
            r17 = r6
            androidx.compose.material.RadioButtonColors r10 = r10.a(r11, r13, r15, r17, r18, r19)
            r1 = r1 & r20
            r17 = r4
            r4 = r2
            r2 = r10
            goto L_0x0117
        L_0x0113:
            r17 = r4
            r4 = r2
            goto L_0x00e1
        L_0x0117:
            r6.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0126
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.RadioButton (RadioButton.kt:81)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r10, r11)
        L_0x0126:
            if (r7 == 0) goto L_0x0133
            float r0 = f8224e
            r15 = 2
            float r10 = (float) r15
            float r0 = r0 / r10
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
        L_0x0131:
            r10 = r0
            goto L_0x013a
        L_0x0133:
            r15 = 2
            float r0 = (float) r5
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            goto L_0x0131
        L_0x013a:
            r0 = 100
            r11 = 6
            r14 = 0
            androidx.compose.animation.core.TweenSpec r11 = androidx.compose.animation.core.AnimationSpecKt.n(r0, r5, r14, r11, r14)
            r0 = 48
            r16 = 12
            r12 = 0
            r13 = 0
            r14 = r6
            r18 = r15
            r15 = r0
            androidx.compose.runtime.State r10 = androidx.compose.animation.core.AnimateAsStateKt.c(r10, r11, r12, r13, r14, r15, r16)
            int r0 = r1 >> 9
            r11 = r0 & 14
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r11
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            androidx.compose.runtime.State r11 = r2.a(r3, r7, r6, r0)
            if (r8 == 0) goto L_0x0191
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.f()
            float r22 = f8220a
            r25 = 4
            r26 = 0
            r21 = 0
            r23 = 0
            androidx.compose.foundation.IndicationNodeFactory r12 = androidx.compose.material.RippleKt.f(r21, r22, r23, r25, r26)
            androidx.compose.ui.semantics.Role r13 = androidx.compose.ui.semantics.Role.j(r1)
            r1 = r27
            r14 = r2
            r2 = r17
            r15 = r3
            r3 = r12
            r12 = r4
            r4 = r15
            r9 = r5
            r7 = r18
            r5 = r13
            r13 = r6
            r6 = r28
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.SelectableKt.a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x019a
        L_0x0191:
            r14 = r2
            r15 = r3
            r12 = r4
            r9 = r5
            r13 = r6
            r7 = r18
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
        L_0x019a:
            if (r8 == 0) goto L_0x01a3
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.material.InteractiveComponentSizeKt.c(r1)
            goto L_0x01a5
        L_0x01a3:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
        L_0x01a5:
            androidx.compose.ui.Modifier r1 = r12.o0(r1)
            androidx.compose.ui.Modifier r0 = r1.o0(r0)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.e()
            r2 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.E(r0, r1, r9, r7, r2)
            float r1 = f8221b
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.i(r0, r1)
            float r1 = f8222c
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.o(r0, r1)
            boolean r1 = r13.W(r11)
            boolean r2 = r13.W(r10)
            r1 = r1 | r2
            java.lang.Object r2 = r13.g()
            if (r1 != 0) goto L_0x01db
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x01e3
        L_0x01db:
            androidx.compose.material.RadioButtonKt$RadioButton$1$1 r2 = new androidx.compose.material.RadioButtonKt$RadioButton$1$1
            r2.<init>(r11, r10)
            r13.N(r2)
        L_0x01e3:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.foundation.CanvasKt.b(r0, r2, r13, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f1
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f1:
            r3 = r12
            r0 = r13
            r6 = r14
            r4 = r15
            r5 = r17
            goto L_0x01ff
        L_0x01f8:
            r0 = r6
            r0.B()
            r4 = r10
            r5 = r12
            r6 = r13
        L_0x01ff:
            androidx.compose.runtime.ScopeUpdateScope r9 = r0.x()
            if (r9 == 0) goto L_0x0216
            androidx.compose.material.RadioButtonKt$RadioButton$2 r10 = new androidx.compose.material.RadioButtonKt$RadioButton$2
            r0 = r10
            r1 = r27
            r2 = r28
            r7 = r34
            r8 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonKt.a(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.RadioButtonColors, androidx.compose.runtime.Composer, int, int):void");
    }
}
