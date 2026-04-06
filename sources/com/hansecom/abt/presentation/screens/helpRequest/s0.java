package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HelpRequestViewModel f34944A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.Action f34945z;

    public /* synthetic */ s0(HelpRequest.Action action, HelpRequestViewModel helpRequestViewModel) {
        this.f34945z = action;
        this.f34944A = helpRequestViewModel;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.Z(this.f34945z, this.f34944A, (HelpRequest.State) obj);
    }
}
