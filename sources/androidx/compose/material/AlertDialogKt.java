package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AlertDialogKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Modifier f7041a;

    /* renamed from: b  reason: collision with root package name */
    public static final Modifier f7042b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f7043c = TextUnitKt.i(40);

    /* renamed from: d  reason: collision with root package name */
    public static final long f7044d = TextUnitKt.i(36);

    /* renamed from: e  reason: collision with root package name */
    public static final long f7045e = TextUnitKt.i(38);

    static {
        Modifier.Companion companion = Modifier.f15489d;
        float f2 = (float) 24;
        f7041a = PaddingKt.m(companion, Dp.m(f2), 0.0f, Dp.m(f2), 0.0f, 10, (Object) null);
        f7042b = PaddingKt.m(companion, Dp.m(f2), 0.0f, Dp.m(f2), Dp.m((float) 28), 2, (Object) null);
    }

    public static final void a(ColumnScope columnScope, Function2 function2, Function2 function22, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-555573207);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function22) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-555573207, i3, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:249)");
            }
            Modifier a2 = columnScope.a(Modifier.f15489d, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = AlertDialogKt$AlertDialogBaselineLayout$2.f7046a;
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, a2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, alertDialogKt$AlertDialogBaselineLayout$2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            if (function2 == null) {
                q2.X(1317321954);
            } else {
                q2.X(1317321955);
                Modifier b4 = LayoutIdKt.b(f7041a, "title");
                Alignment.Companion companion2 = Alignment.f15444a;
                Modifier b5 = columnScope.b(b4, companion2.k());
                MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
                int a5 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, b5);
                Function0 a6 = companion.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a6);
                } else {
                    q2.K();
                }
                Composer b6 = Updater.b(q2);
                Updater.g(b6, g2, companion.c());
                Updater.g(b6, I2, companion.e());
                Function2 b7 = companion.b();
                if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a5))) {
                    b6.N(Integer.valueOf(a5));
                    b6.A(Integer.valueOf(a5), b7);
                }
                Updater.g(b6, e3, companion.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function2.m(q2, 0);
                q2.T();
            }
            q2.M();
            if (function22 == null) {
                q2.X(1317454758);
            } else {
                q2.X(1317454759);
                Modifier b8 = LayoutIdKt.b(f7042b, "text");
                Alignment.Companion companion3 = Alignment.f15444a;
                Modifier b9 = columnScope.b(b8, companion3.k());
                MeasurePolicy g3 = BoxKt.g(companion3.o(), false);
                int a7 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I3 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, b9);
                Function0 a8 = companion.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a8);
                } else {
                    q2.K();
                }
                Composer b10 = Updater.b(q2);
                Updater.g(b10, g3, companion.c());
                Updater.g(b10, I3, companion.e());
                Function2 b11 = companion.b();
                if (b10.n() || !Intrinsics.d(b10.g(), Integer.valueOf(a7))) {
                    b10.N(Integer.valueOf(a7));
                    b10.A(Integer.valueOf(a7), b11);
                }
                Updater.g(b10, e4, companion.d());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3797a;
                function22.m(q2, 0);
                q2.T();
            }
            q2.M();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AlertDialogKt$AlertDialogBaselineLayout$3(columnScope, function2, function22, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function2 r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function2 r30, androidx.compose.ui.graphics.Shape r31, long r32, long r34, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r1 = r27
            r10 = r37
            r0 = -453679601(0xffffffffe4f5660f, float:-3.6214451E22)
            r2 = r36
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r38 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r10 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r10
            goto L_0x0024
        L_0x0023:
            r3 = r10
        L_0x0024:
            r4 = r38 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r28
            goto L_0x003f
        L_0x002d:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r28
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r3 = r3 | r6
        L_0x003f:
            r6 = r38 & 4
            if (r6 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r7 = r29
            goto L_0x005a
        L_0x0048:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r29
            boolean r8 = r2.l(r7)
            if (r8 == 0) goto L_0x0057
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r8
        L_0x005a:
            r8 = r38 & 8
            if (r8 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r9 = r30
            goto L_0x0075
        L_0x0063:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0060
            r9 = r30
            boolean r11 = r2.l(r9)
            if (r11 == 0) goto L_0x0072
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r11
        L_0x0075:
            r11 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x008e
            r11 = r38 & 16
            if (r11 != 0) goto L_0x0088
            r11 = r31
            boolean r12 = r2.W(r11)
            if (r12 == 0) goto L_0x008a
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x0088:
            r11 = r31
        L_0x008a:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r3 = r3 | r12
            goto L_0x0090
        L_0x008e:
            r11 = r31
        L_0x0090:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00aa
            r12 = r38 & 32
            if (r12 != 0) goto L_0x00a4
            r12 = r32
            boolean r14 = r2.j(r12)
            if (r14 == 0) goto L_0x00a6
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a4:
            r12 = r32
        L_0x00a6:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r3 = r3 | r14
            goto L_0x00ac
        L_0x00aa:
            r12 = r32
        L_0x00ac:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r15 = r10 & r14
            if (r15 != 0) goto L_0x00c8
            r15 = r38 & 64
            if (r15 != 0) goto L_0x00c1
            r14 = r34
            boolean r16 = r2.j(r14)
            if (r16 == 0) goto L_0x00c3
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00c1:
            r14 = r34
        L_0x00c3:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c5:
            r3 = r3 | r16
            goto L_0x00ca
        L_0x00c8:
            r14 = r34
        L_0x00ca:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            r7 = 1
            if (r0 == r5) goto L_0x00d7
            r0 = r7
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            r5 = r3 & 1
            boolean r0 = r2.E(r0, r5)
            if (r0 == 0) goto L_0x01b4
            r2.p()
            r0 = r10 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0116
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x00f7
            goto L_0x0116
        L_0x00f7:
            r2.B()
            r0 = r38 & 16
            if (r0 == 0) goto L_0x0100
            r3 = r3 & r18
        L_0x0100:
            r0 = r38 & 32
            if (r0 == 0) goto L_0x0106
            r3 = r3 & r16
        L_0x0106:
            r0 = r38 & 64
            if (r0 == 0) goto L_0x010b
            r3 = r3 & r5
        L_0x010b:
            r0 = r28
            r6 = r29
            r4 = r9
            r8 = r11
            r23 = r12
        L_0x0113:
            r25 = r14
            goto L_0x0162
        L_0x0116:
            if (r4 == 0) goto L_0x011b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x011d
        L_0x011b:
            r0 = r28
        L_0x011d:
            r4 = 0
            if (r6 == 0) goto L_0x0122
            r6 = r4
            goto L_0x0124
        L_0x0122:
            r6 = r29
        L_0x0124:
            if (r8 == 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r4 = r9
        L_0x0128:
            r8 = r38 & 16
            r9 = 6
            if (r8 == 0) goto L_0x013a
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r8 = r8.b(r2, r9)
            androidx.compose.foundation.shape.CornerBasedShape r8 = r8.b()
            r3 = r3 & r18
            goto L_0x013b
        L_0x013a:
            r8 = r11
        L_0x013b:
            r11 = r38 & 32
            if (r11 == 0) goto L_0x014c
            androidx.compose.material.MaterialTheme r11 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r9 = r11.a(r2, r9)
            long r11 = r9.n()
            r3 = r3 & r16
            goto L_0x014d
        L_0x014c:
            r11 = r12
        L_0x014d:
            r9 = r38 & 64
            if (r9 == 0) goto L_0x015f
            int r9 = r3 >> 15
            r9 = r9 & 14
            long r13 = androidx.compose.material.ColorsKt.b(r11, r2, r9)
            r3 = r3 & r5
            r23 = r11
            r25 = r13
            goto L_0x0162
        L_0x015f:
            r23 = r11
            goto L_0x0113
        L_0x0162:
            r2.U()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0174
            r5 = -1
            java.lang.String r9 = "androidx.compose.material.AlertDialogContent (AlertDialog.kt:203)"
            r11 = -453679601(0xffffffffe4f5660f, float:-3.6214451E22)
            androidx.compose.runtime.ComposerKt.Y(r11, r3, r5, r9)
        L_0x0174:
            androidx.compose.material.AlertDialogKt$AlertDialogContent$1 r5 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$1
            r5.<init>(r6, r4, r1)
            r9 = 54
            r11 = 629950291(0x258c4753, float:2.433446E-16)
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r7, r5, r2, r9)
            int r5 = r3 >> 3
            r5 = r5 & 14
            r7 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r7
            int r3 = r3 >> 9
            r7 = r3 & 112(0x70, float:1.57E-43)
            r5 = r5 | r7
            r7 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 | r7
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r21 = r5 | r3
            r22 = 48
            r17 = 0
            r18 = 0
            r11 = r0
            r12 = r8
            r13 = r23
            r15 = r25
            r20 = r2
            androidx.compose.material.SurfaceKt.a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01af
            androidx.compose.runtime.ComposerKt.X()
        L_0x01af:
            r3 = r0
            r5 = r8
            r8 = r25
            goto L_0x01c0
        L_0x01b4:
            r2.B()
            r3 = r28
            r6 = r29
            r4 = r9
            r5 = r11
            r23 = r12
            r8 = r14
        L_0x01c0:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x01d9
            androidx.compose.material.AlertDialogKt$AlertDialogContent$2 r13 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$2
            r0 = r13
            r1 = r27
            r2 = r3
            r3 = r6
            r6 = r23
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            r12.a(r13)
        L_0x01d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.b(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(float f2, float f3, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(73434452);
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
                ComposerKt.Y(73434452, i3, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:351)");
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
            x2.a(new AlertDialogKt$AlertDialogFlowRow$2(f2, f3, function2, i2));
        }
    }
}
