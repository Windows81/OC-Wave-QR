package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;

class AuthenticationCallbackProvider {

    /* renamed from: a  reason: collision with root package name */
    public BiometricPrompt$AuthenticationCallback f1405a;

    /* renamed from: b  reason: collision with root package name */
    public FingerprintManagerCompat.AuthenticationCallback f1406b;

    /* renamed from: c  reason: collision with root package name */
    public final Listener f1407c;

    public static class Api28Impl {
        public static BiometricPrompt$AuthenticationCallback a(final Listener listener) {
            return new BiometricPrompt$AuthenticationCallback() {
                public void onAuthenticationError(int i2, CharSequence charSequence) {
                    Listener.this.a(i2, charSequence);
                }

                public void onAuthenticationFailed() {
                    Listener.this.b();
                }

                public void onAuthenticationHelp(int i2, CharSequence charSequence) {
                }

                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject b2 = authenticationResult != null ? CryptoObjectUtils.b(Api28Impl.b(authenticationResult)) : null;
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = -1;
                    if (i2 >= 30) {
                        if (authenticationResult != null) {
                            i3 = Api30Impl.a(authenticationResult);
                        }
                    } else if (i2 != 29) {
                        i3 = 2;
                    }
                    Listener.this.d(new BiometricPrompt.AuthenticationResult(b2, i3));
                }
            };
        }

        public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    public static class Api30Impl {
        public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    public static class Listener {
        public void a(int i2, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(CharSequence charSequence) {
        }

        public void d(BiometricPrompt.AuthenticationResult authenticationResult) {
        }
    }

    public AuthenticationCallbackProvider(Listener listener) {
        this.f1407c = listener;
    }

    public BiometricPrompt$AuthenticationCallback a() {
        if (this.f1405a == null) {
            this.f1405a = Api28Impl.a(this.f1407c);
        }
        return this.f1405a;
    }

    public FingerprintManagerCompat.AuthenticationCallback b() {
        if (this.f1406b == null) {
            this.f1406b = new FingerprintManagerCompat.AuthenticationCallback() {
                public void a(int i2, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.f1407c.a(i2, charSequence);
                }

                public void b() {
                    AuthenticationCallbackProvider.this.f1407c.b();
                }

                public void c(int i2, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.f1407c.c(charSequence);
                }

                public void d(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                    AuthenticationCallbackProvider.this.f1407c.d(new BiometricPrompt.AuthenticationResult(authenticationResult != null ? CryptoObjectUtils.c(authenticationResult.a()) : null, 2));
                }
            };
        }
        return this.f1406b;
    }
}
