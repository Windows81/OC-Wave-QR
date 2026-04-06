package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Map;

public final /* synthetic */ class l implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uploader f24229a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f24230b;

    public /* synthetic */ l(Uploader uploader, Map map) {
        this.f24229a = uploader;
        this.f24230b = map;
    }

    public final Object D() {
        return this.f24229a.q(this.f24230b);
    }
}
