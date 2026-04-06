package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel;
import com.hansecom.mapi.models.User;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class v0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HelpRequestViewModel f34951A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ User f34952z;

    public /* synthetic */ v0(User user, HelpRequestViewModel helpRequestViewModel) {
        this.f34952z = user;
        this.f34951A = helpRequestViewModel;
    }

    public final Object invoke(Object obj) {
        return HelpRequestViewModel.AnonymousClass2.AnonymousClass1.D(this.f34952z, this.f34951A, (HelpRequest.State) obj);
    }
}
