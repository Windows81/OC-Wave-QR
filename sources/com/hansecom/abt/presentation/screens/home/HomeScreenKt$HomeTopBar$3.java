package com.hansecom.abt.presentation.screens.home;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class HomeScreenKt$HomeTopBar$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f34982A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavHostController f34983B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f34984z;

    public HomeScreenKt$HomeTopBar$3(String str, Modifier modifier, NavHostController navHostController) {
        this.f34984z = str;
        this.f34982A = modifier;
        this.f34983B = navHostController;
    }

    /* access modifiers changed from: private */
    public static final Unit e(NavHostController navHostController) {
        navHostController.a0();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.animation.AnimatedVisibilityScope r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "$this$AnimatedVisibility"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0014
            r11 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.HomeTopBar.<anonymous> (HomeScreen.kt:163)"
            r1 = 1354640379(0x50be2bfb, float:2.55244268E10)
            androidx.compose.runtime.ComposerKt.Y(r1, r13, r11, r0)
        L_0x0014:
            java.lang.String r2 = r10.f34984z
            androidx.compose.ui.Modifier r3 = r10.f34982A
            r11 = 635452368(0x25e03bd0, float:3.8898336E-16)
            r12.X(r11)
            androidx.navigation.NavHostController r11 = r10.f34983B
            boolean r11 = r12.l(r11)
            androidx.navigation.NavHostController r13 = r10.f34983B
            java.lang.Object r0 = r12.g()
            if (r11 != 0) goto L_0x0034
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x003c
        L_0x0034:
            com.hansecom.abt.presentation.screens.home.w r0 = new com.hansecom.abt.presentation.screens.home.w
            r0.<init>(r13)
            r12.N(r0)
        L_0x003c:
            r4 = r0
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r12.M()
            r8 = 0
            r9 = 24
            r5 = 0
            r6 = 0
            r7 = r12
            com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt.b(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0054
            androidx.compose.runtime.ComposerKt.X()
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeScreenKt$HomeTopBar$3.c(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
