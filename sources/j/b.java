package j;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

public final /* synthetic */ class b implements SynchronizationGuard.CriticalSection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultScheduler f34118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TransportContext f34119b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EventInternal f34120c;

    public /* synthetic */ b(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        this.f34118a = defaultScheduler;
        this.f34119b = transportContext;
        this.f34120c = eventInternal;
    }

    public final Object D() {
        return this.f34118a.d(this.f34119b, this.f34120c);
    }
}
