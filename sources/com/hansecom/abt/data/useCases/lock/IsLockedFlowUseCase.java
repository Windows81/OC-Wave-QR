package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class IsLockedFlowUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AppFeatures f33974a;

    /* renamed from: b  reason: collision with root package name */
    public final LockPreferences f33975b;

    public IsLockedFlowUseCase(AppFeatures appFeatures, LockPreferences lockPreferences) {
        Intrinsics.i(appFeatures, "appFeatures");
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33974a = appFeatures;
        this.f33975b = lockPreferences;
    }

    public final Flow b() {
        return FlowKt.n(this.f33975b.e(), this.f33975b.g(), this.f33975b.h(), new IsLockedFlowUseCase$invoke$1(this, (Continuation) null));
    }
}
