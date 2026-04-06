package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class u0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34949z;

    public /* synthetic */ u0(HelpRequest.Action action) {
        this.f34949z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.b0(this.f34949z, (HelpRequest.State) obj);
    }
}
