package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavHostController;
import com.hansecom.abt.presentation.screens.home.Home;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class HomeScreenKt$ScreenImpl$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f34985A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Home.State f34986B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ NavHostController D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ AbtSnackbarHostState F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f34987z;

    public HomeScreenKt$ScreenImpl$3(State state, MutableState mutableState, Home.State state2, Function1 function1, NavHostController navHostController, Function0 function0, AbtSnackbarHostState abtSnackbarHostState) {
        this.f34987z = state;
        this.f34985A = mutableState;
        this.f34986B = state2;
        this.C = function1;
        this.D = navHostController;
        this.E = function0;
        this.F = abtSnackbarHostState;
    }

    public static final Unit g(Function1 function1) {
        function1.invoke(Home.Action.ActivateBiometricLock.f34965a);
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1) {
        function1.invoke(Home.Action.DismissBiometricLockActivation.f34966a);
        return Unit.f40552a;
    }

    public static final Unit i(Function1 function1) {
        function1.invoke(Home.Action.DismissBiometricLockActivation.f34966a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.compose.runtime.Composer r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r15 = r24
            r1 = r25
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r24.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r24.B()
            goto L_0x01a4
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.ScreenImpl.<anonymous> (HomeScreen.kt:81)"
            r4 = -126987879(0xfffffffff86e5199, float:-1.9334713E34)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.runtime.State r1 = r0.f34987z
            androidx.navigation.NavBackStackEntry r1 = com.hansecom.abt.presentation.screens.home.HomeScreenKt.K(r1)
            r2 = 1795447417(0x6b045a79, float:1.6000545E26)
            r15.X(r2)
            androidx.compose.runtime.State r2 = r0.f34987z
            boolean r2 = r15.W(r2)
            androidx.compose.runtime.MutableState r3 = r0.f34985A
            boolean r3 = r15.W(r3)
            r2 = r2 | r3
            androidx.compose.runtime.MutableState r3 = r0.f34985A
            androidx.compose.runtime.State r4 = r0.f34987z
            java.lang.Object r5 = r24.g()
            r6 = 0
            if (r2 != 0) goto L_0x0052
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x005a
        L_0x0052:
            com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$1$1 r5 = new com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$1$1
            r5.<init>(r3, r4, r6)
            r15.N(r5)
        L_0x005a:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r24.M()
            r14 = 0
            androidx.compose.runtime.EffectsKt.g(r1, r5, r15, r14)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r2 = 0
            r3 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r1, r2, r3, r6)
            java.lang.String r2 = "HomeScreen"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.TestTagKt.a(r1, r2)
            com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$2 r2 = new com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$2
            androidx.compose.runtime.MutableState r4 = r0.f34985A
            androidx.navigation.NavHostController r5 = r0.D
            r2.<init>(r4, r5)
            r4 = -813372587(0xffffffffcf84eb55, float:-4.4600305E9)
            r5 = 54
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r3, r2, r15, r5)
            com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$3 r4 = new com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$3
            androidx.compose.runtime.MutableState r6 = r0.f34985A
            com.hansecom.abt.presentation.screens.home.Home$State r7 = r0.f34986B
            androidx.navigation.NavHostController r8 = r0.D
            kotlin.jvm.functions.Function0 r9 = r0.E
            r4.<init>(r6, r7, r8, r9)
            r6 = -1049990412(0xffffffffc16a6af4, float:-14.651112)
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r3, r4, r15, r5)
            com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$4 r6 = new com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$4
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r7 = r0.F
            com.hansecom.abt.presentation.screens.home.Home$State r8 = r0.f34986B
            r6.<init>(r7, r8)
            r7 = -1286608237(0xffffffffb34fea93, float:-4.8409287E-8)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r3, r6, r15, r5)
            com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$5 r7 = new com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3$5
            androidx.navigation.NavHostController r8 = r0.D
            r7.<init>(r8)
            r8 = 1641552490(0x61d81a6a, float:4.983E20)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r3, r7, r15, r5)
            r16 = 805309878(0x30000db6, float:4.6585613E-10)
            r17 = 496(0x1f0, float:6.95E-43)
            r5 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r13 = 0
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r9 = r10
            r11 = r13
            r13 = r24
            r14 = r16
            r15 = r17
            androidx.compose.material3.ScaffoldKt.f(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15)
            com.hansecom.abt.presentation.screens.home.Home$State r1 = r0.f34986B
            boolean r4 = r1.c()
            int r1 = com.hansecom.abt.R.string.x6
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r14 = r24
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r14, r2)
            int r3 = com.hansecom.abt.R.string.w6
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r5, r14, r2)
            int r3 = com.hansecom.abt.R.string.v6
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r8 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r6, r14, r2)
            int r3 = com.hansecom.abt.R.string.u6
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r13 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r3, r6, r14, r2)
            com.hansecom.abt.presentation.screens.home.ComposableSingletons$HomeScreenKt r2 = com.hansecom.abt.presentation.screens.home.ComposableSingletons$HomeScreenKt.f34962a
            kotlin.jvm.functions.Function2 r11 = r2.a()
            r2 = 1795534473(0x6b05ae89, float:1.6161135E26)
            r14.X(r2)
            kotlin.jvm.functions.Function1 r2 = r0.C
            boolean r2 = r14.W(r2)
            kotlin.jvm.functions.Function1 r3 = r0.C
            java.lang.Object r6 = r24.g()
            if (r2 != 0) goto L_0x011b
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0123
        L_0x011b:
            com.hansecom.abt.presentation.screens.home.x r6 = new com.hansecom.abt.presentation.screens.home.x
            r6.<init>(r3)
            r14.N(r6)
        L_0x0123:
            r18 = r6
            kotlin.jvm.functions.Function0 r18 = (kotlin.jvm.functions.Function0) r18
            r24.M()
            r2 = 1795540274(0x6b05c532, float:1.6171836E26)
            r14.X(r2)
            kotlin.jvm.functions.Function1 r2 = r0.C
            boolean r2 = r14.W(r2)
            kotlin.jvm.functions.Function1 r3 = r0.C
            java.lang.Object r6 = r24.g()
            if (r2 != 0) goto L_0x0146
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x014e
        L_0x0146:
            com.hansecom.abt.presentation.screens.home.y r6 = new com.hansecom.abt.presentation.screens.home.y
            r6.<init>(r3)
            r14.N(r6)
        L_0x014e:
            r22 = r6
            kotlin.jvm.functions.Function0 r22 = (kotlin.jvm.functions.Function0) r22
            r24.M()
            r2 = 1795542898(0x6b05cf72, float:1.6176677E26)
            r14.X(r2)
            kotlin.jvm.functions.Function1 r2 = r0.C
            boolean r2 = r14.W(r2)
            kotlin.jvm.functions.Function1 r3 = r0.C
            java.lang.Object r6 = r24.g()
            if (r2 != 0) goto L_0x0171
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0179
        L_0x0171:
            com.hansecom.abt.presentation.screens.home.z r6 = new com.hansecom.abt.presentation.screens.home.z
            r6.<init>(r3)
            r14.N(r6)
        L_0x0179:
            r16 = r6
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r24.M()
            r20 = 0
            r21 = 84836(0x14b64, float:1.1888E-40)
            r3 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r19 = 24576(0x6000, float:3.4438E-41)
            r2 = r5
            r5 = r11
            r11 = r18
            r14 = r22
            r18 = r24
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01a4
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.HomeScreenKt$ScreenImpl$3.f(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
