package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AddPassesScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        if ((r9 & 1) != 0) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel r18, kotlin.jvm.functions.Function2 r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r7 = r19
            r8 = r21
            r9 = r22
            java.lang.String r0 = "navigateCheckout"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            r0 = -1995475538(0xffffffff890f75ae, float:-1.7268332E-33)
            r1 = r20
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r8 & 6
            r5 = 4
            if (r1 != 0) goto L_0x002c
            r1 = r9 & 1
            if (r1 != 0) goto L_0x0027
            r1 = r18
            boolean r2 = r6.W(r1)
            if (r2 == 0) goto L_0x0029
            r2 = r5
            goto L_0x002a
        L_0x0027:
            r1 = r18
        L_0x0029:
            r2 = 2
        L_0x002a:
            r2 = r2 | r8
            goto L_0x002f
        L_0x002c:
            r1 = r18
            r2 = r8
        L_0x002f:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0036
            r2 = r2 | 48
            goto L_0x0046
        L_0x0036:
            r3 = r8 & 48
            if (r3 != 0) goto L_0x0046
            boolean r3 = r6.l(r7)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r2 = r2 | r3
        L_0x0046:
            r3 = r2 & 19
            r4 = 18
            if (r3 != r4) goto L_0x0059
            boolean r3 = r6.t()
            if (r3 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            r6.B()
            r12 = r6
            goto L_0x0135
        L_0x0059:
            r6.p()
            r3 = r8 & 1
            r4 = 0
            if (r3 == 0) goto L_0x0074
            boolean r3 = r6.J()
            if (r3 == 0) goto L_0x0068
            goto L_0x0074
        L_0x0068:
            r6.B()
            r3 = r9 & 1
            if (r3 == 0) goto L_0x0071
        L_0x006f:
            r2 = r2 & -15
        L_0x0071:
            r10 = r1
            r11 = r2
            goto L_0x00c0
        L_0x0074:
            r3 = r9 & 1
            if (r3 == 0) goto L_0x0071
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r6.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r3 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r11 = r1.c(r6, r3)
            if (r11 == 0) goto L_0x00b8
            androidx.lifecycle.ViewModelProvider$Factory r13 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r11, r6, r4)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r6.f(r1)
            boolean r1 = r11 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x009f
            r1 = r11
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x009d:
            r14 = r1
            goto L_0x00a2
        L_0x009f:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x009d
        L_0x00a2:
            r16 = 36936(0x9048, float:5.1758E-41)
            r17 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel> r10 = com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel.class
            r12 = 0
            r15 = r6
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r10, r11, r12, r13, r14, r15, r16, r17)
            r6.S()
            r6.S()
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel r1 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel) r1
            goto L_0x006f
        L_0x00b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            r6.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00cf
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreen (AddPassesScreen.kt:42)"
            androidx.compose.runtime.ComposerKt.Y(r0, r11, r1, r2)
        L_0x00cf:
            int r0 = r11 << 6
            r12 = r0 & 896(0x380, float:1.256E-42)
            r13 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r14 = r4
            r4 = r6
            r15 = r5
            r5 = r12
            r12 = r6
            r6 = r13
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses$State r1 = d(r1)
            r2 = 1088125807(0x40db7b6f, float:6.8588176)
            r12.X(r2)
            r2 = r11 & 14
            r2 = r2 ^ 6
            if (r2 <= r15) goto L_0x00f7
            boolean r2 = r12.W(r10)
            if (r2 != 0) goto L_0x00fb
        L_0x00f7:
            r2 = r11 & 6
            if (r2 != r15) goto L_0x00fd
        L_0x00fb:
            r4 = 1
            goto L_0x00fe
        L_0x00fd:
            r4 = r14
        L_0x00fe:
            java.lang.Object r2 = r12.g()
            if (r4 != 0) goto L_0x010c
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0114
        L_0x010c:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$AddPassesScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$AddPassesScreen$1$1
            r2.<init>(r10)
            r12.N(r2)
        L_0x0114:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            r12.M()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r5 = r0 & 7168(0x1c00, float:1.0045E-41)
            r6 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r19
            r4 = r12
            f(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0134
            androidx.compose.runtime.ComposerKt.X()
        L_0x0134:
            r1 = r10
        L_0x0135:
            androidx.compose.runtime.ScopeUpdateScope r0 = r12.x()
            if (r0 == 0) goto L_0x0143
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.a r2 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.a
            r2.<init>(r1, r7, r8, r9)
            r0.a(r2)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt.c(com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesViewModel, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AddPasses.State d(State state) {
        return (AddPasses.State) state.getValue();
    }

    public static final Unit e(AddPassesViewModel addPassesViewModel, Function2 function2, int i2, int i3, Composer composer, int i4) {
        c(addPassesViewModel, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0099, code lost:
        if ((r25 & 4) != 0) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses.State r19, kotlin.jvm.functions.Function1 r20, kotlinx.coroutines.flow.Flow r21, kotlin.jvm.functions.Function2 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r24
            r0 = -605413646(0xffffffffdbea1ef2, float:-1.31798339E17)
            r3 = r23
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r6 = r25 & 1
            if (r6 == 0) goto L_0x0018
            r6 = r5 | 6
            goto L_0x0028
        L_0x0018:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0027
            boolean r6 = r3.l(r1)
            if (r6 == 0) goto L_0x0024
            r6 = 4
            goto L_0x0025
        L_0x0024:
            r6 = 2
        L_0x0025:
            r6 = r6 | r5
            goto L_0x0028
        L_0x0027:
            r6 = r5
        L_0x0028:
            r7 = r25 & 2
            if (r7 == 0) goto L_0x002f
            r6 = r6 | 48
            goto L_0x003f
        L_0x002f:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x003f
            boolean r7 = r3.l(r2)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r6 = r6 | r7
        L_0x003f:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0058
            r7 = r25 & 4
            if (r7 != 0) goto L_0x0052
            r7 = r21
            boolean r8 = r3.l(r7)
            if (r8 == 0) goto L_0x0054
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0052:
            r7 = r21
        L_0x0054:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r6 = r6 | r8
            goto L_0x005a
        L_0x0058:
            r7 = r21
        L_0x005a:
            r8 = r25 & 8
            r15 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0063
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0072
        L_0x0063:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0072
            boolean r8 = r3.l(r4)
            if (r8 == 0) goto L_0x006f
            r8 = r15
            goto L_0x0071
        L_0x006f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r6 = r6 | r8
        L_0x0072:
            r8 = r6 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0086
            boolean r8 = r3.t()
            if (r8 != 0) goto L_0x007f
            goto L_0x0086
        L_0x007f:
            r3.B()
            r16 = r7
            goto L_0x0123
        L_0x0086:
            r3.p()
            r8 = r5 & 1
            if (r8 == 0) goto L_0x00a1
            boolean r8 = r3.J()
            if (r8 == 0) goto L_0x0094
            goto L_0x00a1
        L_0x0094:
            r3.B()
            r8 = r25 & 4
            if (r8 == 0) goto L_0x009d
        L_0x009b:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x009d:
            r14 = r6
            r16 = r7
            goto L_0x00aa
        L_0x00a1:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x009d
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.A()
            goto L_0x009b
        L_0x00aa:
            r3.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00b9
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.faremedia.passes.add.ScreenImpl (AddPassesScreen.kt:59)"
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r6, r7)
        L_0x00b9:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r6 = "AddPassesScreen"
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.platform.TestTagKt.a(r0, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$1
            r0.<init>(r1, r2)
            r7 = 54
            r8 = -570006093(0xffffffffde0665b3, float:-2.42108585E18)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r13, r0, r3, r7)
            r0 = 3078(0xc06, float:4.313E-42)
            r17 = 6
            r7 = 0
            r9 = 0
            r12 = r3
            r18 = r13
            r13 = r0
            r0 = r14
            r14 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            r6 = -1611998202(0xffffffff9feadc06, float:-9.946685E-20)
            r3.X(r6)
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != r15) goto L_0x00ef
            r13 = r18
            goto L_0x00f0
        L_0x00ef:
            r13 = 0
        L_0x00f0:
            java.lang.Object r6 = r3.g()
            if (r13 != 0) goto L_0x00fe
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x0107
        L_0x00fe:
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$2$1 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt$ScreenImpl$2$1
            r7 = 0
            r6.<init>(r4, r7)
            r3.N(r6)
        L_0x0107:
            r9 = r6
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r3.M()
            int r0 = r0 >> 6
            r11 = r0 & 14
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r16
            r10 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0123
            androidx.compose.runtime.ComposerKt.X()
        L_0x0123:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.x()
            if (r7 == 0) goto L_0x013e
            com.hansecom.abt.presentation.screens.home.faremedia.passes.add.b r8 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.add.b
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r16
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPassesScreenKt.f(com.hansecom.abt.presentation.screens.home.faremedia.passes.add.AddPasses$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(AddPasses.State state, Function1 function1, Flow flow, Function2 function2, int i2, int i3, Composer composer, int i4) {
        f(state, function1, flow, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
