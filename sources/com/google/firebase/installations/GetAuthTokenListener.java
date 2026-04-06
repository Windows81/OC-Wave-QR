package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

class GetAuthTokenListener implements StateListener {

    /* renamed from: a  reason: collision with root package name */
    public final Utils f30798a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f30799b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource taskCompletionSource) {
        this.f30798a = utils;
        this.f30799b = taskCompletionSource;
    }

    public boolean a(Exception exc) {
        this.f30799b.d(exc);
        return true;
    }

    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.k() || this.f30798a.f(persistedInstallationEntry)) {
            return false;
        }
        this.f30799b.c(InstallationTokenResult.a().b(persistedInstallationEntry.b()).d(persistedInstallationEntry.c()).c(persistedInstallationEntry.h()).a());
        return true;
    }
}
