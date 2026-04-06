package androidx.compose.material3;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TimePickerDialogKt {
    public static final void c(Function2 function2, Function2 function22, Function3 function3, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-493479138);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function3) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-493479138, i3, -1, "androidx.compose.material3.TimePickerCustomLayout (TimePickerDialog.kt:130)");
            }
            ComposableLambda e2 = ComposableLambdaKt.e(468305759, true, new TimePickerDialogKt$TimePickerCustomLayout$content$1(function3, function2, function22), q2, 54);
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1.f11454a;
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            Modifier.Companion companion = Modifier.f15489d;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
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
            Updater.g(b2, e3, companion2.d());
            e2.m(q2, 6);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0242s7(function2, function22, function3, i2));
        }
    }

    public static final Unit d(Function2 function2, Function2 function22, Function3 function3, int i2, Composer composer, int i3) {
        c(function2, function22, function3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0123, code lost:
        if ((r11 & 64) != 0) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function2 r28, androidx.compose.ui.Modifier r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function2 r31, androidx.compose.ui.graphics.Shape r32, long r33, kotlin.jvm.functions.Function3 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r10 = r37
            r11 = r38
            r0 = -401873644(0xffffffffe80be514, float:-2.6425387E24)
            r1 = r36
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r10 | 6
            r3 = r2
            r2 = r27
            goto L_0x002b
        L_0x0017:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r27
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x002b
        L_0x0028:
            r2 = r27
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r28
            goto L_0x0046
        L_0x0034:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r28
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r29
            goto L_0x0061
        L_0x004f:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r29
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r30
            goto L_0x007c
        L_0x006a:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r30
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r11 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r31
            goto L_0x0097
        L_0x0085:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r31
            boolean r13 = r1.l(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00b1
            r13 = r11 & 32
            if (r13 != 0) goto L_0x00ab
            r13 = r32
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00ad
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r13 = r32
        L_0x00ad:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r14
            goto L_0x00b3
        L_0x00b1:
            r13 = r32
        L_0x00b3:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00ce
            r14 = r11 & 64
            if (r14 != 0) goto L_0x00c7
            r14 = r33
            boolean r16 = r1.j(r14)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c7:
            r14 = r33
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00ce:
            r14 = r33
        L_0x00d0:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00db
            r3 = r3 | r17
        L_0x00d8:
            r0 = r35
            goto L_0x00ee
        L_0x00db:
            r0 = r10 & r17
            if (r0 != 0) goto L_0x00d8
            r0 = r35
            boolean r17 = r1.l(r0)
            if (r17 == 0) goto L_0x00ea
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r17
        L_0x00ee:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r0 = r3 & r17
            r2 = 4793490(0x492492, float:6.71711E-39)
            r4 = 1
            if (r0 == r2) goto L_0x00fb
            r0 = r4
            goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x01b0
            r1.p()
            r0 = r10 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0129
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0118
            goto L_0x0129
        L_0x0118:
            r1.B()
            r0 = r11 & 32
            if (r0 == 0) goto L_0x0121
            r3 = r3 & r17
        L_0x0121:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0126
        L_0x0125:
            r3 = r3 & r2
        L_0x0126:
            r0 = r12
            r2 = r13
            goto L_0x014e
        L_0x0129:
            if (r5 == 0) goto L_0x012e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r6 = r0
        L_0x012e:
            r0 = 0
            if (r7 == 0) goto L_0x0132
            r8 = r0
        L_0x0132:
            if (r9 == 0) goto L_0x0135
            r12 = r0
        L_0x0135:
            r0 = r11 & 32
            r5 = 6
            if (r0 == 0) goto L_0x0143
            androidx.compose.material3.TimePickerDialogDefaults r0 = androidx.compose.material3.TimePickerDialogDefaults.f11448a
            androidx.compose.ui.graphics.Shape r0 = r0.b(r1, r5)
            r3 = r3 & r17
            r13 = r0
        L_0x0143:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0126
            androidx.compose.material3.TimePickerDialogDefaults r0 = androidx.compose.material3.TimePickerDialogDefaults.f11448a
            long r14 = r0.a(r1, r5)
            goto L_0x0125
        L_0x014e:
            r1.U()
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0160
            r5 = -1
            java.lang.String r7 = "androidx.compose.material3.TimePickerDialogLayout (TimePickerDialog.kt:104)"
            r9 = -401873644(0xffffffffe80be514, float:-2.6425387E24)
            androidx.compose.runtime.ComposerKt.Y(r9, r3, r5, r7)
        L_0x0160:
            androidx.compose.material3.tokens.DialogTokens r5 = androidx.compose.material3.tokens.DialogTokens.f13036a
            float r18 = r5.d()
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.BackgroundKt.a(r6, r14, r2)
            androidx.compose.material3.TimePickerDialogKt$TimePickerDialogLayout$1 r5 = new androidx.compose.material3.TimePickerDialogKt$TimePickerDialogLayout$1
            r29 = r5
            r30 = r28
            r31 = r35
            r32 = r8
            r33 = r0
            r34 = r27
            r29.<init>(r30, r31, r32, r33, r34)
            r7 = 54
            r9 = 1522143641(0x5aba1199, float:2.61868472E16)
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r4, r5, r1, r7)
            int r3 = r3 >> 12
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 12607488(0xc06000, float:1.7666854E-38)
            r23 = r3 | r4
            r24 = 108(0x6c, float:1.51E-43)
            r3 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r13 = r2
            r25 = r14
            r14 = r3
            r22 = r1
            androidx.compose.material3.SurfaceKt.c(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01a9
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a9:
            r5 = r0
            r3 = r6
            r4 = r8
            r7 = r25
            r6 = r2
            goto L_0x01b8
        L_0x01b0:
            r1.B()
            r3 = r6
            r4 = r8
            r5 = r12
            r6 = r13
            r7 = r14
        L_0x01b8:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01d1
            androidx.compose.material3.t7 r13 = new androidx.compose.material3.t7
            r0 = r13
            r1 = r27
            r2 = r28
            r9 = r35
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            r12.a(r13)
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerDialogKt.e(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(Function2 function2, Function2 function22, Modifier modifier, Function2 function23, Function2 function24, Shape shape, long j2, Function3 function3, int i2, int i3, Composer composer, int i4) {
        e(function2, function22, modifier, function23, function24, shape, j2, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
