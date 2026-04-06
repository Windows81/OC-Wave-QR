package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34922z;

    public /* synthetic */ f0(HelpRequest.Action action) {
        this.f34922z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.g0(this.f34922z, (HelpRequest.State) obj);
    }
}
