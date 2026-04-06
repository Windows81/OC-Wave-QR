package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class h0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34923z;

    public /* synthetic */ h0(HelpRequest.Action action) {
        this.f34923z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.i0(this.f34923z, (HelpRequest.State) obj);
    }
}
