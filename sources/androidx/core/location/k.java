package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Location f19921A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f19922z;

    public /* synthetic */ k(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Location location) {
        this.f19922z = locationListenerTransport;
        this.f19921A = location;
    }

    public final void run() {
        this.f19922z.h(this.f19921A);
    }
}
