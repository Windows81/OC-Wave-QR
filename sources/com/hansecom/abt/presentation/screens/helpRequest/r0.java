package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class r0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34941z;

    public /* synthetic */ r0(HelpRequest.Action action) {
        this.f34941z = action;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.Y(this.f34941z, (HelpRequest.State) obj);
    }
}
