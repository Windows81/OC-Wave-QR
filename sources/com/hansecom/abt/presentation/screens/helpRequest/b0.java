package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34909z;

    public /* synthetic */ b0(HelpRequest.Action action) {
        this.f34909z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.c0(this.f34909z, (HelpRequest.State) obj);
    }
}
