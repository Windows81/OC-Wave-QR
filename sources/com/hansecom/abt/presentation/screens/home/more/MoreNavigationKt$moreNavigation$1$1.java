package com.hansecom.abt.presentation.screens.home.more;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestDestination;
import com.hansecom.abt.presentation.screens.main.DebugMenuDestination;
import com.hansecom.abt.presentation.screens.main.GuidedTourDestination;
import com.hansecom.abt.presentation.screens.main.WebViewDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MoreNavigationKt$moreNavigation$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37431z;

    public MoreNavigationKt$moreNavigation$1$1(NavHostController navHostController) {
        this.f37431z = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit i(NavHostController navHostController) {
        NavController.Y(navHostController, GuidedTourDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit k(NavHostController navHostController) {
        NavController.Y(navHostController, new HelpRequestDestination(false, false, false, true, 7, (DefaultConstructorMarker) null), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit p(NavHostController navHostController, String str, String str2) {
        Intrinsics.i(str, "url");
        NavController.Y(navHostController, new WebViewDestination(str, str2), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit q(MainActivity mainActivity, String str) {
        Intrinsics.i(str, "url");
        if (mainActivity != null) {
            mainActivity.B0(str);
        }
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit s(NavHostController navHostController) {
        NavController.Y(navHostController, DebugMenuDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.compose.animation.AnimatedContentScope r12, androidx.navigation.NavBackStackEntry r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$composable"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r12 = "it"
            kotlin.jvm.internal.Intrinsics.i(r13, r12)
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0019
            r12 = -1
            java.lang.String r13 = "com.hansecom.abt.presentation.screens.home.more.moreNavigation.<anonymous>.<anonymous> (MoreNavigation.kt:32)"
            r0 = 1235422206(0x49a30bfe, float:1335679.8)
            androidx.compose.runtime.ComposerKt.Y(r0, r15, r12, r13)
        L_0x0019:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = com.hansecom.abt.presentation.screens.main.MainNavigationKt.l()
            java.lang.Object r12 = r14.C(r12)
            androidx.navigation.NavHostController r12 = (androidx.navigation.NavHostController) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.activity.compose.LocalActivityKt.a()
            java.lang.Object r13 = r14.C(r13)
            boolean r15 = r13 instanceof com.hansecom.abt.presentation.main.MainActivity
            if (r15 == 0) goto L_0x0032
            com.hansecom.abt.presentation.main.MainActivity r13 = (com.hansecom.abt.presentation.main.MainActivity) r13
            goto L_0x0033
        L_0x0032:
            r13 = 0
        L_0x0033:
            java.lang.String r15 = "MoreScreen"
            r0 = 6
            com.hansecom.abt.util.LaunchTracingKt.c(r15, r14, r0)
            r15 = 384629379(0x16ecfa83, float:3.8285951E-25)
            r14.X(r15)
            boolean r15 = r14.l(r12)
            java.lang.Object r0 = r14.g()
            if (r15 != 0) goto L_0x0051
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r15.a()
            if (r0 != r15) goto L_0x0059
        L_0x0051:
            com.hansecom.abt.presentation.screens.home.more.h r0 = new com.hansecom.abt.presentation.screens.home.more.h
            r0.<init>(r12)
            r14.N(r0)
        L_0x0059:
            r1 = r0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r14.M()
            r15 = 384633331(0x16ed09f3, float:3.8295694E-25)
            r14.X(r15)
            androidx.navigation.NavHostController r15 = r11.f37431z
            boolean r15 = r14.l(r15)
            androidx.navigation.NavHostController r0 = r11.f37431z
            java.lang.Object r2 = r14.g()
            if (r15 != 0) goto L_0x007b
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r15.a()
            if (r2 != r15) goto L_0x0083
        L_0x007b:
            com.hansecom.abt.presentation.screens.home.more.i r2 = new com.hansecom.abt.presentation.screens.home.more.i
            r2.<init>(r0)
            r14.N(r2)
        L_0x0083:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r14.M()
            r15 = 384637754(0x16ed1b3a, float:3.8306597E-25)
            r14.X(r15)
            boolean r15 = r14.l(r12)
            java.lang.Object r0 = r14.g()
            if (r15 != 0) goto L_0x00a0
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r15.a()
            if (r0 != r15) goto L_0x00a8
        L_0x00a0:
            com.hansecom.abt.presentation.screens.home.more.j r0 = new com.hansecom.abt.presentation.screens.home.more.j
            r0.<init>(r12)
            r14.N(r0)
        L_0x00a8:
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r14.M()
            r15 = 384642359(0x16ed2d37, float:3.831795E-25)
            r14.X(r15)
            boolean r15 = r14.l(r13)
            java.lang.Object r0 = r14.g()
            if (r15 != 0) goto L_0x00c6
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r15.a()
            if (r0 != r15) goto L_0x00ce
        L_0x00c6:
            com.hansecom.abt.presentation.screens.home.more.k r0 = new com.hansecom.abt.presentation.screens.home.more.k
            r0.<init>(r13)
            r14.N(r0)
        L_0x00ce:
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r14.M()
            r13 = 384645858(0x16ed3ae2, float:3.8326575E-25)
            r14.X(r13)
            boolean r13 = r14.l(r12)
            java.lang.Object r15 = r14.g()
            if (r13 != 0) goto L_0x00ec
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r15 != r13) goto L_0x00f4
        L_0x00ec:
            com.hansecom.abt.presentation.screens.home.more.l r15 = new com.hansecom.abt.presentation.screens.home.more.l
            r15.<init>(r12)
            r14.N(r15)
        L_0x00f4:
            r5 = r15
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r14.M()
            r9 = 0
            r10 = 96
            r6 = 0
            r7 = 0
            r8 = r14
            com.hansecom.abt.presentation.screens.home.more.MoreScreenKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x010c
            androidx.compose.runtime.ComposerKt.X()
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.MoreNavigationKt$moreNavigation$1$1.h(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        h((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
