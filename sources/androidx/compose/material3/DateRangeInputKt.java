package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

@Metadata
public final class DateRangeInputKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9774a = Dp.m((float) 8);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: androidx.compose.material3.internal.DateInputFormat} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.Long r32, java.lang.Long r33, kotlin.jvm.functions.Function2 r34, androidx.compose.material3.internal.CalendarModel r35, kotlin.ranges.IntRange r36, androidx.compose.material3.DatePickerFormatter r37, androidx.compose.material3.SelectableDates r38, androidx.compose.material3.DatePickerColors r39, androidx.compose.ui.focus.FocusRequester r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            r15 = r32
            r14 = r33
            r13 = r34
            r12 = r35
            r11 = r37
            r10 = r42
            r0 = 1372713366(0x51d1f196, float:1.12712663E11)
            r1 = r41
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r7 = 6
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r8.W(r15)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r10
            goto L_0x0026
        L_0x0025:
            r1 = r10
        L_0x0026:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0036
            boolean r2 = r8.W(r14)
            if (r2 == 0) goto L_0x0033
            r2 = 32
            goto L_0x0035
        L_0x0033:
            r2 = 16
        L_0x0035:
            r1 = r1 | r2
        L_0x0036:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r8.l(r13)
            if (r2 == 0) goto L_0x0043
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0056
            boolean r2 = r8.l(r12)
            if (r2 == 0) goto L_0x0053
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r1 = r1 | r2
        L_0x0056:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            r3 = r36
            if (r2 != 0) goto L_0x0068
            boolean r2 = r8.l(r3)
            if (r2 == 0) goto L_0x0065
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r1 = r1 | r2
        L_0x0068:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r10
            r16 = 262144(0x40000, float:3.67342E-40)
            if (r2 != 0) goto L_0x0084
            r2 = r10 & r16
            if (r2 != 0) goto L_0x0078
            boolean r2 = r8.W(r11)
            goto L_0x007c
        L_0x0078:
            boolean r2 = r8.l(r11)
        L_0x007c:
            if (r2 == 0) goto L_0x0081
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0083
        L_0x0081:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x0083:
            r1 = r1 | r2
        L_0x0084:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x0099
            r2 = r38
            boolean r17 = r8.W(r2)
            if (r17 == 0) goto L_0x0094
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0096
        L_0x0094:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0096:
            r1 = r1 | r17
            goto L_0x009b
        L_0x0099:
            r2 = r38
        L_0x009b:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r10 & r17
            r4 = r39
            if (r17 != 0) goto L_0x00b0
            boolean r18 = r8.W(r4)
            if (r18 == 0) goto L_0x00ac
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ae
        L_0x00ac:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ae:
            r1 = r1 | r18
        L_0x00b0:
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r10 & r18
            r0 = r40
            if (r18 != 0) goto L_0x00c5
            boolean r19 = r8.W(r0)
            if (r19 == 0) goto L_0x00c1
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c3
        L_0x00c1:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00c3:
            r1 = r1 | r19
        L_0x00c5:
            r19 = 38347923(0x2492493, float:1.4777644E-37)
            r5 = r1 & r19
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            r9 = 0
            if (r5 == r6) goto L_0x00d3
            r5 = 1
        L_0x00d1:
            r6 = 1
            goto L_0x00d5
        L_0x00d3:
            r5 = r9
            goto L_0x00d1
        L_0x00d5:
            r7 = r1 & 1
            boolean r5 = r8.E(r5, r7)
            if (r5 == 0) goto L_0x0378
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00ec
            r5 = -1
            java.lang.String r6 = "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:44)"
            r7 = 1372713366(0x51d1f196, float:1.12712663E11)
            androidx.compose.runtime.ComposerKt.Y(r7, r1, r5, r6)
        L_0x00ec:
            java.util.Locale r5 = r35.f()
            boolean r5 = r8.W(r5)
            java.lang.Object r6 = r8.g()
            if (r5 != 0) goto L_0x0102
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x010d
        L_0x0102:
            java.util.Locale r5 = r35.f()
            androidx.compose.material3.internal.DateInputFormat r6 = r12.c(r5)
            r8.N(r6)
        L_0x010d:
            r7 = r6
            androidx.compose.material3.internal.DateInputFormat r7 = (androidx.compose.material3.internal.DateInputFormat) r7
            androidx.compose.material3.internal.Strings$Companion r5 = androidx.compose.material3.internal.Strings.f12320b
            int r5 = androidx.compose.material3.R.string.f10661h
            int r5 = androidx.compose.material3.internal.Strings.a(r5)
            java.lang.String r5 = androidx.compose.material3.internal.Strings_androidKt.b(r5, r8, r9)
            int r6 = androidx.compose.material3.R.string.f10663j
            int r6 = androidx.compose.material3.internal.Strings.a(r6)
            java.lang.String r6 = androidx.compose.material3.internal.Strings_androidKt.b(r6, r8, r9)
            int r18 = androidx.compose.material3.R.string.f10662i
            int r0 = androidx.compose.material3.internal.Strings.a(r18)
            java.lang.String r18 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r8, r9)
            int r0 = androidx.compose.material3.R.string.f10652A
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            java.lang.String r23 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r8, r9)
            boolean r0 = r8.W(r7)
            r24 = 458752(0x70000, float:6.42848E-40)
            r9 = r1 & r24
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r9 == r2) goto L_0x0153
            r2 = r1 & r16
            if (r2 == 0) goto L_0x0151
            boolean r2 = r8.W(r11)
            if (r2 == 0) goto L_0x0151
            goto L_0x0153
        L_0x0151:
            r2 = 0
            goto L_0x0154
        L_0x0153:
            r2 = 1
        L_0x0154:
            r0 = r0 | r2
            java.lang.Object r2 = r8.g()
            if (r0 != 0) goto L_0x0169
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0164
            goto L_0x0169
        L_0x0164:
            r12 = r1
            r16 = r7
            r11 = r8
            goto L_0x0186
        L_0x0169:
            androidx.compose.material3.DateInputValidator r9 = new androidx.compose.material3.DateInputValidator
            r0 = r9
            r2 = r1
            r1 = r36
            r12 = r2
            r2 = r38
            r3 = r7
            r11 = 256(0x100, float:3.59E-43)
            r4 = r37
            r16 = r7
            r11 = 6
            r7 = r18
            r11 = r8
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.N(r9)
            r2 = r9
        L_0x0186:
            r9 = r2
            androidx.compose.material3.DateInputValidator r9 = (androidx.compose.material3.DateInputValidator) r9
            r9.b(r15)
            r9.a(r14)
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.PaddingValues r0 = androidx.compose.material3.DateInputKt.r()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.h(r8, r0)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r2 = f9774a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r1 = r1.n(r2)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r2 = r2.l()
            r3 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.RowKt.b(r1, r2, r11, r3)
            r2 = 0
            int r3 = androidx.compose.runtime.ComposablesKt.a(r11, r2)
            androidx.compose.runtime.CompositionLocalMap r2 = r11.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r11, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r11.v()
            if (r6 != 0) goto L_0x01c8
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01c8:
            r11.s()
            boolean r6 = r11.n()
            if (r6 == 0) goto L_0x01d5
            r11.y(r5)
            goto L_0x01d8
        L_0x01d5:
            r11.K()
        L_0x01d8:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r11)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r2, r1)
            kotlin.jvm.functions.Function2 r1 = r4.b()
            boolean r2 = r5.n()
            if (r2 != 0) goto L_0x0202
            java.lang.Object r2 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)
            if (r2 != 0) goto L_0x0210
        L_0x0202:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.N(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.A(r2, r1)
        L_0x0210:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            androidx.compose.foundation.layout.RowScopeInstance r17 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            java.lang.String r0 = r16.b()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r7 = r0.toUpperCase(r1)
            java.lang.String r0 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            int r0 = androidx.compose.material3.R.string.G
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            r6 = 0
            java.lang.String r5 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r11, r6)
            r4 = 2
            r18 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r0 = r17
            r1 = r8
            r6 = r5
            r5 = r18
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.RowScope.c(r0, r1, r2, r3, r4, r5)
            androidx.compose.material3.InputIdentifier$Companion r18 = androidx.compose.material3.InputIdentifier.f10146b
            int r19 = r18.c()
            java.util.Locale r20 = r35.f()
            r5 = r12 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r5 != r4) goto L_0x0255
            r1 = 1
            goto L_0x0256
        L_0x0255:
            r1 = 0
        L_0x0256:
            r3 = r12 & 112(0x70, float:1.57E-43)
            r2 = 32
            if (r3 != r2) goto L_0x025e
            r2 = 1
            goto L_0x025f
        L_0x025e:
            r2 = 0
        L_0x025f:
            r1 = r1 | r2
            java.lang.Object r2 = r11.g()
            if (r1 != 0) goto L_0x026e
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0276
        L_0x026e:
            androidx.compose.material3.D1 r2 = new androidx.compose.material3.D1
            r2.<init>(r13, r14)
            r11.N(r2)
        L_0x0276:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2 r1 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2
            r1.<init>(r6, r7)
            r6 = 1740538748(0x67be837c, float:1.7993502E24)
            r15 = 54
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r10, r1, r11, r15)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3 r1 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3
            r1.<init>(r7)
            r4 = 1229526589(0x4949163d, float:823651.8)
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r10, r1, r11, r15)
            int r1 = r12 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = 1794048(0x1b6000, float:2.513997E-39)
            r1 = r1 | r22
            r4 = r12 & 7168(0x1c00, float:1.0045E-41)
            r23 = r1 | r4
            int r1 = r12 >> 21
            r24 = r1 & 14
            r26 = r1 & 126(0x7e, float:1.77E-43)
            r1 = r32
            r27 = r3
            r3 = r35
            r29 = r4
            r28 = 256(0x100, float:3.59E-43)
            r4 = r6
            r6 = r5
            r5 = r21
            r15 = r6
            r21 = 0
            r6 = r19
            r30 = r7
            r7 = r9
            r19 = r8
            r8 = r16
            r25 = r9
            r31 = r21
            r21 = r15
            r15 = r31
            r9 = r20
            r10 = r39
            r20 = r11
            r11 = r40
            r28 = r12
            r12 = r20
            r13 = r23
            r14 = r26
            androidx.compose.material3.DateInputKt.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            int r0 = androidx.compose.material3.R.string.D
            int r0 = androidx.compose.material3.internal.Strings.a(r0)
            r14 = r20
            java.lang.String r6 = androidx.compose.material3.internal.Strings_androidKt.b(r0, r14, r15)
            r4 = 2
            r5 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r0 = r17
            r1 = r19
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.RowScope.c(r0, r1, r2, r3, r4, r5)
            int r7 = r18.a()
            java.util.Locale r9 = r35.f()
            r2 = r21
            r1 = 256(0x100, float:3.59E-43)
            if (r2 != r1) goto L_0x0304
            r1 = 1
            goto L_0x0305
        L_0x0304:
            r1 = r15
        L_0x0305:
            r2 = r28 & 14
            r3 = 4
            if (r2 != r3) goto L_0x030b
            r15 = 1
        L_0x030b:
            r1 = r1 | r15
            java.lang.Object r2 = r14.g()
            if (r1 != 0) goto L_0x0322
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x031b
            goto L_0x0322
        L_0x031b:
            r15 = r32
            r13 = r34
            r1 = 54
            goto L_0x0330
        L_0x0322:
            androidx.compose.material3.E1 r2 = new androidx.compose.material3.E1
            r1 = 54
            r15 = r32
            r13 = r34
            r2.<init>(r13, r15)
            r14.N(r2)
        L_0x0330:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5 r3 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5
            r4 = r30
            r3.<init>(r6, r4)
            r5 = -882370893(0xffffffffcb6816b3, float:-1.5210163E7)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r6, r3, r14, r1)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6 r3 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6
            r3.<init>(r4)
            r4 = 1956183348(0x7498fd34, float:9.696835E31)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r6, r3, r14, r1)
            r1 = r27 | r22
            r17 = r1 | r29
            r18 = r24 | 48
            r11 = 0
            r1 = r33
            r3 = r35
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r25
            r8 = r16
            r10 = r39
            r12 = r14
            r13 = r17
            r16 = r14
            r14 = r18
            androidx.compose.material3.DateInputKt.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r16.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x037d
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x037d
        L_0x0378:
            r16 = r8
            r16.B()
        L_0x037d:
            androidx.compose.runtime.ScopeUpdateScope r11 = r16.x()
            if (r11 == 0) goto L_0x03a0
            androidx.compose.material3.F1 r12 = new androidx.compose.material3.F1
            r0 = r12
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x03a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangeInputKt.d(java.lang.Long, java.lang.Long, kotlin.jvm.functions.Function2, androidx.compose.material3.internal.CalendarModel, kotlin.ranges.IntRange, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit e(Function2 function2, Long l2, Long l3) {
        function2.m(l3, l2);
        return Unit.f40552a;
    }

    public static final Unit f(Function2 function2, Long l2, Long l3) {
        function2.m(l2, l3);
        return Unit.f40552a;
    }

    public static final Unit g(Long l2, Long l3, Function2 function2, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, Composer composer, int i3) {
        d(l2, l3, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
