package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.List;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f19919A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f19920z;

    public /* synthetic */ j(LocationManagerCompat.LocationListenerTransport locationListenerTransport, List list) {
        this.f19920z = locationListenerTransport;
        this.f19919A = list;
    }

    public final void run() {
        this.f19920z.i(this.f19919A);
    }
}
