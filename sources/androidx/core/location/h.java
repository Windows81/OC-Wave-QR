package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f19915A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f19916z;

    public /* synthetic */ h(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f19916z = locationListenerTransport;
        this.f19915A = str;
    }

    public final void run() {
        this.f19916z.k(this.f19915A);
    }
}
