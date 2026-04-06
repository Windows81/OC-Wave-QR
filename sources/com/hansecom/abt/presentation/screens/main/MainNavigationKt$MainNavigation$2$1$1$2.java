package com.hansecom.abt.presentation.screens.main;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MainNavigationKt$MainNavigation$2$1$1$2 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37560z;

    public MainNavigationKt$MainNavigation$2$1$1$2(NavHostController navHostController) {
        this.f37560z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1874821637, i2, -1, "com.hansecom.abt.presentation.screens.main.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainNavigation.kt:104)");
        }
        NavHostController navHostController = this.f37560z;
        boolean s2 = ((AppFeatures) composer.C(AppFeaturesKt.c())).s();
        final NavHostController navHostController2 = this.f37560z;
        AppFeatureGuardKt.b(navHostController, s2, (String) null, ComposableLambdaKt.e(-1926869443, true, new Function2<Composer, Integer, Unit>() {
            /* access modifiers changed from: private */
            public static final Unit e(NavHostController navHostController) {
                NavController.Y(navHostController, BarcodeDisplayHelpDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.f40552a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(androidx.compose.runtime.Composer r9, int r10) {
                /*
                    r8 = this;
                    r0 = r10 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0010
                    boolean r0 = r9.t()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0010
                L_0x000c:
                    r9.B()
                    goto L_0x0064
                L_0x0010:
                    boolean r0 = androidx.compose.runtime.ComposerKt.P()
                    if (r0 == 0) goto L_0x001f
                    r0 = -1
                    java.lang.String r1 = "com.hansecom.abt.presentation.screens.main.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainNavigation.kt:105)"
                    r2 = -1926869443(0xffffffff8d264e3d, float:-5.1246875E-31)
                    androidx.compose.runtime.ComposerKt.Y(r2, r10, r0, r1)
                L_0x001f:
                    java.lang.String r10 = "BarcodeDisplayScreen"
                    r0 = 6
                    com.hansecom.abt.util.LaunchTracingKt.c(r10, r9, r0)
                    r10 = -979273903(0xffffffffc5a17751, float:-5166.9146)
                    r9.X(r10)
                    androidx.navigation.NavHostController r10 = r10
                    boolean r10 = r9.l(r10)
                    androidx.navigation.NavHostController r0 = r10
                    java.lang.Object r1 = r9.g()
                    if (r10 != 0) goto L_0x0041
                    androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r10 = r10.a()
                    if (r1 != r10) goto L_0x0049
                L_0x0041:
                    com.hansecom.abt.presentation.screens.main.o r1 = new com.hansecom.abt.presentation.screens.main.o
                    r1.<init>(r0)
                    r9.N(r1)
                L_0x0049:
                    r3 = r1
                    kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                    r9.M()
                    r10 = 0
                    kotlin.jvm.functions.Function0 r4 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r9, r10)
                    r6 = 0
                    r7 = 1
                    r2 = 0
                    r5 = r9
                    com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt.f(r2, r3, r4, r5, r6, r7)
                    boolean r9 = androidx.compose.runtime.ComposerKt.P()
                    if (r9 == 0) goto L_0x0064
                    androidx.compose.runtime.ComposerKt.X()
                L_0x0064:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.MainNavigationKt$MainNavigation$2$1$1$2.AnonymousClass1.c(androidx.compose.runtime.Composer, int):void");
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                c((Composer) obj, ((Number) obj2).intValue());
                return Unit.f40552a;
            }
        }, composer, 54), composer, 3072, 4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
