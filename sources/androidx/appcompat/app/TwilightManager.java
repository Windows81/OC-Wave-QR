package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

class TwilightManager {

    /* renamed from: d  reason: collision with root package name */
    public static TwilightManager f652d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f653a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f654b;

    /* renamed from: c  reason: collision with root package name */
    public final TwilightState f655c = new TwilightState();

    public static class TwilightState {

        /* renamed from: a  reason: collision with root package name */
        public boolean f656a;

        /* renamed from: b  reason: collision with root package name */
        public long f657b;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.f653a = context;
        this.f654b = locationManager;
    }

    public static TwilightManager a(Context context) {
        if (f652d == null) {
            Context applicationContext = context.getApplicationContext();
            f652d = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f652d;
    }

    public final Location b() {
        Location location = null;
        Location c2 = PermissionChecker.b(this.f653a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (PermissionChecker.b(this.f653a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c2 == null) ? location != null ? location : c2 : location.getTime() > c2.getTime() ? location : c2;
    }

    public final Location c(String str) {
        try {
            if (this.f654b.isProviderEnabled(str)) {
                return this.f654b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    public boolean d() {
        TwilightState twilightState = this.f655c;
        if (e()) {
            return twilightState.f656a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return twilightState.f656a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }

    public final boolean e() {
        return this.f655c.f657b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j2;
        TwilightState twilightState = this.f655c;
        long currentTimeMillis = System.currentTimeMillis();
        TwilightCalculator b2 = TwilightCalculator.b();
        TwilightCalculator twilightCalculator = b2;
        twilightCalculator.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        twilightCalculator.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = true;
        if (b2.f651c != 1) {
            z2 = false;
        }
        boolean z3 = z2;
        long j3 = b2.f650b;
        long j4 = b2.f649a;
        long j5 = j3;
        b2.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j6 = b2.f650b;
        if (j5 == -1 || j4 == -1) {
            j2 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j4) {
                j6 = currentTimeMillis > j5 ? j4 : j5;
            }
            j2 = j6 + 60000;
        }
        twilightState.f656a = z3;
        twilightState.f657b = j2;
    }
}
