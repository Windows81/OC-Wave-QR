package com.hansecom.abt.presentation.screens.main.debugMenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class DebugMenuDialogKt {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
        if ((r15 & 4) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(kotlin.jvm.functions.Function0 r10, androidx.compose.ui.Modifier r11, com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = 1596206607(0x5f242e0f, float:1.183041E19)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r14 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0022
            boolean r1 = r13.l(r10)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r14
            goto L_0x0023
        L_0x0022:
            r1 = r14
        L_0x0023:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x003a
            boolean r3 = r13.W(r11)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004e
            r3 = r15 & 4
            if (r3 != 0) goto L_0x004b
            boolean r3 = r13.l(r12)
            if (r3 == 0) goto L_0x004b
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004d
        L_0x004b:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004d:
            r1 = r1 | r3
        L_0x004e:
            r9 = r1
            r1 = r9 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r1 != r3) goto L_0x0063
            boolean r1 = r13.t()
            if (r1 != 0) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            r13.B()
        L_0x005f:
            r3 = r11
            r4 = r12
            goto L_0x0131
        L_0x0063:
            r13.p()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x007b
            boolean r1 = r13.J()
            if (r1 == 0) goto L_0x0071
            goto L_0x007b
        L_0x0071:
            r13.B()
            r1 = r15 & 4
            if (r1 == 0) goto L_0x00cb
        L_0x0078:
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00cb
        L_0x007b:
            if (r2 == 0) goto L_0x007f
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
        L_0x007f:
            r1 = r15 & 4
            if (r1 == 0) goto L_0x00cb
            r12 = 1890788296(0x70b323c8, float:4.435286E29)
            r13.f(r12)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r12 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r12.c(r13, r1)
            if (r2 == 0) goto L_0x00c3
            r12 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r13, r12)
            r12 = 1729797275(0x671a9c9b, float:7.301333E23)
            r13.f(r12)
            boolean r12 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r12 == 0) goto L_0x00ab
            r12 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r12 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r12
            androidx.lifecycle.viewmodel.CreationExtras r12 = r12.n()
        L_0x00a9:
            r5 = r12
            goto L_0x00ae
        L_0x00ab:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r12 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00a9
        L_0x00ae:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel> r1 = com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r12 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel r12 = (com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel) r12
            goto L_0x0078
        L_0x00c3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00cb:
            r13.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00da
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialog (DebugMenuDialog.kt:41)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00da:
            r5 = r9 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r12
            r4 = r13
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$State r2 = e(r0)
            r0 = 1317970732(0x4e8ea32c, float:1.19652915E9)
            r13.X(r0)
            boolean r0 = r13.l(r12)
            java.lang.Object r1 = r13.g()
            if (r0 != 0) goto L_0x0101
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0109
        L_0x0101:
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DebugMenuDialog$1$1 r1 = new com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DebugMenuDialog$1$1
            r1.<init>(r12)
            r13.N(r1)
        L_0x0109:
            kotlin.reflect.KFunction r1 = (kotlin.reflect.KFunction) r1
            r13.M()
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            kotlinx.coroutines.flow.Flow r4 = r12.l()
            r0 = r9 & 14
            int r1 = r9 << 9
            r5 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            r7 = r0 | r1
            r8 = 0
            r1 = r10
            r5 = r11
            r6 = r13
            g(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x005f
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x005f
        L_0x0131:
            androidx.compose.runtime.ScopeUpdateScope r11 = r13.x()
            if (r11 == 0) goto L_0x0143
            com.hansecom.abt.presentation.screens.main.debugMenu.a r12 = new com.hansecom.abt.presentation.screens.main.debugMenu.a
            r1 = r12
            r2 = r10
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r11.a(r12)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt.d(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final DebugMenu.State e(State state) {
        return (DebugMenu.State) state.getValue();
    }

    public static final Unit f(Function0 function0, Modifier modifier, DebugMenuViewModel debugMenuViewModel, int i2, int i3, Composer composer, int i4) {
        d(function0, modifier, debugMenuViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(kotlin.jvm.functions.Function0 r29, com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu.State r30, kotlin.jvm.functions.Function1 r31, kotlinx.coroutines.flow.Flow r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r2 = r29
            r14 = r30
            r15 = r31
            r12 = r35
            r0 = 437880153(0x1a198559, float:3.1747376E-23)
            r1 = r34
            androidx.compose.runtime.Composer r13 = r1.q(r0)
            r1 = r36 & 1
            r3 = 2
            if (r1 == 0) goto L_0x0019
            r1 = r12 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0028
            boolean r1 = r13.l(r2)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = r3
        L_0x0026:
            r1 = r1 | r12
            goto L_0x0029
        L_0x0028:
            r1 = r12
        L_0x0029:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0040
        L_0x0030:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0040
            boolean r4 = r13.W(r14)
            if (r4 == 0) goto L_0x003d
            r4 = 32
            goto L_0x003f
        L_0x003d:
            r4 = 16
        L_0x003f:
            r1 = r1 | r4
        L_0x0040:
            r4 = r36 & 4
            if (r4 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0057
        L_0x0047:
            r4 = r12 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0057
            boolean r4 = r13.l(r15)
            if (r4 == 0) goto L_0x0054
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r4
        L_0x0057:
            r4 = r36 & 16
            if (r4 == 0) goto L_0x0061
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x005d:
            r5 = r33
        L_0x005f:
            r7 = r1
            goto L_0x0074
        L_0x0061:
            r5 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x005d
            r5 = r33
            boolean r6 = r13.W(r5)
            if (r6 == 0) goto L_0x0070
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0072
        L_0x0070:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0072:
            r1 = r1 | r6
            goto L_0x005f
        L_0x0074:
            r1 = r7 & 8339(0x2093, float:1.1685E-41)
            r6 = 8338(0x2092, float:1.1684E-41)
            if (r1 != r6) goto L_0x0088
            boolean r1 = r13.t()
            if (r1 != 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            r13.B()
            r25 = r13
            goto L_0x0174
        L_0x0088:
            if (r4 == 0) goto L_0x008f
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r22 = r1
            goto L_0x0091
        L_0x008f:
            r22 = r5
        L_0x0091:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x009d
            r1 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.main.debugMenu.DialogImpl (DebugMenuDialog.kt:60)"
            androidx.compose.runtime.ComposerKt.Y(r0, r7, r1, r4)
        L_0x009d:
            r0 = 37260866(0x2388e42, float:1.3559011E-37)
            r13.X(r0)
            java.lang.Object r0 = r13.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r1.a()
            r5 = 0
            if (r0 != r4) goto L_0x00b9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r0, r5, r3, r5)
            r13.N(r0)
        L_0x00b9:
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            r13.M()
            r4 = 37262594(0x2389502, float:1.3560948E-37)
            r13.X(r4)
            java.lang.Object r4 = r13.g()
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x00d7
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r1, r5, r3, r5)
            r13.N(r4)
        L_0x00d7:
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            r13.M()
            kotlinx.collections.immutable.PersistentList r1 = r30.c()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x010d
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00ef
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ef:
            androidx.compose.runtime.ScopeUpdateScope r8 = r13.x()
            if (r8 == 0) goto L_0x010c
            com.hansecom.abt.presentation.screens.main.debugMenu.b r9 = new com.hansecom.abt.presentation.screens.main.debugMenu.b
            r0 = r9
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r22
            r6 = r35
            r7 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x010c:
            return
        L_0x010d:
            androidx.compose.ui.window.DialogProperties r23 = new androidx.compose.ui.window.DialogProperties
            r17 = r23
            r27 = 5
            r28 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r23.<init>((boolean) r24, (boolean) r25, (boolean) r26, (int) r27, (kotlin.jvm.internal.DefaultConstructorMarker) r28)
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$2 r1 = new com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$2
            r1.<init>(r15, r2, r4)
            r3 = 42861985(0x28e05a1, float:2.0868256E-37)
            r6 = 1
            r8 = 54
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r6, r1, r13, r8)
            com.hansecom.abt.presentation.screens.main.debugMenu.ComposableSingletons$DebugMenuDialogKt r3 = com.hansecom.abt.presentation.screens.main.debugMenu.ComposableSingletons$DebugMenuDialogKt.f37600a
            kotlin.jvm.functions.Function2 r5 = r3.a()
            com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3 r3 = new com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt$DialogImpl$3
            r3.<init>(r15, r0, r14, r4)
            r0 = -436166938(0xffffffffe6009ee6, float:-1.5184852E23)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r6, r3, r13, r8)
            r0 = r7 & 14
            r3 = 1769520(0x1b0030, float:2.479626E-39)
            r0 = r0 | r3
            int r3 = r7 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r19 = r0 | r3
            r20 = 3072(0xc00, float:4.305E-42)
            r21 = 8088(0x1f98, float:1.1334E-41)
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r23 = 0
            r25 = r13
            r12 = r23
            r14 = r23
            r16 = 0
            r0 = r29
            r2 = r22
            r18 = r25
            androidx.compose.material3.AndroidAlertDialog_androidKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0172
            androidx.compose.runtime.ComposerKt.X()
        L_0x0172:
            r5 = r22
        L_0x0174:
            androidx.compose.runtime.ScopeUpdateScope r8 = r25.x()
            if (r8 == 0) goto L_0x018f
            com.hansecom.abt.presentation.screens.main.debugMenu.c r9 = new com.hansecom.abt.presentation.screens.main.debugMenu.c
            r0 = r9
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r6 = r35
            r7 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt.g(kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit h(Function0 function0, DebugMenu.State state, Function1 function1, Flow flow, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        g(function0, state, function1, flow, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final boolean i(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void j(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final boolean k(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void l(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final Unit m(Function0 function0, DebugMenu.State state, Function1 function1, Flow flow, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        g(function0, state, function1, flow, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
