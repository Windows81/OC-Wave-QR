package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class U implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PagerState f36039A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f36040B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f36041z;

    public /* synthetic */ U(Modifier modifier, PagerState pagerState, FareMedia.State state, int i2, int i3) {
        this.f36041z = modifier;
        this.f36039A = pagerState;
        this.f36040B = state;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.H(this.f36041z, this.f36039A, this.f36040B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
