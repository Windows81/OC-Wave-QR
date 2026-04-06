package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class FareMediaScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35959A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PagerState f35960B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function1 H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f35961z;

    public FareMediaScreenKt$ScreenImpl$1(FareMedia.State state, Function1 function1, PagerState pagerState, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function1 function16) {
        this.f35961z = state;
        this.f35959A = function1;
        this.f35960B = pagerState;
        this.C = function12;
        this.D = function13;
        this.E = function14;
        this.F = function15;
        this.G = function0;
        this.H = function16;
    }

    /* access modifiers changed from: private */
    public static final Unit e(Function1 function1) {
        function1.invoke(FareMedia.Action.Refresh.f35908a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r11 = r23
            r1 = r24
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r23.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r23.B()
            goto L_0x00c2
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.faremedia.ScreenImpl.<anonymous> (FareMediaScreen.kt:175)"
            r4 = -1558768414(0xffffffffa31714e2, float:-8.1901485E-18)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State r1 = r0.f35961z
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x003d
            r1 = 1706033089(0x65afffc1, float:1.03891495E23)
            r11.X(r1)
            r1 = 0
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r11, r1)
            r23.M()
            goto L_0x00b9
        L_0x003d:
            r1 = 1706124074(0x65b1632a, float:1.04711015E23)
            r11.X(r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.f(r1, r2, r4, r3)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State r1 = r0.f35961z
            boolean r1 = r1.q()
            r2 = -360602029(0xffffffffea81a653, float:-7.836844E25)
            r11.X(r2)
            kotlin.jvm.functions.Function1 r2 = r0.f35959A
            boolean r2 = r11.W(r2)
            kotlin.jvm.functions.Function1 r5 = r0.f35959A
            java.lang.Object r6 = r23.g()
            if (r2 != 0) goto L_0x006e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0076
        L_0x006e:
            com.hansecom.abt.presentation.screens.home.faremedia.k0 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.k0
            r6.<init>(r5)
            r11.N(r6)
        L_0x0076:
            r2 = r6
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r23.M()
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$1$2 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$1$2
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State r13 = r0.f35961z
            kotlin.jvm.functions.Function1 r14 = r0.f35959A
            androidx.compose.foundation.pager.PagerState r15 = r0.f35960B
            kotlin.jvm.functions.Function1 r6 = r0.C
            kotlin.jvm.functions.Function1 r7 = r0.D
            kotlin.jvm.functions.Function1 r8 = r0.E
            kotlin.jvm.functions.Function1 r9 = r0.F
            kotlin.jvm.functions.Function0 r10 = r0.G
            kotlin.jvm.functions.Function1 r12 = r0.H
            r21 = r12
            r12 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6 = 54
            r7 = -480547292(0xffffffffe35b6e24, float:-4.0477734E21)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r4, r5, r11, r6)
            r9 = 1573248(0x180180, float:2.20459E-39)
            r10 = 56
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = r23
            androidx.compose.material3.pulltorefresh.PullToRefreshKt.n(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r23.M()
        L_0x00b9:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
