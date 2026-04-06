package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.data.localDomain.AutoloadConfiguration;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class w implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AutoloadSetupViewModel f36366A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AutoloadConfiguration f36367z;

    public /* synthetic */ w(AutoloadConfiguration autoloadConfiguration, AutoloadSetupViewModel autoloadSetupViewModel) {
        this.f36367z = autoloadConfiguration;
        this.f36366A = autoloadSetupViewModel;
    }

    public final Object invoke(Object obj) {
        return AutoloadSetupViewModel.AnonymousClass1.AnonymousClass4.D(this.f36367z, this.f36366A, (AutoloadSetup.State) obj);
    }
}
