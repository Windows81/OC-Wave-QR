package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;

@Metadata
public final class ContextMenuArea_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.contextmenu.ContextMenuState r9, kotlin.jvm.functions.Function0 r10, androidx.compose.ui.Modifier r11, kotlin.jvm.functions.Function1 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r0 = 645832757(0x267ea035, float:8.8341074E-16)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x000e
            r1 = r14 | 6
            goto L_0x001e
        L_0x000e:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x001d
            boolean r1 = r13.W(r9)
            if (r1 == 0) goto L_0x001a
            r1 = 4
            goto L_0x001b
        L_0x001a:
            r1 = 2
        L_0x001b:
            r1 = r1 | r14
            goto L_0x001e
        L_0x001d:
            r1 = r14
        L_0x001e:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0025
            r1 = r1 | 48
            goto L_0x0035
        L_0x0025:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x0035
            boolean r2 = r13.l(r10)
            if (r2 == 0) goto L_0x0032
            r2 = 32
            goto L_0x0034
        L_0x0032:
            r2 = 16
        L_0x0034:
            r1 = r1 | r2
        L_0x0035:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x003c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x004c
        L_0x003c:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004c
            boolean r3 = r13.W(r11)
            if (r3 == 0) goto L_0x0049
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r1 = r1 | r3
        L_0x004c:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0063
        L_0x0053:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0063
            boolean r3 = r13.l(r12)
            if (r3 == 0) goto L_0x0060
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0062
        L_0x0060:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0062:
            r1 = r1 | r3
        L_0x0063:
            r3 = r1 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r3 == r4) goto L_0x006b
            r3 = 1
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            r4 = r1 & 1
            boolean r3 = r13.E(r3, r4)
            if (r3 == 0) goto L_0x00e9
            if (r2 == 0) goto L_0x0078
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
        L_0x0078:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0084
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:73)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0084:
            androidx.compose.foundation.contextmenu.ContextMenuState$Status r0 = r9.a()
            boolean r2 = r0 instanceof androidx.compose.foundation.contextmenu.ContextMenuState.Status.Open
            if (r2 != 0) goto L_0x00ab
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0095
            androidx.compose.runtime.ComposerKt.X()
        L_0x0095:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.x()
            if (r13 == 0) goto L_0x00aa
            androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1 r0 = new androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.a(r0)
        L_0x00aa:
            return
        L_0x00ab:
            boolean r2 = r13.W(r0)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x00bd
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00d0
        L_0x00bd:
            androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider r3 = new androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider
            androidx.compose.foundation.contextmenu.ContextMenuState$Status$Open r0 = (androidx.compose.foundation.contextmenu.ContextMenuState.Status.Open) r0
            long r4 = r0.a()
            long r4 = androidx.compose.ui.unit.IntOffsetKt.d(r4)
            r0 = 0
            r3.<init>(r4, r0)
            r13.N(r3)
        L_0x00d0:
            r0 = r3
            androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider r0 = (androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider) r0
            r6 = r1 & 8176(0x1ff0, float:1.1457E-41)
            r7 = 0
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.d(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00e7
            androidx.compose.runtime.ComposerKt.X()
        L_0x00e7:
            r4 = r11
            goto L_0x00ed
        L_0x00e9:
            r13.B()
            goto L_0x00e7
        L_0x00ed:
            androidx.compose.runtime.ScopeUpdateScope r11 = r13.x()
            if (r11 == 0) goto L_0x0101
            androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2 r13 = new androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
            r1 = r13
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.a(r13)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.a(androidx.compose.foundation.contextmenu.ContextMenuState, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.contextmenu.ContextMenuState r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function1 r20, androidx.compose.ui.Modifier r21, boolean r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function2 r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r7 = r18
            r8 = r24
            r9 = r26
            r0 = 16
            r1 = 32
            r2 = 2
            r3 = 1969259374(0x7560836e, float:2.8460454E32)
            r4 = r25
            androidx.compose.runtime.Composer r10 = r4.q(r3)
            r4 = 1
            r5 = r27 & 1
            r6 = 4
            if (r5 == 0) goto L_0x001d
            r5 = r9 | 6
            goto L_0x002d
        L_0x001d:
            r5 = r9 & 6
            if (r5 != 0) goto L_0x002c
            boolean r5 = r10.W(r7)
            if (r5 == 0) goto L_0x0029
            r5 = r6
            goto L_0x002a
        L_0x0029:
            r5 = r2
        L_0x002a:
            r5 = r5 | r9
            goto L_0x002d
        L_0x002c:
            r5 = r9
        L_0x002d:
            r2 = r27 & 2
            if (r2 == 0) goto L_0x0036
            r5 = r5 | 48
            r11 = r19
            goto L_0x0046
        L_0x0036:
            r2 = r9 & 48
            r11 = r19
            if (r2 != 0) goto L_0x0046
            boolean r2 = r10.l(r11)
            if (r2 == 0) goto L_0x0044
            r2 = r1
            goto L_0x0045
        L_0x0044:
            r2 = r0
        L_0x0045:
            r5 = r5 | r2
        L_0x0046:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
            r12 = r20
            goto L_0x0061
        L_0x004f:
            r2 = r9 & 384(0x180, float:5.38E-43)
            r12 = r20
            if (r2 != 0) goto L_0x0061
            boolean r2 = r10.l(r12)
            if (r2 == 0) goto L_0x005e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r2
        L_0x0061:
            r2 = r27 & 8
            if (r2 == 0) goto L_0x006a
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r13 = r21
            goto L_0x007c
        L_0x006a:
            r13 = r9 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0067
            r13 = r21
            boolean r14 = r10.W(r13)
            if (r14 == 0) goto L_0x0079
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r5 = r5 | r14
        L_0x007c:
            r0 = r27 & 16
            if (r0 == 0) goto L_0x0085
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r14 = r22
            goto L_0x0097
        L_0x0085:
            r14 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0082
            r14 = r22
            boolean r15 = r10.d(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r5 = r5 | r15
        L_0x0097:
            r1 = r27 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a2
            r5 = r5 | r16
            r6 = r23
            goto L_0x00b5
        L_0x00a2:
            r16 = r9 & r16
            r6 = r23
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r10.l(r6)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r5 = r5 | r16
        L_0x00b5:
            r16 = r27 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r5 = r5 | r17
            goto L_0x00cf
        L_0x00be:
            r16 = r9 & r17
            if (r16 != 0) goto L_0x00cf
            boolean r16 = r10.l(r8)
            if (r16 == 0) goto L_0x00cb
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r5 = r5 | r16
        L_0x00cf:
            r16 = 599187(0x92493, float:8.3964E-40)
            r15 = r5 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r15 == r3) goto L_0x00dc
            r3 = 1
            r15 = 1
            goto L_0x00de
        L_0x00dc:
            r3 = 1
            r15 = 0
        L_0x00de:
            r4 = r5 & 1
            boolean r3 = r10.E(r15, r4)
            if (r3 == 0) goto L_0x01f0
            if (r2 == 0) goto L_0x00eb
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r13 = r2
        L_0x00eb:
            if (r0 == 0) goto L_0x00ee
            r14 = 1
        L_0x00ee:
            if (r1 == 0) goto L_0x00f4
            androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1 r0 = androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1.f3229z
            r15 = r0
            goto L_0x00f5
        L_0x00f4:
            r15 = r6
        L_0x00f5:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0104
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)"
            r2 = 1969259374(0x7560836e, float:2.8460454E32)
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r0, r1)
        L_0x0104:
            if (r14 == 0) goto L_0x013f
            r0 = 1021907653(0x3ce912c5, float:0.028451333)
            r10.X(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r5
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0115
            r3 = 1
            goto L_0x0116
        L_0x0115:
            r3 = 0
        L_0x0116:
            r0 = r5 & 14
            r1 = 4
            if (r0 != r1) goto L_0x011d
            r0 = 1
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            r0 = r0 | r3
            java.lang.Object r1 = r10.g()
            if (r0 != 0) goto L_0x012d
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0135
        L_0x012d:
            androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1 r1 = new androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
            r1.<init>(r15, r7)
            r10.N(r1)
        L_0x0135:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.c(r13, r1)
            r10.M()
            goto L_0x0149
        L_0x013f:
            r0 = 1022064513(0x3ceb7781, float:0.028743507)
            r10.X(r0)
            r10.M()
            r0 = r13
        L_0x0149:
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.o()
            r2 = 1
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r2)
            r2 = 0
            int r2 = androidx.compose.runtime.ComposablesKt.a(r10, r2)
            androidx.compose.runtime.CompositionLocalMap r3 = r10.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r10, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r4.a()
            androidx.compose.runtime.Applier r16 = r10.v()
            if (r16 != 0) goto L_0x0170
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0170:
            r10.s()
            boolean r16 = r10.n()
            if (r16 == 0) goto L_0x017d
            r10.y(r6)
            goto L_0x0180
        L_0x017d:
            r10.K()
        L_0x0180:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r7 = r4.c()
            androidx.compose.runtime.Updater.g(r6, r1, r7)
            kotlin.jvm.functions.Function2 r1 = r4.e()
            androidx.compose.runtime.Updater.g(r6, r3, r1)
            kotlin.jvm.functions.Function2 r1 = r4.b()
            boolean r3 = r6.n()
            if (r3 != 0) goto L_0x01aa
            java.lang.Object r3 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r7)
            if (r3 != 0) goto L_0x01b8
        L_0x01aa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r6.N(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.A(r2, r1)
        L_0x01b8:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r6, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r0 = r5 >> 18
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.m(r10, r0)
            r0 = r5 & 126(0x7e, float:1.77E-43)
            int r1 = r5 << 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r6 = 4
            r2 = 0
            r0 = r18
            r1 = r19
            r3 = r20
            r4 = r10
            a(r0, r1, r2, r3, r4, r5, r6)
            r10.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01ec
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ec:
            r4 = r13
            r5 = r14
            r6 = r15
            goto L_0x01f5
        L_0x01f0:
            r10.B()
            r4 = r13
            r5 = r14
        L_0x01f5:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.x()
            if (r10 == 0) goto L_0x0210
            androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3 r13 = new androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
            r0 = r13
            r1 = r18
            r2 = r19
            r3 = r20
            r7 = r24
            r8 = r26
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r13)
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.b(androidx.compose.foundation.contextmenu.ContextMenuState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
