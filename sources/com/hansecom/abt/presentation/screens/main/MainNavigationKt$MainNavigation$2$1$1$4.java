package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.AppInfoKt;
import com.hansecom.abt.presentation.navigation.AppFeatureGuardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MainNavigationKt$MainNavigation$2$1$1$4 implements Function3<NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f37563z;

    public MainNavigationKt$MainNavigation$2$1$1$4(NavHostController navHostController) {
        this.f37563z = navHostController;
    }

    public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        Intrinsics.i(navBackStackEntry, "it");
        if (ComposerKt.P()) {
            ComposerKt.Y(2005735589, i2, -1, "com.hansecom.abt.presentation.screens.main.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainNavigation.kt:125)");
        }
        NavHostController navHostController = this.f37563z;
        boolean b2 = ((AppInfo) composer.C(AppInfoKt.c())).b();
        final NavHostController navHostController2 = this.f37563z;
        AppFeatureGuardKt.b(navHostController, b2, (String) null, ComposableLambdaKt.e(1683790243, true, new Function2<Composer, Integer, Unit>() {
            /* access modifiers changed from: private */
            public static final Unit e(NavHostController navHostController) {
                navHostController.c0();
                return Unit.f40552a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
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
                    goto L_0x005a
                L_0x0010:
                    boolean r0 = androidx.compose.runtime.ComposerKt.P()
                    if (r0 == 0) goto L_0x001f
                    r0 = -1
                    java.lang.String r1 = "com.hansecom.abt.presentation.screens.main.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainNavigation.kt:126)"
                    r2 = 1683790243(0x645c99a3, float:1.6277418E22)
                    androidx.compose.runtime.ComposerKt.Y(r2, r10, r0, r1)
                L_0x001f:
                    r10 = -979247740(0xffffffffc5a1dd84, float:-5179.6895)
                    r9.X(r10)
                    androidx.navigation.NavHostController r10 = r12
                    boolean r10 = r9.l(r10)
                    androidx.navigation.NavHostController r0 = r12
                    java.lang.Object r1 = r9.g()
                    if (r10 != 0) goto L_0x003b
                    androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
                    java.lang.Object r10 = r10.a()
                    if (r1 != r10) goto L_0x0043
                L_0x003b:
                    com.hansecom.abt.presentation.screens.main.p r1 = new com.hansecom.abt.presentation.screens.main.p
                    r1.<init>(r0)
                    r9.N(r1)
                L_0x0043:
                    r2 = r1
                    kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                    r9.M()
                    r6 = 0
                    r7 = 6
                    r3 = 0
                    r4 = 0
                    r5 = r9
                    com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuDialogKt.d(r2, r3, r4, r5, r6, r7)
                    boolean r9 = androidx.compose.runtime.ComposerKt.P()
                    if (r9 == 0) goto L_0x005a
                    androidx.compose.runtime.ComposerKt.X()
                L_0x005a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.MainNavigationKt$MainNavigation$2$1$1$4.AnonymousClass1.c(androidx.compose.runtime.Composer, int):void");
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

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
