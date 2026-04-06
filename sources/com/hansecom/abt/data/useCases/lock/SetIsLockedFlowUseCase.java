package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata
public final class SetIsLockedFlowUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33990a;

    public SetIsLockedFlowUseCase(LockPreferences lockPreferences) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33990a = lockPreferences;
    }

    public final Object a(boolean z2, Continuation continuation) {
        Timber.f44337a.p("LOCK").a(z2 ? "LOCKED" : "UNLOCKED", new Object[0]);
        Object m2 = this.f33990a.m(z2, continuation);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
