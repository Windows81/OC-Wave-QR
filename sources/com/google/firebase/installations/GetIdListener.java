package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

class GetIdListener implements StateListener {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f30800a;

    public GetIdListener(TaskCompletionSource taskCompletionSource) {
        this.f30800a = taskCompletionSource;
    }

    public boolean a(Exception exc) {
        return false;
    }

    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.l() && !persistedInstallationEntry.k() && !persistedInstallationEntry.i()) {
            return false;
        }
        this.f30800a.e(persistedInstallationEntry.d());
        return true;
    }
}
