package com.hansecom.abt.data.useCases;

import com.hansecom.mapi.apis.FeedbackApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class SendHelpRequestUseCase_Factory implements Factory<SendHelpRequestUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33756a;

    public static SendHelpRequestUseCase b(FeedbackApi feedbackApi) {
        return new SendHelpRequestUseCase(feedbackApi);
    }

    /* renamed from: a */
    public SendHelpRequestUseCase get() {
        return b((FeedbackApi) this.f33756a.get());
    }
}
