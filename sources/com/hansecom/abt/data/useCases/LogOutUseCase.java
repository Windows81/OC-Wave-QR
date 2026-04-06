package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata
public final class LogOutUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AuthenticationPreferences f33753a;

    public LogOutUseCase(AuthenticationPreferences authenticationPreferences) {
        Intrinsics.i(authenticationPreferences, "authenticationPreferences");
        this.f33753a = authenticationPreferences;
    }

    public final Object a(Continuation continuation) {
        Timber.f44337a.a("Clearing auth tokens", new Object[0]);
        Object d2 = this.f33753a.d(continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }
}
