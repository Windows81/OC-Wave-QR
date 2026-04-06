package androidx.core.location;

import android.os.Bundle;
import androidx.core.location.LocationManagerCompat;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f19925A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f19926B;
    public final /* synthetic */ Bundle C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f19927z;

    public /* synthetic */ m(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i2, Bundle bundle) {
        this.f19927z = locationListenerTransport;
        this.f19925A = str;
        this.f19926B = i2;
        this.C = bundle;
    }

    public final void run() {
        this.f19927z.l(this.f19925A, this.f19926B, this.C);
    }
}
