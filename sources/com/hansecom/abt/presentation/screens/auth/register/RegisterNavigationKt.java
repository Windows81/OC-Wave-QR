package com.hansecom.abt.presentation.screens.auth.register;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.auth.register.RegistrationStep;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class RegisterNavigationKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.navigation.NavBackStackEntry r21, androidx.navigation.NavHostController r22, android.content.Context r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r0 = r21
            r15 = r22
            r14 = r23
            r13 = r25
            java.lang.String r1 = "parentEntry"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.String r1 = "navController"
            kotlin.jvm.internal.Intrinsics.i(r15, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.i(r14, r1)
            r1 = -925387648(0xffffffffc8d7b480, float:-441764.0)
            r2 = r24
            androidx.compose.runtime.Composer r12 = r2.q(r1)
            r2 = r13 & 6
            if (r2 != 0) goto L_0x002f
            boolean r2 = r12.l(r0)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r13
            goto L_0x0030
        L_0x002f:
            r2 = r13
        L_0x0030:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0040
            boolean r3 = r12.l(r15)
            if (r3 == 0) goto L_0x003d
            r3 = 32
            goto L_0x003f
        L_0x003d:
            r3 = 16
        L_0x003f:
            r2 = r2 | r3
        L_0x0040:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0050
            boolean r3 = r12.l(r14)
            if (r3 == 0) goto L_0x004d
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004f
        L_0x004d:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004f:
            r2 = r2 | r3
        L_0x0050:
            r3 = r2 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0064
            boolean r3 = r12.t()
            if (r3 != 0) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r12.B()
            r20 = r12
            goto L_0x00dc
        L_0x0064:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0070
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.auth.register.RegisterNavigation (RegisterNavigation.kt:36)"
            androidx.compose.runtime.ComposerKt.Y(r1, r2, r3, r4)
        L_0x0070:
            com.hansecom.abt.presentation.screens.auth.register.Registration r3 = com.hansecom.abt.presentation.screens.auth.register.Registration.INSTANCE
            r1 = -314435255(0xffffffffed421949, float:-3.7544162E27)
            r12.X(r1)
            boolean r1 = r12.l(r14)
            boolean r4 = r12.l(r0)
            r1 = r1 | r4
            boolean r4 = r12.l(r15)
            r1 = r1 | r4
            java.lang.Object r4 = r12.g()
            if (r1 != 0) goto L_0x0094
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x009c
        L_0x0094:
            com.hansecom.abt.presentation.screens.auth.register.a r4 = new com.hansecom.abt.presentation.screens.auth.register.a
            r4.<init>(r14, r0, r15)
            r12.N(r4)
        L_0x009c:
            r16 = r4
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            r12.M()
            int r1 = r2 >> 3
            r1 = r1 & 14
            r17 = r1 | 48
            r18 = 0
            r19 = 2044(0x7fc, float:2.864E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r20 = 0
            r1 = r22
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r20
            r20 = r12
            r12 = r16
            r13 = r20
            r14 = r17
            r15 = r18
            r16 = r19
            androidx.navigation.compose.NavHostKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00dc
            androidx.compose.runtime.ComposerKt.X()
        L_0x00dc:
            androidx.compose.runtime.ScopeUpdateScope r1 = r20.x()
            if (r1 == 0) goto L_0x00f0
            com.hansecom.abt.presentation.screens.auth.register.b r2 = new com.hansecom.abt.presentation.screens.auth.register.b
            r3 = r22
            r4 = r23
            r5 = r25
            r2.<init>(r0, r3, r4, r5)
            r1.a(r2)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.RegisterNavigationKt.d(androidx.navigation.NavBackStackEntry, androidx.navigation.NavHostController, android.content.Context, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit e(Context context, NavBackStackEntry navBackStackEntry, NavHostController navHostController, NavGraphBuilder navGraphBuilder) {
        Intrinsics.i(navGraphBuilder, "$this$NavHost");
        RegistrationStep.UserInfo userInfo = RegistrationStep.UserInfo.INSTANCE;
        C0410c cVar = new C0410c(context, navBackStackEntry, navHostController);
        NavGraphBuilder navGraphBuilder2 = navGraphBuilder;
        NavGraphBuilderKt.a(navGraphBuilder2, userInfo, Reflection.b(Registration.class), MapsKt.h(), CollectionsKt.m(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, cVar);
        return Unit.f40552a;
    }

    public static final Unit f(Context context, NavBackStackEntry navBackStackEntry, NavHostController navHostController, NavGraphBuilder navGraphBuilder) {
        Intrinsics.i(navGraphBuilder, "$this$navigation");
        String string = context.getString(R.string.k9);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(-1964262541, true, new RegisterNavigationKt$RegisterNavigation$1$1$1$1(navBackStackEntry));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(RegistrationStep.UserInfo.class), h2, c2);
        composeNavigatorDestinationBuilder.e(string);
        for (NavDeepLink b2 : m2) {
            composeNavigatorDestinationBuilder.b(b2);
        }
        composeNavigatorDestinationBuilder.h((Function1) null);
        composeNavigatorDestinationBuilder.i((Function1) null);
        composeNavigatorDestinationBuilder.j((Function1) null);
        composeNavigatorDestinationBuilder.k((Function1) null);
        composeNavigatorDestinationBuilder.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder);
        String string2 = context.getString(R.string.x8);
        Intrinsics.h(string2, "getString(...)");
        ComposableLambda c3 = ComposableLambdaKt.c(-1589618980, true, new RegisterNavigationKt$RegisterNavigation$1$1$1$2(navBackStackEntry, navHostController));
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(RegistrationStep.Questions.class), h3, c3);
        composeNavigatorDestinationBuilder2.e(string2);
        for (NavDeepLink b3 : m3) {
            composeNavigatorDestinationBuilder2.b(b3);
        }
        composeNavigatorDestinationBuilder2.h((Function1) null);
        composeNavigatorDestinationBuilder2.i((Function1) null);
        composeNavigatorDestinationBuilder2.j((Function1) null);
        composeNavigatorDestinationBuilder2.k((Function1) null);
        composeNavigatorDestinationBuilder2.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder2);
        String string3 = context.getString(R.string.h8);
        Intrinsics.h(string3, "getString(...)");
        ComposableLambda c4 = ComposableLambdaKt.c(-1932502789, true, new RegisterNavigationKt$RegisterNavigation$1$1$1$3(navBackStackEntry));
        Map h4 = MapsKt.h();
        List<NavDeepLink> m4 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder3 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(RegistrationStep.ChooseQuestion.class), h4, c4);
        composeNavigatorDestinationBuilder3.e(string3);
        for (NavDeepLink b4 : m4) {
            composeNavigatorDestinationBuilder3.b(b4);
        }
        composeNavigatorDestinationBuilder3.h((Function1) null);
        composeNavigatorDestinationBuilder3.i((Function1) null);
        composeNavigatorDestinationBuilder3.j((Function1) null);
        composeNavigatorDestinationBuilder3.k((Function1) null);
        composeNavigatorDestinationBuilder3.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder3);
        return Unit.f40552a;
    }

    public static final Unit g(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Context context, int i2, Composer composer, int i3) {
        d(navBackStackEntry, navHostController, context, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
