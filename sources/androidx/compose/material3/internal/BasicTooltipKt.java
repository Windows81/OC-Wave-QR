package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class BasicTooltipKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(androidx.compose.ui.window.PopupPositionProvider r25, kotlin.jvm.functions.Function2 r26, androidx.compose.material3.TooltipState r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function0 r29, boolean r30, boolean r31, boolean r32, kotlin.jvm.functions.Function2 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r9 = r27
            r10 = r35
            r11 = r36
            r0 = 128(0x80, float:1.794E-43)
            r1 = 16
            r2 = 32
            r3 = 4
            r4 = -1221877520(0xffffffffb72ba0f0, float:-1.0229865E-5)
            r5 = r34
            androidx.compose.runtime.Composer r13 = r5.q(r4)
            r14 = 1
            r5 = r11 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0021
            r5 = r10 | 6
            r15 = r25
            goto L_0x0033
        L_0x0021:
            r5 = r10 & 6
            r15 = r25
            if (r5 != 0) goto L_0x0032
            boolean r5 = r13.W(r15)
            if (r5 == 0) goto L_0x002f
            r5 = r3
            goto L_0x0030
        L_0x002f:
            r5 = r6
        L_0x0030:
            r5 = r5 | r10
            goto L_0x0033
        L_0x0032:
            r5 = r10
        L_0x0033:
            r7 = r11 & 2
            if (r7 == 0) goto L_0x003c
            r5 = r5 | 48
            r8 = r26
            goto L_0x004c
        L_0x003c:
            r7 = r10 & 48
            r8 = r26
            if (r7 != 0) goto L_0x004c
            boolean r7 = r13.l(r8)
            if (r7 == 0) goto L_0x004a
            r7 = r2
            goto L_0x004b
        L_0x004a:
            r7 = r1
        L_0x004b:
            r5 = r5 | r7
        L_0x004c:
            r3 = r3 & r11
            if (r3 == 0) goto L_0x0052
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0052:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x006a
            r3 = r10 & 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x005f
            boolean r3 = r13.W(r9)
            goto L_0x0063
        L_0x005f:
            boolean r3 = r13.l(r9)
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r5 = r5 | r3
        L_0x006a:
            r3 = r11 & 8
            if (r3 == 0) goto L_0x0073
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r7 = r28
            goto L_0x0086
        L_0x0073:
            r7 = r10 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0070
            r7 = r28
            boolean r16 = r13.W(r7)
            if (r16 == 0) goto L_0x0082
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r5 = r5 | r16
        L_0x0086:
            r1 = r1 & r11
            if (r1 == 0) goto L_0x008e
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008b:
            r6 = r29
            goto L_0x00a1
        L_0x008e:
            r6 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008b
            r6 = r29
            boolean r16 = r13.l(r6)
            if (r16 == 0) goto L_0x009d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r5 = r5 | r16
        L_0x00a1:
            r2 = r2 & r11
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00ab
            r5 = r5 | r16
            r4 = r30
            goto L_0x00be
        L_0x00ab:
            r17 = r10 & r16
            r4 = r30
            if (r17 != 0) goto L_0x00be
            boolean r18 = r13.d(r4)
            if (r18 == 0) goto L_0x00ba
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r5 = r5 | r18
        L_0x00be:
            r18 = r11 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c9
            r5 = r5 | r19
            r14 = r31
            goto L_0x00dc
        L_0x00c9:
            r19 = r10 & r19
            r14 = r31
            if (r19 != 0) goto L_0x00dc
            boolean r20 = r13.d(r14)
            if (r20 == 0) goto L_0x00d8
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r5 = r5 | r20
        L_0x00dc:
            r0 = r0 & r11
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e8
            r5 = r5 | r20
            r12 = r32
        L_0x00e5:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x00fc
        L_0x00e8:
            r20 = r10 & r20
            r12 = r32
            if (r20 != 0) goto L_0x00e5
            boolean r21 = r13.d(r12)
            if (r21 == 0) goto L_0x00f7
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r5 = r5 | r21
            goto L_0x00e5
        L_0x00fc:
            r6 = r11 & 256(0x100, float:3.59E-43)
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            if (r6 == 0) goto L_0x0106
            r5 = r5 | r4
            r6 = r33
            goto L_0x0117
        L_0x0106:
            r4 = r4 & r10
            r6 = r33
            if (r4 != 0) goto L_0x0117
            boolean r4 = r13.l(r6)
            if (r4 == 0) goto L_0x0114
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r5 = r5 | r4
        L_0x0117:
            r4 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r4 & r5
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            r10 = 0
            if (r4 == r6) goto L_0x0125
            r4 = 1
        L_0x0122:
            r19 = 1
            goto L_0x0127
        L_0x0125:
            r4 = r10
            goto L_0x0122
        L_0x0127:
            r6 = r5 & 1
            boolean r4 = r13.E(r4, r6)
            if (r4 == 0) goto L_0x02e2
            if (r3 == 0) goto L_0x0136
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r21 = r3
            goto L_0x0138
        L_0x0136:
            r21 = r7
        L_0x0138:
            r3 = 0
            if (r1 == 0) goto L_0x013e
            r22 = r3
            goto L_0x0140
        L_0x013e:
            r22 = r29
        L_0x0140:
            if (r2 == 0) goto L_0x0145
            r23 = r10
            goto L_0x0147
        L_0x0145:
            r23 = r30
        L_0x0147:
            if (r18 == 0) goto L_0x014b
            r14 = r19
        L_0x014b:
            if (r0 == 0) goto L_0x014e
            r12 = r10
        L_0x014e:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x015d
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)"
            r2 = -1221877520(0xffffffffb72ba0f0, float:-1.0229865E-5)
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r0, r1)
        L_0x015d:
            java.lang.Object r0 = r13.g()
            androidx.compose.runtime.Composer$Companion r17 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r17.a()
            if (r0 != r1) goto L_0x0172
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.j(r0, r13)
            r13.N(r0)
        L_0x0172:
            r4 = r0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            java.lang.Object r0 = r13.g()
            java.lang.Object r1 = r17.a()
            if (r0 != r1) goto L_0x0189
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r0, r3, r1, r3)
            r13.N(r0)
        L_0x0189:
            r18 = r0
            androidx.compose.runtime.MutableState r18 = (androidx.compose.runtime.MutableState) r18
            if (r12 == 0) goto L_0x01ae
            androidx.compose.runtime.State r0 = w(r13, r10)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01ab
            java.lang.Object r0 = r18.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01ae
        L_0x01ab:
            r0 = r19
            goto L_0x01af
        L_0x01ae:
            r0 = r10
        L_0x01af:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r2 = r2.o()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.g(r2, r10)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r13, r10)
            androidx.compose.runtime.CompositionLocalMap r6 = r13.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r13, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r10 = r7.a()
            androidx.compose.runtime.Applier r24 = r13.v()
            if (r24 != 0) goto L_0x01d6
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01d6:
            r13.s()
            boolean r24 = r13.n()
            if (r24 == 0) goto L_0x01e3
            r13.y(r10)
            goto L_0x01e6
        L_0x01e3:
            r13.K()
        L_0x01e6:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r13)
            kotlin.jvm.functions.Function2 r8 = r7.c()
            androidx.compose.runtime.Updater.g(r10, r2, r8)
            kotlin.jvm.functions.Function2 r2 = r7.e()
            androidx.compose.runtime.Updater.g(r10, r6, r2)
            kotlin.jvm.functions.Function2 r2 = r7.b()
            boolean r6 = r10.n()
            if (r6 != 0) goto L_0x0210
            java.lang.Object r6 = r10.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r8)
            if (r6 != 0) goto L_0x021e
        L_0x0210:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r10.N(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.A(r3, r2)
        L_0x021e:
            kotlin.jvm.functions.Function2 r2 = r7.d()
            androidx.compose.runtime.Updater.g(r10, r1, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            boolean r1 = r27.isVisible()
            if (r1 == 0) goto L_0x0266
            r1 = -1891243071(0xffffffff8f45ebc1, float:-9.7582544E-30)
            r13.X(r1)
            if (r23 != 0) goto L_0x023a
            if (r0 == 0) goto L_0x0238
            goto L_0x023a
        L_0x0238:
            r6 = 0
            goto L_0x023c
        L_0x023a:
            r6 = r19
        L_0x023c:
            r0 = r5 & 14
            r0 = r0 | r16
            int r1 = r5 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r5 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r5 << 15
            r2 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r8 = r0 | r1
            r0 = r25
            r1 = r27
            r2 = r22
            r3 = r4
            r4 = r6
            r10 = r5
            r5 = r18
            r6 = r26
            r7 = r13
            l(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r13.M()
            goto L_0x0270
        L_0x0266:
            r10 = r5
            r0 = -1890863476(0xffffffff8f4bb68c, float:-1.004383E-29)
            r13.X(r0)
            r13.M()
        L_0x0270:
            int r0 = r10 >> 18
            r0 = r0 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            int r1 = r10 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r10 >> 12
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            int r2 = r10 << 3
            r1 = r1 & r2
            r0 = r0 | r1
            int r1 = r10 >> 9
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r7 = r0 | r1
            r8 = 0
            r0 = r14
            r1 = r27
            r2 = r18
            r3 = r12
            r4 = r21
            r5 = r33
            r6 = r13
            o(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r13.T()
            r0 = r10 & 896(0x380, float:1.256E-42)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 == r1) goto L_0x02b3
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x02b1
            boolean r0 = r13.l(r9)
            if (r0 == 0) goto L_0x02b1
            goto L_0x02b3
        L_0x02b1:
            r19 = 0
        L_0x02b3:
            java.lang.Object r0 = r13.g()
            if (r19 != 0) goto L_0x02bf
            java.lang.Object r1 = r17.a()
            if (r0 != r1) goto L_0x02c7
        L_0x02bf:
            androidx.compose.material3.internal.y r0 = new androidx.compose.material3.internal.y
            r0.<init>(r9)
            r13.N(r0)
        L_0x02c7:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            int r1 = r10 >> 6
            r1 = r1 & 14
            androidx.compose.runtime.EffectsKt.c(r9, r0, r13, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02d9
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d9:
            r8 = r12
            r7 = r14
            r4 = r21
            r5 = r22
            r6 = r23
            goto L_0x02ec
        L_0x02e2:
            r13.B()
            r5 = r29
            r6 = r30
            r4 = r7
            r8 = r12
            r7 = r14
        L_0x02ec:
            androidx.compose.runtime.ScopeUpdateScope r12 = r13.x()
            if (r12 == 0) goto L_0x0307
            androidx.compose.material3.internal.z r13 = new androidx.compose.material3.internal.z
            r0 = r13
            r1 = r25
            r2 = r26
            r3 = r27
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0307:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt.i(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function2, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, boolean, boolean, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final DisposableEffectResult j(TooltipState tooltipState, DisposableEffectScope disposableEffectScope) {
        return new BasicTooltipKt$BasicTooltipBox$lambda$4$lambda$3$$inlined$onDispose$1(tooltipState);
    }

    public static final Unit k(PopupPositionProvider popupPositionProvider, Function2 function2, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z2, boolean z3, boolean z4, Function2 function22, int i2, int i3, Composer composer, int i4) {
        i(popupPositionProvider, function2, tooltipState, modifier, function0, z2, z3, z4, function22, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(androidx.compose.ui.window.PopupPositionProvider r20, androidx.compose.material3.TooltipState r21, kotlin.jvm.functions.Function0 r22, kotlinx.coroutines.CoroutineScope r23, boolean r24, androidx.compose.runtime.MutableState r25, kotlin.jvm.functions.Function2 r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r2 = r21
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r28
            r0 = -1413720282(0xffffffffabbc5726, float:-1.3382392E-12)
            r1 = r27
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r5 = r8 & 6
            if (r5 != 0) goto L_0x0026
            r5 = r20
            boolean r9 = r1.W(r5)
            if (r9 == 0) goto L_0x0023
            r9 = 4
            goto L_0x0024
        L_0x0023:
            r9 = 2
        L_0x0024:
            r9 = r9 | r8
            goto L_0x0029
        L_0x0026:
            r5 = r20
            r9 = r8
        L_0x0029:
            r10 = r8 & 48
            r11 = 32
            if (r10 != 0) goto L_0x0043
            r10 = r8 & 64
            if (r10 != 0) goto L_0x0038
            boolean r10 = r1.W(r2)
            goto L_0x003c
        L_0x0038:
            boolean r10 = r1.l(r2)
        L_0x003c:
            if (r10 == 0) goto L_0x0040
            r10 = r11
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r9 = r9 | r10
        L_0x0043:
            r10 = r8 & 384(0x180, float:5.38E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r10 != 0) goto L_0x0054
            boolean r10 = r1.l(r3)
            if (r10 == 0) goto L_0x0051
            r10 = r12
            goto L_0x0053
        L_0x0051:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0053:
            r9 = r9 | r10
        L_0x0054:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0064
            boolean r10 = r1.l(r4)
            if (r10 == 0) goto L_0x0061
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0063
        L_0x0061:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0063:
            r9 = r9 | r10
        L_0x0064:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0077
            r10 = r24
            boolean r13 = r1.d(r10)
            if (r13 == 0) goto L_0x0073
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0075
        L_0x0073:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0075:
            r9 = r9 | r13
            goto L_0x0079
        L_0x0077:
            r10 = r24
        L_0x0079:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x008a
            boolean r13 = r1.W(r6)
            if (r13 == 0) goto L_0x0087
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0089
        L_0x0087:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0089:
            r9 = r9 | r13
        L_0x008a:
            r13 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x009b
            boolean r13 = r1.l(r7)
            if (r13 == 0) goto L_0x0098
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009a
        L_0x0098:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x009a:
            r9 = r9 | r13
        L_0x009b:
            r13 = 599187(0x92493, float:8.3964E-40)
            r13 = r13 & r9
            r15 = 599186(0x92492, float:8.39638E-40)
            r16 = 0
            r14 = 1
            if (r13 == r15) goto L_0x00a9
            r13 = r14
            goto L_0x00ab
        L_0x00a9:
            r13 = r16
        L_0x00ab:
            r15 = r9 & 1
            boolean r13 = r1.E(r13, r15)
            if (r13 == 0) goto L_0x0142
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x00bf
            r13 = -1
            java.lang.String r15 = "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:169)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r13, r15)
        L_0x00bf:
            androidx.compose.material3.internal.BasicTooltipStrings r0 = androidx.compose.material3.internal.BasicTooltipStrings.f12182a
            r13 = 6
            java.lang.String r0 = r0.a(r1, r13)
            r13 = r9 & 896(0x380, float:1.256E-42)
            if (r13 != r12) goto L_0x00cc
            r12 = r14
            goto L_0x00ce
        L_0x00cc:
            r12 = r16
        L_0x00ce:
            r13 = r9 & 112(0x70, float:1.57E-43)
            if (r13 == r11) goto L_0x00e0
            r11 = r9 & 64
            if (r11 == 0) goto L_0x00dd
            boolean r11 = r1.l(r2)
            if (r11 == 0) goto L_0x00dd
            goto L_0x00e0
        L_0x00dd:
            r11 = r16
            goto L_0x00e1
        L_0x00e0:
            r11 = r14
        L_0x00e1:
            r11 = r11 | r12
            boolean r12 = r1.l(r4)
            r11 = r11 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r12 != r13) goto L_0x00f0
            r16 = r14
        L_0x00f0:
            r11 = r11 | r16
            java.lang.Object r12 = r1.g()
            if (r11 != 0) goto L_0x0100
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x0108
        L_0x0100:
            androidx.compose.material3.internal.A r12 = new androidx.compose.material3.internal.A
            r12.<init>(r3, r2, r4, r6)
            r1.N(r12)
        L_0x0108:
            r11 = r12
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            androidx.compose.ui.window.PopupProperties r12 = new androidx.compose.ui.window.PopupProperties
            r18 = 14
            r19 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r12
            r2 = r14
            r14 = r24
            r13.<init>((boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (int) r18, (kotlin.jvm.internal.DefaultConstructorMarker) r19)
            androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$2 r13 = new androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$2
            r13.<init>(r0, r7)
            r0 = 54
            r14 = -1287705660(0xffffffffb33f2bc4, float:-4.4510458E-8)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r2, r13, r1, r0)
            r2 = r9 & 14
            r14 = r2 | 3072(0xc00, float:4.305E-42)
            r9 = r20
            r10 = r11
            r11 = r12
            r12 = r0
            r13 = r1
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0145
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0145
        L_0x0142:
            r1.B()
        L_0x0145:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x0164
            androidx.compose.material3.internal.B r10 = new androidx.compose.material3.internal.B
            r0 = r10
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt.l(androidx.compose.ui.window.PopupPositionProvider, androidx.compose.material3.TooltipState, kotlin.jvm.functions.Function0, kotlinx.coroutines.CoroutineScope, boolean, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit m(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, Function0 function0, CoroutineScope coroutineScope, boolean z2, MutableState mutableState, Function2 function2, int i2, Composer composer, int i3) {
        l(popupPositionProvider, tooltipState, function0, coroutineScope, z2, mutableState, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit n(Function0 function0, TooltipState tooltipState, CoroutineScope coroutineScope, MutableState mutableState) {
        if (function0 != null) {
            function0.invoke();
        } else if (tooltipState.isVisible()) {
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BasicTooltipKt$TooltipPopup$1$1$1(tooltipState, (Continuation) null), 3, (Object) null);
            mutableState.setValue(Boolean.FALSE);
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(boolean r16, androidx.compose.material3.TooltipState r17, androidx.compose.runtime.MutableState r18, boolean r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function2 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r6 = r16
            r7 = r17
            r8 = r21
            r9 = r23
            r0 = 16
            r1 = 32
            r2 = 2
            r3 = 4
            r4 = 6
            r5 = 1873232064(0x6fa740c0, float:1.0352455E29)
            r10 = r22
            androidx.compose.runtime.Composer r10 = r10.q(r5)
            r11 = 1
            r12 = r24 & 1
            if (r12 == 0) goto L_0x0020
            r12 = r9 | 6
            goto L_0x0030
        L_0x0020:
            r12 = r9 & 6
            if (r12 != 0) goto L_0x002f
            boolean r12 = r10.d(r6)
            if (r12 == 0) goto L_0x002c
            r12 = r3
            goto L_0x002d
        L_0x002c:
            r12 = r2
        L_0x002d:
            r12 = r12 | r9
            goto L_0x0030
        L_0x002f:
            r12 = r9
        L_0x0030:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0037
            r12 = r12 | 48
            goto L_0x004e
        L_0x0037:
            r2 = r9 & 48
            if (r2 != 0) goto L_0x004e
            r2 = r9 & 64
            if (r2 != 0) goto L_0x0044
            boolean r2 = r10.W(r7)
            goto L_0x0048
        L_0x0044:
            boolean r2 = r10.l(r7)
        L_0x0048:
            if (r2 == 0) goto L_0x004c
            r2 = r1
            goto L_0x004d
        L_0x004c:
            r2 = r0
        L_0x004d:
            r12 = r12 | r2
        L_0x004e:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x0057
            r12 = r12 | 384(0x180, float:5.38E-43)
            r13 = r18
            goto L_0x0069
        L_0x0057:
            r2 = r9 & 384(0x180, float:5.38E-43)
            r13 = r18
            if (r2 != 0) goto L_0x0069
            boolean r2 = r10.W(r13)
            if (r2 == 0) goto L_0x0066
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r12 = r12 | r2
        L_0x0069:
            r2 = r24 & 8
            if (r2 == 0) goto L_0x0072
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            r14 = r19
            goto L_0x0084
        L_0x0072:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            r14 = r19
            if (r2 != 0) goto L_0x0084
            boolean r2 = r10.d(r14)
            if (r2 == 0) goto L_0x0081
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r12 = r12 | r2
        L_0x0084:
            r0 = r24 & 16
            if (r0 == 0) goto L_0x008d
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r2 = r20
            goto L_0x009f
        L_0x008d:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x008a
            r2 = r20
            boolean r3 = r10.W(r2)
            if (r3 == 0) goto L_0x009c
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r12 = r12 | r3
        L_0x009f:
            r1 = r24 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a7
            r12 = r12 | r3
            goto L_0x00b7
        L_0x00a7:
            r1 = r9 & r3
            if (r1 != 0) goto L_0x00b7
            boolean r1 = r10.l(r8)
            if (r1 == 0) goto L_0x00b4
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r12 = r12 | r1
        L_0x00b7:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r12
            r3 = 74898(0x12492, float:1.04954E-40)
            r15 = 0
            if (r1 == r3) goto L_0x00c3
            r1 = r11
            goto L_0x00c4
        L_0x00c3:
            r1 = r15
        L_0x00c4:
            r3 = r12 & 1
            boolean r1 = r10.E(r1, r3)
            if (r1 == 0) goto L_0x01a0
            if (r0 == 0) goto L_0x00d2
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r11 = r0
            goto L_0x00d3
        L_0x00d2:
            r11 = r2
        L_0x00d3:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00df
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)"
            androidx.compose.runtime.ComposerKt.Y(r5, r12, r0, r1)
        L_0x00df:
            java.lang.Object r0 = r10.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x00f4
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.j(r0, r10)
            r10.N(r0)
        L_0x00f4:
            r3 = r0
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            androidx.compose.material3.internal.BasicTooltipStrings r0 = androidx.compose.material3.internal.BasicTooltipStrings.f12182a
            java.lang.String r0 = r0.b(r10, r4)
            androidx.compose.ui.Modifier r1 = t(r11, r6, r7)
            androidx.compose.ui.Modifier r0 = q(r1, r0, r6, r7, r3)
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r18
            androidx.compose.ui.Modifier r0 = u(r0, r1, r2, r3, r4, r5)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.o()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r15)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r10, r15)
            androidx.compose.runtime.CompositionLocalMap r3 = r10.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r10, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r15 = r10.v()
            if (r15 != 0) goto L_0x0136
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0136:
            r10.s()
            boolean r15 = r10.n()
            if (r15 == 0) goto L_0x0143
            r10.y(r5)
            goto L_0x0146
        L_0x0143:
            r10.K()
        L_0x0146:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r15 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r1, r15)
            kotlin.jvm.functions.Function2 r1 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r3, r1)
            kotlin.jvm.functions.Function2 r1 = r4.b()
            boolean r3 = r5.n()
            if (r3 != 0) goto L_0x0170
            java.lang.Object r3 = r5.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r15)
            if (r3 != 0) goto L_0x017e
        L_0x0170:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.N(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.A(r2, r1)
        L_0x017e:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r0 = r12 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.m(r10, r0)
            r10.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x019e
            androidx.compose.runtime.ComposerKt.X()
        L_0x019e:
            r5 = r11
            goto L_0x01a4
        L_0x01a0:
            r10.B()
            r5 = r2
        L_0x01a4:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.x()
            if (r10 == 0) goto L_0x01c1
            androidx.compose.material3.internal.C r11 = new androidx.compose.material3.internal.C
            r0 = r11
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt.o(boolean, androidx.compose.material3.TooltipState, androidx.compose.runtime.MutableState, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit p(boolean z2, TooltipState tooltipState, MutableState mutableState, boolean z3, Modifier modifier, Function2 function2, int i2, int i3, Composer composer, int i4) {
        o(z2, tooltipState, mutableState, z3, modifier, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Modifier q(Modifier modifier, String str, boolean z2, TooltipState tooltipState, CoroutineScope coroutineScope) {
        return z2 ? ChildParentSemanticsKt.e(modifier, new E(str, coroutineScope, tooltipState)) : modifier;
    }

    public static final Unit r(String str, CoroutineScope coroutineScope, TooltipState tooltipState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.F(semanticsPropertyReceiver, str, new F(coroutineScope, tooltipState));
        return Unit.f40552a;
    }

    public static final boolean s(CoroutineScope coroutineScope, TooltipState tooltipState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BasicTooltipKt$anchorSemantics$1$1$1(tooltipState, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final Modifier t(Modifier modifier, boolean z2, TooltipState tooltipState) {
        return z2 ? SuspendingPointerInputFilterKt.c(SuspendingPointerInputFilterKt.c(modifier, tooltipState, new BasicTooltipKt$handleGestures$1(tooltipState)), tooltipState, new BasicTooltipKt$handleGestures$2(tooltipState)) : modifier;
    }

    public static final Modifier u(Modifier modifier, boolean z2, TooltipState tooltipState, CoroutineScope coroutineScope, boolean z3, MutableState mutableState) {
        if (z2) {
            return KeyInputModifierKt.b(FocusChangedModifierKt.a(modifier, new D(coroutineScope, tooltipState)), new BasicTooltipKt$keyboardBehavior$2(tooltipState, mutableState, z3));
        }
        mutableState.setValue(Boolean.FALSE);
        return modifier;
    }

    public static final Unit v(CoroutineScope coroutineScope, TooltipState tooltipState, FocusState focusState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new BasicTooltipKt$keyboardBehavior$1$1(focusState, tooltipState, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final State w(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1960751094, i2, -1, "androidx.compose.material3.internal.rememberTouchExplorationOrSwitchAccessServiceState (BasicTooltip.kt:456)");
        }
        State n2 = AccessibilityServiceStateProvider_androidKt.n(true, true, false, composer, 438, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return n2;
    }
}
