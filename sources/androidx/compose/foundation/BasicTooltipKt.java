package androidx.compose.foundation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class BasicTooltipKt {
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.window.PopupPositionProvider r20, kotlin.jvm.functions.Function2 r21, androidx.compose.foundation.BasicTooltipState r22, androidx.compose.ui.Modifier r23, boolean r24, boolean r25, kotlin.jvm.functions.Function2 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r7 = r22
            r8 = r28
            r0 = 16
            r1 = 32
            r2 = 2
            r3 = 4
            r4 = 1841478228(0x6dc2ba54, float:7.5331686E27)
            r5 = r27
            androidx.compose.runtime.Composer r9 = r5.q(r4)
            r10 = 1
            r5 = r29 & 1
            if (r5 == 0) goto L_0x001d
            r5 = r8 | 6
            r11 = r20
            goto L_0x002f
        L_0x001d:
            r5 = r8 & 6
            r11 = r20
            if (r5 != 0) goto L_0x002e
            boolean r5 = r9.W(r11)
            if (r5 == 0) goto L_0x002b
            r5 = r3
            goto L_0x002c
        L_0x002b:
            r5 = r2
        L_0x002c:
            r5 = r5 | r8
            goto L_0x002f
        L_0x002e:
            r5 = r8
        L_0x002f:
            r2 = r29 & 2
            if (r2 == 0) goto L_0x0038
            r5 = r5 | 48
            r12 = r21
            goto L_0x0048
        L_0x0038:
            r2 = r8 & 48
            r12 = r21
            if (r2 != 0) goto L_0x0048
            boolean r2 = r9.l(r12)
            if (r2 == 0) goto L_0x0046
            r2 = r1
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            r5 = r5 | r2
        L_0x0048:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004f:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005f
            boolean r2 = r9.W(r7)
            if (r2 == 0) goto L_0x005c
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r2
        L_0x005f:
            r2 = r29 & 8
            if (r2 == 0) goto L_0x0068
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r3 = r23
            goto L_0x007a
        L_0x0068:
            r3 = r8 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0065
            r3 = r23
            boolean r6 = r9.W(r3)
            if (r6 == 0) goto L_0x0077
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r5 = r5 | r6
        L_0x007a:
            r0 = r29 & 16
            if (r0 == 0) goto L_0x0083
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r6 = r24
            goto L_0x0095
        L_0x0083:
            r6 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0080
            r6 = r24
            boolean r14 = r9.d(r6)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r5 = r5 | r14
        L_0x0095:
            r1 = r29 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x009f
            r5 = r5 | r14
        L_0x009c:
            r14 = r25
            goto L_0x00b0
        L_0x009f:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009c
            r14 = r25
            boolean r15 = r9.d(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r5 = r5 | r15
        L_0x00b0:
            r15 = r29 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bb
            r5 = r5 | r16
        L_0x00b8:
            r15 = r26
            goto L_0x00ce
        L_0x00bb:
            r15 = r8 & r16
            if (r15 != 0) goto L_0x00b8
            r15 = r26
            boolean r16 = r9.l(r15)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r5 = r5 | r16
        L_0x00ce:
            r16 = 599187(0x92493, float:8.3964E-40)
            r13 = r5 & r16
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r13 == r4) goto L_0x00db
            r4 = 1
        L_0x00d9:
            r13 = 1
            goto L_0x00dd
        L_0x00db:
            r4 = 0
            goto L_0x00d9
        L_0x00dd:
            r10 = r5 & 1
            boolean r4 = r9.E(r4, r10)
            if (r4 == 0) goto L_0x0226
            if (r2 == 0) goto L_0x00eb
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r10 = r2
            goto L_0x00ec
        L_0x00eb:
            r10 = r3
        L_0x00ec:
            if (r0 == 0) goto L_0x00f1
            r18 = r13
            goto L_0x00f3
        L_0x00f1:
            r18 = r6
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r14 = r13
        L_0x00f6:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0105
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)"
            r2 = 1841478228(0x6dc2ba54, float:7.5331686E27)
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r0, r1)
        L_0x0105:
            java.lang.Object r0 = r9.g()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r16.a()
            if (r0 != r1) goto L_0x011a
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.j(r0, r9)
            r9.N(r0)
        L_0x011a:
            r2 = r0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.o()
            r6 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r6)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r9, r6)
            androidx.compose.runtime.CompositionLocalMap r4 = r9.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r9, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r17.a()
            androidx.compose.runtime.Applier r19 = r9.v()
            if (r19 != 0) goto L_0x0145
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0145:
            r9.s()
            boolean r19 = r9.n()
            if (r19 == 0) goto L_0x0152
            r9.y(r6)
            goto L_0x0155
        L_0x0152:
            r9.K()
        L_0x0155:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r13 = r17.c()
            androidx.compose.runtime.Updater.g(r6, r1, r13)
            kotlin.jvm.functions.Function2 r1 = r17.e()
            androidx.compose.runtime.Updater.g(r6, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r17.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x017f
            java.lang.Object r4 = r6.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r13)
            if (r4 != 0) goto L_0x018d
        L_0x017f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r1)
        L_0x018d:
            kotlin.jvm.functions.Function2 r1 = r17.d()
            androidx.compose.runtime.Updater.g(r6, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            boolean r0 = r22.isVisible()
            if (r0 == 0) goto L_0x01c7
            r0 = 137118168(0x82c41d8, float:5.1836766E-34)
            r9.X(r0)
            r0 = r5 & 14
            int r1 = r5 >> 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r5 << 9
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r6 = r0 | r1
            r0 = r20
            r1 = r22
            r3 = r18
            r4 = r21
            r13 = r5
            r5 = r9
            r17 = 0
            b(r0, r1, r2, r3, r4, r5, r6)
            r9.M()
            goto L_0x01d3
        L_0x01c7:
            r13 = r5
            r17 = 0
            r0 = 137347847(0x82fc307, float:5.28914E-34)
            r9.X(r0)
            r9.M()
        L_0x01d3:
            int r0 = r13 >> 15
            r0 = r0 & 14
            int r1 = r13 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r13 >> 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r6 = 0
            r0 = r14
            r1 = r22
            r2 = r10
            r3 = r26
            r4 = r9
            c(r0, r1, r2, r3, r4, r5, r6)
            r9.T()
            r0 = r13 & 896(0x380, float:1.256E-42)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L_0x01fb
            r17 = 1
        L_0x01fb:
            java.lang.Object r0 = r9.g()
            if (r17 != 0) goto L_0x0207
            java.lang.Object r1 = r16.a()
            if (r0 != r1) goto L_0x020f
        L_0x0207:
            androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$2$1 r0 = new androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$2$1
            r0.<init>(r7)
            r9.N(r0)
        L_0x020f:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            int r1 = r13 >> 6
            r1 = r1 & 14
            androidx.compose.runtime.EffectsKt.c(r7, r0, r9, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0221
            androidx.compose.runtime.ComposerKt.X()
        L_0x0221:
            r4 = r10
            r6 = r14
            r5 = r18
            goto L_0x022c
        L_0x0226:
            r9.B()
            r4 = r3
            r5 = r6
            r6 = r14
        L_0x022c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r9.x()
            if (r10 == 0) goto L_0x0247
            androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$3 r13 = new androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$3
            r0 = r13
            r1 = r20
            r2 = r21
            r3 = r22
            r7 = r26
            r8 = r28
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r13)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.a(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function2, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.window.PopupPositionProvider r19, androidx.compose.foundation.BasicTooltipState r20, kotlinx.coroutines.CoroutineScope r21, boolean r22, kotlin.jvm.functions.Function2 r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r25
            r0 = -487341126(0xffffffffe2f3c3ba, float:-2.2483312E21)
            r1 = r24
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r4 = r6 & 6
            if (r4 != 0) goto L_0x0022
            r4 = r19
            boolean r7 = r1.W(r4)
            if (r7 == 0) goto L_0x001f
            r7 = 4
            goto L_0x0020
        L_0x001f:
            r7 = 2
        L_0x0020:
            r7 = r7 | r6
            goto L_0x0025
        L_0x0022:
            r4 = r19
            r7 = r6
        L_0x0025:
            r8 = r6 & 48
            r9 = 32
            if (r8 != 0) goto L_0x0036
            boolean r8 = r1.W(r2)
            if (r8 == 0) goto L_0x0033
            r8 = r9
            goto L_0x0035
        L_0x0033:
            r8 = 16
        L_0x0035:
            r7 = r7 | r8
        L_0x0036:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0046
            boolean r8 = r1.l(r3)
            if (r8 == 0) goto L_0x0043
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r7 = r7 | r8
        L_0x0046:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0059
            r8 = r22
            boolean r10 = r1.d(r8)
            if (r10 == 0) goto L_0x0055
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r7 = r7 | r10
            goto L_0x005b
        L_0x0059:
            r8 = r22
        L_0x005b:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x006b
            boolean r10 = r1.l(r5)
            if (r10 == 0) goto L_0x0068
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006a
        L_0x0068:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x006a:
            r7 = r7 | r10
        L_0x006b:
            r10 = r7 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            r12 = 0
            r15 = 1
            if (r10 == r11) goto L_0x0075
            r10 = r15
            goto L_0x0076
        L_0x0075:
            r10 = r12
        L_0x0076:
            r11 = r7 & 1
            boolean r10 = r1.E(r10, r11)
            if (r10 == 0) goto L_0x00ee
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x008a
            r10 = -1
            java.lang.String r11 = "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)"
            androidx.compose.runtime.ComposerKt.Y(r0, r7, r10, r11)
        L_0x008a:
            androidx.compose.foundation.BasicTooltipStrings r0 = androidx.compose.foundation.BasicTooltipStrings.f2963a
            r10 = 6
            java.lang.String r0 = r0.a(r1, r10)
            r10 = r7 & 112(0x70, float:1.57E-43)
            if (r10 != r9) goto L_0x0096
            r12 = r15
        L_0x0096:
            boolean r9 = r1.l(r3)
            r9 = r9 | r12
            java.lang.Object r10 = r1.g()
            if (r9 != 0) goto L_0x00a9
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x00b1
        L_0x00a9:
            androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1 r10 = new androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1
            r10.<init>(r2, r3)
            r1.N(r10)
        L_0x00b1:
            r9 = r10
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            androidx.compose.ui.window.PopupProperties r17 = new androidx.compose.ui.window.PopupProperties
            r16 = 14
            r18 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r17
            r11 = r22
            r15 = r16
            r16 = r18
            r10.<init>((boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (int) r15, (kotlin.jvm.internal.DefaultConstructorMarker) r16)
            androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2 r10 = new androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2
            r10.<init>(r0, r5)
            r0 = 54
            r11 = -2085908648(0xffffffff83ab8f58, float:-1.0083387E-36)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r12, r10, r1, r0)
            r0 = r7 & 14
            r12 = r0 | 3072(0xc00, float:4.305E-42)
            r7 = r19
            r8 = r9
            r9 = r17
            r11 = r1
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00f1
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00f1
        L_0x00ee:
            r1.B()
        L_0x00f1:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x010c
            androidx.compose.foundation.BasicTooltipKt$TooltipPopup$3 r8 = new androidx.compose.foundation.BasicTooltipKt$TooltipPopup$3
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.b(androidx.compose.ui.window.PopupPositionProvider, androidx.compose.foundation.BasicTooltipState, kotlinx.coroutines.CoroutineScope, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(boolean z2, BasicTooltipState basicTooltipState, Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-111661630);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.d(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((2 & i3) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(basicTooltipState) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.W(modifier) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= q2.l(function2) ? 2048 : 1024;
        }
        if (q2.E((i4 & 1171) != 1170, 1 & i4)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-111661630, i4, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, q2);
                q2.N(g2);
            }
            Modifier f2 = f(g(modifier, z2, basicTooltipState), BasicTooltipStrings.f2963a.b(q2, 6), z2, basicTooltipState, (CoroutineScope) g2);
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, f2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
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
            Updater.g(b2, g3, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function2.m(q2, Integer.valueOf((i4 >> 9) & 14));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BasicTooltipKt$WrappedAnchor$2(z2, basicTooltipState, modifier2, function2, i2, i3));
        }
    }

    public static final Modifier f(Modifier modifier, String str, boolean z2, BasicTooltipState basicTooltipState, CoroutineScope coroutineScope) {
        return z2 ? SemanticsModifierKt.c(modifier, true, new BasicTooltipKt$anchorSemantics$1(str, coroutineScope, basicTooltipState)) : modifier;
    }

    public static final Modifier g(Modifier modifier, boolean z2, BasicTooltipState basicTooltipState) {
        return z2 ? SuspendingPointerInputFilterKt.c(SuspendingPointerInputFilterKt.c(modifier, basicTooltipState, new BasicTooltipKt$handleGestures$1(basicTooltipState)), basicTooltipState, new BasicTooltipKt$handleGestures$2(basicTooltipState)) : modifier;
    }
}
