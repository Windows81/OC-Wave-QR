package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class K implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36013A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36014B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f36015z;

    public /* synthetic */ K(FareMedia.State state, Function1 function1, int i2) {
        this.f36015z = state;
        this.f36013A = function1;
        this.f36014B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.t0(this.f36015z, this.f36013A, this.f36014B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
