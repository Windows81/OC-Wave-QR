package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.menu.AccountMenuConfigConverter;
import com.hansecom.abt.data.preferences.LockPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GetAccountMenuConfigurationUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final AccountMenuConfigConverter f33846a;

    /* renamed from: b  reason: collision with root package name */
    public final LockPreferences f33847b;

    public GetAccountMenuConfigurationUseCase(AccountMenuConfigConverter accountMenuConfigConverter, LockPreferences lockPreferences) {
        Intrinsics.i(accountMenuConfigConverter, "accountMenuConfigConverter");
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33846a = accountMenuConfigConverter;
        this.f33847b = lockPreferences;
    }

    public final Flow c() {
        return new GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1(this.f33847b.g(), this);
    }
}
