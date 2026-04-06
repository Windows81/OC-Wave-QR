package com.hansecom.abt.presentation.screens.auth.register;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.presentation.mvi.MviEffectKt;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import com.hansecom.abt.ui.CompositionLocalKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.util.NavControllerExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class RegisterScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.navigation.NavBackStackEntry r23, androidx.navigation.NavHostController r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function1 r30, kotlin.jvm.functions.Function1 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r15 = r23
            r14 = r24
            r13 = r25
            r12 = r26
            r11 = r27
            r10 = r33
            r9 = r34
            java.lang.String r0 = "backStackEntry"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "nestedNavigationNavController"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "onBack"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "goToHome"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "goToSignIn"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = 1902604468(0x716770b4, float:1.1460366E30)
            r1 = r32
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0037
            r1 = r10 | 6
            goto L_0x0047
        L_0x0037:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0046
            boolean r1 = r8.l(r15)
            if (r1 == 0) goto L_0x0043
            r1 = 4
            goto L_0x0044
        L_0x0043:
            r1 = 2
        L_0x0044:
            r1 = r1 | r10
            goto L_0x0047
        L_0x0046:
            r1 = r10
        L_0x0047:
            r2 = r9 & 2
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 48
            goto L_0x005e
        L_0x004e:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x005e
            boolean r2 = r8.l(r14)
            if (r2 == 0) goto L_0x005b
            r2 = 32
            goto L_0x005d
        L_0x005b:
            r2 = 16
        L_0x005d:
            r1 = r1 | r2
        L_0x005e:
            r2 = r9 & 4
            if (r2 == 0) goto L_0x0065
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0075
        L_0x0065:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0075
            boolean r2 = r8.l(r13)
            if (r2 == 0) goto L_0x0072
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0074
        L_0x0072:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0074:
            r1 = r1 | r2
        L_0x0075:
            r2 = r9 & 8
            if (r2 == 0) goto L_0x007c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008c
        L_0x007c:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x008c
            boolean r2 = r8.l(r12)
            if (r2 == 0) goto L_0x0089
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008b
        L_0x0089:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x008b:
            r1 = r1 | r2
        L_0x008c:
            r2 = r9 & 16
            if (r2 == 0) goto L_0x0093
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x0093:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a3
            boolean r2 = r8.l(r11)
            if (r2 == 0) goto L_0x00a0
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r1 = r1 | r2
        L_0x00a3:
            r2 = r9 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00ad
            r1 = r1 | r3
        L_0x00aa:
            r3 = r28
            goto L_0x00be
        L_0x00ad:
            r3 = r3 & r10
            if (r3 != 0) goto L_0x00aa
            r3 = r28
            boolean r4 = r8.l(r3)
            if (r4 == 0) goto L_0x00bb
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r4
        L_0x00be:
            r4 = r9 & 64
            r5 = 1572864(0x180000, float:2.204052E-39)
            if (r4 == 0) goto L_0x00c8
            r1 = r1 | r5
        L_0x00c5:
            r5 = r29
            goto L_0x00d9
        L_0x00c8:
            r5 = r5 & r10
            if (r5 != 0) goto L_0x00c5
            r5 = r29
            boolean r6 = r8.l(r5)
            if (r6 == 0) goto L_0x00d6
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r6
        L_0x00d9:
            r6 = r9 & 128(0x80, float:1.794E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00e3
            r1 = r1 | r7
        L_0x00e0:
            r7 = r30
            goto L_0x00f5
        L_0x00e3:
            r7 = r7 & r10
            if (r7 != 0) goto L_0x00e0
            r7 = r30
            boolean r16 = r8.l(r7)
            if (r16 == 0) goto L_0x00f1
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r1 = r1 | r16
        L_0x00f5:
            r0 = r9 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0100
            r1 = r1 | r17
            r3 = r31
            goto L_0x0113
        L_0x0100:
            r17 = r10 & r17
            r3 = r31
            if (r17 != 0) goto L_0x0113
            boolean r17 = r8.l(r3)
            if (r17 == 0) goto L_0x010f
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r1 = r1 | r17
        L_0x0113:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r1 & r17
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x0132
            boolean r3 = r8.t()
            if (r3 != 0) goto L_0x0124
            goto L_0x0132
        L_0x0124:
            r8.B()
            r6 = r28
            r9 = r31
            r22 = r8
            r8 = r7
            r7 = r29
            goto L_0x0275
        L_0x0132:
            if (r2 == 0) goto L_0x0156
            r2 = -595991377(0xffffffffdc79e4af, float:-2.81354838E17)
            r8.X(r2)
            java.lang.Object r2 = r8.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x014e
            com.hansecom.abt.presentation.screens.auth.register.g r2 = new com.hansecom.abt.presentation.screens.auth.register.g
            r2.<init>()
            r8.N(r2)
        L_0x014e:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r8.M()
            r17 = r2
            goto L_0x0158
        L_0x0156:
            r17 = r28
        L_0x0158:
            if (r4 == 0) goto L_0x017c
            r2 = -595989617(0xffffffffdc79eb8f, float:-2.81385074E17)
            r8.X(r2)
            java.lang.Object r2 = r8.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0174
            com.hansecom.abt.presentation.screens.auth.register.h r2 = new com.hansecom.abt.presentation.screens.auth.register.h
            r2.<init>()
            r8.N(r2)
        L_0x0174:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r8.M()
            r18 = r2
            goto L_0x017e
        L_0x017c:
            r18 = r29
        L_0x017e:
            if (r6 == 0) goto L_0x01a2
            r2 = -595987377(0xffffffffdc79f44f, float:-2.81423557E17)
            r8.X(r2)
            java.lang.Object r2 = r8.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x019a
            com.hansecom.abt.presentation.screens.auth.register.i r2 = new com.hansecom.abt.presentation.screens.auth.register.i
            r2.<init>()
            r8.N(r2)
        L_0x019a:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r8.M()
            r19 = r2
            goto L_0x01a4
        L_0x01a2:
            r19 = r7
        L_0x01a4:
            if (r0 == 0) goto L_0x01c8
            r0 = -595985649(0xffffffffdc79fb0f, float:-2.81453244E17)
            r8.X(r0)
            java.lang.Object r0 = r8.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x01c0
            com.hansecom.abt.presentation.screens.auth.register.j r0 = new com.hansecom.abt.presentation.screens.auth.register.j
            r0.<init>()
            r8.N(r0)
        L_0x01c0:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r8.M()
            r20 = r0
            goto L_0x01ca
        L_0x01c8:
            r20 = r31
        L_0x01ca:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01d9
            r0 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.auth.register.RegisterScreen (RegisterScreen.kt:36)"
            r3 = 1902604468(0x716770b4, float:1.1460366E30)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x01d9:
            r0 = 1890788296(0x70b323c8, float:4.435286E29)
            r8.f(r0)
            r0 = r1 & 14
            androidx.lifecycle.ViewModelProvider$Factory r3 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r15, r8, r0)
            r0 = 1729797275(0x671a9c9b, float:7.301333E23)
            r8.f(r0)
            if (r15 == 0) goto L_0x01f3
            androidx.lifecycle.viewmodel.CreationExtras r0 = r23.n()
        L_0x01f1:
            r4 = r0
            goto L_0x01f6
        L_0x01f3:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x01f1
        L_0x01f6:
            r6 = 36936(0x9048, float:5.1758E-41)
            r7 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel> r0 = com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel.class
            r2 = 0
            r16 = r1
            r1 = r23
            r5 = r8
            androidx.lifecycle.ViewModel r0 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.S()
            r8.S()
            com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel r0 = (com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel) r0
            r5 = 0
            r6 = 3
            r3 = 0
            r1 = r0
            r4 = r8
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.auth.register.Register$State r2 = m(r1)
            kotlinx.coroutines.flow.Flow r3 = r0.l()
            r0 = r16 & 126(0x7e, float:1.77E-43)
            int r1 = r16 << 6
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r1
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r1
            r0 = r0 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r4
            r0 = r0 | r1
            int r1 = r16 << 15
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r4
            r0 = r0 | r1
            int r1 = r16 << 9
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r1
            r0 = r0 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r4
            r21 = r0 | r1
            int r0 = r16 >> 21
            r16 = r0 & 126(0x7e, float:1.77E-43)
            r0 = r23
            r1 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r25
            r22 = r8
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r22
            r13 = r21
            r14 = r16
            o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x026d
            androidx.compose.runtime.ComposerKt.X()
        L_0x026d:
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
        L_0x0275:
            androidx.compose.runtime.ScopeUpdateScope r12 = r22.x()
            if (r12 == 0) goto L_0x0292
            com.hansecom.abt.presentation.screens.auth.register.k r13 = new com.hansecom.abt.presentation.screens.auth.register.k
            r0 = r13
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r10 = r33
            r11 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.RegisterScreenKt.h(androidx.navigation.NavBackStackEntry, androidx.navigation.NavHostController, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit i() {
        return Unit.f40552a;
    }

    public static final Unit j(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit k(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit l(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Register.State m(State state) {
        return (Register.State) state.getValue();
    }

    public static final Unit n(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function1 function12, Function1 function13, int i2, int i3, Composer composer, int i4) {
        h(navBackStackEntry, navHostController, function0, function02, function03, function04, function1, function12, function13, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void o(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Register.State state, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function1 function13, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer composer2;
        int i6;
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        NavHostController navHostController2 = navHostController;
        Function0 function06 = function0;
        int i7 = i2;
        Composer q2 = composer.q(-210147507);
        if ((i7 & 6) == 0) {
            i4 = (q2.l(navBackStackEntry2) ? 4 : 2) | i7;
        } else {
            i4 = i7;
        }
        if ((i7 & 48) == 0) {
            i4 |= q2.l(navHostController2) ? 32 : 16;
        }
        Flow flow2 = flow;
        if ((i7 & 3072) == 0) {
            i4 |= q2.l(flow2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i4 |= q2.l(function06) ? 16384 : 8192;
        }
        Function0 function07 = function02;
        if ((196608 & i7) == 0) {
            i4 |= q2.l(function07) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i4 |= q2.l(function03) ? 1048576 : 524288;
        } else {
            Function0 function08 = function03;
        }
        Function0 function09 = function04;
        if ((i7 & 12582912) == 0) {
            i4 |= q2.l(function09) ? 8388608 : 4194304;
        }
        Function0 function010 = function05;
        if ((i7 & 100663296) == 0) {
            i4 |= q2.l(function010) ? 67108864 : 33554432;
        }
        Function1 function14 = function1;
        if ((i7 & 805306368) == 0) {
            i4 |= q2.l(function14) ? 536870912 : 268435456;
        }
        Function1 function15 = function12;
        if ((i3 & 6) == 0) {
            i5 = i3 | (q2.l(function15) ? 4 : 2);
        } else {
            i5 = i3;
        }
        Function1 function16 = function13;
        if ((i3 & 48) == 0) {
            i5 |= q2.l(function16) ? 32 : 16;
        }
        int i8 = i5;
        if ((i4 & 306783251) == 306783250 && (i8 & 19) == 18 && q2.t()) {
            q2.B();
            composer2 = q2;
        } else {
            if (ComposerKt.P()) {
                ComposerKt.Y(-210147507, i4, i8, "com.hansecom.abt.presentation.screens.auth.register.RegisterScreenImpl (RegisterScreen.kt:69)");
            }
            String a2 = NavControllerExtKt.a(navHostController2, q2, (i4 >> 3) & 14);
            AbtSnackbarHostState abtSnackbarHostState = (AbtSnackbarHostState) q2.C(CompositionLocalKt.c());
            AutofillManager autofillManager = (AutofillManager) q2.C(CompositionLocalsKt.d());
            q2.X(-1307315609);
            int i9 = i4 & 57344;
            boolean l2 = q2.l(autofillManager) | (i9 == 16384);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new C0419l(autofillManager, function06);
                q2.N(g2);
            }
            q2.M();
            BackHandlerKt.a(false, (Function0) g2, q2, 0, 1);
            ScaffoldKt.f(SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), ComposableLambdaKt.e(-436697071, true, new RegisterScreenKt$RegisterScreenImpl$2(a2), q2, 54), (Function2) null, ComposableLambdaKt.e(-663918061, true, new RegisterScreenKt$RegisterScreenImpl$3(abtSnackbarHostState), q2, 54), (Function2) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.e(879470556, true, new RegisterScreenKt$RegisterScreenImpl$4(navBackStackEntry2, navHostController2), q2, 54), q2, 805309494, 500);
            q2.X(-1307288523);
            boolean l3 = q2.l(abtSnackbarHostState) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576) | ((234881024 & i4) == 67108864) | (i9 == 16384) | ((29360128 & i4) == 8388608) | ((i8 & 14) == 4) | ((i8 & 112) == 32) | ((1879048192 & i4) == 536870912);
            Object g3 = q2.g();
            if (l3 || g3 == Composer.f14567a.a()) {
                i6 = i4;
                composer2 = q2;
                RegisterScreenKt$RegisterScreenImpl$5$1 registerScreenKt$RegisterScreenImpl$5$1 = new RegisterScreenKt$RegisterScreenImpl$5$1(abtSnackbarHostState, function02, function03, function05, function0, function04, function12, function13, function1, (Continuation) null);
                composer2.N(registerScreenKt$RegisterScreenImpl$5$1);
                g3 = registerScreenKt$RegisterScreenImpl$5$1;
            } else {
                i6 = i4;
                composer2 = q2;
            }
            composer2.M();
            MviEffectKt.b(flow, (Lifecycle.State) null, (Object) null, (Function2) g3, composer2, (i6 >> 9) & 14, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            C0420m mVar = r0;
            C0420m mVar2 = new C0420m(navBackStackEntry, navHostController, state, flow, function0, function02, function03, function04, function05, function1, function12, function13, i2, i3);
            x2.a(mVar);
        }
    }

    public static final Unit p(AutofillManager autofillManager, Function0 function0) {
        if (autofillManager != null) {
            autofillManager.c();
        }
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit q(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Register.State state, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function1 function13, int i2, int i3, Composer composer, int i4) {
        o(navBackStackEntry, navHostController, state, flow, function0, function02, function03, function04, function05, function1, function12, function13, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }
}
