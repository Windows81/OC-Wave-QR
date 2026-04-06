package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34914z;

    public /* synthetic */ d0(HelpRequest.Action action) {
        this.f34914z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.e0(this.f34914z, (HelpRequest.State) obj);
    }
}
