package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class q implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f36361A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetupViewModel f36362z;

    public /* synthetic */ q(AutoloadSetupViewModel autoloadSetupViewModel, String str) {
        this.f36362z = autoloadSetupViewModel;
        this.f36361A = str;
    }

    public final Object invoke(Object obj) {
        return AutoloadSetupViewModel.T(this.f36362z, this.f36361A, (AutoloadSetup.State) obj);
    }
}
