package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19907A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f19908z;

    public /* synthetic */ e(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f19908z = gpsStatusTransport;
        this.f19907A = executor;
    }

    public final void run() {
        this.f19908z.f(this.f19907A);
    }
}
