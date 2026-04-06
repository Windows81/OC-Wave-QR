package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.RippleConfiguration;
import androidx.compose.material3.RippleDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BottomBarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f37991a = Dp.m((float) 72);

    /* renamed from: b  reason: collision with root package name */
    public static final float f37992b = Dp.m(Dp.m((float) 76) / ((float) 2));

    /* renamed from: c  reason: collision with root package name */
    public static final RippleConfiguration f37993c = new RippleConfiguration(Color.f15975b.a(), RippleDefaults.f10735a.a(), (DefaultConstructorMarker) null);

    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(int r17, java.util.List r18, kotlin.jvm.functions.Function1 r19, boolean r20, boolean r21, kotlin.jvm.functions.Function0 r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r8 = r18
            r9 = r19
            r10 = r22
            r11 = r25
            java.lang.String r0 = "items"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onBarcodeClick"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = 1077423045(0x40382bc5, float:2.8776715)
            r1 = r24
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r11 | 6
            r13 = r17
            goto L_0x003b
        L_0x0029:
            r1 = r11 & 6
            r13 = r17
            if (r1 != 0) goto L_0x003a
            boolean r1 = r12.i(r13)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r11
            goto L_0x003b
        L_0x003a:
            r1 = r11
        L_0x003b:
            r2 = r26 & 2
            if (r2 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0052
        L_0x0042:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0052
            boolean r2 = r12.l(r8)
            if (r2 == 0) goto L_0x004f
            r2 = 32
            goto L_0x0051
        L_0x004f:
            r2 = 16
        L_0x0051:
            r1 = r1 | r2
        L_0x0052:
            r2 = r26 & 4
            if (r2 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0069
            boolean r2 = r12.l(r9)
            if (r2 == 0) goto L_0x0066
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r2
        L_0x0069:
            r2 = r26 & 8
            if (r2 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r14 = r20
            goto L_0x0084
        L_0x0072:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            r14 = r20
            if (r2 != 0) goto L_0x0084
            boolean r2 = r12.d(r14)
            if (r2 == 0) goto L_0x0081
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r2
        L_0x0084:
            r2 = r26 & 16
            if (r2 == 0) goto L_0x008d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r15 = r21
            goto L_0x009f
        L_0x008d:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            r15 = r21
            if (r2 != 0) goto L_0x009f
            boolean r2 = r12.d(r15)
            if (r2 == 0) goto L_0x009c
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r2
        L_0x009f:
            r2 = r26 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00a7
            r1 = r1 | r3
            goto L_0x00b7
        L_0x00a7:
            r2 = r11 & r3
            if (r2 != 0) goto L_0x00b7
            boolean r2 = r12.l(r10)
            if (r2 == 0) goto L_0x00b4
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r2
        L_0x00b7:
            r2 = r26 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00c1
            r1 = r1 | r3
        L_0x00be:
            r3 = r23
            goto L_0x00d2
        L_0x00c1:
            r3 = r3 & r11
            if (r3 != 0) goto L_0x00be
            r3 = r23
            boolean r4 = r12.W(r3)
            if (r4 == 0) goto L_0x00cf
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r1 = r1 | r4
        L_0x00d2:
            r4 = 599187(0x92493, float:8.3964E-40)
            r4 = r4 & r1
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r4 != r5) goto L_0x00e7
            boolean r4 = r12.t()
            if (r4 != 0) goto L_0x00e2
            goto L_0x00e7
        L_0x00e2:
            r12.B()
            r7 = r3
            goto L_0x0138
        L_0x00e7:
            if (r2 == 0) goto L_0x00ee
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r16 = r2
            goto L_0x00f0
        L_0x00ee:
            r16 = r3
        L_0x00f0:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00fc
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.bottomBar.BottomBar (BottomBar.kt:71)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x00fc:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.RippleKt.c()
            androidx.compose.material3.RippleConfiguration r1 = f37993c
            androidx.compose.runtime.ProvidedValue r7 = r0.d(r1)
            com.hansecom.abt.ui.components.bottomBar.BottomBarKt$BottomBar$1 r6 = new com.hansecom.abt.ui.components.bottomBar.BottomBarKt$BottomBar$1
            r0 = r6
            r1 = r16
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r18
            r8 = r6
            r6 = r17
            r9 = r7
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 54
            r1 = 255709317(0xf3dd085, float:9.358579E-30)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r8, r12, r0)
            int r1 = androidx.compose.runtime.ProvidedValue.f14769i
            r1 = r1 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r9, r0, r12, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0136
            androidx.compose.runtime.ComposerKt.X()
        L_0x0136:
            r7 = r16
        L_0x0138:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x0158
            com.hansecom.abt.ui.components.bottomBar.b r9 = new com.hansecom.abt.ui.components.bottomBar.b
            r0 = r9
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r25
            r10 = r9
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.a(r10)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.bottomBar.BottomBarKt.c(int, java.util.List, kotlin.jvm.functions.Function1, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(int i2, List list, Function1 function1, boolean z2, boolean z3, Function0 function0, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        c(i2, list, function1, z2, z3, function0, modifier, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.foundation.layout.RowScope r38, boolean r39, kotlin.jvm.functions.Function0 r40, int r41, androidx.compose.ui.Modifier r42, boolean r43, int r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r2 = r39
            r3 = r40
            r4 = r41
            r7 = r44
            r8 = r46
            r0 = 16
            r1 = 32
            r5 = 1
            r6 = 2
            r9 = 6
            r10 = -956845094(0xffffffffc6f7b3da, float:-31705.926)
            r11 = r45
            androidx.compose.runtime.Composer r15 = r11.q(r10)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r47 & r11
            r14 = 4
            if (r11 == 0) goto L_0x0026
            r11 = r8 | 6
            r13 = r38
            goto L_0x0038
        L_0x0026:
            r11 = r8 & 6
            r13 = r38
            if (r11 != 0) goto L_0x0037
            boolean r11 = r15.W(r13)
            if (r11 == 0) goto L_0x0034
            r11 = r14
            goto L_0x0035
        L_0x0034:
            r11 = r6
        L_0x0035:
            r11 = r11 | r8
            goto L_0x0038
        L_0x0037:
            r11 = r8
        L_0x0038:
            r12 = r47 & 1
            if (r12 == 0) goto L_0x003f
            r11 = r11 | 48
            goto L_0x004d
        L_0x003f:
            r12 = r8 & 48
            if (r12 != 0) goto L_0x004d
            boolean r12 = r15.d(r2)
            if (r12 == 0) goto L_0x004b
            r12 = r1
            goto L_0x004c
        L_0x004b:
            r12 = r0
        L_0x004c:
            r11 = r11 | r12
        L_0x004d:
            r6 = r47 & 2
            if (r6 == 0) goto L_0x0054
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r6 = r8 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0064
            boolean r6 = r15.l(r3)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r11 = r11 | r6
        L_0x0064:
            r6 = r47 & 4
            if (r6 == 0) goto L_0x006b
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r6 = r8 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x007b
            boolean r6 = r15.i(r4)
            if (r6 == 0) goto L_0x0078
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r11 = r11 | r6
        L_0x007b:
            r6 = r47 & 8
            if (r6 == 0) goto L_0x0084
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r12 = r42
            goto L_0x0097
        L_0x0084:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0081
            r12 = r42
            boolean r16 = r15.W(r12)
            if (r16 == 0) goto L_0x0093
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r11 = r11 | r16
        L_0x0097:
            r0 = r47 & 16
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00a2
            r11 = r11 | r16
            r14 = r43
            goto L_0x00b5
        L_0x00a2:
            r16 = r8 & r16
            r14 = r43
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r15.d(r14)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r11 = r11 | r16
        L_0x00b5:
            r1 = r47 & 32
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r1 == 0) goto L_0x00bf
            r11 = r11 | r16
        L_0x00bd:
            r1 = r11
            goto L_0x00d0
        L_0x00bf:
            r1 = r8 & r16
            if (r1 != 0) goto L_0x00bd
            boolean r1 = r15.i(r7)
            if (r1 == 0) goto L_0x00cc
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r1 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r11 = r11 | r1
            goto L_0x00bd
        L_0x00d0:
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r1
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r5) goto L_0x00e7
            boolean r5 = r15.t()
            if (r5 != 0) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r15.B()
            r5 = r12
            r6 = r15
            goto L_0x0300
        L_0x00e7:
            if (r6 == 0) goto L_0x00ec
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ed
        L_0x00ec:
            r5 = r12
        L_0x00ed:
            if (r0 == 0) goto L_0x00f1
            r0 = 1
            goto L_0x00f2
        L_0x00f1:
            r0 = r14
        L_0x00f2:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00fe
            r6 = -1
            java.lang.String r11 = "com.hansecom.abt.ui.components.bottomBar.BottomBarItem (BottomBar.kt:133)"
            androidx.compose.runtime.ComposerKt.Y(r10, r1, r6, r11)
        L_0x00fe:
            if (r2 == 0) goto L_0x0115
            r6 = -1532575847(0xffffffffa4a6bf99, float:-7.23156E-17)
            r15.X(r6)
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r6.b(r15, r9)
            long r10 = r6.x()
            r15.M()
        L_0x0113:
            r11 = r10
            goto L_0x0129
        L_0x0115:
            r6 = -1532518280(0xffffffffa4a7a078, float:-7.269655E-17)
            r15.X(r6)
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r6.b(r15, r9)
            long r10 = r6.a()
            r15.M()
            goto L_0x0113
        L_0x0129:
            r17 = 384(0x180, float:5.38E-43)
            r18 = 10
            r6 = 0
            java.lang.String r14 = "color"
            r10 = 0
            r13 = r6
            r6 = 4
            r42 = r15
            r15 = r10
            r16 = r42
            androidx.compose.runtime.State r10 = androidx.compose.animation.SingleValueAnimationKt.a(r11, r13, r14, r15, r16, r17, r18)
            androidx.compose.ui.semantics.Role$Companion r11 = androidx.compose.ui.semantics.Role.f18040b
            int r11 = r11.h()
            androidx.compose.ui.semantics.Role r11 = androidx.compose.ui.semantics.Role.j(r11)
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.selection.SelectableKt.c(r5, r2, r0, r11, r3)
            r14 = 0
            r15 = 0
            r12 = 1
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.SizeKt.d(r11, r14, r12, r15)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r38
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.RowScope.c(r16, r17, r18, r19, r20, r21)
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r13 = r12.e()
            r9 = 1
            androidx.compose.ui.layout.MeasurePolicy r13 = androidx.compose.foundation.layout.BoxKt.g(r13, r9)
            r9 = 0
            r6 = r42
            int r16 = androidx.compose.runtime.ComposablesKt.a(r6, r9)
            androidx.compose.runtime.CompositionLocalMap r9 = r6.I()
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.ComposedModifierKt.e(r6, r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r17.a()
            androidx.compose.runtime.Applier r18 = r6.v()
            if (r18 != 0) goto L_0x0188
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0188:
            r6.s()
            boolean r18 = r6.n()
            if (r18 == 0) goto L_0x0195
            r6.y(r14)
            goto L_0x0198
        L_0x0195:
            r6.K()
        L_0x0198:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r6)
            kotlin.jvm.functions.Function2 r15 = r17.c()
            androidx.compose.runtime.Updater.g(r14, r13, r15)
            kotlin.jvm.functions.Function2 r13 = r17.e()
            androidx.compose.runtime.Updater.g(r14, r9, r13)
            kotlin.jvm.functions.Function2 r9 = r17.b()
            boolean r13 = r14.n()
            if (r13 != 0) goto L_0x01c2
            java.lang.Object r13 = r14.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r13, r15)
            if (r13 != 0) goto L_0x01d0
        L_0x01c2:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r14.N(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r14.A(r13, r9)
        L_0x01d0:
            kotlin.jvm.functions.Function2 r9 = r17.d()
            androidx.compose.runtime.Updater.g(r14, r11, r9)
            androidx.compose.foundation.layout.BoxScopeInstance r9 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            r11 = 1
            r14 = 0
            r15 = 0
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.f(r9, r14, r11, r15)
            androidx.compose.ui.Alignment$Horizontal r11 = r12.g()
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r12 = r12.b()
            r14 = 54
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.ColumnKt.a(r12, r11, r6, r14)
            r12 = 0
            int r14 = androidx.compose.runtime.ComposablesKt.a(r6, r12)
            androidx.compose.runtime.CompositionLocalMap r12 = r6.I()
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.ComposedModifierKt.e(r6, r13)
            kotlin.jvm.functions.Function0 r15 = r17.a()
            androidx.compose.runtime.Applier r16 = r6.v()
            if (r16 != 0) goto L_0x020c
            androidx.compose.runtime.ComposablesKt.d()
        L_0x020c:
            r6.s()
            boolean r16 = r6.n()
            if (r16 == 0) goto L_0x0219
            r6.y(r15)
            goto L_0x021c
        L_0x0219:
            r6.K()
        L_0x021c:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r6)
            r37 = r0
            kotlin.jvm.functions.Function2 r0 = r17.c()
            androidx.compose.runtime.Updater.g(r15, r11, r0)
            kotlin.jvm.functions.Function2 r0 = r17.e()
            androidx.compose.runtime.Updater.g(r15, r12, r0)
            kotlin.jvm.functions.Function2 r0 = r17.b()
            boolean r11 = r15.n()
            if (r11 != 0) goto L_0x0248
            java.lang.Object r11 = r15.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 != 0) goto L_0x0256
        L_0x0248:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r15.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r15.A(r11, r0)
        L_0x0256:
            kotlin.jvm.functions.Function2 r0 = r17.d()
            androidx.compose.runtime.Updater.g(r15, r13, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r0 = 24
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.t(r9, r0)
            long r14 = f(r10)
            int r0 = r1 >> 9
            r0 = r0 & 14
            androidx.compose.ui.graphics.painter.Painter r11 = androidx.compose.ui.res.PainterResources_androidKt.c(r4, r6, r0)
            r17 = 432(0x1b0, float:6.05E-43)
            r0 = 0
            r12 = 0
            r16 = r6
            r18 = r0
            androidx.compose.material3.IconKt.d(r11, r12, r13, r14, r16, r17, r18)
            r0 = 4
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.i(r9, r0)
            r11 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r0, r6, r11)
            r0 = 0
            r12 = 0
            r13 = 1
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.h(r9, r0, r13, r12)
            androidx.compose.ui.text.style.TextAlign$Companion r0 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r0 = r0.a()
            int r1 = r1 >> 18
            r1 = r1 & 14
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r7, r6, r1)
            long r13 = f(r10)
            com.hansecom.abt.ui.theme.AbtTheme r9 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r9 = r9.d(r6, r11)
            androidx.compose.ui.text.TextStyle r9 = r9.d()
            r10 = 0
            androidx.compose.ui.text.TextStyle r32 = com.hansecom.abt.util.TextStyleExtKt.a(r9, r6, r10)
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.ui.text.font.FontWeight.f18746A
            if (r2 == 0) goto L_0x02c2
            androidx.compose.ui.text.font.FontWeight r9 = r9.b()
        L_0x02bf:
            r19 = r9
            goto L_0x02c7
        L_0x02c2:
            androidx.compose.ui.text.font.FontWeight r9 = r9.g()
            goto L_0x02bf
        L_0x02c7:
            androidx.compose.ui.text.style.TextAlign r24 = androidx.compose.ui.text.style.TextAlign.h(r0)
            r35 = 24576(0x6000, float:3.4438E-41)
            r36 = 113592(0x1bbb8, float:1.59176E-40)
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 1
            r30 = 0
            r31 = 0
            r34 = 48
            r11 = r1
            r33 = r6
            androidx.compose.material3.TextKt.j(r11, r12, r13, r15, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r6.T()
            r6.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02fe
            androidx.compose.runtime.ComposerKt.X()
        L_0x02fe:
            r14 = r37
        L_0x0300:
            androidx.compose.runtime.ScopeUpdateScope r10 = r6.x()
            if (r10 == 0) goto L_0x031e
            com.hansecom.abt.ui.components.bottomBar.c r11 = new com.hansecom.abt.ui.components.bottomBar.c
            r0 = r11
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r6 = r14
            r7 = r44
            r8 = r46
            r9 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.bottomBar.BottomBarKt.e(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, int, androidx.compose.ui.Modifier, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long f(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final Unit g(RowScope rowScope, boolean z2, Function0 function0, int i2, Modifier modifier, boolean z3, int i3, int i4, int i5, Composer composer, int i6) {
        e(rowScope, z2, function0, i2, modifier, z3, i3, composer, RecomposeScopeImplKt.a(i4 | 1), i5);
        return Unit.f40552a;
    }

    public static final float i() {
        return f37992b;
    }

    public static final float j() {
        return f37991a;
    }
}
