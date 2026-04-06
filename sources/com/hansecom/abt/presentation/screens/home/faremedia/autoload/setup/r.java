package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class r implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f36363A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetupViewModel f36364z;

    public /* synthetic */ r(AutoloadSetupViewModel autoloadSetupViewModel, String str) {
        this.f36364z = autoloadSetupViewModel;
        this.f36363A = str;
    }

    public final Object invoke(Object obj) {
        return AutoloadSetupViewModel.R(this.f36364z, this.f36363A, (AutoloadSetup.State) obj);
    }
}
