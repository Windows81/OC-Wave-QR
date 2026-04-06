package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

class CryptoObjectUtils {

    public static class Api23Impl {
        public static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        public static KeyGenParameterSpec.Builder b(String str, int i2) {
            return new KeyGenParameterSpec.Builder(str, i2);
        }

        public static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes(new String[]{"CBC"});
        }

        public static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
        }
    }

    public static class Api28Impl {
        public static BiometricPrompt.CryptoObject a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        public static BiometricPrompt.CryptoObject b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        public static BiometricPrompt.CryptoObject c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        public static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        public static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        public static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    public static class Api30Impl {
        public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    public static class Api33Impl {
        public static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        public static PresentationSession b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    public static class Api35Impl {
        public static BiometricPrompt.CryptoObject a(long j2) {
            return new BiometricPrompt.CryptoObject(j2);
        }

        public static long b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getOperationHandle();
        }
    }

    public static BiometricPrompt.CryptoObject a() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder b2 = Api23Impl.b("androidxBiometric", 3);
            Api23Impl.d(b2);
            Api23Impl.e(b2);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            Api23Impl.c(instance2, Api23Impl.a(b2));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
            return new BiometricPrompt.CryptoObject(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e2) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e2);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(BiometricPrompt.CryptoObject cryptoObject) {
        PresentationSession b2;
        IdentityCredential b3;
        if (cryptoObject == null) {
            return null;
        }
        Cipher d2 = Api28Impl.d(cryptoObject);
        if (d2 != null) {
            return new BiometricPrompt.CryptoObject(d2);
        }
        Signature f2 = Api28Impl.f(cryptoObject);
        if (f2 != null) {
            return new BiometricPrompt.CryptoObject(f2);
        }
        Mac e2 = Api28Impl.e(cryptoObject);
        if (e2 != null) {
            return new BiometricPrompt.CryptoObject(e2);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && (b3 = Api30Impl.b(cryptoObject)) != null) {
            return new BiometricPrompt.CryptoObject(b3);
        }
        if (i2 >= 33 && (b2 = Api33Impl.b(cryptoObject)) != null) {
            return new BiometricPrompt.CryptoObject(b2);
        }
        if (i2 >= 35) {
            long b4 = Api35Impl.b(cryptoObject);
            if (b4 != 0) {
                return new BiometricPrompt.CryptoObject(b4);
            }
        }
        return null;
    }

    public static BiometricPrompt.CryptoObject c(FingerprintManagerCompat.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher a2 = cryptoObject.a();
        if (a2 != null) {
            return new BiometricPrompt.CryptoObject(a2);
        }
        Signature c2 = cryptoObject.c();
        if (c2 != null) {
            return new BiometricPrompt.CryptoObject(c2);
        }
        Mac b2 = cryptoObject.b();
        if (b2 != null) {
            return new BiometricPrompt.CryptoObject(b2);
        }
        return null;
    }

    public static BiometricPrompt.CryptoObject d(BiometricPrompt.CryptoObject cryptoObject) {
        PresentationSession e2;
        IdentityCredential b2;
        if (cryptoObject == null) {
            return null;
        }
        Cipher a2 = cryptoObject.a();
        if (a2 != null) {
            return Api28Impl.b(a2);
        }
        Signature f2 = cryptoObject.f();
        if (f2 != null) {
            return Api28Impl.a(f2);
        }
        Mac c2 = cryptoObject.c();
        if (c2 != null) {
            return Api28Impl.c(c2);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && (b2 = cryptoObject.b()) != null) {
            return Api30Impl.a(b2);
        }
        if (i2 >= 33 && (e2 = cryptoObject.e()) != null) {
            return Api33Impl.a(e2);
        }
        if (i2 >= 35) {
            long d2 = cryptoObject.d();
            if (d2 != 0) {
                return Api35Impl.a(d2);
            }
        }
        return null;
    }

    public static FingerprintManagerCompat.CryptoObject e(BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher a2 = cryptoObject.a();
        if (a2 != null) {
            return new FingerprintManagerCompat.CryptoObject(a2);
        }
        Signature f2 = cryptoObject.f();
        if (f2 != null) {
            return new FingerprintManagerCompat.CryptoObject(f2);
        }
        Mac c2 = cryptoObject.c();
        if (c2 != null) {
            return new FingerprintManagerCompat.CryptoObject(c2);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && cryptoObject.b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
            return null;
        } else if (i2 < 33 || cryptoObject.e() == null) {
            if (i2 >= 35) {
                Log.e("CryptoObjectUtils", "Operation handle is not supported by FingerprintManager.");
            }
            return null;
        } else {
            Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
            return null;
        }
    }
}
