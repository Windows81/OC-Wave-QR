package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class GnssStatusCompat {

    public static abstract class Callback {
        public void a(int i2) {
        }

        public void b(GnssStatusCompat gnssStatusCompat) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConstellationType {
    }

    public static GnssStatusCompat a(GnssStatus gnssStatus) {
        return new GnssStatusWrapper(gnssStatus);
    }

    public static GnssStatusCompat b(GpsStatus gpsStatus) {
        return new GpsStatusWrapper(gpsStatus);
    }
}
