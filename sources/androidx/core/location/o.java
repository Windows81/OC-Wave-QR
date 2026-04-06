package androidx.core.location;

import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f19931A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ GnssStatus f19932B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f19933z;

    public /* synthetic */ o(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, GnssStatus gnssStatus) {
        this.f19933z = preRGnssStatusTransport;
        this.f19931A = executor;
        this.f19932B = gnssStatus;
    }

    public final void run() {
        this.f19933z.f(this.f19931A, this.f19932B);
    }
}
