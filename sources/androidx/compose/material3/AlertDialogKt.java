package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AlertDialogKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9125a = Dp.m((float) 280);

    /* renamed from: b  reason: collision with root package name */
    public static final float f9126b = Dp.m((float) 560);

    /* renamed from: c  reason: collision with root package name */
    public static final float f9127c = Dp.m((float) 8);

    /* renamed from: d  reason: collision with root package name */
    public static final float f9128d = Dp.m((float) 12);

    /* renamed from: e  reason: collision with root package name */
    public static final PaddingValues f9129e;

    /* renamed from: f  reason: collision with root package name */
    public static final PaddingValues f9130f;

    /* renamed from: g  reason: collision with root package name */
    public static final PaddingValues f9131g;

    /* renamed from: h  reason: collision with root package name */
    public static final PaddingValues f9132h;

    /* renamed from: i  reason: collision with root package name */
    public static final ProvidableCompositionLocal f9133i = CompositionLocalKt.h((SnapshotMutationPolicy) null, new C0062c(), 1, (Object) null);

    static {
        float f2 = (float) 24;
        f9129e = PaddingKt.a(Dp.m(f2));
        float f3 = (float) 16;
        f9130f = PaddingKt.e(0.0f, 0.0f, 0.0f, Dp.m(f3), 7, (Object) null);
        f9131g = PaddingKt.e(0.0f, 0.0f, 0.0f, Dp.m(f3), 7, (Object) null);
        f9132h = PaddingKt.e(0.0f, 0.0f, 0.0f, Dp.m(f2), 7, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(kotlin.jvm.functions.Function2 r33, androidx.compose.ui.Modifier r34, kotlin.jvm.functions.Function2 r35, kotlin.jvm.functions.Function2 r36, kotlin.jvm.functions.Function2 r37, androidx.compose.ui.graphics.Shape r38, long r39, float r41, long r42, long r44, long r46, long r48, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            r14 = r51
            r15 = r53
            r0 = 1378716401(0x522d8af1, float:1.86340098E11)
            r1 = r50
            androidx.compose.runtime.Composer r13 = r1.q(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r14 | 6
            r12 = r33
            goto L_0x0028
        L_0x0016:
            r1 = r14 & 6
            r12 = r33
            if (r1 != 0) goto L_0x0027
            boolean r1 = r13.l(r12)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r4 = r15 & 2
            r6 = 32
            if (r4 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r7 = r34
            goto L_0x0044
        L_0x0033:
            r7 = r14 & 48
            if (r7 != 0) goto L_0x0030
            r7 = r34
            boolean r8 = r13.W(r7)
            if (r8 == 0) goto L_0x0041
            r8 = r6
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r1 = r1 | r8
        L_0x0044:
            r8 = r15 & 4
            if (r8 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            r11 = r35
            goto L_0x005f
        L_0x004d:
            r8 = r14 & 384(0x180, float:5.38E-43)
            r11 = r35
            if (r8 != 0) goto L_0x005f
            boolean r8 = r13.l(r11)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r8
        L_0x005f:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r10 = r36
            goto L_0x007a
        L_0x0068:
            r8 = r14 & 3072(0xc00, float:4.305E-42)
            r10 = r36
            if (r8 != 0) goto L_0x007a
            boolean r8 = r13.l(r10)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
        L_0x007a:
            r8 = r15 & 16
            if (r8 == 0) goto L_0x0083
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r9 = r37
            goto L_0x0095
        L_0x0083:
            r8 = r14 & 24576(0x6000, float:3.4438E-41)
            r9 = r37
            if (r8 != 0) goto L_0x0095
            boolean r8 = r13.l(r9)
            if (r8 == 0) goto L_0x0092
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r8
        L_0x0095:
            r8 = r15 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00a0
            r1 = r1 | r16
        L_0x009d:
            r8 = r38
            goto L_0x00b3
        L_0x00a0:
            r8 = r14 & r16
            if (r8 != 0) goto L_0x009d
            r8 = r38
            boolean r16 = r13.W(r8)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r1 = r1 | r16
        L_0x00b3:
            r16 = r15 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r1 = r1 | r17
            r9 = r39
            goto L_0x00d1
        L_0x00be:
            r16 = r14 & r17
            r9 = r39
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r13.j(r9)
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r1 = r1 | r16
        L_0x00d1:
            r2 = r15 & 128(0x80, float:1.794E-43)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00dc
            r1 = r1 | r29
        L_0x00d9:
            r2 = r41
            goto L_0x00ef
        L_0x00dc:
            r2 = r14 & r29
            if (r2 != 0) goto L_0x00d9
            r2 = r41
            boolean r16 = r13.h(r2)
            if (r16 == 0) goto L_0x00eb
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r1 = r1 | r16
        L_0x00ef:
            r3 = r15 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x00fa
            r1 = r1 | r17
            r9 = r42
            goto L_0x010c
        L_0x00fa:
            r3 = r14 & r17
            r9 = r42
            if (r3 != 0) goto L_0x010c
            boolean r3 = r13.j(r9)
            if (r3 == 0) goto L_0x0109
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r1 = r1 | r3
        L_0x010c:
            r3 = r15 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0117
            r1 = r1 | r17
            r9 = r44
            goto L_0x0129
        L_0x0117:
            r3 = r14 & r17
            r9 = r44
            if (r3 != 0) goto L_0x0129
            boolean r3 = r13.j(r9)
            if (r3 == 0) goto L_0x0126
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r1 = r1 | r3
        L_0x0129:
            r3 = r15 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0132
            r3 = r52 | 6
            r9 = r46
            goto L_0x0148
        L_0x0132:
            r3 = r52 & 6
            r9 = r46
            if (r3 != 0) goto L_0x0146
            boolean r3 = r13.j(r9)
            if (r3 == 0) goto L_0x0141
            r16 = 4
            goto L_0x0143
        L_0x0141:
            r16 = 2
        L_0x0143:
            r3 = r52 | r16
            goto L_0x0148
        L_0x0146:
            r3 = r52
        L_0x0148:
            r5 = r15 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0151
            r3 = r3 | 48
            r9 = r48
            goto L_0x0162
        L_0x0151:
            r5 = r52 & 48
            r9 = r48
            if (r5 != 0) goto L_0x0162
            boolean r5 = r13.j(r9)
            if (r5 == 0) goto L_0x015f
            r5 = r6
            goto L_0x0161
        L_0x015f:
            r5 = 16
        L_0x0161:
            r3 = r3 | r5
        L_0x0162:
            r5 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r5 & r1
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            r0 = 1
            if (r5 != r6) goto L_0x0175
            r5 = r3 & 19
            r6 = 18
            if (r5 == r6) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r5 = 0
            goto L_0x0176
        L_0x0175:
            r5 = r0
        L_0x0176:
            r6 = r1 & 1
            boolean r5 = r13.E(r5, r6)
            if (r5 == 0) goto L_0x01f5
            if (r4 == 0) goto L_0x0185
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r30 = r4
            goto L_0x0187
        L_0x0185:
            r30 = r7
        L_0x0187:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0195
            java.lang.String r4 = "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)"
            r5 = 1378716401(0x522d8af1, float:1.86340098E11)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r3, r4)
        L_0x0195:
            androidx.compose.material3.AlertDialogKt$AlertDialogContent$1 r3 = new androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
            r16 = r3
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r44
            r22 = r46
            r24 = r48
            r26 = r42
            r28 = r33
            r16.<init>(r17, r18, r19, r20, r22, r24, r26, r28)
            r4 = 54
            r5 = -652798794(0xffffffffd91714b6, float:-2.65784334E15)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r0, r3, r13, r4)
            int r3 = r1 >> 3
            r3 = r3 & 14
            r3 = r3 | r29
            int r4 = r1 >> 12
            r5 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            r4 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r1 = r1 >> 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r4
            r16 = r3 | r1
            r17 = 104(0x68, float:1.46E-43)
            r5 = 0
            r18 = 0
            r19 = 0
            r1 = r30
            r2 = r38
            r3 = r39
            r7 = r41
            r8 = r18
            r9 = r19
            r10 = r0
            r11 = r13
            r12 = r16
            r0 = r13
            r13 = r17
            androidx.compose.material3.SurfaceKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01f2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f2:
            r2 = r30
            goto L_0x01fa
        L_0x01f5:
            r0 = r13
            r0.B()
            r2 = r7
        L_0x01fa:
            androidx.compose.runtime.ScopeUpdateScope r12 = r0.x()
            if (r12 == 0) goto L_0x022d
            androidx.compose.material3.a r13 = new androidx.compose.material3.a
            r0 = r13
            r1 = r33
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r9 = r41
            r10 = r42
            r31 = r12
            r32 = r13
            r12 = r44
            r14 = r46
            r16 = r48
            r18 = r51
            r19 = r52
            r20 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r12, r14, r16, r18, r19, r20)
            r0 = r31
            r1 = r32
            r0.a(r1)
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.f(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit g(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Shape shape, long j2, float f2, long j3, long j4, long j5, long j6, int i2, int i3, int i4, Composer composer, int i5) {
        f(function2, modifier, function22, function23, function24, shape, j2, f2, j3, j4, j5, j6, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static final void h(float f2, float f3, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-917637668);
        if ((i2 & 6) == 0) {
            i3 = (q2.h(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.h(f3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function2) ? 256 : 128;
        }
        boolean z2 = true;
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-917637668, i3, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:379)");
            }
            boolean z3 = (i3 & 14) == 4;
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new AlertDialogKt$AlertDialogFlowRow$1$1(f2, f3);
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            Modifier.Companion companion = Modifier.f15489d;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            int i4 = ((((i3 >> 6) & 14) << 6) & 896) | 6;
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, measurePolicy, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            function2.m(q2, Integer.valueOf((i4 >> 6) & 14));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0052b(f2, f3, function2, i2));
        }
    }

    public static final Unit i(float f2, float f3, Function2 function2, int i2, Composer composer, int i3) {
        h(f2, f3, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void j(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        Composer q2 = composer.q(-867616355);
        Function0 function02 = function0;
        if ((i6 & 6) == 0) {
            i4 = (q2.l(function02) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        int i8 = 16;
        Function2 function26 = function2;
        if ((i6 & 48) == 0) {
            i4 |= q2.l(function26) ? 32 : 16;
        }
        Modifier modifier2 = modifier;
        if ((i6 & 384) == 0) {
            i4 |= q2.W(modifier2) ? 256 : 128;
        }
        int i9 = 2048;
        if ((i6 & 3072) == 0) {
            i4 |= q2.l(function22) ? 2048 : 1024;
        } else {
            Function2 function27 = function22;
        }
        if ((i6 & 24576) == 0) {
            i4 |= q2.l(function23) ? 16384 : 8192;
        } else {
            Function2 function28 = function23;
        }
        Function2 function29 = function24;
        if ((i6 & 196608) == 0) {
            i4 |= q2.l(function29) ? 131072 : 65536;
        }
        Function2 function210 = function25;
        if ((i6 & 1572864) == 0) {
            i4 |= q2.l(function210) ? 1048576 : 524288;
        }
        Shape shape2 = shape;
        if ((i6 & 12582912) == 0) {
            i4 |= q2.W(shape2) ? 8388608 : 4194304;
        }
        int i10 = i4;
        long j6 = j2;
        if ((i6 & 100663296) == 0) {
            i10 |= q2.j(j6) ? 67108864 : 33554432;
        }
        long j7 = j3;
        if ((i6 & 805306368) == 0) {
            i10 |= q2.j(j7) ? 536870912 : 268435456;
        }
        int i11 = i10;
        long j8 = j4;
        if ((i7 & 6) == 0) {
            i5 = i7 | (q2.j(j8) ? 4 : 2);
        } else {
            i5 = i7;
        }
        long j9 = j5;
        if ((i7 & 48) == 0) {
            if (q2.j(j9)) {
                i8 = 32;
            }
            i5 |= i8;
        }
        float f3 = f2;
        if ((i7 & 384) == 0) {
            i5 |= q2.h(f3) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            if (!q2.W(dialogProperties)) {
                i9 = 1024;
            }
            i5 |= i9;
        } else {
            DialogProperties dialogProperties2 = dialogProperties;
        }
        int i12 = i5;
        if (q2.E(((306783379 & i11) == 306783378 && (i12 & 1171) == 1170) ? false : true, i11 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-867616355, i11, i12, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:260)");
            }
            l(function0, modifier, dialogProperties, ComposableLambdaKt.e(527420759, true, new AlertDialogKt$AlertDialogImpl$1(function23, function24, function25, shape, j2, f2, j3, j4, j5, function22, function2), q2, 54), q2, ((i12 >> 3) & 896) | (i11 & 14) | 3072 | ((i11 >> 3) & 112), 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            C0072d dVar = r0;
            C0072d dVar2 = new C0072d(function0, function2, modifier, function22, function23, function24, function25, shape, j2, j3, j4, j5, f2, dialogProperties, i2, i3);
            x2.a(dVar);
        }
    }

    public static final Unit k(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, int i2, int i3, Composer composer, int i4) {
        j(function0, function2, modifier, function22, function23, function24, function25, shape, j2, j3, j4, j5, f2, dialogProperties, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(kotlin.jvm.functions.Function0 r19, androidx.compose.ui.Modifier r20, androidx.compose.ui.window.DialogProperties r21, kotlin.jvm.functions.Function2 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r19
            r4 = r22
            r5 = r24
            r0 = 24925658(0x17c55da, float:4.6346686E-38)
            r2 = r23
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r25 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r5 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r5
            goto L_0x0026
        L_0x0025:
            r3 = r5
        L_0x0026:
            r6 = r25 & 2
            if (r6 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r7 = r20
            goto L_0x0041
        L_0x002f:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r20
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r3 = r3 | r8
        L_0x0041:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r9 = r21
            goto L_0x005c
        L_0x004a:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r21
            boolean r10 = r2.W(r9)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r10
        L_0x005c:
            r10 = r25 & 8
            if (r10 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0073
        L_0x0063:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0073
            boolean r10 = r2.l(r4)
            if (r10 == 0) goto L_0x0070
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r3 = r3 | r10
        L_0x0073:
            r10 = r3 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            r12 = 0
            if (r10 == r11) goto L_0x007c
            r10 = 1
            goto L_0x007d
        L_0x007c:
            r10 = r12
        L_0x007d:
            r11 = r3 & 1
            boolean r10 = r2.E(r10, r11)
            if (r10 == 0) goto L_0x00c3
            if (r6 == 0) goto L_0x008a
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x008b
        L_0x008a:
            r6 = r7
        L_0x008b:
            if (r8 == 0) goto L_0x009c
            androidx.compose.ui.window.DialogProperties r7 = new androidx.compose.ui.window.DialogProperties
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r7
            r13.<init>((boolean) r14, (boolean) r15, (boolean) r16, (int) r17, (kotlin.jvm.internal.DefaultConstructorMarker) r18)
            r9 = r7
        L_0x009c:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00a8
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:143)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r7, r8)
        L_0x00a8:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = f9133i
            java.lang.Object r0 = r2.C(r0)
            androidx.compose.material3.BasicAlertDialogOverride r0 = (androidx.compose.material3.BasicAlertDialogOverride) r0
            androidx.compose.material3.BasicAlertDialogOverrideScope r3 = new androidx.compose.material3.BasicAlertDialogOverrideScope
            r3.<init>(r1, r6, r9, r4)
            r0.a(r3, r2, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00c1
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c1:
            r3 = r9
            goto L_0x00c8
        L_0x00c3:
            r2.B()
            r6 = r7
            goto L_0x00c1
        L_0x00c8:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.x()
            if (r7 == 0) goto L_0x00e0
            androidx.compose.material3.e r8 = new androidx.compose.material3.e
            r0 = r8
            r1 = r19
            r2 = r6
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.l(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit m(Function0 function0, Modifier modifier, DialogProperties dialogProperties, Function2 function2, int i2, int i3, Composer composer, int i4) {
        l(function0, modifier, dialogProperties, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final BasicAlertDialogOverride n() {
        return DefaultBasicAlertDialogOverride.f9823a;
    }

    public static final float u() {
        return f9126b;
    }

    public static final float v() {
        return f9125a;
    }
}
