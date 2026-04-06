package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

final class zaaa implements ListenerHolder.Notifier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ModuleInstallStatusUpdate f25028a;

    public zaaa(zaab zaab, ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f25028a = moduleInstallStatusUpdate;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((InstallStatusListener) obj).a(this.f25028a);
    }

    public final void b() {
    }
}
