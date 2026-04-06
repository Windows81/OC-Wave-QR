package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19909A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f19910B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f19911z;

    public /* synthetic */ f(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, int i2) {
        this.f19911z = gpsStatusTransport;
        this.f19909A = executor;
        this.f19910B = i2;
    }

    public final void run() {
        this.f19911z.g(this.f19909A, this.f19910B);
    }
}
