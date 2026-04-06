package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34918z;

    public /* synthetic */ e0(HelpRequest.Action action) {
        this.f34918z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.f0(this.f34918z, (HelpRequest.State) obj);
    }
}
