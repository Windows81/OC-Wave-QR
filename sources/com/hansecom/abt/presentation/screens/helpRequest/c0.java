package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34910z;

    public /* synthetic */ c0(HelpRequest.Action action) {
        this.f34910z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.d0(this.f34910z, (HelpRequest.State) obj);
    }
}
