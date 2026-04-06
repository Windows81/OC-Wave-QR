package com.hansecom.abt.presentation.screens.auth.login;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class LoginScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ea, code lost:
        if ((r28 & 1) != 0) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(com.hansecom.abt.presentation.screens.auth.login.LoginViewModel r20, kotlin.jvm.functions.Function0 r21, kotlin.jvm.functions.Function1 r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r15 = r25
            r10 = r27
            java.lang.String r0 = "onLoginSuccess"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onAccountInactive"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "onResetPassword"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "onRegister"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "onBack"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            r0 = 942588604(0x382ec2bc, float:4.1666193E-5)
            r1 = r26
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0045
            r1 = r28 & 1
            if (r1 != 0) goto L_0x0040
            r1 = r20
            boolean r2 = r9.l(r1)
            if (r2 == 0) goto L_0x0042
            r2 = 4
            goto L_0x0043
        L_0x0040:
            r1 = r20
        L_0x0042:
            r2 = 2
        L_0x0043:
            r2 = r2 | r10
            goto L_0x0048
        L_0x0045:
            r1 = r20
            r2 = r10
        L_0x0048:
            r3 = r28 & 2
            if (r3 == 0) goto L_0x004f
            r2 = r2 | 48
            goto L_0x005f
        L_0x004f:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x005f
            boolean r3 = r9.l(r11)
            if (r3 == 0) goto L_0x005c
            r3 = 32
            goto L_0x005e
        L_0x005c:
            r3 = 16
        L_0x005e:
            r2 = r2 | r3
        L_0x005f:
            r3 = r28 & 4
            if (r3 == 0) goto L_0x0066
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0066:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0076
            boolean r3 = r9.l(r12)
            if (r3 == 0) goto L_0x0073
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0073:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0075:
            r2 = r2 | r3
        L_0x0076:
            r3 = r28 & 8
            if (r3 == 0) goto L_0x007d
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007d:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x008d
            boolean r3 = r9.l(r13)
            if (r3 == 0) goto L_0x008a
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r2 = r2 | r3
        L_0x008d:
            r3 = r28 & 16
            if (r3 == 0) goto L_0x0094
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0094:
            r3 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00a4
            boolean r3 = r9.l(r14)
            if (r3 == 0) goto L_0x00a1
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r2 = r2 | r3
        L_0x00a4:
            r3 = r28 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00ae
            r2 = r2 | r4
        L_0x00ab:
            r16 = r2
            goto L_0x00bf
        L_0x00ae:
            r3 = r10 & r4
            if (r3 != 0) goto L_0x00ab
            boolean r3 = r9.l(r15)
            if (r3 == 0) goto L_0x00bb
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r2 = r2 | r3
            goto L_0x00ab
        L_0x00bf:
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r16 & r2
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r3) goto L_0x00d7
            boolean r2 = r9.t()
            if (r2 != 0) goto L_0x00d0
            goto L_0x00d7
        L_0x00d0:
            r9.B()
            r19 = r9
            goto L_0x01b5
        L_0x00d7:
            r9.p()
            r2 = r10 & 1
            if (r2 == 0) goto L_0x00f2
            boolean r2 = r9.J()
            if (r2 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            r9.B()
            r2 = r28 & 1
            if (r2 == 0) goto L_0x00ee
        L_0x00ec:
            r16 = r16 & -15
        L_0x00ee:
            r8 = r1
            r1 = r16
            goto L_0x013e
        L_0x00f2:
            r2 = r28 & 1
            if (r2 == 0) goto L_0x00ee
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r9.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r2 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r1.c(r9, r2)
            if (r2 == 0) goto L_0x0136
            r1 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r9, r1)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r9.f(r1)
            boolean r1 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x011e
            r1 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x011c:
            r5 = r1
            goto L_0x0121
        L_0x011e:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x011c
        L_0x0121:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.auth.login.LoginViewModel> r1 = com.hansecom.abt.presentation.screens.auth.login.LoginViewModel.class
            r3 = 0
            r6 = r9
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.S()
            r9.S()
            com.hansecom.abt.presentation.screens.auth.login.LoginViewModel r1 = (com.hansecom.abt.presentation.screens.auth.login.LoginViewModel) r1
            goto L_0x00ec
        L_0x0136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x013e:
            r9.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x014d
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.auth.login.LoginScreen (LoginScreen.kt:66)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x014d:
            int r0 = r1 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r8
            r4 = r9
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.auth.login.Login$State r1 = k(r1)
            r2 = 702349556(0x29dd00f4, float:9.814537E-14)
            r9.X(r2)
            boolean r2 = r9.l(r8)
            java.lang.Object r3 = r9.g()
            if (r2 != 0) goto L_0x0176
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x017e
        L_0x0176:
            com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$LoginScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$LoginScreen$1$1
            r3.<init>(r8)
            r9.N(r3)
        L_0x017e:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r9.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r8.l()
            r4 = 33553408(0x1fffc00, float:9.403381E-38)
            r16 = r0 & r4
            r17 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r18 = r8
            r8 = r9
            r19 = r9
            r9 = r16
            r10 = r17
            o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01b3
            androidx.compose.runtime.ComposerKt.X()
        L_0x01b3:
            r1 = r18
        L_0x01b5:
            androidx.compose.runtime.ScopeUpdateScope r9 = r19.x()
            if (r9 == 0) goto L_0x01d2
            com.hansecom.abt.presentation.screens.auth.login.d r10 = new com.hansecom.abt.presentation.screens.auth.login.d
            r0 = r10
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt.j(com.hansecom.abt.presentation.screens.auth.login.LoginViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Login.State k(State state) {
        return (Login.State) state.getValue();
    }

    public static final Unit l(LoginViewModel loginViewModel, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, Composer composer, int i4) {
        j(loginViewModel, function0, function1, function02, function03, function04, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void m(Login.State state, Function0 function0, Function0 function02, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Function0 function03 = function0;
        int i4 = i2;
        Composer q2 = composer.q(-1664134946);
        if ((i4 & 48) == 0) {
            i3 = (q2.l(function03) ? 32 : 16) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 17) != 16 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1664134946, i3, -1, "com.hansecom.abt.presentation.screens.auth.login.RegistrationPart (LoginScreen.kt:223)");
            }
            float m2 = Dp.m((float) 1);
            Modifier.Companion companion = Modifier.f15489d;
            Modifier m3 = PaddingKt.m(companion, 0.0f, Dp.m((float) 28), 0.0f, Dp.m((float) 40), 5, (Object) null);
            AbtTheme abtTheme = AbtTheme.f38851a;
            DividerKt.e(m3, m2, abtTheme.b(q2, 6).u(), q2, 54, 0);
            Modifier.Companion companion2 = companion;
            String b2 = StringResources_androidKt.b(R.string.L9, q2, 0);
            TextStyle l2 = abtTheme.d(q2, 6).l();
            AbtTheme abtTheme2 = abtTheme;
            long q3 = abtTheme.b(q2, 6).q();
            TextAlign.Companion companion3 = TextAlign.f19080b;
            Composer composer3 = q2;
            TextKt.j(b2, (Modifier) null, q3, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(companion3.a()), 0, 0, false, 0, 0, (Function1) null, l2, composer3, 0, 0, 130042);
            SpacerKt.a(SizeKt.i(companion2, Dp.m((float) 16)), q2, 6);
            TextKt.j(StringResources_androidKt.b(R.string.M9, q2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(companion3.a()), 0, 0, false, 0, 0, (Function1) null, abtTheme2.d(q2, 6).b(), composer3, 0, 0, 130046);
            SpacerKt.a(SizeKt.i(companion2, Dp.m((float) 22)), q2, 6);
            int i5 = ((i3 >> 3) & 14) | 48;
            composer2 = q2;
            AbtButtonKt.j(function0, SizeKt.h(companion2, 0.0f, 1, (Object) null), AbtButtonStyle.f37880f.a(q2, 6).e(q2, 0), (AbtButtonState) null, StringResources_androidKt.b(R.string.K9, q2, 0), (Integer) null, (AbtButtonIconPosition) null, q2, i5, 104);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new c(state, function03, function02, i4));
        }
    }

    public static final Unit n(Login.State state, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        m(state, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(com.hansecom.abt.presentation.screens.auth.login.Login.State r32, kotlin.jvm.functions.Function1 r33, kotlinx.coroutines.flow.Flow r34, kotlin.jvm.functions.Function0 r35, kotlin.jvm.functions.Function1 r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, kotlin.jvm.functions.Function0 r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r8 = r39
            r9 = r41
            r10 = r42
            r0 = -696337398(0xffffffffd67ebc0a, float:-7.0020894E13)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r10 & 1
            if (r2 != 0) goto L_0x0021
            r2 = r32
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0021:
            r2 = r32
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r9
            goto L_0x0029
        L_0x0026:
            r2 = r32
            r3 = r9
        L_0x0029:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r33
            goto L_0x0044
        L_0x0032:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r33
            boolean r6 = r1.l(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r9 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005d
            r6 = r10 & 4
            if (r6 != 0) goto L_0x0057
            r6 = r34
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0059
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r6 = r34
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r7
            goto L_0x005f
        L_0x005d:
            r6 = r34
        L_0x005f:
            r7 = r10 & 8
            if (r7 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r11 = r35
            goto L_0x007a
        L_0x0068:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r35
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r12
        L_0x007a:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r36
            goto L_0x0096
        L_0x0083:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r36
            boolean r16 = r1.l(r13)
            if (r16 == 0) goto L_0x0092
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r16
        L_0x0096:
            r16 = r10 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a1
            r3 = r3 | r17
            r14 = r37
            goto L_0x00b4
        L_0x00a1:
            r17 = r9 & r17
            r14 = r37
            if (r17 != 0) goto L_0x00b4
            boolean r17 = r1.l(r14)
            if (r17 == 0) goto L_0x00b0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r3 = r3 | r17
        L_0x00b4:
            r17 = r10 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00bf
            r3 = r3 | r18
            r15 = r38
            goto L_0x00d2
        L_0x00bf:
            r18 = r9 & r18
            r15 = r38
            if (r18 != 0) goto L_0x00d2
            boolean r19 = r1.l(r15)
            if (r19 == 0) goto L_0x00ce
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r3 = r3 | r19
        L_0x00d2:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00db
            r3 = r3 | r20
            goto L_0x00eb
        L_0x00db:
            r0 = r9 & r20
            if (r0 != 0) goto L_0x00eb
            boolean r0 = r1.l(r8)
            if (r0 == 0) goto L_0x00e8
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r3 = r3 | r0
        L_0x00eb:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0106
            boolean r0 = r1.t()
            if (r0 != 0) goto L_0x00fb
            goto L_0x0106
        L_0x00fb:
            r1.B()
            r2 = r32
            r3 = r6
            r4 = r11
            r6 = r14
            r7 = r15
            goto L_0x033e
        L_0x0106:
            r1.p()
            r0 = r9 & 1
            if (r0 == 0) goto L_0x012c
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0114
            goto L_0x012c
        L_0x0114:
            r1.B()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x011d
            r3 = r3 & -15
        L_0x011d:
            r0 = r10 & 4
            if (r0 == 0) goto L_0x0123
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0123:
            r0 = r32
        L_0x0125:
            r2 = r11
            r4 = r14
            r7 = r15
            r15 = r3
            r3 = r13
            goto L_0x0209
        L_0x012c:
            r0 = r10 & 1
            if (r0 == 0) goto L_0x014e
            com.hansecom.abt.presentation.screens.auth.login.Login$State r0 = new com.hansecom.abt.presentation.screens.auth.login.Login$State
            r30 = 255(0xff, float:3.57E-43)
            r31 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3 = r3 & -15
            goto L_0x0150
        L_0x014e:
            r0 = r32
        L_0x0150:
            if (r4 == 0) goto L_0x0172
            r2 = -1074260640(0xffffffffbff81560, float:-1.9381523)
            r1.X(r2)
            java.lang.Object r2 = r1.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x016c
            com.hansecom.abt.presentation.screens.auth.login.e r2 = new com.hansecom.abt.presentation.screens.auth.login.e
            r2.<init>()
            r1.N(r2)
        L_0x016c:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r1.M()
            r5 = r2
        L_0x0172:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x017d
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.A()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r6 = r2
        L_0x017d:
            if (r7 == 0) goto L_0x019f
            r2 = -1074258144(0xffffffffbff81f20, float:-1.9384499)
            r1.X(r2)
            java.lang.Object r2 = r1.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x0199
            com.hansecom.abt.presentation.screens.auth.login.f r2 = new com.hansecom.abt.presentation.screens.auth.login.f
            r2.<init>()
            r1.N(r2)
        L_0x0199:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r1.M()
            r11 = r2
        L_0x019f:
            if (r12 == 0) goto L_0x01c1
            r2 = -1074256672(0xffffffffbff824e0, float:-1.9386253)
            r1.X(r2)
            java.lang.Object r2 = r1.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x01bb
            com.hansecom.abt.presentation.screens.auth.login.g r2 = new com.hansecom.abt.presentation.screens.auth.login.g
            r2.<init>()
            r1.N(r2)
        L_0x01bb:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r1.M()
            r13 = r2
        L_0x01c1:
            if (r16 == 0) goto L_0x01e3
            r2 = -1074255456(0xffffffffbff829a0, float:-1.9387703)
            r1.X(r2)
            java.lang.Object r2 = r1.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x01dd
            com.hansecom.abt.presentation.screens.auth.login.h r2 = new com.hansecom.abt.presentation.screens.auth.login.h
            r2.<init>()
            r1.N(r2)
        L_0x01dd:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r1.M()
            r14 = r2
        L_0x01e3:
            if (r17 == 0) goto L_0x0125
            r2 = -1074254400(0xffffffffbff82dc0, float:-1.9388962)
            r1.X(r2)
            java.lang.Object r2 = r1.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x01ff
            com.hansecom.abt.presentation.screens.auth.login.i r2 = new com.hansecom.abt.presentation.screens.auth.login.i
            r2.<init>()
            r1.N(r2)
        L_0x01ff:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r1.M()
            r7 = r2
            r15 = r3
            r2 = r11
            r3 = r13
            r4 = r14
        L_0x0209:
            r1.U()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x021b
            r11 = -1
            java.lang.String r12 = "com.hansecom.abt.presentation.screens.auth.login.ScreenImpl (LoginScreen.kt:90)"
            r13 = -696337398(0xffffffffd67ebc0a, float:-7.0020894E13)
            androidx.compose.runtime.ComposerKt.Y(r13, r15, r11, r12)
        L_0x021b:
            androidx.compose.runtime.ProvidableCompositionLocal r11 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r11 = r1.C(r11)
            r14 = r11
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r14 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r14
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r11 = r1.C(r11)
            androidx.compose.ui.focus.FocusManager r11 = (androidx.compose.ui.focus.FocusManager) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.d()
            java.lang.Object r12 = r1.C(r12)
            androidx.compose.ui.autofill.AutofillManager r12 = (androidx.compose.ui.autofill.AutofillManager) r12
            r13 = -1074247560(0xffffffffbff84878, float:-1.9397116)
            r1.X(r13)
            boolean r13 = r1.l(r12)
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r15 & r16
            r16 = r15
            r15 = 8388608(0x800000, float:1.17549435E-38)
            if (r9 != r15) goto L_0x0250
            r9 = 1
            goto L_0x0251
        L_0x0250:
            r9 = 0
        L_0x0251:
            r9 = r9 | r13
            java.lang.Object r13 = r1.g()
            if (r9 != 0) goto L_0x0260
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r13 != r9) goto L_0x0268
        L_0x0260:
            com.hansecom.abt.presentation.screens.auth.login.j r13 = new com.hansecom.abt.presentation.screens.auth.login.j
            r13.<init>(r12, r8)
            r1.N(r13)
        L_0x0268:
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r1.M()
            r9 = 0
            r15 = 1
            androidx.activity.compose.BackHandlerKt.a(r9, r13, r1, r9, r15)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            r13 = 0
            r9 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.f(r12, r13, r15, r9)
            java.lang.String r13 = "LoginScreen"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.platform.TestTagKt.a(r12, r13)
            com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$7 r13 = new com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$7
            r13.<init>(r0)
            r9 = 1745280974(0x6806dfce, float:2.5477023E24)
            r8 = 54
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r15, r13, r1, r8)
            com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$8 r13 = new com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$8
            r13.<init>(r14)
            r10 = 929233744(0x3762fb50, float:1.3529163E-5)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r15, r13, r1, r8)
            com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$9 r13 = new com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$9
            r32 = r13
            r33 = r0
            r34 = r5
            r35 = r11
            r36 = r4
            r37 = r7
            r38 = r2
            r32.<init>(r33, r34, r35, r36, r37, r38)
            r11 = 1312443353(0x4e3a4bd9, float:7.8138323E8)
            androidx.compose.runtime.internal.ComposableLambda r22 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r15, r13, r1, r8)
            r24 = 805309494(0x30000c36, float:4.658348E-10)
            r25 = 500(0x1f4, float:7.0E-43)
            r13 = 0
            r8 = 0
            r19 = 0
            r20 = 0
            r27 = 0
            r23 = 0
            r11 = r12
            r12 = r9
            r9 = r14
            r14 = r10
            r30 = r15
            r10 = r16
            r15 = r8
            r16 = r19
            r17 = r20
            r19 = r27
            r21 = r23
            r23 = r1
            androidx.compose.material3.ScaffoldKt.f(r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25)
            r8 = -1074090619(0xffffffffbffaad85, float:-1.9584204)
            r1.X(r8)
            boolean r8 = r1.l(r9)
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 != r12) goto L_0x02ec
            r15 = r30
            goto L_0x02ed
        L_0x02ec:
            r15 = 0
        L_0x02ed:
            r8 = r8 | r15
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r12) goto L_0x02f9
            r15 = r30
            goto L_0x02fa
        L_0x02f9:
            r15 = 0
        L_0x02fa:
            r8 = r8 | r15
            java.lang.Object r11 = r1.g()
            if (r8 != 0) goto L_0x0309
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x0312
        L_0x0309:
            com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$10$1 r11 = new com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt$ScreenImpl$10$1
            r8 = 0
            r11.<init>(r9, r2, r3, r8)
            r1.N(r11)
        L_0x0312:
            r8 = r11
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r1.M()
            int r9 = r10 >> 6
            r9 = r9 & 14
            r10 = 6
            r11 = 0
            r12 = 0
            r32 = r6
            r33 = r11
            r34 = r12
            r35 = r8
            r36 = r1
            r37 = r9
            r38 = r10
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r32, r33, r34, r35, r36, r37, r38)
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0339
            androidx.compose.runtime.ComposerKt.X()
        L_0x0339:
            r13 = r3
            r3 = r6
            r6 = r4
            r4 = r2
            r2 = r0
        L_0x033e:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0356
            com.hansecom.abt.presentation.screens.auth.login.k r12 = new com.hansecom.abt.presentation.screens.auth.login.k
            r0 = r12
            r1 = r2
            r2 = r5
            r5 = r13
            r8 = r39
            r9 = r41
            r10 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0356:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.login.LoginScreenKt.o(com.hansecom.abt.presentation.screens.auth.login.Login$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit p() {
        return Unit.f40552a;
    }

    public static final Unit q() {
        return Unit.f40552a;
    }

    public static final Unit r(AutofillManager autofillManager, Function0 function0) {
        if (autofillManager != null) {
            autofillManager.c();
        }
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit s(Login.State state, Function1 function1, Flow flow, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, Composer composer, int i4) {
        o(state, function1, flow, function0, function12, function02, function03, function04, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit t(Login.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit u() {
        return Unit.f40552a;
    }

    public static final Unit v(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }
}
