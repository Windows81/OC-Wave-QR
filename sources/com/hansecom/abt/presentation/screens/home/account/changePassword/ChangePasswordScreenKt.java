package com.hansecom.abt.presentation.screens.home.account.changePassword;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.autofill.AutofillManager;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class ChangePasswordScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "goBack"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 1032964941(0x3d91cb4d, float:0.07118855)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0024
            r1 = r15 & 1
            if (r1 != 0) goto L_0x0021
            boolean r1 = r13.l(r10)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = 2
        L_0x0022:
            r1 = r1 | r14
            goto L_0x0025
        L_0x0024:
            r1 = r14
        L_0x0025:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x002c
            r1 = r1 | 48
            goto L_0x003c
        L_0x002c:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x003c
            boolean r2 = r13.l(r11)
            if (r2 == 0) goto L_0x0039
            r2 = 32
            goto L_0x003b
        L_0x0039:
            r2 = 16
        L_0x003b:
            r1 = r1 | r2
        L_0x003c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r9 = r1
            goto L_0x0055
        L_0x0044:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r13.l(r12)
            if (r2 == 0) goto L_0x0051
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0053
        L_0x0051:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0053:
            r1 = r1 | r2
            goto L_0x0042
        L_0x0055:
            r1 = r9 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0068
            boolean r1 = r13.t()
            if (r1 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            r13.B()
        L_0x0065:
            r2 = r10
            goto L_0x012f
        L_0x0068:
            r13.p()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0080
            boolean r1 = r13.J()
            if (r1 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            r13.B()
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
        L_0x007d:
            r9 = r9 & -15
            goto L_0x00cc
        L_0x0080:
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r13.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r13, r1)
            if (r2 == 0) goto L_0x00c4
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r13, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r13.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x00ac
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x00aa:
            r5 = r10
            goto L_0x00af
        L_0x00ac:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00aa
        L_0x00af:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel r10 = (com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel) r10
            goto L_0x007d
        L_0x00c4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00cc:
            r13.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00db
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreen (ChangePasswordScreen.kt:51)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00db:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r13
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State r1 = f(r1)
            r2 = 1206717076(0x47ed0a94, float:121365.16)
            r13.X(r2)
            boolean r2 = r13.l(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt$ChangePasswordScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt$ChangePasswordScreen$1$1
            r3.<init>(r10)
            r13.N(r3)
        L_0x010c:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r13.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r10.l()
            r4 = 64512(0xfc00, float:9.04E-41)
            r7 = r0 & r4
            r8 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            h(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x012f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0142
            com.hansecom.abt.presentation.screens.home.account.changePassword.d r13 = new com.hansecom.abt.presentation.screens.home.account.changePassword.d
            r1 = r13
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r13)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt.e(com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ChangePassword.State f(State state) {
        return (ChangePassword.State) state.getValue();
    }

    public static final Unit g(ChangePasswordViewModel changePasswordViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        e(changePasswordViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword.State r21, kotlin.jvm.functions.Function1 r22, kotlinx.coroutines.flow.Flow r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r1 = r21
            r4 = r24
            r5 = r25
            r6 = r27
            r0 = 307573473(0x125532e1, float:6.727366E-28)
            r2 = r26
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r6 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = 2
        L_0x0025:
            r3 = r3 | r6
            goto L_0x0028
        L_0x0027:
            r3 = r6
        L_0x0028:
            r7 = r28 & 2
            if (r7 == 0) goto L_0x0031
            r3 = r3 | 48
        L_0x002e:
            r8 = r22
            goto L_0x0043
        L_0x0031:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x002e
            r8 = r22
            boolean r9 = r2.l(r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r3 = r3 | r9
        L_0x0043:
            r9 = r28 & 4
            if (r9 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r23
            goto L_0x005e
        L_0x004c:
            r9 = r6 & 384(0x180, float:5.38E-43)
            r15 = r23
            if (r9 != 0) goto L_0x005e
            boolean r9 = r2.l(r15)
            if (r9 == 0) goto L_0x005b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r9
        L_0x005e:
            r9 = r28 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0067
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0067:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0076
            boolean r9 = r2.l(r4)
            if (r9 == 0) goto L_0x0073
            r9 = r14
            goto L_0x0075
        L_0x0073:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r3 = r3 | r9
        L_0x0076:
            r9 = r28 & 16
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x007f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007f:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008e
            boolean r9 = r2.l(r5)
            if (r9 == 0) goto L_0x008b
            r9 = r10
            goto L_0x008d
        L_0x008b:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r3 = r3 | r9
        L_0x008e:
            r9 = r3 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r11) goto L_0x00a0
            boolean r9 = r2.t()
            if (r9 != 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            r2.B()
            goto L_0x0193
        L_0x00a0:
            if (r7 == 0) goto L_0x00c3
            r7 = 201208762(0xbfe33ba, float:9.791507E-32)
            r2.X(r7)
            java.lang.Object r7 = r2.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00bc
            com.hansecom.abt.presentation.screens.home.account.changePassword.a r7 = new com.hansecom.abt.presentation.screens.home.account.changePassword.a
            r7.<init>()
            r2.N(r7)
        L_0x00bc:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r2.M()
            r13 = r7
            goto L_0x00c4
        L_0x00c3:
            r13 = r8
        L_0x00c4:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00d0
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.account.changePassword.ScreenImpl (ChangePasswordScreen.kt:69)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r7, r8)
        L_0x00d0:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r0 = r2.C(r0)
            androidx.compose.ui.focus.FocusManager r0 = (androidx.compose.ui.focus.FocusManager) r0
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.d()
            java.lang.Object r7 = r2.C(r7)
            androidx.compose.ui.autofill.AutofillManager r7 = (androidx.compose.ui.autofill.AutofillManager) r7
            r8 = 201215922(0xbfe4fb2, float:9.7957153E-32)
            r2.X(r8)
            boolean r8 = r2.l(r7)
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r3
            r12 = 0
            r11 = 1
            if (r9 != r10) goto L_0x00f8
            r9 = r11
            goto L_0x00f9
        L_0x00f8:
            r9 = r12
        L_0x00f9:
            r8 = r8 | r9
            java.lang.Object r9 = r2.g()
            if (r8 != 0) goto L_0x0108
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0110
        L_0x0108:
            com.hansecom.abt.presentation.screens.home.account.changePassword.b r9 = new com.hansecom.abt.presentation.screens.home.account.changePassword.b
            r9.<init>(r7, r5)
            r2.N(r9)
        L_0x0110:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r2.M()
            androidx.activity.compose.BackHandlerKt.a(r12, r9, r2, r12, r11)
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt$ScreenImpl$3 r7 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt$ScreenImpl$3
            r7.<init>(r1, r13, r0)
            r0 = 54
            r8 = 562636352(0x21892640, float:9.293606E-19)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r11, r7, r2, r0)
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 7
            r7 = 0
            r8 = 0
            r18 = 0
            r20 = r11
            r10 = r18
            r18 = r12
            r12 = r0
            r0 = r13
            r13 = r2
            r14 = r16
            r15 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r7, r8, r10, r12, r13, r14, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r7 = r2.C(r7)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r7 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r7
            r8 = 201347590(0xc005206, float:9.885444E-32)
            r2.X(r8)
            boolean r8 = r2.l(r7)
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2048(0x800, float:2.87E-42)
            if (r9 != r10) goto L_0x015c
            r12 = r20
            goto L_0x015e
        L_0x015c:
            r12 = r18
        L_0x015e:
            r8 = r8 | r12
            java.lang.Object r9 = r2.g()
            if (r8 != 0) goto L_0x016d
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0176
        L_0x016d:
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt$ScreenImpl$4$1 r9 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt$ScreenImpl$4$1
            r8 = 0
            r9.<init>(r7, r4, r8)
            r2.N(r9)
        L_0x0176:
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r2.M()
            int r3 = r3 >> 6
            r12 = r3 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r23
            r11 = r2
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0192
            androidx.compose.runtime.ComposerKt.X()
        L_0x0192:
            r8 = r0
        L_0x0193:
            androidx.compose.runtime.ScopeUpdateScope r9 = r2.x()
            if (r9 == 0) goto L_0x01af
            com.hansecom.abt.presentation.screens.home.account.changePassword.c r10 = new com.hansecom.abt.presentation.screens.home.account.changePassword.c
            r0 = r10
            r1 = r21
            r2 = r8
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordScreenKt.h(com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit i(ChangePassword.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit j(AutofillManager autofillManager, Function0 function0) {
        if (autofillManager != null) {
            autofillManager.c();
        }
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit k(ChangePassword.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        h(state, function1, flow, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
