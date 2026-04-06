package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19899A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ GnssMeasurementsEvent f19900B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GnssMeasurementsTransport f19901z;

    public /* synthetic */ b(LocationManagerCompat.GnssMeasurementsTransport gnssMeasurementsTransport, Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
        this.f19901z = gnssMeasurementsTransport;
        this.f19899A = executor;
        this.f19900B = gnssMeasurementsEvent;
    }

    public final void run() {
        this.f19901z.c(this.f19899A, this.f19900B);
    }
}
