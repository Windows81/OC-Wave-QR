package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class LocationManagerCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap f19868a = new WeakHashMap();

    public static class Api19Impl {
    }

    public static class Api24Impl {
    }

    public static class Api28Impl {
    }

    public static class Api30Impl {
    }

    public static class Api31Impl {
    }

    public static final class CancellableLocationListener implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        public final LocationManager f19869a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f19870b;

        /* renamed from: c  reason: collision with root package name */
        public final Handler f19871c;

        /* renamed from: d  reason: collision with root package name */
        public Consumer f19872d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f19873e;

        /* renamed from: f  reason: collision with root package name */
        public Runnable f19874f;

        public final void b() {
            this.f19872d = null;
            this.f19869a.removeUpdates(this);
            Runnable runnable = this.f19874f;
            if (runnable != null) {
                this.f19871c.removeCallbacks(runnable);
                this.f19874f = null;
            }
        }

        public void onLocationChanged(Location location) {
            synchronized (this) {
                try {
                    if (!this.f19873e) {
                        this.f19873e = true;
                        this.f19870b.execute(new a(this.f19872d, location));
                        b();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }

        public void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    public static class GnssListenersHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleArrayMap f19875a = new SimpleArrayMap();

        /* renamed from: b  reason: collision with root package name */
        public static final SimpleArrayMap f19876b = new SimpleArrayMap();
    }

    public static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final GnssMeasurementsEvent.Callback f19877a;

        /* renamed from: b  reason: collision with root package name */
        public volatile Executor f19878b;

        public final /* synthetic */ void c(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.f19878b == executor) {
                this.f19877a.onGnssMeasurementsReceived(gnssMeasurementsEvent);
            }
        }

        public final /* synthetic */ void d(Executor executor, int i2) {
            if (this.f19878b == executor) {
                this.f19877a.onStatusChanged(i2);
            }
        }

        public void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
            Executor executor = this.f19878b;
            if (executor != null) {
                executor.execute(new b(this, executor, gnssMeasurementsEvent));
            }
        }

        public void onStatusChanged(int i2) {
            Executor executor = this.f19878b;
            if (executor != null) {
                executor.execute(new c(this, executor, i2));
            }
        }
    }

    public static class GnssStatusTransport extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final GnssStatusCompat.Callback f19879a;

        public void onFirstFix(int i2) {
            this.f19879a.a(i2);
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f19879a.b(GnssStatusCompat.a(gnssStatus));
        }

        public void onStarted() {
            this.f19879a.c();
        }

        public void onStopped() {
            this.f19879a.d();
        }
    }

    public static class GpsStatusTransport implements GpsStatus.Listener {

        /* renamed from: a  reason: collision with root package name */
        public final LocationManager f19880a;

        /* renamed from: b  reason: collision with root package name */
        public final GnssStatusCompat.Callback f19881b;

        /* renamed from: c  reason: collision with root package name */
        public volatile Executor f19882c;

        public final /* synthetic */ void e(Executor executor) {
            if (this.f19882c == executor) {
                this.f19881b.c();
            }
        }

        public final /* synthetic */ void f(Executor executor) {
            if (this.f19882c == executor) {
                this.f19881b.d();
            }
        }

        public final /* synthetic */ void g(Executor executor, int i2) {
            if (this.f19882c == executor) {
                this.f19881b.a(i2);
            }
        }

        public final /* synthetic */ void h(Executor executor, GnssStatusCompat gnssStatusCompat) {
            if (this.f19882c == executor) {
                this.f19881b.b(gnssStatusCompat);
            }
        }

        public void onGpsStatusChanged(int i2) {
            GpsStatus gpsStatus;
            Executor executor = this.f19882c;
            if (executor != null) {
                if (i2 == 1) {
                    executor.execute(new d(this, executor));
                } else if (i2 == 2) {
                    executor.execute(new e(this, executor));
                } else if (i2 == 3) {
                    GpsStatus gpsStatus2 = this.f19880a.getGpsStatus((GpsStatus) null);
                    if (gpsStatus2 != null) {
                        executor.execute(new f(this, executor, gpsStatus2.getTimeToFirstFix()));
                    }
                } else if (i2 == 4 && (gpsStatus = this.f19880a.getGpsStatus((GpsStatus) null)) != null) {
                    executor.execute(new g(this, executor, GnssStatusCompat.b(gpsStatus)));
                }
            }
        }
    }

    public static final class InlineHandlerExecutor implements Executor {

        /* renamed from: z  reason: collision with root package name */
        public final Handler f19883z;

        public void execute(Runnable runnable) {
            if (Looper.myLooper() == this.f19883z.getLooper()) {
                runnable.run();
            } else if (!this.f19883z.post((Runnable) Preconditions.f(runnable))) {
                throw new RejectedExecutionException(this.f19883z + " is shutting down");
            }
        }
    }

    public static class LocationListenerKey {

        /* renamed from: a  reason: collision with root package name */
        public final String f19884a;

        /* renamed from: b  reason: collision with root package name */
        public final LocationListenerCompat f19885b;

        public boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            LocationListenerKey locationListenerKey = (LocationListenerKey) obj;
            return this.f19884a.equals(locationListenerKey.f19884a) && this.f19885b.equals(locationListenerKey.f19885b);
        }

        public int hashCode() {
            return ObjectsCompat.b(this.f19884a, this.f19885b);
        }
    }

    public static class PreRGnssStatusTransport extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final GnssStatusCompat.Callback f19888a;

        /* renamed from: b  reason: collision with root package name */
        public volatile Executor f19889b;

        public final /* synthetic */ void e(Executor executor, int i2) {
            if (this.f19889b == executor) {
                this.f19888a.a(i2);
            }
        }

        public final /* synthetic */ void f(Executor executor, GnssStatus gnssStatus) {
            if (this.f19889b == executor) {
                this.f19888a.b(GnssStatusCompat.a(gnssStatus));
            }
        }

        public final /* synthetic */ void g(Executor executor) {
            if (this.f19889b == executor) {
                this.f19888a.c();
            }
        }

        public final /* synthetic */ void h(Executor executor) {
            if (this.f19889b == executor) {
                this.f19888a.d();
            }
        }

        public void onFirstFix(int i2) {
            Executor executor = this.f19889b;
            if (executor != null) {
                executor.execute(new n(this, executor, i2));
            }
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            Executor executor = this.f19889b;
            if (executor != null) {
                executor.execute(new o(this, executor, gnssStatus));
            }
        }

        public void onStarted() {
            Executor executor = this.f19889b;
            if (executor != null) {
                executor.execute(new q(this, executor));
            }
        }

        public void onStopped() {
            Executor executor = this.f19889b;
            if (executor != null) {
                executor.execute(new p(this, executor));
            }
        }
    }

    public static class LocationListenerTransport implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        public volatile LocationListenerKey f19886a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f19887b;

        public final /* synthetic */ void g(int i2) {
            LocationListenerKey locationListenerKey = this.f19886a;
            if (locationListenerKey != null) {
                locationListenerKey.f19885b.onFlushComplete(i2);
            }
        }

        public final /* synthetic */ void h(Location location) {
            LocationListenerKey locationListenerKey = this.f19886a;
            if (locationListenerKey != null) {
                locationListenerKey.f19885b.onLocationChanged(location);
            }
        }

        public final /* synthetic */ void i(List list) {
            LocationListenerKey locationListenerKey = this.f19886a;
            if (locationListenerKey != null) {
                locationListenerKey.f19885b.onLocationChanged(list);
            }
        }

        public final /* synthetic */ void j(String str) {
            LocationListenerKey locationListenerKey = this.f19886a;
            if (locationListenerKey != null) {
                locationListenerKey.f19885b.onProviderDisabled(str);
            }
        }

        public final /* synthetic */ void k(String str) {
            LocationListenerKey locationListenerKey = this.f19886a;
            if (locationListenerKey != null) {
                locationListenerKey.f19885b.onProviderEnabled(str);
            }
        }

        public final /* synthetic */ void l(String str, int i2, Bundle bundle) {
            LocationListenerKey locationListenerKey = this.f19886a;
            if (locationListenerKey != null) {
                locationListenerKey.f19885b.onStatusChanged(str, i2, bundle);
            }
        }

        public void onFlushComplete(int i2) {
            if (this.f19886a != null) {
                this.f19887b.execute(new l(this, i2));
            }
        }

        public void onLocationChanged(Location location) {
            if (this.f19886a != null) {
                this.f19887b.execute(new k(this, location));
            }
        }

        public void onProviderDisabled(String str) {
            if (this.f19886a != null) {
                this.f19887b.execute(new i(this, str));
            }
        }

        public void onProviderEnabled(String str) {
            if (this.f19886a != null) {
                this.f19887b.execute(new h(this, str));
            }
        }

        public void onStatusChanged(String str, int i2, Bundle bundle) {
            if (this.f19886a != null) {
                this.f19887b.execute(new m(this, str, i2, bundle));
            }
        }

        public void onLocationChanged(List list) {
            if (this.f19886a != null) {
                this.f19887b.execute(new j(this, list));
            }
        }
    }
}
