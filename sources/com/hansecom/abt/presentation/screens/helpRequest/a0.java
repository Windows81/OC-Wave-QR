package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.data.config.help.HelpScreenConfig;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HelpScreenConfig f34907A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequestViewModel f34908z;

    public /* synthetic */ a0(HelpRequestViewModel helpRequestViewModel, HelpScreenConfig helpScreenConfig) {
        this.f34908z = helpRequestViewModel;
        this.f34907A = helpScreenConfig;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.P(this.f34908z, this.f34907A, (HelpRequest.State) obj);
    }
}
