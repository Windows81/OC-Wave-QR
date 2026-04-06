package com.hansecom.abt.data.useCases.lock;

import androidx.lifecycle.Lifecycle;
import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class AutoLockAfterInactivityUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33966a;

    /* renamed from: b  reason: collision with root package name */
    public final ResetUnlockEndDateTimeUseCase f33967b;

    /* renamed from: c  reason: collision with root package name */
    public final SetIsLockedFlowUseCase f33968c;

    public AutoLockAfterInactivityUseCase(LockPreferences lockPreferences, ResetUnlockEndDateTimeUseCase resetUnlockEndDateTimeUseCase, SetIsLockedFlowUseCase setIsLockedFlowUseCase) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        Intrinsics.i(resetUnlockEndDateTimeUseCase, "resetUnlockEndDateTimeUseCase");
        Intrinsics.i(setIsLockedFlowUseCase, "setIsLockedFlowUseCase");
        this.f33966a = lockPreferences;
        this.f33967b = resetUnlockEndDateTimeUseCase;
        this.f33968c = setIsLockedFlowUseCase;
    }

    public final Object c(Lifecycle lifecycle, Continuation continuation) {
        Object l2 = FlowKt.l(this.f33966a.b(), new AutoLockAfterInactivityUseCase$invoke$2(this, lifecycle, (Continuation) null), continuation);
        return l2 == IntrinsicsKt.f() ? l2 : Unit.f40552a;
    }
}
