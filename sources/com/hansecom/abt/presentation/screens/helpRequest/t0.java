package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class t0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34947z;

    public /* synthetic */ t0(HelpRequest.Action action) {
        this.f34947z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.a0(this.f34947z, (HelpRequest.State) obj);
    }
}
