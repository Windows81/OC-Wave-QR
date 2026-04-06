package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class O implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36025A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f36026B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedia.State f36027z;

    public /* synthetic */ O(FareMedia.State state, Function0 function0, int i2) {
        this.f36027z = state;
        this.f36025A = function0;
        this.f36026B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return FareMediaScreenKt.U(this.f36027z, this.f36025A, this.f36026B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
