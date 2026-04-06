package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.serialization.RouteSerializerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class CardOptionsNavigationKt$cardOptionsNavigation$14 implements Function3<NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36540z;

    public CardOptionsNavigationKt$cardOptionsNavigation$14(NavHostController navHostController) {
        this.f36540z = navHostController;
    }

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

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.navigation.NavBackStackEntry r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0014
            r9 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:356)"
            r1 = -1178150452(0xffffffffb9c6d9cc, float:-3.7927774E-4)
            androidx.compose.runtime.ComposerKt.Y(r1, r11, r9, r0)
        L_0x0014:
            androidx.compose.runtime.ProvidableCompositionLocal r9 = com.hansecom.abt.presentation.screens.home.HomeNavigationKt.f()
            java.lang.Object r9 = r10.C(r9)
            androidx.navigation.NavHostController r9 = (androidx.navigation.NavHostController) r9
            r11 = 188558643(0xb3d2d33, float:3.643408E-32)
            r10.X(r11)
            androidx.navigation.NavHostController r11 = r8.f36540z
            boolean r11 = r10.l(r11)
            androidx.navigation.NavHostController r0 = r8.f36540z
            java.lang.Object r1 = r10.g()
            if (r11 != 0) goto L_0x003a
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r1 != r11) goto L_0x0042
        L_0x003a:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.q r1 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.q
            r1.<init>(r0)
            r10.N(r1)
        L_0x0042:
            r3 = r1
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r10.M()
            r11 = 188560575(0xb3d34bf, float:3.6439758E-32)
            r10.X(r11)
            boolean r11 = r10.l(r9)
            java.lang.Object r0 = r10.g()
            if (r11 != 0) goto L_0x0060
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0068
        L_0x0060:
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.r r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.r
            r0.<init>(r9)
            r10.N(r0)
        L_0x0068:
            r4 = r0
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r10.M()
            r6 = 0
            r7 = 1
            r2 = 0
            r5 = r10
            com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardDialogKt.i(r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x007e
            androidx.compose.runtime.ComposerKt.X()
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsNavigationKt$cardOptionsNavigation$14.e(androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}
