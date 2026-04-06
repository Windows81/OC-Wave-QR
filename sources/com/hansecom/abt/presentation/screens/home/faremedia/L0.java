package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import java.time.LocalDateTime;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class L0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocalDateTime f36020z;

    public /* synthetic */ L0(LocalDateTime localDateTime) {
        this.f36020z = localDateTime;
    }

    public final Object invoke(Object obj) {
        return FareMediaViewModel$launchTimer$2.C(this.f36020z, (FareMedia.State) obj);
    }
}
