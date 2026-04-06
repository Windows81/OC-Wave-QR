package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class q0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34937z;

    public /* synthetic */ q0(HelpRequest.Action action) {
        this.f34937z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.W(this.f34937z, (HelpRequest.State) obj);
    }
}
