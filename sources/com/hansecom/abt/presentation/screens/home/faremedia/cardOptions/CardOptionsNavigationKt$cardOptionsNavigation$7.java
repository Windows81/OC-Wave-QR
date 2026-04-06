package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

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
public final class CardOptionsNavigationKt$cardOptionsNavigation$7 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f36552z;

    public CardOptionsNavigationKt$cardOptionsNavigation$7(NavHostController navHostController) {
        this.f36552z = navHostController;
    }

    public final void b(AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(animatedContentScope, "$this$composable");
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(558783461, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous> (CardOptionsNavigation.kt:254)");
        }
        NavHostController navHostController = this.f36552z;
        boolean e2 = ((AppFeatures) composer.C(AppFeaturesKt.c())).e();
        final NavHostController navHostController2 = this.f36552z;
        AppFeatureGuardKt.b(navHostController, e2, (String) null, ComposableLambdaKt.e(-1083947353, true, new Function2<Composer, Integer, Unit>() {
            public static final Unit e(NavHostController navHostController, String str, int i2) {
                NavController.Y(navHostController, new CardOptionsAddInstitutionDestination(str, i2), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.f40552a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function1} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(androidx.compose.runtime.Composer r10, int r11) {
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
                    goto L_0x00e6
                L_0x0011:
                    boolean r0 = androidx.compose.runtime.ComposerKt.P()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.cardOptionsNavigation.<anonymous>.<anonymous> (CardOptionsNavigation.kt:255)"
                    r2 = -1083947353(0xffffffffbf6446a7, float:-0.89170307)
                    androidx.compose.runtime.ComposerKt.Y(r2, r11, r0, r1)
                L_0x0020:
                    r11 = 2121517345(0x7e73c921, float:8.101168E37)
                    r10.X(r11)
                    androidx.navigation.NavBackStackEntry r11 = r11
                    boolean r11 = r10.W(r11)
                    androidx.navigation.NavBackStackEntry r0 = r11
                    java.lang.Object r1 = r10.g()
                    if (r11 != 0) goto L_0x003c
                    androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r11 = r11.a()
                    if (r1 != r11) goto L_0x0097
                L_0x003c:
                    android.os.Bundle r11 = r0.e()
                    if (r11 != 0) goto L_0x0047
                    android.os.Bundle r11 = new android.os.Bundle
                    r11.<init>()
                L_0x0047:
                    androidx.navigation.NavDestination r0 = r0.g()
                    java.util.Map r0 = r0.o()
                    java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                    int r2 = r0.size()
                    int r2 = kotlin.collections.MapsKt.e(r2)
                    r1.<init>(r2)
                    java.util.Set r0 = r0.entrySet()
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x0066:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x0084
                    java.lang.Object r2 = r0.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    java.lang.Object r3 = r2.getKey()
                    java.lang.Object r2 = r2.getValue()
                    androidx.navigation.NavArgument r2 = (androidx.navigation.NavArgument) r2
                    androidx.navigation.NavType r2 = r2.a()
                    r1.put(r3, r2)
                    goto L_0x0066
                L_0x0084:
                    com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsSearchInstitutionsDestination$Companion r0 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsSearchInstitutionsDestination.Companion
                    kotlinx.serialization.KSerializer r0 = r0.serializer()
                    java.lang.Object r11 = androidx.navigation.serialization.RouteDeserializerKt.a(r0, r11, r1)
                    com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsSearchInstitutionsDestination r11 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsSearchInstitutionsDestination) r11
                    java.lang.String r1 = r11.a()
                    r10.N(r1)
                L_0x0097:
                    java.lang.String r1 = (java.lang.String) r1
                    r10.M()
                    java.lang.String r11 = "InstitutionsSearchScreen"
                    r0 = 6
                    com.hansecom.abt.util.LaunchTracingKt.c(r11, r10, r0)
                    r11 = 2121525091(0x7e73e763, float:8.105096E37)
                    r10.X(r11)
                    androidx.navigation.NavHostController r11 = r13
                    boolean r11 = r10.l(r11)
                    boolean r0 = r10.W(r1)
                    r11 = r11 | r0
                    androidx.navigation.NavHostController r0 = r13
                    java.lang.Object r2 = r10.g()
                    if (r11 != 0) goto L_0x00c3
                    androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r11 = r11.a()
                    if (r2 != r11) goto L_0x00cb
                L_0x00c3:
                    com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.G r2 = new com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.G
                    r2.<init>(r0, r1)
                    r10.N(r2)
                L_0x00cb:
                    r4 = r2
                    kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                    r10.M()
                    r11 = 0
                    kotlin.jvm.functions.Function0 r5 = com.hansecom.abt.util.CallDeviceOnBackButtonKt.b(r10, r11)
                    r7 = 0
                    r8 = 1
                    r3 = 0
                    r6 = r10
                    com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchScreenKt.c(r3, r4, r5, r6, r7, r8)
                    boolean r10 = androidx.compose.runtime.ComposerKt.P()
                    if (r10 == 0) goto L_0x00e6
                    androidx.compose.runtime.ComposerKt.X()
                L_0x00e6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsNavigationKt$cardOptionsNavigation$7.AnonymousClass1.c(androidx.compose.runtime.Composer, int):void");
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
