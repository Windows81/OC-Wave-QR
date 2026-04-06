package com.hansecom.abt.presentation.screens.home;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.PopUpToBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HomeScreenKt$HomeBottomBar$4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f34979A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f34980B;
    public final /* synthetic */ NavHostController C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function0 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f34981z;

    public HomeScreenKt$HomeBottomBar$4(List list, List list2, MutableIntState mutableIntState, NavHostController navHostController, boolean z2, boolean z3, Function0 function0) {
        this.f34981z = list;
        this.f34979A = list2;
        this.f34980B = mutableIntState;
        this.C = navHostController;
        this.D = z2;
        this.E = z3;
        this.F = function0;
    }

    public static final Unit h(List list, NavHostController navHostController, MutableIntState mutableIntState, int i2) {
        Object f2 = ((HomeBottomBarItems) list.get(i2)).f();
        if (HomeScreenKt.s(mutableIntState) == i2) {
            navHostController.W(f2, new t(f2));
        } else {
            HomeScreenKt.t(mutableIntState, i2);
            navHostController.W(f2, new u(navHostController));
        }
        return Unit.f40552a;
    }

    public static final Unit i(Object obj, NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        NavOptionsBuilder.f(navOptionsBuilder, obj, (Function1) null, 2, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit k(NavHostController navHostController, NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.i(navOptionsBuilder, "$this$navigate");
        navOptionsBuilder.c(NavGraph.P.b(navHostController.K()).q(), new v());
        navOptionsBuilder.g(true);
        navOptionsBuilder.k(true);
        return Unit.f40552a;
    }

    public static final Unit p(PopUpToBuilder popUpToBuilder) {
        Intrinsics.i(popUpToBuilder, "$this$popUpTo");
        popUpToBuilder.c(true);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        g((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.animation.AnimatedVisibilityScope r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "$this$AnimatedVisibility"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0014
            r11 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.HomeBottomBar.<anonymous> (HomeScreen.kt:217)"
            r1 = -413533471(0xffffffffe759fae1, float:-1.0293814E24)
            androidx.compose.runtime.ComposerKt.Y(r1, r13, r11, r0)
        L_0x0014:
            androidx.compose.runtime.MutableIntState r11 = r10.f34980B
            int r0 = com.hansecom.abt.presentation.screens.home.HomeScreenKt.s(r11)
            java.util.List r1 = r10.f34981z
            r11 = -576605007(0xffffffffdda1b4b1, float:-1.45651659E18)
            r12.X(r11)
            java.util.List r11 = r10.f34979A
            boolean r11 = r12.l(r11)
            androidx.compose.runtime.MutableIntState r13 = r10.f34980B
            boolean r13 = r12.W(r13)
            r11 = r11 | r13
            androidx.navigation.NavHostController r13 = r10.C
            boolean r13 = r12.l(r13)
            r11 = r11 | r13
            java.util.List r13 = r10.f34979A
            androidx.navigation.NavHostController r2 = r10.C
            androidx.compose.runtime.MutableIntState r3 = r10.f34980B
            java.lang.Object r4 = r12.g()
            if (r11 != 0) goto L_0x004a
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r4 != r11) goto L_0x0052
        L_0x004a:
            com.hansecom.abt.presentation.screens.home.s r4 = new com.hansecom.abt.presentation.screens.home.s
            r4.<init>(r13, r2, r3)
            r12.N(r4)
        L_0x0052:
            r2 = r4
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r12.M()
            boolean r3 = r10.D
            boolean r4 = r10.E
            kotlin.jvm.functions.Function0 r5 = r10.F
            r8 = 0
            r9 = 64
            r6 = 0
            r7 = r12
            com.hansecom.abt.ui.components.bottomBar.BottomBarKt.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x006f
            androidx.compose.runtime.ComposerKt.X()
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeScreenKt$HomeBottomBar$4.g(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
    }
}
