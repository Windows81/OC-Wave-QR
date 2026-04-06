package androidx.core.location;

import android.location.GnssStatus;
import androidx.core.util.Preconditions;

class GnssStatusWrapper extends GnssStatusCompat {

    /* renamed from: a  reason: collision with root package name */
    public final GnssStatus f19862a;

    public static class Api26Impl {
    }

    public static class Api30Impl {
    }

    public GnssStatusWrapper(Object obj) {
        this.f19862a = (GnssStatus) Preconditions.f((GnssStatus) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GnssStatusWrapper)) {
            return false;
        }
        return this.f19862a.equals(((GnssStatusWrapper) obj).f19862a);
    }

    public int hashCode() {
        return this.f19862a.hashCode();
    }
}
