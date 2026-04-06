package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.screens.home.account.AccountNavigationKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodsGraphKt;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaNavigationKt;
import com.hansecom.abt.presentation.screens.home.more.MoreNavigationKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class HomeNavigationKt$HomeNavigation$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MainActivity f34974A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34975z;

    public HomeNavigationKt$HomeNavigation$1(NavHostController navHostController, MainActivity mainActivity) {
        this.f34975z = navHostController;
        this.f34974A = mainActivity;
    }

    public static final Unit e(NavHostController navHostController, MainActivity mainActivity, NavGraphBuilder navGraphBuilder) {
        Intrinsics.i(navGraphBuilder, "$this$NavHost");
        FareMediaNavigationKt.a(navGraphBuilder, navHostController, mainActivity);
        String string = mainActivity.getString(R.string.ka);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(1168649321, true, new HomeNavigationKt$HomeNavigation$1$1$1$1(navHostController, mainActivity));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(ComposeNavigator.class), Reflection.b(TripPlannerDestination.class), h2, c2);
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
        AccountNavigationKt.a(navGraphBuilder, navHostController, mainActivity);
        MoreNavigationKt.a(navGraphBuilder, navHostController, mainActivity);
        AddPaymentMethodsGraphKt.a(navGraphBuilder, navHostController, mainActivity);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r13 = r18
            r1 = r19
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0016
            boolean r2 = r18.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            r18.B()
            goto L_0x0078
        L_0x0016:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.HomeNavigation.<anonymous> (HomeNavigation.kt:36)"
            r4 = -582241305(0xffffffffdd4bb3e7, float:-9.173956E17)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0025:
            androidx.navigation.NavHostController r1 = r0.f34975z
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaGraph r2 = com.hansecom.abt.presentation.screens.home.faremedia.FareMediaGraph.INSTANCE
            r3 = 685963015(0x28e2f707, float:2.5198171E-14)
            r13.X(r3)
            androidx.navigation.NavHostController r3 = r0.f34975z
            boolean r3 = r13.l(r3)
            com.hansecom.abt.presentation.main.MainActivity r4 = r0.f34974A
            boolean r4 = r13.l(r4)
            r3 = r3 | r4
            androidx.navigation.NavHostController r4 = r0.f34975z
            com.hansecom.abt.presentation.main.MainActivity r5 = r0.f34974A
            java.lang.Object r6 = r18.g()
            if (r3 != 0) goto L_0x004e
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0056
        L_0x004e:
            com.hansecom.abt.presentation.screens.home.c r6 = new com.hansecom.abt.presentation.screens.home.c
            r6.<init>(r4, r5)
            r13.N(r6)
        L_0x0056:
            r12 = r6
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r18.M()
            r15 = 0
            r16 = 2044(0x7fc, float:2.864E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 48
            r13 = r18
            androidx.navigation.compose.NavHostKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0078
            androidx.compose.runtime.ComposerKt.X()
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeNavigationKt$HomeNavigation$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
