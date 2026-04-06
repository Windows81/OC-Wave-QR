package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SwitchMenuItemKt {
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r17, kotlin.jvm.functions.Function1 r18, androidx.compose.ui.Modifier r19, androidx.compose.ui.graphics.painter.Painter r20, boolean r21, boolean r22, boolean r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r1 = r17
            r2 = r18
            r8 = r25
            r0 = 16
            r3 = 32
            r4 = 2
            r5 = 4
            java.lang.String r6 = "text"
            kotlin.jvm.internal.Intrinsics.i(r1, r6)
            java.lang.String r6 = "onCheckedChange"
            kotlin.jvm.internal.Intrinsics.i(r2, r6)
            r6 = 146038053(0x8b45d25, float:1.0855254E-33)
            r7 = r24
            androidx.compose.runtime.Composer r7 = r7.q(r6)
            r9 = 1
            r10 = r26 & 1
            if (r10 == 0) goto L_0x0027
            r10 = r8 | 6
            goto L_0x0037
        L_0x0027:
            r10 = r8 & 6
            if (r10 != 0) goto L_0x0036
            boolean r10 = r7.W(r1)
            if (r10 == 0) goto L_0x0033
            r10 = r5
            goto L_0x0034
        L_0x0033:
            r10 = r4
        L_0x0034:
            r10 = r10 | r8
            goto L_0x0037
        L_0x0036:
            r10 = r8
        L_0x0037:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x003e
            r10 = r10 | 48
            goto L_0x004c
        L_0x003e:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x004c
            boolean r4 = r7.l(r2)
            if (r4 == 0) goto L_0x004a
            r4 = r3
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            r10 = r10 | r4
        L_0x004c:
            r4 = r26 & 4
            if (r4 == 0) goto L_0x0055
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r5 = r19
            goto L_0x0067
        L_0x0055:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0052
            r5 = r19
            boolean r11 = r7.W(r5)
            if (r11 == 0) goto L_0x0064
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r10 = r10 | r11
        L_0x0067:
            r11 = r26 & 8
            if (r11 == 0) goto L_0x0070
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r12 = r20
            goto L_0x0082
        L_0x0070:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x006d
            r12 = r20
            boolean r13 = r7.l(r12)
            if (r13 == 0) goto L_0x007f
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r10 = r10 | r13
        L_0x0082:
            r0 = r26 & 16
            if (r0 == 0) goto L_0x008b
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r13 = r21
            goto L_0x009d
        L_0x008b:
            r13 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0088
            r13 = r21
            boolean r14 = r7.d(r13)
            if (r14 == 0) goto L_0x009a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r10 = r10 | r14
        L_0x009d:
            r3 = r26 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00a7
            r10 = r10 | r14
        L_0x00a4:
            r14 = r22
            goto L_0x00b8
        L_0x00a7:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00a4
            r14 = r22
            boolean r15 = r7.d(r14)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r10 = r10 | r15
        L_0x00b8:
            r15 = r26 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c3
            r10 = r10 | r16
            r9 = r23
            goto L_0x00d6
        L_0x00c3:
            r16 = r8 & r16
            r9 = r23
            if (r16 != 0) goto L_0x00d6
            boolean r16 = r7.d(r9)
            if (r16 == 0) goto L_0x00d2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r10 = r10 | r16
        L_0x00d6:
            r16 = 599187(0x92493, float:8.3964E-40)
            r6 = r10 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r6 != r5) goto L_0x00f1
            boolean r5 = r7.t()
            if (r5 != 0) goto L_0x00e7
            goto L_0x00f1
        L_0x00e7:
            r7.B()
            r3 = r19
            r4 = r12
            r5 = r13
            r6 = r14
            goto L_0x01e7
        L_0x00f1:
            if (r4 == 0) goto L_0x00f6
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00f8
        L_0x00f6:
            r4 = r19
        L_0x00f8:
            if (r11 == 0) goto L_0x00fc
            r5 = 0
            goto L_0x00fd
        L_0x00fc:
            r5 = r12
        L_0x00fd:
            r6 = 0
            if (r0 == 0) goto L_0x0102
            r0 = r6
            goto L_0x0103
        L_0x0102:
            r0 = r13
        L_0x0103:
            if (r3 == 0) goto L_0x0107
            r3 = r6
            goto L_0x0108
        L_0x0107:
            r3 = r14
        L_0x0108:
            if (r15 == 0) goto L_0x010c
            r15 = 1
            goto L_0x010d
        L_0x010c:
            r15 = r9
        L_0x010d:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x011c
            r9 = -1
            java.lang.String r11 = "com.hansecom.abt.ui.components.listItem.SwitchMenuItem (SwitchMenuItem.kt:28)"
            r12 = 146038053(0x8b45d25, float:1.0855254E-33)
            androidx.compose.runtime.ComposerKt.Y(r12, r10, r9, r11)
        L_0x011c:
            androidx.compose.ui.semantics.Role$Companion r9 = androidx.compose.ui.semantics.Role.f18040b
            int r9 = r9.g()
            androidx.compose.ui.semantics.Role r9 = androidx.compose.ui.semantics.Role.j(r9)
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.selection.ToggleableKt.c(r4, r0, r15, r9, r2)
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r11 = r11.g()
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r12 = r12.k()
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.ColumnKt.a(r11, r12, r7, r6)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r7, r6)
            androidx.compose.runtime.CompositionLocalMap r13 = r7.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r7, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r14.a()
            androidx.compose.runtime.Applier r16 = r7.v()
            if (r16 != 0) goto L_0x0155
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0155:
            r7.s()
            boolean r16 = r7.n()
            if (r16 == 0) goto L_0x0162
            r7.y(r6)
            goto L_0x0165
        L_0x0162:
            r7.K()
        L_0x0165:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r7)
            kotlin.jvm.functions.Function2 r2 = r14.c()
            androidx.compose.runtime.Updater.g(r6, r11, r2)
            kotlin.jvm.functions.Function2 r2 = r14.e()
            androidx.compose.runtime.Updater.g(r6, r13, r2)
            kotlin.jvm.functions.Function2 r2 = r14.b()
            boolean r11 = r6.n()
            if (r11 != 0) goto L_0x018f
            java.lang.Object r11 = r6.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r13)
            if (r11 != 0) goto L_0x019d
        L_0x018f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r6.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r6.A(r11, r2)
        L_0x019d:
            kotlin.jvm.functions.Function2 r2 = r14.d()
            androidx.compose.runtime.Updater.g(r6, r9, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.ui.components.listItem.SwitchMenuItemKt$SwitchMenuItem$1$1 r2 = new com.hansecom.abt.ui.components.listItem.SwitchMenuItemKt$SwitchMenuItem$1$1
            r2.<init>(r5, r1, r0, r15)
            r6 = 54
            r9 = -159048450(0xfffffffff6851cfe, float:-1.3499287E33)
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r11, r2, r7, r6)
            int r2 = r10 >> 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r16 = 7
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = r15
            r14 = r7
            r6 = r15
            r15 = r2
            com.hansecom.abt.ui.components.listItem.MenuItemKt.q(r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = 601367324(0x23d8231c, float:2.3433636E-17)
            r7.X(r2)
            if (r3 == 0) goto L_0x01d3
            r2 = 0
            com.hansecom.abt.ui.components.listItem.MenuItemKt.k(r7, r2)
        L_0x01d3:
            r7.M()
            r7.T()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x01e2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01e2:
            r9 = r6
            r6 = r3
            r3 = r4
            r4 = r5
            r5 = r0
        L_0x01e7:
            androidx.compose.runtime.ScopeUpdateScope r10 = r7.x()
            if (r10 == 0) goto L_0x01ff
            com.hansecom.abt.ui.components.listItem.A r11 = new com.hansecom.abt.ui.components.listItem.A
            r0 = r11
            r1 = r17
            r2 = r18
            r7 = r9
            r8 = r25
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.SwitchMenuItemKt.b(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(String str, Function1 function1, Modifier modifier, Painter painter, boolean z2, boolean z3, boolean z4, int i2, int i3, Composer composer, int i4) {
        b(str, function1, modifier, painter, z2, z3, z4, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
