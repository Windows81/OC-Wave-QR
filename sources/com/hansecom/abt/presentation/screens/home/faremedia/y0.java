package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.PersistentList;

public final /* synthetic */ class y0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PersistentList f37401z;

    public /* synthetic */ y0(PersistentList persistentList) {
        this.f37401z = persistentList;
    }

    public final Object invoke(Object obj) {
        return FareMediaViewModel.t0(this.f37401z, (FareMedia.State) obj);
    }
}
