package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19936A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f19937z;

    public /* synthetic */ q(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f19937z = preRGnssStatusTransport;
        this.f19936A = executor;
    }

    public final void run() {
        this.f19937z.g(this.f19936A);
    }
}
