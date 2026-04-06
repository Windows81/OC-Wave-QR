package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19905A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f19906z;

    public /* synthetic */ d(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f19906z = gpsStatusTransport;
        this.f19905A = executor;
    }

    public final void run() {
        this.f19906z.e(this.f19905A);
    }
}
