package com.google.pay.button;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r.e;

@Metadata
public final class PayButtonKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: r.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: r.b} */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0211, code lost:
        if (r10 == r5.a()) goto L_0x0213;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(kotlin.jvm.functions.Function0 r25, java.lang.String r26, androidx.compose.ui.Modifier r27, com.google.pay.button.ButtonTheme r28, com.google.pay.button.ButtonType r29, float r30, boolean r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function2 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r1 = r25
            r2 = r26
            r10 = r35
            r11 = r36
            r3 = 128(0x80, float:1.794E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 16
            r6 = 32
            java.lang.String r7 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r1, r7)
            java.lang.String r7 = "allowedPaymentMethods"
            kotlin.jvm.internal.Intrinsics.i(r2, r7)
            r7 = -268720185(0xffffffffeffba7c7, float:-1.5576714E29)
            r8 = r34
            androidx.compose.runtime.Composer r8 = r8.q(r7)
            r9 = 1
            r12 = r11 & 1
            r13 = 2
            r14 = 4
            if (r12 == 0) goto L_0x002d
            r12 = r10 | 6
            goto L_0x003d
        L_0x002d:
            r12 = r10 & 6
            if (r12 != 0) goto L_0x003c
            boolean r12 = r8.l(r1)
            if (r12 == 0) goto L_0x0039
            r12 = r14
            goto L_0x003a
        L_0x0039:
            r12 = r13
        L_0x003a:
            r12 = r12 | r10
            goto L_0x003d
        L_0x003c:
            r12 = r10
        L_0x003d:
            r15 = r11 & 2
            if (r15 == 0) goto L_0x0044
            r12 = r12 | 48
            goto L_0x0052
        L_0x0044:
            r15 = r10 & 48
            if (r15 != 0) goto L_0x0052
            boolean r15 = r8.W(r2)
            if (r15 == 0) goto L_0x0050
            r15 = r6
            goto L_0x0051
        L_0x0050:
            r15 = r5
        L_0x0051:
            r12 = r12 | r15
        L_0x0052:
            r15 = r11 & 4
            if (r15 == 0) goto L_0x005b
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r9 = r27
            goto L_0x006e
        L_0x005b:
            r9 = r10 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0058
            r9 = r27
            boolean r16 = r8.W(r9)
            if (r16 == 0) goto L_0x006a
            r16 = r4
            goto L_0x006c
        L_0x006a:
            r16 = r3
        L_0x006c:
            r12 = r12 | r16
        L_0x006e:
            r16 = r11 & 8
            if (r16 == 0) goto L_0x0077
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r14 = r28
            goto L_0x008a
        L_0x0077:
            r14 = r10 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0074
            r14 = r28
            boolean r17 = r8.W(r14)
            if (r17 == 0) goto L_0x0086
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r12 = r12 | r17
        L_0x008a:
            r5 = r5 & r11
            if (r5 == 0) goto L_0x0092
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x008f:
            r13 = r29
            goto L_0x00a5
        L_0x0092:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x008f
            r13 = r29
            boolean r18 = r8.W(r13)
            if (r18 == 0) goto L_0x00a1
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r12 = r12 | r18
        L_0x00a5:
            r18 = r11 & 32
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x00b0
            r12 = r12 | r19
            r6 = r30
            goto L_0x00c3
        L_0x00b0:
            r19 = r10 & r19
            r6 = r30
            if (r19 != 0) goto L_0x00c3
            boolean r20 = r8.h(r6)
            if (r20 == 0) goto L_0x00bf
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r12 = r12 | r20
        L_0x00c3:
            r20 = r11 & 64
            r21 = 1572864(0x180000, float:2.204052E-39)
            if (r20 == 0) goto L_0x00ce
            r12 = r12 | r21
            r7 = r31
            goto L_0x00e1
        L_0x00ce:
            r21 = r10 & r21
            r7 = r31
            if (r21 != 0) goto L_0x00e1
            boolean r22 = r8.d(r7)
            if (r22 == 0) goto L_0x00dd
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r12 = r12 | r22
        L_0x00e1:
            r3 = r3 & r11
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00eb
            r12 = r12 | r23
            r0 = r32
            goto L_0x00fe
        L_0x00eb:
            r23 = r10 & r23
            r0 = r32
            if (r23 != 0) goto L_0x00fe
            boolean r24 = r8.l(r0)
            if (r24 == 0) goto L_0x00fa
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r12 = r12 | r24
        L_0x00fe:
            r4 = r4 & r11
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x0108
            r12 = r12 | r22
            r0 = r33
            goto L_0x011b
        L_0x0108:
            r22 = r10 & r22
            r0 = r33
            if (r22 != 0) goto L_0x011b
            boolean r22 = r8.l(r0)
            if (r22 == 0) goto L_0x0117
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r12 = r12 | r22
        L_0x011b:
            r22 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r12 & r22
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r2) goto L_0x0138
            boolean r0 = r8.t()
            if (r0 != 0) goto L_0x012c
            goto L_0x0138
        L_0x012c:
            r8.B()
            r10 = r33
            r3 = r9
            r5 = r13
            r4 = r14
            r9 = r32
            goto L_0x02a6
        L_0x0138:
            if (r15 == 0) goto L_0x013d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r9 = r0
        L_0x013d:
            if (r16 == 0) goto L_0x0142
            com.google.pay.button.ButtonTheme r0 = com.google.pay.button.ButtonTheme.Dark
            r14 = r0
        L_0x0142:
            if (r5 == 0) goto L_0x0147
            com.google.pay.button.ButtonType r0 = com.google.pay.button.ButtonType.Buy
            r13 = r0
        L_0x0147:
            if (r18 == 0) goto L_0x0151
            r0 = 100
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            r6 = r0
        L_0x0151:
            if (r20 == 0) goto L_0x0154
            r7 = 1
        L_0x0154:
            if (r3 == 0) goto L_0x0176
            r0 = -1137921778(0xffffffffbc2cb10e, float:-0.01054026)
            r8.X(r0)
            java.lang.Object r0 = r8.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0170
            r.a r0 = new r.a
            r0.<init>()
            r8.N(r0)
        L_0x0170:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r8.M()
            goto L_0x0178
        L_0x0176:
            r0 = r32
        L_0x0178:
            r2 = 0
            if (r4 == 0) goto L_0x017d
            r3 = r2
            goto L_0x017f
        L_0x017d:
            r3 = r33
        L_0x017f:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x018e
            r4 = -1
            java.lang.String r5 = "com.google.pay.button.PayButton (PayButton.kt:62)"
            r15 = -268720185(0xffffffffeffba7c7, float:-1.5576714E29)
            androidx.compose.runtime.ComposerKt.Y(r15, r12, r4, r5)
        L_0x018e:
            r4 = -1137919090(0xffffffffbc2cbb8e, float:-0.010542763)
            r8.X(r4)
            java.lang.Object r4 = r8.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r5.a()
            if (r4 != r15) goto L_0x01aa
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r15 = 2
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r4, r2, r15, r2)
            r8.N(r4)
        L_0x01aa:
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            r8.M()
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r8.C(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            float r2 = r2.B1(r6)
            int r2 = (int) r2
            boolean r15 = l(r4)
            if (r15 != 0) goto L_0x027b
            r15 = -915575883(0xffffffffc96d6bb5, float:-972475.3)
            r8.X(r15)
            r15 = -1137911450(0xffffffffbc2cd966, float:-0.010549879)
            r8.X(r15)
            r15 = r12 & 7168(0x1c00, float:1.0045E-41)
            r16 = 0
            r17 = r6
            r6 = 2048(0x800, float:2.87E-42)
            if (r15 != r6) goto L_0x01dc
            r6 = 1
            goto L_0x01de
        L_0x01dc:
            r6 = r16
        L_0x01de:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r12
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r15 != r10) goto L_0x01e8
            r10 = 1
            goto L_0x01ea
        L_0x01e8:
            r10 = r16
        L_0x01ea:
            r6 = r6 | r10
            boolean r10 = r8.i(r2)
            r6 = r6 | r10
            r10 = r12 & 112(0x70, float:1.57E-43)
            r15 = 32
            if (r10 != r15) goto L_0x01f8
            r10 = 1
            goto L_0x01fa
        L_0x01f8:
            r10 = r16
        L_0x01fa:
            r6 = r6 | r10
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r12
            r15 = 8388608(0x800000, float:1.17549435E-38)
            if (r10 != r15) goto L_0x0204
            r10 = 1
            goto L_0x0206
        L_0x0204:
            r10 = r16
        L_0x0206:
            r6 = r6 | r10
            java.lang.Object r10 = r8.g()
            if (r6 != 0) goto L_0x0213
            java.lang.Object r6 = r5.a()
            if (r10 != r6) goto L_0x0229
        L_0x0213:
            r.b r10 = new r.b
            r27 = r10
            r28 = r14
            r29 = r13
            r30 = r2
            r31 = r26
            r32 = r0
            r33 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r8.N(r10)
        L_0x0229:
            r2 = r10
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r8.M()
            r6 = -1137888610(0xffffffffbc2d329e, float:-0.01057115)
            r8.X(r6)
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r12
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r10) goto L_0x023e
            r6 = 1
            goto L_0x0240
        L_0x023e:
            r6 = r16
        L_0x0240:
            r10 = r12 & 14
            r15 = 4
            if (r10 != r15) goto L_0x0247
            r16 = 1
        L_0x0247:
            r6 = r6 | r16
            java.lang.Object r10 = r8.g()
            if (r6 != 0) goto L_0x0255
            java.lang.Object r5 = r5.a()
            if (r10 != r5) goto L_0x025d
        L_0x0255:
            r.c r10 = new r.c
            r10.<init>(r4, r7, r1)
            r8.N(r10)
        L_0x025d:
            r4 = r10
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r8.M()
            int r5 = r12 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 0
            r27 = r2
            r28 = r9
            r29 = r4
            r30 = r8
            r31 = r5
            r32 = r6
            androidx.compose.ui.viewinterop.AndroidView_androidKt.a(r27, r28, r29, r30, r31, r32)
            r8.M()
            goto L_0x0296
        L_0x027b:
            r17 = r6
            r2 = -914337774(0xffffffffc9805012, float:-1051138.2)
            r8.X(r2)
            if (r3 != 0) goto L_0x0286
            goto L_0x0293
        L_0x0286:
            int r2 = r12 >> 24
            r2 = r2 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.m(r8, r2)
            kotlin.Unit r2 = kotlin.Unit.f40552a
        L_0x0293:
            r8.M()
        L_0x0296:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x029f
            androidx.compose.runtime.ComposerKt.X()
        L_0x029f:
            r10 = r3
            r3 = r9
            r5 = r13
            r4 = r14
            r6 = r17
            r9 = r0
        L_0x02a6:
            androidx.compose.runtime.ScopeUpdateScope r12 = r8.x()
            if (r12 == 0) goto L_0x02bf
            r.d r13 = new r.d
            r0 = r13
            r1 = r25
            r2 = r26
            r8 = r9
            r9 = r10
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.pay.button.PayButtonKt.f(kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, com.google.pay.button.ButtonTheme, com.google.pay.button.ButtonType, float, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(Throwable th) {
        Intrinsics.i(th, "it");
        return Unit.f40552a;
    }

    public static final PayButton h(ButtonTheme buttonTheme, ButtonType buttonType, int i2, String str, Function1 function1, MutableState mutableState, Context context) {
        Object obj;
        Intrinsics.i(context, "context");
        PayButton payButton = new PayButton(context);
        try {
            Result.Companion companion = Result.f40519A;
            payButton.a(ButtonOptions.f0().c(buttonTheme.f()).d(buttonType.f()).e(i2).b(str).a());
            obj = Result.b(Unit.f40552a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        Throwable e2 = Result.e(obj);
        if (e2 != null) {
            function1.invoke(e2);
            m(mutableState, true);
        }
        return payButton;
    }

    public static final Unit i(MutableState mutableState, boolean z2, Function0 function0, PayButton payButton) {
        Intrinsics.i(payButton, "button");
        if (!l(mutableState)) {
            payButton.setAlpha(z2 ? 1.0f : 0.5f);
            payButton.setEnabled(z2);
            if (z2) {
                payButton.setOnClickListener(new e(function0));
            } else {
                payButton.setOnClickListener((View.OnClickListener) null);
            }
        }
        return Unit.f40552a;
    }

    public static final void j(Function0 function0, View view) {
        function0.invoke();
    }

    public static final Unit k(Function0 function0, String str, Modifier modifier, ButtonTheme buttonTheme, ButtonType buttonType, float f2, boolean z2, Function1 function1, Function2 function2, int i2, int i3, Composer composer, int i4) {
        f(function0, str, modifier, buttonTheme, buttonType, f2, z2, function1, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final boolean l(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void m(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }
}
