package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19902A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f19903B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GnssMeasurementsTransport f19904z;

    public /* synthetic */ c(LocationManagerCompat.GnssMeasurementsTransport gnssMeasurementsTransport, Executor executor, int i2) {
        this.f19904z = gnssMeasurementsTransport;
        this.f19902A = executor;
        this.f19903B = i2;
    }

    public final void run() {
        this.f19904z.d(this.f19902A, this.f19903B);
    }
}
