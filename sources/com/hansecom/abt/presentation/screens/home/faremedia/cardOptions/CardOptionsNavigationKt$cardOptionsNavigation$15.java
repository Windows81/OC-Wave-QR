package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.serialization.RouteSerializerKt;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.AppFeaturesKt;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class CardOptionsNavigationKt$cardOptionsNavigation$15 implements Function3<NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36541z;

    public CardOptionsNavigationKt$cardOptionsNavigation$15(NavHostController navHostController) {
        this.f36541z = navHostController;
    }

    public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(-1702452157, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:366)");
        }
        NavHostController navHostController = this.f36541z;
        boolean B2 = ((AppFeatures) composer.C(AppFeaturesKt.c())).B();
        final NavHostController navHostController2 = this.f36541z;
        AppFeatureGuardKt.b(navHostController, B2, (String) null, ComposableLambdaKt.e(-685444287, true, new Function2<Composer, Integer, Unit>() {
            /* access modifiers changed from: private */
            public static final Unit f(NavHostController navHostController) {
                navHostController.c0();
                return Unit.f40552a;
            }

            /* access modifiers changed from: private */
            public static final Unit g(NavHostController navHostController) {
                if (navHostController != null) {
                    int g2 = RouteSerializerKt.g(FareMediaDestination.Companion.serializer());
                    if (NavController.z(navHostController, navHostController.K(), g2, true, (NavDestination) null, 4, (Object) null) != null) {
                        navHostController.e0(g2, false, false);
                    } else {
                        throw new IllegalArgumentException(("Destination with route " + Reflection.b(FareMediaDestination.class).e() + " cannot be found in navigation graph " + navHostController.K()).toString());
                    }
                }
                return Unit.f40552a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function0} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void e(androidx.compose.runtime.Composer r10, int r11) {
                /*
                    r9 = this;
                    r0 = r11 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r10.t()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r10.B()
                    goto L_0x008a
                L_0x0011:
                    boolean r0 = androidx.compose.runtime.ComposerKt.P()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous>.<anonymous> (CardOptionsNavigation.kt:367)"
                    r2 = -685444287(0xffffffffd724f341, float:-1.81364675E14)
                    androidx.compose.runtime.ComposerKt.Y(r2, r11, r0, r1)
                L_0x0020:
                    androidx.compose.runtime.ProvidableCompositionLocal r11 = com.hansecom.abt.presentation.screens.home.HomeNavigationKt.f()
                    java.lang.Object r11 = r10.C(r11)
                    androidx.navigation.NavHostController r11 = (androidx.navigation.NavHostController) r11
                    r0 = 2121647474(0x7e75c572, float:8.1671513E37)
                    r10.X(r0)
                    androidx.navigation.NavHostController r0 = r12
                    boolean r0 = r10.l(r0)
                    androidx.navigation.NavHostController r1 = r12
                    java.lang.Object r2 = r10.g()
                    if (r0 != 0) goto L_0x0046
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r0 = r0.a()
                    if (r2 != r0) goto L_0x004e
                L_0x0046:
                    com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.s r2 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.s
                    r2.<init>(r1)
                    r10.N(r2)
                L_0x004e:
                    r4 = r2
                    kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                    r10.M()
                    r0 = 2121649542(0x7e75cd86, float:8.1682E37)
                    r10.X(r0)
                    boolean r0 = r10.l(r11)
                    java.lang.Object r1 = r10.g()
                    if (r0 != 0) goto L_0x006c
                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r0 = r0.a()
                    if (r1 != r0) goto L_0x0074
                L_0x006c:
                    com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.t r1 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.t
                    r1.<init>(r11)
                    r10.N(r1)
                L_0x0074:
                    r5 = r1
                    kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                    r10.M()
                    r7 = 0
                    r8 = 1
                    r3 = 0
                    r6 = r10
                    com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardDialogKt.e(r3, r4, r5, r6, r7, r8)
                    boolean r10 = androidx.compose.runtime.ComposerKt.P()
                    if (r10 == 0) goto L_0x008a
                    androidx.compose.runtime.ComposerKt.X()
                L_0x008a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsNavigationKt$cardOptionsNavigation$15.AnonymousClass1.e(androidx.compose.runtime.Composer, int):void");
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                e((Composer) obj, ((Number) obj2).intValue());
                return Unit.f40552a;
            }
        }, composer, 54), composer, 3072, 4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
