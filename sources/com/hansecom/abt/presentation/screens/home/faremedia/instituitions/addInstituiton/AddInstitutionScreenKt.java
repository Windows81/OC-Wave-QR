package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AddInstitutionScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = 543078664(0x205eb908, float:1.8865353E-19)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r14 & 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.l(r10)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r13
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0028
            r1 = r1 | 48
        L_0x0026:
            r9 = r1
            goto L_0x0039
        L_0x0028:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0026
            boolean r2 = r12.l(r11)
            if (r2 == 0) goto L_0x0035
            r2 = 32
            goto L_0x0037
        L_0x0035:
            r2 = 16
        L_0x0037:
            r1 = r1 | r2
            goto L_0x0026
        L_0x0039:
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x004b
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r12.B()
            goto L_0x010c
        L_0x004b:
            r12.p()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0063
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            r12.B()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
        L_0x0060:
            r9 = r9 & -15
            goto L_0x00af
        L_0x0063:
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r12, r1)
            if (r2 == 0) goto L_0x00a7
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x008f
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x008d:
            r5 = r10
            goto L_0x0092
        L_0x008f:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x008d
        L_0x0092:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel) r10
            goto L_0x0060
        L_0x00a7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00af:
            r12.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00be
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreen (AddInstitutionScreen.kt:40)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00be:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r12
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution$State r1 = d(r1)
            r2 = 2014097395(0x780caff3, float:1.141391E34)
            r12.X(r2)
            boolean r2 = r12.l(r10)
            java.lang.Object r3 = r12.g()
            if (r2 != 0) goto L_0x00e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00ef
        L_0x00e7:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt$AddInstitutionScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt$AddInstitutionScreen$1$1
            r3.<init>(r10)
            r12.N(r3)
        L_0x00ef:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r12.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            r7 = 0
            r4 = r11
            r5 = r12
            f(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x010c
            androidx.compose.runtime.ComposerKt.X()
        L_0x010c:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x011a
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.b r0 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.b
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt.c(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AddInstitution.State d(State state) {
        return (AddInstitution.State) state.getValue();
    }

    public static final Unit e(AddInstitutionViewModel addInstitutionViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(addInstitutionViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0099, code lost:
        if ((r25 & 4) != 0) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution.State r19, kotlin.jvm.functions.Function1 r20, kotlinx.coroutines.flow.Flow r21, kotlin.jvm.functions.Function0 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r24
            r0 = 1615019292(0x60433d1c, float:5.6273726E19)
            r3 = r23
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r6 = r25 & 1
            if (r6 == 0) goto L_0x0018
            r6 = r5 | 6
            goto L_0x0028
        L_0x0018:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0027
            boolean r6 = r3.W(r1)
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
            goto L_0x012b
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
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.ScreenImpl (AddInstitutionScreen.kt:57)"
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r6, r7)
        L_0x00b9:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt$ScreenImpl$1
            r0.<init>(r1, r2)
            r6 = 54
            r7 = 686091579(0x28e4ed3b, float:2.5415967E-14)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r13, r0, r3, r6)
            r0 = 3072(0xc00, float:4.305E-42)
            r17 = 7
            r6 = 0
            r7 = 0
            r9 = 0
            r12 = r3
            r18 = r13
            r13 = r0
            r0 = r14
            r14 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r6, r7, r9, r11, r12, r13, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r6 = r3.C(r6)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r6 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r6
            r7 = 1701904600(0x657100d8, float:7.113162E22)
            r3.X(r7)
            boolean r7 = r3.l(r6)
            r8 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != r15) goto L_0x00f6
            r13 = r18
            goto L_0x00f7
        L_0x00f6:
            r13 = 0
        L_0x00f7:
            r7 = r7 | r13
            java.lang.Object r8 = r3.g()
            if (r7 != 0) goto L_0x0106
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x010f
        L_0x0106:
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt$ScreenImpl$2$1 r8 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt$ScreenImpl$2$1
            r7 = 0
            r8.<init>(r6, r4, r7)
            r3.N(r8)
        L_0x010f:
            r9 = r8
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
            if (r0 == 0) goto L_0x012b
            androidx.compose.runtime.ComposerKt.X()
        L_0x012b:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.x()
            if (r7 == 0) goto L_0x0146
            com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.a r8 = new com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.a
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r16
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionScreenKt.f(com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitution$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(AddInstitution.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3, Composer composer, int i4) {
        f(state, function1, flow, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
