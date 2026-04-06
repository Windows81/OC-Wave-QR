package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34927z;

    public /* synthetic */ i0(HelpRequest.Action action) {
        this.f34927z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.j0(this.f34927z, (HelpRequest.State) obj);
    }
}
