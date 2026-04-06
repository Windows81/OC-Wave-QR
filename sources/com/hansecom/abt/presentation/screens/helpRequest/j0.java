package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class j0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34928z;

    public /* synthetic */ j0(HelpRequest.Action action) {
        this.f34928z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.k0(this.f34928z, (HelpRequest.State) obj);
    }
}
