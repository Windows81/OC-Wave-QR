package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class N implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36022A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36023B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f36024z;

    public /* synthetic */ N(FareMedia.State state, Function0 function0, int i2) {
        this.f36024z = state;
        this.f36022A = function0;
        this.f36023B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.T(this.f36024z, this.f36022A, this.f36023B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
