package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class k0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34929z;

    public /* synthetic */ k0(HelpRequest.Action action) {
        this.f34929z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.X(this.f34929z, (HelpRequest.State) obj);
    }
}
