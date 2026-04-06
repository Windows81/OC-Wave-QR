package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class PriorityNavigationKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.navigation.NavHostController r20, java.lang.Object r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r15 = r20
            r14 = r21
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "startDestination"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            r0 = -46426781(0xfffffffffd3b9563, float:-1.5583831E37)
            r1 = r22
            androidx.compose.runtime.Composer r13 = r1.q(r0)
            r1 = r23 & 6
            if (r1 != 0) goto L_0x0027
            boolean r1 = r13.l(r15)
            if (r1 == 0) goto L_0x0023
            r1 = 4
            goto L_0x0024
        L_0x0023:
            r1 = 2
        L_0x0024:
            r1 = r23 | r1
            goto L_0x0029
        L_0x0027:
            r1 = r23
        L_0x0029:
            r2 = r23 & 48
            if (r2 != 0) goto L_0x0039
            boolean r2 = r13.l(r14)
            if (r2 == 0) goto L_0x0036
            r2 = 32
            goto L_0x0038
        L_0x0036:
            r2 = 16
        L_0x0038:
            r1 = r1 | r2
        L_0x0039:
            r2 = r1 & 19
            r3 = 18
            if (r2 != r3) goto L_0x004d
            boolean r2 = r13.t()
            if (r2 != 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            r13.B()
            r19 = r13
            goto L_0x00d8
        L_0x004d:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0059
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.main.PriorityNavigation (PriorityNavigation.kt:29)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0059:
            com.hansecom.abt.presentation.screens.main.PriorityGraph r2 = com.hansecom.abt.presentation.screens.main.PriorityGraph.INSTANCE
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r3 = 293477683(0x117e1d33, float:2.0046065E-28)
            r13.X(r3)
            java.lang.Object r3 = r13.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r4.a()
            if (r3 != r5) goto L_0x0077
            com.hansecom.abt.presentation.screens.main.F r3 = new com.hansecom.abt.presentation.screens.main.F
            r3.<init>()
            r13.N(r3)
        L_0x0077:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r13.M()
            r5 = 1
            r6 = 0
            r7 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r7, r3, r5, r6)
            r0 = 293479173(0x117e2305, float:2.0047858E-28)
            r13.X(r0)
            boolean r0 = r13.l(r14)
            java.lang.Object r5 = r13.g()
            if (r0 != 0) goto L_0x0099
            java.lang.Object r0 = r4.a()
            if (r5 != r0) goto L_0x00a1
        L_0x0099:
            com.hansecom.abt.presentation.screens.main.G r5 = new com.hansecom.abt.presentation.screens.main.G
            r5.<init>(r14)
            r13.N(r5)
        L_0x00a1:
            r11 = r5
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r13.M()
            r0 = r1 & 14
            r16 = r0 | 48
            r17 = 0
            r18 = 2040(0x7f8, float:2.859E-42)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r0 = r20
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r13
            r19 = r13
            r13 = r16
            r14 = r17
            r15 = r18
            androidx.navigation.compose.NavHostKt.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00d8
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d8:
            androidx.compose.runtime.ScopeUpdateScope r0 = r19.x()
            if (r0 == 0) goto L_0x00ec
            com.hansecom.abt.presentation.screens.main.H r1 = new com.hansecom.abt.presentation.screens.main.H
            r2 = r20
            r3 = r21
            r4 = r23
            r1.<init>(r2, r3, r4)
            r0.a(r1)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.PriorityNavigationKt.e(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit f(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsProperties_androidKt.a(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public static final Unit g(Object obj, NavGraphBuilder navGraphBuilder) {
        Intrinsics.i(navGraphBuilder, "$this$NavHost");
        I i2 = new I();
        NavGraphBuilder navGraphBuilder2 = navGraphBuilder;
        Object obj2 = obj;
        NavGraphBuilderKt.a(navGraphBuilder2, obj2, Reflection.b(PriorityGraph.class), MapsKt.h(), CollectionsKt.m(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, i2);
        return Unit.f40552a;
    }

    public static final Unit h(NavGraphBuilder navGraphBuilder) {
        Intrinsics.i(navGraphBuilder, "$this$navigation");
        Function4 a2 = ComposableSingletons$PriorityNavigationKt.f37538a.a();
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        Class<ComposeNavigator> cls = ComposeNavigator.class;
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(LockDestination.class), h2, a2);
        for (NavDeepLink b2 : m2) {
            composeNavigatorDestinationBuilder.b(b2);
        }
        composeNavigatorDestinationBuilder.h((Function1) null);
        composeNavigatorDestinationBuilder.i((Function1) null);
        composeNavigatorDestinationBuilder.j((Function1) null);
        composeNavigatorDestinationBuilder.k((Function1) null);
        composeNavigatorDestinationBuilder.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder);
        Function4 b3 = ComposableSingletons$PriorityNavigationKt.f37538a.b();
        Map h3 = MapsKt.h();
        List<NavDeepLink> m3 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder2 = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(cls), Reflection.b(HardUpdateDestination.class), h3, b3);
        for (NavDeepLink b4 : m3) {
            composeNavigatorDestinationBuilder2.b(b4);
        }
        composeNavigatorDestinationBuilder2.h((Function1) null);
        composeNavigatorDestinationBuilder2.i((Function1) null);
        composeNavigatorDestinationBuilder2.j((Function1) null);
        composeNavigatorDestinationBuilder2.k((Function1) null);
        composeNavigatorDestinationBuilder2.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder2);
        return Unit.f40552a;
    }

    public static final Unit i(NavHostController navHostController, Object obj, int i2, Composer composer, int i3) {
        e(navHostController, obj, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
