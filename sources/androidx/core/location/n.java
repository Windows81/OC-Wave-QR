package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19928A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f19929B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f19930z;

    public /* synthetic */ n(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i2) {
        this.f19930z = preRGnssStatusTransport;
        this.f19928A = executor;
        this.f19929B = i2;
    }

    public final void run() {
        this.f19930z.e(this.f19928A, this.f19929B);
    }
}
