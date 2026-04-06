package com.hansecom.abt.presentation.screens.main.debugMenu;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import com.hansecom.abt.data.useCases.LogOutUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class DebugMenuViewModel_Factory implements Factory<DebugMenuViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37629a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37630b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37631c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f37632d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f37633e;

    public static DebugMenuViewModel b(Context context, SavedStateHandle savedStateHandle, RealmPreferences realmPreferences, AuthenticationPreferences authenticationPreferences, LogOutUseCase logOutUseCase) {
        return new DebugMenuViewModel(context, savedStateHandle, realmPreferences, authenticationPreferences, logOutUseCase);
    }

    /* renamed from: a */
    public DebugMenuViewModel get() {
        return b((Context) this.f37629a.get(), (SavedStateHandle) this.f37630b.get(), (RealmPreferences) this.f37631c.get(), (AuthenticationPreferences) this.f37632d.get(), (LogOutUseCase) this.f37633e.get());
    }
}
