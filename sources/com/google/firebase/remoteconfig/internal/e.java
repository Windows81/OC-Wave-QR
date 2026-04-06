package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final /* synthetic */ class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f31375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f31376b;

    public /* synthetic */ e(ConfigFetchHandler configFetchHandler, Map map) {
        this.f31375a = configFetchHandler;
        this.f31376b = map;
    }

    public final Object a(Task task) {
        return this.f31375a.y(this.f31376b, task);
    }
}
