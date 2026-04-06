package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final /* synthetic */ class h implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f31384a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f31385b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f31386c;

    public /* synthetic */ h(ConfigFetchHandler configFetchHandler, long j2, Map map) {
        this.f31384a = configFetchHandler;
        this.f31385b = j2;
        this.f31386c = map;
    }

    public final Object a(Task task) {
        return this.f31384a.u(this.f31385b, this.f31386c, task);
    }
}
