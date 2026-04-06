package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class e implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EventStore f24214a;

    public /* synthetic */ e(EventStore eventStore) {
        this.f24214a = eventStore;
    }

    public final Object D() {
        return Integer.valueOf(this.f24214a.L());
    }
}
