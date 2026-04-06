package com.hansecom.abt.presentation.screens.main;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import androidx.navigation.compose.DialogNavigator;
import androidx.navigation.compose.DialogNavigatorDestinationBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.hansecom.abt.presentation.screens.auth.AuthNavigationKt;
import com.hansecom.abt.presentation.screens.guest.GuestNavigationKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodsGraphKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class MainNavigationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f37558a = CompositionLocalKt.h((SnapshotMutationPolicy) null, new C0620i(), 1, (Object) null);

    public static final NavHostController f() {
        throw new IllegalStateException("CompositionLocal MainNavController not present");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(androidx.navigation.NavHostController r22, android.content.Context r23, java.lang.Object r24, java.lang.Object r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            r15 = r22
            r14 = r23
            r13 = r24
            r12 = r25
            r11 = r27
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "startDestination"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "startAuthDestination"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = -1140241578(0xffffffffbc094b56, float:-0.008379778)
            r1 = r26
            androidx.compose.runtime.Composer r10 = r1.q(r0)
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0036
            boolean r1 = r10.l(r15)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r11
            goto L_0x0037
        L_0x0036:
            r1 = r11
        L_0x0037:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0047
            boolean r2 = r10.l(r14)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0057
            boolean r2 = r10.l(r13)
            if (r2 == 0) goto L_0x0054
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r2
        L_0x0057:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0067
            boolean r2 = r10.l(r12)
            if (r2 == 0) goto L_0x0064
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0066
        L_0x0064:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0066:
            r1 = r1 | r2
        L_0x0067:
            r2 = r1 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r2 != r3) goto L_0x007b
            boolean r2 = r10.t()
            if (r2 != 0) goto L_0x0074
            goto L_0x007b
        L_0x0074:
            r10.B()
            r20 = r10
            goto L_0x011d
        L_0x007b:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0087
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.main.MainNavigation (MainNavigation.kt:61)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0087:
            com.hansecom.abt.presentation.screens.main.MainGraph r2 = com.hansecom.abt.presentation.screens.main.MainGraph.INSTANCE
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r3 = -79364184(0xfffffffffb44ffa8, float:-1.0228755E36)
            r10.X(r3)
            java.lang.Object r3 = r10.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r4.a()
            if (r3 != r5) goto L_0x00a5
            com.hansecom.abt.presentation.screens.main.j r3 = new com.hansecom.abt.presentation.screens.main.j
            r3.<init>()
            r10.N(r3)
        L_0x00a5:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r10.M()
            r5 = 1
            r6 = 0
            r7 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r7, r3, r5, r6)
            r0 = -79360415(0xfffffffffb450e61, float:-1.0231741E36)
            r10.X(r0)
            boolean r0 = r10.l(r13)
            boolean r5 = r10.l(r15)
            r0 = r0 | r5
            boolean r5 = r10.l(r12)
            r0 = r0 | r5
            boolean r5 = r10.l(r14)
            r0 = r0 | r5
            java.lang.Object r5 = r10.g()
            if (r0 != 0) goto L_0x00d6
            java.lang.Object r0 = r4.a()
            if (r5 != r0) goto L_0x00de
        L_0x00d6:
            com.hansecom.abt.presentation.screens.main.k r5 = new com.hansecom.abt.presentation.screens.main.k
            r5.<init>(r13, r15, r12, r14)
            r10.N(r5)
        L_0x00de:
            r16 = r5
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            r10.M()
            r0 = r1 & 14
            r17 = r0 | 48
            r18 = 0
            r19 = 2040(0x7f8, float:2.859E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r20 = 0
            r21 = 0
            r0 = r22
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r20
            r20 = r10
            r10 = r21
            r11 = r16
            r12 = r20
            r13 = r17
            r14 = r18
            r15 = r19
            androidx.navigation.compose.NavHostKt.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x011d
            androidx.compose.runtime.ComposerKt.X()
        L_0x011d:
            androidx.compose.runtime.ScopeUpdateScope r6 = r20.x()
            if (r6 == 0) goto L_0x0136
            com.hansecom.abt.presentation.screens.main.l r7 = new com.hansecom.abt.presentation.screens.main.l
            r0 = r7
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.MainNavigationKt.g(androidx.navigation.NavHostController, android.content.Context, java.lang.Object, java.lang.Object, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit h(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsProperties_androidKt.a(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public static final Unit i(Object obj, NavHostController navHostController, Object obj2, Context context, NavGraphBuilder navGraphBuilder) {
        NavGraphBuilder navGraphBuilder2 = navGraphBuilder;
        Intrinsics.i(navGraphBuilder2, "$this$NavHost");
        NavHostController navHostController2 = navHostController;
        Object obj3 = obj2;
        Context context2 = context;
        m mVar = new m(navHostController, obj2, context);
        Object obj4 = obj;
        NavGraphBuilderKt.a(navGraphBuilder2, obj4, Reflection.b(MainGraph.class), MapsKt.h(), CollectionsKt.m(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, mVar);
        return Unit.f40552a;
    }

    public static final Unit j(NavHostController navHostController, Object obj, Context context, NavGraphBuilder navGraphBuilder) {
        Intrinsics.i(navGraphBuilder, "$this$navigation");
        ComposableLambda c2 = ComposableLambdaKt.c(1982692610, true, new MainNavigationKt$MainNavigation$2$1$1$1(navHostController));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(HomeDestination.class), h2, c2);
        for (NavDeepLink b2 : m2) {
            composeNavigatorDestinationBuilder.b(b2);
        }
        composeNavigatorDestinationBuilder.h((Function1) null);
        composeNavigatorDestinationBuilder.i((Function1) null);
        composeNavigatorDestinationBuilder.j((Function1) null);
        composeNavigatorDestinationBuilder.k((Function1) null);
        composeNavigatorDestinationBuilder.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder);
        AuthNavigationKt.a(navGraphBuilder, navHostController, obj, context);
        Function4 a2 = ComposableSingletons$MainNavigationKt.f37526a.a();
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(WebViewDestination.class), h3, a2);
        for (NavDeepLink b3 : m3) {
            composeNavigatorDestinationBuilder2.b(b3);
        }
        composeNavigatorDestinationBuilder2.h((Function1) null);
        composeNavigatorDestinationBuilder2.i((Function1) null);
        composeNavigatorDestinationBuilder2.j((Function1) null);
        composeNavigatorDestinationBuilder2.k((Function1) null);
        composeNavigatorDestinationBuilder2.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder2);
        AddPaymentMethodsGraphKt.a(navGraphBuilder, navHostController, context);
        Function4 b4 = ComposableSingletons$MainNavigationKt.f37526a.b();
        Map h4 = MapsKt.h();
        List<NavDeepLink> m4 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder3 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(GuidedTourDestination.class), h4, b4);
        for (NavDeepLink b5 : m4) {
            composeNavigatorDestinationBuilder3.b(b5);
        }
        composeNavigatorDestinationBuilder3.h((Function1) null);
        composeNavigatorDestinationBuilder3.i((Function1) null);
        composeNavigatorDestinationBuilder3.j((Function1) null);
        composeNavigatorDestinationBuilder3.k((Function1) null);
        composeNavigatorDestinationBuilder3.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder3);
        ComposableLambda c3 = ComposableLambdaKt.c(-1874821637, true, new MainNavigationKt$MainNavigation$2$1$1$2(navHostController));
        Map h5 = MapsKt.h();
        List<NavDeepLink> m5 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder4 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(BarcodeDisplayDestination.class), h5, c3);
        for (NavDeepLink b6 : m5) {
            composeNavigatorDestinationBuilder4.b(b6);
        }
        composeNavigatorDestinationBuilder4.h((Function1) null);
        composeNavigatorDestinationBuilder4.i((Function1) null);
        composeNavigatorDestinationBuilder4.j((Function1) null);
        composeNavigatorDestinationBuilder4.k((Function1) null);
        composeNavigatorDestinationBuilder4.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder4);
        ComposableLambda c4 = ComposableLambdaKt.c(-1816839364, true, new MainNavigationKt$MainNavigation$2$1$1$3(navHostController));
        Map h6 = MapsKt.h();
        List<NavDeepLink> m6 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder5 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(BarcodeDisplayHelpDestination.class), h6, c4);
        for (NavDeepLink b7 : m6) {
            composeNavigatorDestinationBuilder5.b(b7);
        }
        composeNavigatorDestinationBuilder5.h((Function1) null);
        composeNavigatorDestinationBuilder5.i((Function1) null);
        composeNavigatorDestinationBuilder5.j((Function1) null);
        composeNavigatorDestinationBuilder5.k((Function1) null);
        composeNavigatorDestinationBuilder5.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder5);
        ComposableLambda c5 = ComposableLambdaKt.c(2005735589, true, new MainNavigationKt$MainNavigation$2$1$1$4(navHostController));
        Map h7 = MapsKt.h();
        List<NavDeepLink> m7 = CollectionsKt.m();
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.i().d(DialogNavigator.class), Reflection.b(DebugMenuDestination.class), h7, new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null), c5);
        for (NavDeepLink b8 : m7) {
            dialogNavigatorDestinationBuilder.b(b8);
        }
        navGraphBuilder.h(dialogNavigatorDestinationBuilder);
        GuestNavigationKt.a(navGraphBuilder, navHostController, context);
        return Unit.f40552a;
    }

    public static final Unit k(NavHostController navHostController, Context context, Object obj, Object obj2, int i2, Composer composer, int i3) {
        g(navHostController, context, obj, obj2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final ProvidableCompositionLocal l() {
        return f37558a;
    }
}
