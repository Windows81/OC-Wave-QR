package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f19917A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f19918z;

    public /* synthetic */ i(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f19918z = locationListenerTransport;
        this.f19917A = str;
    }

    public final void run() {
        this.f19918z.j(this.f19917A);
    }
}
