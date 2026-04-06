package androidx.biometric;

import android.util.Log;
import androidx.core.os.CancellationSignal;

class CancellationSignalProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Injector f1485a = new Injector() {
        public CancellationSignal a() {
            return new CancellationSignal();
        }

        public android.os.CancellationSignal b() {
            return new android.os.CancellationSignal();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public android.os.CancellationSignal f1486b;

    /* renamed from: c  reason: collision with root package name */
    public CancellationSignal f1487c;

    public interface Injector {
        CancellationSignal a();

        android.os.CancellationSignal b();
    }

    public void a() {
        android.os.CancellationSignal cancellationSignal = this.f1486b;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.cancel();
            } catch (NullPointerException e2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e2);
            }
            this.f1486b = null;
        }
        CancellationSignal cancellationSignal2 = this.f1487c;
        if (cancellationSignal2 != null) {
            try {
                cancellationSignal2.a();
            } catch (NullPointerException e3) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e3);
            }
            this.f1487c = null;
        }
    }

    public android.os.CancellationSignal b() {
        if (this.f1486b == null) {
            this.f1486b = this.f1485a.b();
        }
        return this.f1486b;
    }

    public CancellationSignal c() {
        if (this.f1487c == null) {
            this.f1487c = this.f1485a.a();
        }
        return this.f1487c;
    }
}
