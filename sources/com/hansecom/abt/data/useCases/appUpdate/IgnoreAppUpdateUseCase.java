package com.hansecom.abt.data.useCases.appUpdate;

import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.useCases.configurations.GetAppUpdateConfigurationUseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata
public final class IgnoreAppUpdateUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final GetAppUpdateConfigurationUseCase f33786a;

    /* renamed from: b  reason: collision with root package name */
    public final AppPreferences f33787b;

    public IgnoreAppUpdateUseCase(GetAppUpdateConfigurationUseCase getAppUpdateConfigurationUseCase, AppPreferences appPreferences) {
        Intrinsics.i(getAppUpdateConfigurationUseCase, "getAppUpdateConfigurationUseCase");
        Intrinsics.i(appPreferences, "appPreferences");
        this.f33786a = getAppUpdateConfigurationUseCase;
        this.f33787b = appPreferences;
    }

    public final Object a(Continuation continuation) {
        String b2 = this.f33786a.d().b();
        if (b2 != null) {
            Timber.Forest forest = Timber.f44337a;
            forest.i("Ignoring app update version " + b2, new Object[0]);
            Object h2 = this.f33787b.h(b2, continuation);
            if (h2 == IntrinsicsKt.f()) {
                return h2;
            }
        }
        return Unit.f40552a;
    }
}
