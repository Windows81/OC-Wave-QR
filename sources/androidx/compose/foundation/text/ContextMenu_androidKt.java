package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContextMenu_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r11, boolean r12, kotlin.jvm.functions.Function2 r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r0 = 2103477555(0x7d608533, float:1.8652418E37)
            androidx.compose.runtime.Composer r14 = r14.q(r0)
            r1 = r15 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r14.l(r11)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r15
            goto L_0x0018
        L_0x0017:
            r1 = r15
        L_0x0018:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0028
            boolean r3 = r14.d(r12)
            if (r3 == 0) goto L_0x0025
            r3 = 32
            goto L_0x0027
        L_0x0025:
            r3 = 16
        L_0x0027:
            r1 = r1 | r3
        L_0x0028:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0038
            boolean r3 = r14.l(r13)
            if (r3 == 0) goto L_0x0035
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0037
        L_0x0035:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0037:
            r1 = r1 | r3
        L_0x0038:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 1
            if (r3 == r4) goto L_0x0041
            r3 = r5
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            r4 = r1 & 1
            boolean r3 = r14.E(r3, r4)
            if (r3 == 0) goto L_0x0116
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0056
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:67)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r4)
        L_0x0056:
            java.lang.Object r0 = r14.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r3.a()
            r6 = 0
            if (r0 != r4) goto L_0x006b
            androidx.compose.foundation.contextmenu.ContextMenuState r0 = new androidx.compose.foundation.contextmenu.ContextMenuState
            r0.<init>(r6, r5, r6)
            r14.N(r0)
        L_0x006b:
            androidx.compose.foundation.contextmenu.ContextMenuState r0 = (androidx.compose.foundation.contextmenu.ContextMenuState) r0
            java.lang.Object r4 = r14.g()
            java.lang.Object r5 = r3.a()
            if (r4 != r5) goto L_0x0080
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r4 = androidx.compose.runtime.EffectsKt.j(r4, r14)
            r14.N(r4)
        L_0x0080:
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            java.lang.Object r5 = r14.g()
            java.lang.Object r7 = r3.a()
            if (r5 != r7) goto L_0x009d
            androidx.compose.foundation.text.MenuItemsAvailability$Companion r5 = androidx.compose.foundation.text.MenuItemsAvailability.f5856b
            int r5 = r5.a()
            androidx.compose.foundation.text.MenuItemsAvailability r5 = androidx.compose.foundation.text.MenuItemsAvailability.b(r5)
            androidx.compose.runtime.MutableState r5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r5, r6, r2, r6)
            r14.N(r5)
        L_0x009d:
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            boolean r2 = r14.l(r4)
            java.lang.Object r6 = r14.g()
            if (r2 != 0) goto L_0x00af
            java.lang.Object r2 = r3.a()
            if (r6 != r2) goto L_0x00b7
        L_0x00af:
            androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1 r6 = new androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1
            r6.<init>(r4)
            r14.N(r6)
        L_0x00b7:
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            kotlin.jvm.functions.Function1 r6 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.a(r11, r0, r5, r6)
            java.lang.Object r2 = r14.g()
            java.lang.Object r7 = r3.a()
            if (r2 != r7) goto L_0x00cf
            androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1 r2 = new androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1
            r2.<init>(r0)
            r14.N(r2)
        L_0x00cf:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            boolean r7 = r14.l(r4)
            boolean r8 = r14.l(r11)
            r7 = r7 | r8
            java.lang.Object r8 = r14.g()
            if (r7 != 0) goto L_0x00e6
            java.lang.Object r3 = r3.a()
            if (r8 != r3) goto L_0x00ee
        L_0x00e6:
            androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1 r8 = new androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1
            r8.<init>(r4, r5, r11)
            r14.N(r8)
        L_0x00ee:
            r7 = r8
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            int r3 = r1 << 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r3 = r3 | 54
            int r1 = r1 << 12
            r4 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r4
            r9 = r3 | r1
            r10 = 8
            r4 = 0
            r1 = r0
            r3 = r6
            r5 = r12
            r6 = r7
            r7 = r13
            r8 = r14
            androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0119
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0119
        L_0x0116:
            r14.B()
        L_0x0119:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.x()
            if (r14 == 0) goto L_0x0127
            androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$6 r0 = new androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$6
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(SelectionManager selectionManager, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(605522716);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(selectionManager) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(605522716, i3, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new ContextMenuState((ContextMenuState.Status) null, 1, (DefaultConstructorMarker) null);
                q2.N(g2);
            }
            ContextMenuState contextMenuState = (ContextMenuState) g2;
            Object g3 = q2.g();
            if (g3 == companion.a()) {
                g3 = new ContextMenu_androidKt$ContextMenuArea$7$1(contextMenuState);
                q2.N(g3);
            }
            ContextMenuArea_androidKt.b(contextMenuState, (Function0) g3, SelectionManager_androidKt.a(selectionManager, contextMenuState), (Modifier) null, false, (Function0) null, function2, q2, ((i3 << 15) & 3670016) | 54, 56);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ContextMenu_androidKt$ContextMenuArea$8(selectionManager, function2, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.foundation.text.selection.TextFieldSelectionManager r11, kotlin.jvm.functions.Function2 r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r0 = -1985516685(0xffffffff89a76b73, float:-4.0304832E-33)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r14 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r13.l(r11)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r14
            goto L_0x0018
        L_0x0017:
            r1 = r14
        L_0x0018:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0028
            boolean r3 = r13.l(r12)
            if (r3 == 0) goto L_0x0025
            r3 = 32
            goto L_0x0027
        L_0x0025:
            r3 = 16
        L_0x0027:
            r1 = r1 | r3
        L_0x0028:
            r3 = r1 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto L_0x0031
            r3 = r5
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            r4 = r1 & 1
            boolean r3 = r13.E(r3, r4)
            if (r3 == 0) goto L_0x00e8
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0046
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r4)
        L_0x0046:
            java.lang.Object r0 = r13.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r3.a()
            r6 = 0
            if (r0 != r4) goto L_0x005b
            androidx.compose.foundation.contextmenu.ContextMenuState r0 = new androidx.compose.foundation.contextmenu.ContextMenuState
            r0.<init>(r6, r5, r6)
            r13.N(r0)
        L_0x005b:
            androidx.compose.foundation.contextmenu.ContextMenuState r0 = (androidx.compose.foundation.contextmenu.ContextMenuState) r0
            java.lang.Object r4 = r13.g()
            java.lang.Object r5 = r3.a()
            if (r4 != r5) goto L_0x0070
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r4 = androidx.compose.runtime.EffectsKt.j(r4, r13)
            r13.N(r4)
        L_0x0070:
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            java.lang.Object r5 = r13.g()
            java.lang.Object r7 = r3.a()
            if (r5 != r7) goto L_0x008d
            androidx.compose.foundation.text.MenuItemsAvailability$Companion r5 = androidx.compose.foundation.text.MenuItemsAvailability.f5856b
            int r5 = r5.a()
            androidx.compose.foundation.text.MenuItemsAvailability r5 = androidx.compose.foundation.text.MenuItemsAvailability.b(r5)
            androidx.compose.runtime.MutableState r5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r5, r6, r2, r6)
            r13.N(r5)
        L_0x008d:
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            java.lang.Object r2 = r13.g()
            java.lang.Object r6 = r3.a()
            if (r2 != r6) goto L_0x00a1
            androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1 r2 = new androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
            r2.<init>(r0)
            r13.N(r2)
        L_0x00a1:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            kotlin.jvm.functions.Function1 r6 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.a(r11, r0, r5)
            boolean r7 = r11.H()
            boolean r8 = r13.l(r4)
            boolean r9 = r13.l(r11)
            r8 = r8 | r9
            java.lang.Object r9 = r13.g()
            if (r8 != 0) goto L_0x00c0
            java.lang.Object r3 = r3.a()
            if (r9 != r3) goto L_0x00c8
        L_0x00c0:
            androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1 r9 = new androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1
            r9.<init>(r4, r5, r11)
            r13.N(r9)
        L_0x00c8:
            r8 = r9
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            int r1 = r1 << 15
            r3 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r9 = r1 | 54
            r10 = 8
            r4 = 0
            r1 = r0
            r3 = r6
            r5 = r7
            r6 = r8
            r7 = r12
            r8 = r13
            androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00eb
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00eb
        L_0x00e8:
            r13.B()
        L_0x00eb:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.x()
            if (r13 == 0) goto L_0x00f9
            androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$3 r0 = new androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$3
            r0.<init>(r11, r12, r14)
            r13.a(r0)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.c(androidx.compose.foundation.text.selection.TextFieldSelectionManager, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = new androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            boolean r5 = r0.D
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.b(r6)
            goto L_0x004f
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.C()
            r0.C = r5
            r0.D = r6
            r0.F = r3
            java.lang.Object r0 = r5.E(r0)
            if (r0 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L_0x004f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            boolean r1 = r0.D()
            boolean r2 = r0.F()
            boolean r0 = r0.B()
            int r5 = androidx.compose.foundation.text.MenuItemsAvailability.d(r5, r6, r1, r2, r0)
            androidx.compose.foundation.text.MenuItemsAvailability r5 = androidx.compose.foundation.text.MenuItemsAvailability.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.d(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(androidx.compose.foundation.text.selection.TextFieldSelectionManager r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2 r0 = (androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2 r0 = new androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            int r8 = r0.F
            int r1 = r0.E
            int r2 = r0.D
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r0
            kotlin.ResultKt.b(r9)
            goto L_0x007c
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            kotlin.ResultKt.b(r9)
            androidx.compose.ui.text.input.VisualTransformation r9 = r8.V()
            boolean r2 = r9 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation
            androidx.compose.ui.text.input.TextFieldValue r9 = r8.U()
            long r5 = r9.h()
            boolean r9 = androidx.compose.ui.text.TextRange.h(r5)
            r5 = r9 ^ 1
            if (r9 != 0) goto L_0x0059
            if (r2 != 0) goto L_0x0059
            r9 = r4
            goto L_0x005a
        L_0x0059:
            r9 = r3
        L_0x005a:
            boolean r6 = r8.G()
            if (r6 == 0) goto L_0x0093
            androidx.compose.ui.platform.Clipboard r6 = r8.A()
            if (r6 == 0) goto L_0x008e
            r0.C = r8
            r0.D = r2
            r0.E = r5
            r0.F = r9
            r0.H = r4
            java.lang.Object r0 = r6.a(r0)
            if (r0 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r1 = r5
            r7 = r0
            r0 = r8
            r8 = r9
            r9 = r7
        L_0x007c:
            androidx.compose.ui.platform.ClipEntry r9 = (androidx.compose.ui.platform.ClipEntry) r9
            if (r9 == 0) goto L_0x008b
            boolean r9 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.c(r9)
            if (r9 != r4) goto L_0x008b
            r9 = r8
            r8 = r0
            r5 = r1
            r0 = r4
            goto L_0x008f
        L_0x008b:
            r9 = r8
            r8 = r0
            r5 = r1
        L_0x008e:
            r0 = r3
        L_0x008f:
            if (r0 == 0) goto L_0x0093
            r0 = r4
            goto L_0x0094
        L_0x0093:
            r0 = r3
        L_0x0094:
            if (r5 == 0) goto L_0x00a0
            boolean r1 = r8.G()
            if (r1 == 0) goto L_0x00a0
            if (r2 != 0) goto L_0x00a0
            r1 = r4
            goto L_0x00a1
        L_0x00a0:
            r1 = r3
        L_0x00a1:
            androidx.compose.ui.text.input.TextFieldValue r2 = r8.U()
            long r5 = r2.h()
            int r2 = androidx.compose.ui.text.TextRange.j(r5)
            androidx.compose.ui.text.input.TextFieldValue r5 = r8.U()
            java.lang.String r5 = r5.i()
            int r5 = r5.length()
            if (r2 == r5) goto L_0x00bd
            r2 = r4
            goto L_0x00be
        L_0x00bd:
            r2 = r3
        L_0x00be:
            boolean r5 = r8.G()
            if (r5 == 0) goto L_0x00d3
            androidx.compose.ui.text.input.TextFieldValue r8 = r8.U()
            long r5 = r8.h()
            boolean r8 = androidx.compose.ui.text.TextRange.h(r5)
            if (r8 == 0) goto L_0x00d3
            r3 = r4
        L_0x00d3:
            int r8 = androidx.compose.foundation.text.MenuItemsAvailability.d(r9, r0, r1, r2, r3)
            androidx.compose.foundation.text.MenuItemsAvailability r8 = androidx.compose.foundation.text.MenuItemsAvailability.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.e(androidx.compose.foundation.text.selection.TextFieldSelectionManager, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
