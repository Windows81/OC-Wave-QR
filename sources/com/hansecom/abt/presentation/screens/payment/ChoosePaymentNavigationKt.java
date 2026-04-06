package com.hansecom.abt.presentation.screens.payment;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.hansecom.abt.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class ChoosePaymentNavigationKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.util.List r23, java.util.List r24, java.lang.String r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function0 r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r1 = r23
            r4 = r26
            r5 = r27
            r6 = r29
            java.lang.String r0 = "paymentMethodTypes"
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            java.lang.String r0 = "onChoosePaymentMethod"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            java.lang.String r0 = "goToAddPaymentMethod"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            r0 = -1387004349(0xffffffffad53fe43, float:-1.2050419E-11)
            r2 = r28
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r30 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r6 | 6
            goto L_0x0037
        L_0x0027:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0036
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r6
            goto L_0x0037
        L_0x0036:
            r3 = r6
        L_0x0037:
            r7 = r30 & 2
            if (r7 == 0) goto L_0x0040
            r3 = r3 | 48
        L_0x003d:
            r8 = r24
            goto L_0x0052
        L_0x0040:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x003d
            r8 = r24
            boolean r9 = r2.l(r8)
            if (r9 == 0) goto L_0x004f
            r9 = 32
            goto L_0x0051
        L_0x004f:
            r9 = 16
        L_0x0051:
            r3 = r3 | r9
        L_0x0052:
            r9 = r30 & 4
            if (r9 == 0) goto L_0x005b
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r10 = r25
            goto L_0x006d
        L_0x005b:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0058
            r10 = r25
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x006a
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r11 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r3 = r3 | r11
        L_0x006d:
            r11 = r30 & 8
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0076:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0085
            boolean r11 = r2.l(r4)
            if (r11 == 0) goto L_0x0082
            r11 = r12
            goto L_0x0084
        L_0x0082:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r3 = r3 | r11
        L_0x0085:
            r11 = r30 & 16
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x008e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008e:
            r11 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x009d
            boolean r11 = r2.l(r5)
            if (r11 == 0) goto L_0x009a
            r11 = r13
            goto L_0x009c
        L_0x009a:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r11
        L_0x009d:
            r11 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r14) goto L_0x00b0
            boolean r11 = r2.t()
            if (r11 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r2.B()
            r3 = r10
            goto L_0x0147
        L_0x00b0:
            r11 = 0
            if (r7 == 0) goto L_0x00b5
            r15 = r11
            goto L_0x00b6
        L_0x00b5:
            r15 = r8
        L_0x00b6:
            if (r9 == 0) goto L_0x00ba
            r14 = r11
            goto L_0x00bb
        L_0x00ba:
            r14 = r10
        L_0x00bb:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00c7
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.payment.ChoosePaymentNavigation (ChoosePaymentNavigation.kt:26)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r7, r8)
        L_0x00c7:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r2.C(r0)
            android.content.Context r0 = (android.content.Context) r0
            r7 = 0
            androidx.navigation.Navigator[] r8 = new androidx.navigation.Navigator[r7]
            androidx.navigation.NavHostController r8 = androidx.navigation.compose.NavHostControllerKt.e(r8, r2, r7)
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination r9 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentDestination
            r9.<init>(r1, r15, r14)
            r10 = 1911685400(0x71f20118, float:2.3966942E30)
            r2.X(r10)
            boolean r10 = r2.l(r0)
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r3
            r16 = 1
            if (r11 != r13) goto L_0x00f2
            r11 = r16
            goto L_0x00f3
        L_0x00f2:
            r11 = r7
        L_0x00f3:
            r10 = r10 | r11
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != r12) goto L_0x00fa
            r7 = r16
        L_0x00fa:
            r3 = r10 | r7
            java.lang.Object r7 = r2.g()
            if (r3 != 0) goto L_0x010a
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x0112
        L_0x010a:
            com.hansecom.abt.presentation.screens.payment.B r7 = new com.hansecom.abt.presentation.screens.payment.B
            r7.<init>(r0, r5, r4)
            r2.N(r7)
        L_0x0112:
            r18 = r7
            kotlin.jvm.functions.Function1 r18 = (kotlin.jvm.functions.Function1) r18
            r2.M()
            r21 = 0
            r22 = 2044(0x7fc, float:2.864E-42)
            r0 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r14
            r14 = r3
            r3 = r15
            r15 = r16
            r16 = r17
            r17 = r19
            r19 = r2
            androidx.navigation.compose.NavHostKt.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0145
            androidx.compose.runtime.ComposerKt.X()
        L_0x0145:
            r8 = r3
            r3 = r0
        L_0x0147:
            androidx.compose.runtime.ScopeUpdateScope r9 = r2.x()
            if (r9 == 0) goto L_0x0161
            com.hansecom.abt.presentation.screens.payment.C r10 = new com.hansecom.abt.presentation.screens.payment.C
            r0 = r10
            r1 = r23
            r2 = r8
            r4 = r26
            r5 = r27
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentNavigationKt.c(java.util.List, java.util.List, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(Context context, Function0 function0, Function1 function1, NavGraphBuilder navGraphBuilder) {
        Intrinsics.i(navGraphBuilder, "$this$NavHost");
        String string = context.getString(R.string.h0);
        Intrinsics.h(string, "getString(...)");
        ComposableLambda c2 = ComposableLambdaKt.c(-1253117115, true, new ChoosePaymentNavigationKt$ChoosePaymentNavigation$1$1$1(function0, function1));
        Map h2 = MapsKt.h();
        List<NavDeepLink> m2 = CollectionsKt.m();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.i().d(ComposeNavigator.class), Reflection.b(ChoosePaymentDestination.class), h2, c2);
        composeNavigatorDestinationBuilder.e(string);
        for (NavDeepLink b2 : m2) {
            composeNavigatorDestinationBuilder.b(b2);
        }
        composeNavigatorDestinationBuilder.h((Function1) null);
        composeNavigatorDestinationBuilder.i((Function1) null);
        composeNavigatorDestinationBuilder.j((Function1) null);
        composeNavigatorDestinationBuilder.k((Function1) null);
        composeNavigatorDestinationBuilder.l((Function1) null);
        navGraphBuilder.h(composeNavigatorDestinationBuilder);
        return Unit.f40552a;
    }

    public static final Unit e(List list, List list2, String str, Function1 function1, Function0 function0, int i2, int i3, Composer composer, int i4) {
        c(list, list2, str, function1, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
