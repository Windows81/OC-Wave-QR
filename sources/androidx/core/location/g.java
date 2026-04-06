package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19912A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ GnssStatusCompat f19913B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f19914z;

    public /* synthetic */ g(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, GnssStatusCompat gnssStatusCompat) {
        this.f19914z = gpsStatusTransport;
        this.f19912A = executor;
        this.f19913B = gnssStatusCompat;
    }

    public final void run() {
        this.f19914z.h(this.f19912A, this.f19913B);
    }
}
