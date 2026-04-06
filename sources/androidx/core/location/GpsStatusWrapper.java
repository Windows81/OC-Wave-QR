package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.core.util.Preconditions;
import java.util.Iterator;

class GpsStatusWrapper extends GnssStatusCompat {

    /* renamed from: a  reason: collision with root package name */
    public final GpsStatus f19863a;

    /* renamed from: b  reason: collision with root package name */
    public int f19864b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f19865c;

    /* renamed from: d  reason: collision with root package name */
    public int f19866d;

    /* renamed from: e  reason: collision with root package name */
    public GpsSatellite f19867e;

    public GpsStatusWrapper(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.f(gpsStatus);
        this.f19863a = gpsStatus2;
        this.f19865c = gpsStatus2.getSatellites().iterator();
        this.f19866d = -1;
        this.f19867e = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsStatusWrapper)) {
            return false;
        }
        return this.f19863a.equals(((GpsStatusWrapper) obj).f19863a);
    }

    public int hashCode() {
        return this.f19863a.hashCode();
    }
}
