package j;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TransportContext f34115A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TransportScheduleCallback f34116B;
    public final /* synthetic */ EventInternal C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DefaultScheduler f34117z;

    public /* synthetic */ a(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        this.f34117z = defaultScheduler;
        this.f34115A = transportContext;
        this.f34116B = transportScheduleCallback;
        this.C = eventInternal;
    }

    public final void run() {
        this.f34117z.e(this.f34115A, this.f34116B, this.C);
    }
}
