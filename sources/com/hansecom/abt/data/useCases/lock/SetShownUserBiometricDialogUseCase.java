package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SetShownUserBiometricDialogUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33992a;

    public SetShownUserBiometricDialogUseCase(LockPreferences lockPreferences) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33992a = lockPreferences;
    }

    public final Object a(boolean z2, Continuation continuation) {
        Object j2 = this.f33992a.j(z2, continuation);
        return j2 == IntrinsicsKt.f() ? j2 : Unit.f40552a;
    }
}
