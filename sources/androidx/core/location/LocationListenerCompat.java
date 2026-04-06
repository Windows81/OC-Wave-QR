package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

public interface LocationListenerCompat extends LocationListener {
    void onFlushComplete(int i2) {
    }

    void onLocationChanged(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            onLocationChanged((Location) list.get(i2));
        }
    }

    void onProviderDisabled(String str) {
    }

    void onProviderEnabled(String str) {
    }

    void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
