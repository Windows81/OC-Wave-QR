package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f19923A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f19924z;

    public /* synthetic */ l(LocationManagerCompat.LocationListenerTransport locationListenerTransport, int i2) {
        this.f19924z = locationListenerTransport;
        this.f19923A = i2;
    }

    public final void run() {
        this.f19924z.g(this.f19923A);
    }
}
