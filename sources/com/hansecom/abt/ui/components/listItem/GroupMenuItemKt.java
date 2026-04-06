package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupMenuItemKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.painter.Painter r30, androidx.compose.ui.graphics.painter.Painter r31, boolean r32, boolean r33, kotlin.jvm.functions.Function3 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r28
            r7 = r34
            r8 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            r0 = 696946291(0x298a8e73, float:6.153142E-14)
            r2 = r35
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r37 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r8 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x002f
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r8
            goto L_0x0030
        L_0x002f:
            r3 = r8
        L_0x0030:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
        L_0x0036:
            r5 = r29
            goto L_0x004b
        L_0x0039:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0036
            r5 = r29
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r9 = r30
            goto L_0x0066
        L_0x0054:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0051
            r9 = r30
            boolean r10 = r2.l(r9)
            if (r10 == 0) goto L_0x0063
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r10
        L_0x0066:
            r10 = r37 & 8
            if (r10 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r11 = r31
            goto L_0x0081
        L_0x006f:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x006c
            r11 = r31
            boolean r12 = r2.l(r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r12
        L_0x0081:
            r12 = r37 & 16
            if (r12 == 0) goto L_0x008a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r14 = r32
            goto L_0x009c
        L_0x008a:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0087
            r14 = r32
            boolean r15 = r2.d(r14)
            if (r15 == 0) goto L_0x0099
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r15
        L_0x009c:
            r15 = r37 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a7
            r3 = r3 | r16
            r13 = r33
            goto L_0x00ba
        L_0x00a7:
            r16 = r8 & r16
            r13 = r33
            if (r16 != 0) goto L_0x00ba
            boolean r16 = r2.d(r13)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r3 = r3 | r16
        L_0x00ba:
            r16 = r37 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c3
            r3 = r3 | r17
            goto L_0x00d4
        L_0x00c3:
            r16 = r8 & r17
            if (r16 != 0) goto L_0x00d4
            boolean r16 = r2.l(r7)
            if (r16 == 0) goto L_0x00d0
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r3 = r3 | r16
        L_0x00d4:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00ef
            boolean r0 = r2.t()
            if (r0 != 0) goto L_0x00e5
            goto L_0x00ef
        L_0x00e5:
            r2.B()
            r3 = r29
            r4 = r11
            r6 = r13
            r5 = r14
            goto L_0x02d9
        L_0x00ef:
            if (r4 == 0) goto L_0x00f4
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00f6
        L_0x00f4:
            r0 = r29
        L_0x00f6:
            if (r6 == 0) goto L_0x00fa
            r5 = 0
            goto L_0x00fb
        L_0x00fa:
            r5 = r9
        L_0x00fb:
            if (r10 == 0) goto L_0x00ff
            r6 = 0
            goto L_0x0100
        L_0x00ff:
            r6 = r11
        L_0x0100:
            r11 = 0
            if (r12 == 0) goto L_0x0104
            r14 = r11
        L_0x0104:
            if (r15 == 0) goto L_0x0109
            r19 = r11
            goto L_0x010b
        L_0x0109:
            r19 = r13
        L_0x010b:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x011a
            r9 = -1
            java.lang.String r10 = "com.hansecom.abt.ui.components.listItem.GroupMenuItem (GroupMenuItem.kt:40)"
            r12 = 696946291(0x298a8e73, float:6.153142E-14)
            androidx.compose.runtime.ComposerKt.Y(r12, r3, r9, r10)
        L_0x011a:
            java.lang.Object[] r9 = new java.lang.Object[r11]
            r10 = -149778448(0xfffffffff7128ff0, float:-2.9726357E33)
            r2.X(r10)
            r10 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r10
            r15 = 1
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r10) goto L_0x012d
            r3 = r15
            goto L_0x012e
        L_0x012d:
            r3 = r11
        L_0x012e:
            java.lang.Object r10 = r2.g()
            if (r3 != 0) goto L_0x013c
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r10 != r3) goto L_0x0144
        L_0x013c:
            com.hansecom.abt.ui.components.listItem.h r10 = new com.hansecom.abt.ui.components.listItem.h
            r10.<init>(r14)
            r2.N(r10)
        L_0x0144:
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r2.M()
            java.lang.Object r3 = androidx.compose.runtime.saveable.RememberSaveableKt.j(r9, r10, r2, r11)
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            boolean r9 = h(r3)
            if (r9 == 0) goto L_0x0158
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            goto L_0x015a
        L_0x0158:
            r9 = 1119092736(0x42b40000, float:90.0)
        L_0x015a:
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 22
            r10 = 0
            r12 = 0
            java.lang.String r13 = "iconRotation"
            r18 = 0
            r4 = r11
            r11 = r12
            r12 = r13
            r13 = r18
            r20 = r14
            r14 = r2
            r15 = r16
            r16 = r17
            androidx.compose.runtime.State r9 = androidx.compose.animation.core.AnimateAsStateKt.d(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r10 = h(r3)
            if (r10 == 0) goto L_0x017d
            int r10 = com.hansecom.abt.R.string.d7
            goto L_0x017f
        L_0x017d:
            int r10 = com.hansecom.abt.R.string.c7
        L_0x017f:
            java.lang.String r10 = androidx.compose.ui.res.StringResources_androidKt.b(r10, r2, r4)
            r11 = -149765326(0xfffffffff712c332, float:-2.9766968E33)
            r2.X(r11)
            if (r6 != 0) goto L_0x0192
            int r11 = com.hansecom.abt.R.drawable.f33014p
            androidx.compose.ui.graphics.painter.Painter r11 = androidx.compose.ui.res.PainterResources_androidKt.c(r11, r2, r4)
            goto L_0x0193
        L_0x0192:
            r11 = r6
        L_0x0193:
            r2.M()
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r12 = r12.g()
            androidx.compose.ui.Alignment$Companion r13 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r13 = r13.k()
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.foundation.layout.ColumnKt.a(r12, r13, r2, r4)
            int r13 = androidx.compose.runtime.ComposablesKt.a(r2, r4)
            androidx.compose.runtime.CompositionLocalMap r14 = r2.I()
            androidx.compose.ui.Modifier r15 = androidx.compose.ui.ComposedModifierKt.e(r2, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r4 = r16.a()
            androidx.compose.runtime.Applier r17 = r2.v()
            if (r17 != 0) goto L_0x01c1
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01c1:
            r2.s()
            boolean r17 = r2.n()
            if (r17 == 0) goto L_0x01ce
            r2.y(r4)
            goto L_0x01d1
        L_0x01ce:
            r2.K()
        L_0x01d1:
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.b(r2)
            r35 = r0
            kotlin.jvm.functions.Function2 r0 = r16.c()
            androidx.compose.runtime.Updater.g(r4, r12, r0)
            kotlin.jvm.functions.Function2 r0 = r16.e()
            androidx.compose.runtime.Updater.g(r4, r14, r0)
            kotlin.jvm.functions.Function2 r0 = r16.b()
            boolean r12 = r4.n()
            if (r12 != 0) goto L_0x01fd
            java.lang.Object r12 = r4.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r14)
            if (r12 != 0) goto L_0x020b
        L_0x01fd:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r4.N(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r4.A(r12, r0)
        L_0x020b:
            kotlin.jvm.functions.Function2 r0 = r16.d()
            androidx.compose.runtime.Updater.g(r4, r15, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r12 = 1846467935(0x6e0edd5f, float:1.1053623E28)
            r2.X(r12)
            boolean r12 = r2.W(r10)
            java.lang.Object r13 = r2.g()
            if (r12 != 0) goto L_0x022e
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x0236
        L_0x022e:
            com.hansecom.abt.ui.components.listItem.i r13 = new com.hansecom.abt.ui.components.listItem.i
            r13.<init>(r10)
            r2.N(r13)
        L_0x0236:
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r2.M()
            r10 = 0
            r12 = 0
            r15 = 1
            androidx.compose.ui.Modifier r21 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r4, r12, r13, r15, r10)
            r4 = 1846470223(0x6e0ee64f, float:1.1056324E28)
            r2.X(r4)
            boolean r4 = r2.W(r3)
            java.lang.Object r10 = r2.g()
            if (r4 != 0) goto L_0x025a
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r10 != r4) goto L_0x0262
        L_0x025a:
            com.hansecom.abt.ui.components.listItem.j r10 = new com.hansecom.abt.ui.components.listItem.j
            r10.<init>(r3)
            r2.N(r10)
        L_0x0262:
            r25 = r10
            kotlin.jvm.functions.Function0 r25 = (kotlin.jvm.functions.Function0) r25
            r2.M()
            r26 = 7
            r27 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ClickableKt.f(r21, r22, r23, r24, r25, r26, r27)
            com.hansecom.abt.ui.components.listItem.GroupMenuItemKt$GroupMenuItem$1$3 r10 = new com.hansecom.abt.ui.components.listItem.GroupMenuItemKt$GroupMenuItem$1$3
            r10.<init>(r5, r1, r11, r9)
            r9 = 70149452(0x42e654c, float:2.0500115E-36)
            r14 = 54
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r15, r10, r2, r14)
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 14
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r4
            r4 = r14
            r14 = r2
            r15 = r16
            r16 = r17
            com.hansecom.abt.ui.components.listItem.MenuItemKt.q(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r10 = h(r3)
            com.hansecom.abt.ui.components.listItem.GroupMenuItemKt$GroupMenuItem$1$4 r3 = new com.hansecom.abt.ui.components.listItem.GroupMenuItemKt$GroupMenuItem$1$4
            r3.<init>(r7)
            r9 = -1345123995(0xffffffffafd30965, float:-3.8387352E-10)
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r11, r3, r2, r4)
            r17 = 1572870(0x180006, float:2.20406E-39)
            r18 = 30
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r0
            r16 = r2
            androidx.compose.animation.AnimatedVisibilityKt.g(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 1846494349(0x6e0f448d, float:1.1084807E28)
            r2.X(r0)
            if (r19 == 0) goto L_0x02c2
            r0 = 0
            com.hansecom.abt.ui.components.listItem.MenuItemKt.k(r2, r0)
        L_0x02c2:
            r2.M()
            r2.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02d1
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d1:
            r3 = r35
            r9 = r5
            r4 = r6
            r6 = r19
            r5 = r20
        L_0x02d9:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.x()
            if (r10 == 0) goto L_0x02f2
            com.hansecom.abt.ui.components.listItem.k r11 = new com.hansecom.abt.ui.components.listItem.k
            r0 = r11
            r1 = r28
            r2 = r3
            r3 = r9
            r7 = r34
            r8 = r36
            r9 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x02f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.GroupMenuItemKt.e(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.graphics.painter.Painter, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final MutableState f(boolean z2) {
        return SnapshotStateKt__SnapshotStateKt.e(Boolean.valueOf(z2), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final Unit g(String str, Modifier modifier, Painter painter, Painter painter2, boolean z2, boolean z3, Function3 function3, int i2, int i3, Composer composer, int i4) {
        e(str, modifier, painter, painter2, z2, z3, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final boolean h(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void i(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final float j(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final Unit k(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.x0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final Unit l(MutableState mutableState) {
        i(mutableState, !h(mutableState));
        return Unit.f40552a;
    }
}
