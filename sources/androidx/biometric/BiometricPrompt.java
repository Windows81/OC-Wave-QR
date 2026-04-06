package androidx.biometric;

import android.graphics.Bitmap;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricPrompt {

    /* renamed from: a  reason: collision with root package name */
    public FragmentManager f1420a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1421b;

    public static abstract class AuthenticationCallback {
        public void a(int i2, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(AuthenticationResult authenticationResult) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthenticationError {
    }

    public static class AuthenticationResult {

        /* renamed from: a  reason: collision with root package name */
        public final CryptoObject f1422a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1423b;

        public AuthenticationResult(CryptoObject cryptoObject, int i2) {
            this.f1422a = cryptoObject;
            this.f1423b = i2;
        }

        public int a() {
            return this.f1423b;
        }

        public CryptoObject b() {
            return this.f1422a;
        }
    }

    public static class PromptInfo {

        /* renamed from: a  reason: collision with root package name */
        public int f1430a;

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f1431b;

        /* renamed from: c  reason: collision with root package name */
        public String f1432c;

        /* renamed from: d  reason: collision with root package name */
        public final CharSequence f1433d;

        /* renamed from: e  reason: collision with root package name */
        public final CharSequence f1434e;

        /* renamed from: f  reason: collision with root package name */
        public final CharSequence f1435f;

        /* renamed from: g  reason: collision with root package name */
        public PromptContentView f1436g;

        /* renamed from: h  reason: collision with root package name */
        public final CharSequence f1437h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f1438i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f1439j;

        /* renamed from: k  reason: collision with root package name */
        public final int f1440k;

        public static class Builder {

            /* renamed from: a  reason: collision with root package name */
            public int f1441a = -1;

            /* renamed from: b  reason: collision with root package name */
            public Bitmap f1442b = null;

            /* renamed from: c  reason: collision with root package name */
            public String f1443c = null;

            /* renamed from: d  reason: collision with root package name */
            public CharSequence f1444d = null;

            /* renamed from: e  reason: collision with root package name */
            public CharSequence f1445e = null;

            /* renamed from: f  reason: collision with root package name */
            public CharSequence f1446f = null;

            /* renamed from: g  reason: collision with root package name */
            public PromptContentView f1447g = null;

            /* renamed from: h  reason: collision with root package name */
            public CharSequence f1448h = null;

            /* renamed from: i  reason: collision with root package name */
            public boolean f1449i = true;

            /* renamed from: j  reason: collision with root package name */
            public boolean f1450j = false;

            /* renamed from: k  reason: collision with root package name */
            public int f1451k = 0;

            public PromptInfo a() {
                if (TextUtils.isEmpty(this.f1444d)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                } else if (AuthenticatorUtils.f(this.f1451k)) {
                    int i2 = this.f1451k;
                    boolean d2 = i2 != 0 ? AuthenticatorUtils.d(i2) : this.f1450j;
                    if (TextUtils.isEmpty(this.f1448h) && !d2) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    } else if (TextUtils.isEmpty(this.f1448h) || !d2) {
                        return new PromptInfo(this.f1441a, this.f1442b, this.f1443c, this.f1444d, this.f1445e, this.f1446f, this.f1447g, this.f1448h, this.f1449i, this.f1450j, this.f1451k);
                    } else {
                        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                    }
                } else {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AuthenticatorUtils.a(this.f1451k));
                }
            }

            public Builder b(int i2) {
                this.f1451k = i2;
                return this;
            }

            public Builder c(CharSequence charSequence) {
                this.f1446f = charSequence;
                return this;
            }

            public Builder d(CharSequence charSequence) {
                this.f1445e = charSequence;
                return this;
            }

            public Builder e(CharSequence charSequence) {
                this.f1444d = charSequence;
                return this;
            }
        }

        public PromptInfo(int i2, Bitmap bitmap, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PromptContentView promptContentView, CharSequence charSequence4, boolean z2, boolean z3, int i3) {
            this.f1430a = i2;
            this.f1431b = bitmap;
            this.f1432c = str;
            this.f1433d = charSequence;
            this.f1434e = charSequence2;
            this.f1435f = charSequence3;
            this.f1436g = promptContentView;
            this.f1437h = charSequence4;
            this.f1438i = z2;
            this.f1439j = z3;
            this.f1440k = i3;
        }

        public int a() {
            return this.f1440k;
        }

        public PromptContentView b() {
            return this.f1436g;
        }

        public CharSequence c() {
            return this.f1435f;
        }

        public Bitmap d() {
            return this.f1431b;
        }

        public String e() {
            return this.f1432c;
        }

        public int f() {
            return this.f1430a;
        }

        public CharSequence g() {
            CharSequence charSequence = this.f1437h;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence h() {
            return this.f1434e;
        }

        public CharSequence i() {
            return this.f1433d;
        }

        public boolean j() {
            return this.f1438i;
        }

        public boolean k() {
            return this.f1439j;
        }
    }

    public static class ResetCallbackObserver implements DefaultLifecycleObserver {

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f1452z;

        public void D(LifecycleOwner lifecycleOwner) {
            if (this.f1452z.get() != null) {
                ((BiometricViewModel) this.f1452z.get()).R();
            }
        }
    }

    public BiometricPrompt(FragmentActivity fragmentActivity, AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        } else if (authenticationCallback != null) {
            g(true, fragmentActivity.f0(), (BiometricViewModel) new ViewModelProvider((ViewModelStoreOwner) fragmentActivity).a(BiometricViewModel.class), (Executor) null, authenticationCallback);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }

    public static BiometricFragment d(FragmentManager fragmentManager) {
        return (BiometricFragment) fragmentManager.l0("androidx.biometric.BiometricFragment");
    }

    public static BiometricViewModel f(Fragment fragment, boolean z2) {
        ViewModelStoreOwner l2 = z2 ? fragment.l() : null;
        if (l2 == null) {
            l2 = fragment.I();
        }
        if (l2 != null) {
            return (BiometricViewModel) new ViewModelProvider(l2).a(BiometricViewModel.class);
        }
        throw new IllegalStateException("view model not found");
    }

    public void a(PromptInfo promptInfo) {
        if (promptInfo != null) {
            b(promptInfo, (CryptoObject) null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }

    public final void b(PromptInfo promptInfo, CryptoObject cryptoObject) {
        FragmentManager fragmentManager = this.f1420a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.T0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            e().j2(promptInfo, cryptoObject);
        }
    }

    public void c() {
        FragmentManager fragmentManager = this.f1420a;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        BiometricFragment d2 = d(fragmentManager);
        if (d2 == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            d2.m2(3);
        }
    }

    public final BiometricFragment e() {
        BiometricFragment d2 = d(this.f1420a);
        if (d2 != null) {
            return d2;
        }
        BiometricFragment R2 = BiometricFragment.R2(this.f1421b);
        this.f1420a.p().e(R2, "androidx.biometric.BiometricFragment").i();
        this.f1420a.h0();
        return R2;
    }

    public final void g(boolean z2, FragmentManager fragmentManager, BiometricViewModel biometricViewModel, Executor executor, AuthenticationCallback authenticationCallback) {
        this.f1421b = z2;
        this.f1420a = fragmentManager;
        if (executor != null) {
            biometricViewModel.a0(executor);
        }
        biometricViewModel.Z(authenticationCallback);
    }

    public static class CryptoObject {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f1424a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f1425b;

        /* renamed from: c  reason: collision with root package name */
        public final Mac f1426c;

        /* renamed from: d  reason: collision with root package name */
        public final IdentityCredential f1427d;

        /* renamed from: e  reason: collision with root package name */
        public final PresentationSession f1428e;

        /* renamed from: f  reason: collision with root package name */
        public final long f1429f;

        public CryptoObject(Signature signature) {
            this.f1424a = signature;
            this.f1425b = null;
            this.f1426c = null;
            this.f1427d = null;
            this.f1428e = null;
            this.f1429f = 0;
        }

        public Cipher a() {
            return this.f1425b;
        }

        public IdentityCredential b() {
            return this.f1427d;
        }

        public Mac c() {
            return this.f1426c;
        }

        public long d() {
            return this.f1429f;
        }

        public PresentationSession e() {
            return this.f1428e;
        }

        public Signature f() {
            return this.f1424a;
        }

        public CryptoObject(Cipher cipher) {
            this.f1424a = null;
            this.f1425b = cipher;
            this.f1426c = null;
            this.f1427d = null;
            this.f1428e = null;
            this.f1429f = 0;
        }

        public CryptoObject(Mac mac) {
            this.f1424a = null;
            this.f1425b = null;
            this.f1426c = mac;
            this.f1427d = null;
            this.f1428e = null;
            this.f1429f = 0;
        }

        public CryptoObject(IdentityCredential identityCredential) {
            this.f1424a = null;
            this.f1425b = null;
            this.f1426c = null;
            this.f1427d = identityCredential;
            this.f1428e = null;
            this.f1429f = 0;
        }

        public CryptoObject(PresentationSession presentationSession) {
            this.f1424a = null;
            this.f1425b = null;
            this.f1426c = null;
            this.f1427d = null;
            this.f1428e = presentationSession;
            this.f1429f = 0;
        }

        public CryptoObject(long j2) {
            this.f1424a = null;
            this.f1425b = null;
            this.f1426c = null;
            this.f1427d = null;
            this.f1428e = null;
            this.f1429f = j2;
        }
    }
}
