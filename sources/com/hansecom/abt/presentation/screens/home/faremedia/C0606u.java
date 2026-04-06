package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0606u implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PagerState f37365A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37366B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Function0 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f37367z;

    public /* synthetic */ C0606u(FareMedia.State state, PagerState pagerState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function0 function03, int i2, int i3) {
        this.f37367z = state;
        this.f37365A = pagerState;
        this.f37366B = function1;
        this.C = function12;
        this.D = function0;
        this.E = function02;
        this.F = function13;
        this.G = function14;
        this.H = function15;
        this.I = function16;
        this.J = function03;
        this.K = i2;
        this.L = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.y0(this.f37367z, this.f37365A, this.f37366B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (Composer) obj, ((Integer) obj2).intValue());
    }
}
