package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class FingerprintManagerCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19856a;

    public static class Api23Impl {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i2, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i2, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static CryptoObject f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.a() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.a());
            }
            if (cryptoObject.c() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.c());
            }
            if (cryptoObject.b() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.b());
            }
            return null;
        }
    }

    public static abstract class AuthenticationCallback {
        public void a(int i2, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i2, CharSequence charSequence) {
        }

        public void d(AuthenticationResult authenticationResult) {
        }
    }

    public static final class AuthenticationResult {

        /* renamed from: a  reason: collision with root package name */
        public final CryptoObject f19858a;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.f19858a = cryptoObject;
        }

        public CryptoObject a() {
            return this.f19858a;
        }
    }

    public FingerprintManagerCompat(Context context) {
        this.f19856a = context;
    }

    public static FingerprintManagerCompat c(Context context) {
        return new FingerprintManagerCompat(context);
    }

    public static FingerprintManager d(Context context) {
        return Api23Impl.c(context);
    }

    public static CryptoObject g(FingerprintManager.CryptoObject cryptoObject) {
        return Api23Impl.f(cryptoObject);
    }

    public static FingerprintManager.AuthenticationCallback h(final AuthenticationCallback authenticationCallback) {
        return new FingerprintManager.AuthenticationCallback() {
            public void onAuthenticationError(int i2, CharSequence charSequence) {
                AuthenticationCallback.this.a(i2, charSequence);
            }

            public void onAuthenticationFailed() {
                AuthenticationCallback.this.b();
            }

            public void onAuthenticationHelp(int i2, CharSequence charSequence) {
                AuthenticationCallback.this.c(i2, charSequence);
            }

            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                AuthenticationCallback.this.d(new AuthenticationResult(FingerprintManagerCompat.g(Api23Impl.b(authenticationResult))));
            }
        };
    }

    public static FingerprintManager.CryptoObject i(CryptoObject cryptoObject) {
        return Api23Impl.g(cryptoObject);
    }

    public void a(CryptoObject cryptoObject, int i2, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        FingerprintManager d2 = d(this.f19856a);
        if (d2 != null) {
            Api23Impl.a(d2, i(cryptoObject), cancellationSignal, i2, h(authenticationCallback), handler);
        }
    }

    public void b(CryptoObject cryptoObject, int i2, androidx.core.os.CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        a(cryptoObject, i2, cancellationSignal != null ? (CancellationSignal) cancellationSignal.b() : null, authenticationCallback, handler);
    }

    public boolean e() {
        FingerprintManager d2 = d(this.f19856a);
        return d2 != null && Api23Impl.d(d2);
    }

    public boolean f() {
        FingerprintManager d2 = d(this.f19856a);
        return d2 != null && Api23Impl.e(d2);
    }

    public static class CryptoObject {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f19859a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f19860b;

        /* renamed from: c  reason: collision with root package name */
        public final Mac f19861c;

        public CryptoObject(Signature signature) {
            this.f19859a = signature;
            this.f19860b = null;
            this.f19861c = null;
        }

        public Cipher a() {
            return this.f19860b;
        }

        public Mac b() {
            return this.f19861c;
        }

        public Signature c() {
            return this.f19859a;
        }

        public CryptoObject(Cipher cipher) {
            this.f19860b = cipher;
            this.f19859a = null;
            this.f19861c = null;
        }

        public CryptoObject(Mac mac) {
            this.f19861c = mac;
            this.f19860b = null;
            this.f19859a = null;
        }
    }
}
