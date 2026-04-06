package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.biometrics.PromptContentView;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public class BiometricFragment extends Fragment {
    public BiometricViewModel B0;
    public Handler C0 = new Handler(Looper.getMainLooper());

    public static class Api21Impl {
        public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    public static class Api28Impl {
        public static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class Api29Impl {
        public static void a(BiometricPrompt.Builder builder, boolean z2) {
            builder.setConfirmationRequired(z2);
        }

        public static void b(BiometricPrompt.Builder builder, boolean z2) {
            builder.setDeviceCredentialAllowed(z2);
        }
    }

    public static class Api30Impl {
        public static void a(BiometricPrompt.Builder builder, int i2) {
            builder.setAllowedAuthenticators(i2);
        }
    }

    public static class Api35Impl {
        public static void a(BiometricPrompt.Builder builder, PromptContentView promptContentView) {
            builder.setContentView(promptContentView);
        }

        public static void b(BiometricPrompt.Builder builder, Bitmap bitmap) {
            builder.setLogoBitmap(bitmap);
        }

        public static void c(BiometricPrompt.Builder builder, String str) {
            builder.setLogoDescription(str);
        }

        public static void d(BiometricPrompt.Builder builder, int i2) {
            builder.setLogoRes(i2);
        }
    }

    public static class PromptExecutor implements Executor {

        /* renamed from: z  reason: collision with root package name */
        public final Handler f1412z = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.f1412z.post(runnable);
        }
    }

    public static class ShowPromptForAuthenticationRunnable implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f1413z;

        public ShowPromptForAuthenticationRunnable(BiometricFragment biometricFragment) {
            this.f1413z = new WeakReference(biometricFragment);
        }

        public void run() {
            if (this.f1413z.get() != null) {
                ((BiometricFragment) this.f1413z.get()).h3();
            }
        }
    }

    public static class StopDelayingPromptRunnable implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f1414z;

        public StopDelayingPromptRunnable(BiometricViewModel biometricViewModel) {
            this.f1414z = new WeakReference(biometricViewModel);
        }

        public void run() {
            if (this.f1414z.get() != null) {
                ((BiometricViewModel) this.f1414z.get()).d0(false);
            }
        }
    }

    public static class StopIgnoringCancelRunnable implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f1415z;

        public StopIgnoringCancelRunnable(BiometricViewModel biometricViewModel) {
            this.f1415z = new WeakReference(biometricViewModel);
        }

        public void run() {
            if (this.f1415z.get() != null) {
                ((BiometricViewModel) this.f1415z.get()).j0(false);
            }
        }
    }

    public static BiometricFragment R2(boolean z2) {
        BiometricFragment biometricFragment = new BiometricFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z2);
        biometricFragment.H1(bundle);
        return biometricFragment;
    }

    public static int n2(FingerprintManagerCompat fingerprintManagerCompat) {
        if (!fingerprintManagerCompat.f()) {
            return 12;
        }
        return !fingerprintManagerCompat.e() ? 11 : 0;
    }

    private boolean w2() {
        FragmentActivity l2 = l();
        return l2 != null && l2.isChangingConfigurations();
    }

    public final boolean A2() {
        Context u2 = u();
        if (u2 == null || !DeviceUtils.h(u2, Build.MANUFACTURER)) {
            return false;
        }
        int g2 = this.B0.g();
        if (!AuthenticatorUtils.g(g2) || !AuthenticatorUtils.d(g2)) {
            return false;
        }
        this.B0.p0(true);
        return true;
    }

    public final boolean B2() {
        Context u2 = u();
        if (Build.VERSION.SDK_INT != 29 || u2() || t2() || v2()) {
            return C2() && BiometricManager.g(u2).a(255) != 0;
        }
        return true;
    }

    public boolean C2() {
        return Build.VERSION.SDK_INT <= 28 && AuthenticatorUtils.d(this.B0.g());
    }

    public final boolean D2() {
        return Build.VERSION.SDK_INT < 28 || x2() || y2();
    }

    public final /* synthetic */ void E2(BiometricPrompt.AuthenticationResult authenticationResult) {
        if (authenticationResult != null) {
            V2(authenticationResult);
            this.B0.V((BiometricPrompt.AuthenticationResult) null);
        }
    }

    public final /* synthetic */ void F2(BiometricErrorData biometricErrorData) {
        if (biometricErrorData != null) {
            S2(biometricErrorData.b(), biometricErrorData.c());
            this.B0.S((BiometricErrorData) null);
        }
    }

    public final /* synthetic */ void G2(CharSequence charSequence) {
        if (charSequence != null) {
            U2(charSequence);
            this.B0.S((BiometricErrorData) null);
        }
    }

    public final /* synthetic */ void H2(Boolean bool) {
        if (bool.booleanValue()) {
            T2();
            this.B0.T(false);
        }
    }

    public final /* synthetic */ void I2(Boolean bool) {
        if (bool.booleanValue()) {
            if (C2()) {
                X2();
            } else {
                W2();
            }
            this.B0.l0(false);
        }
    }

    public final /* synthetic */ void J2(Boolean bool) {
        if (bool.booleanValue()) {
            Y2();
            this.B0.k0(false);
        }
    }

    public final /* synthetic */ void K2(Boolean bool) {
        if (bool.booleanValue()) {
            m2(1);
            p2();
            this.B0.e0(false);
        }
    }

    public final /* synthetic */ void M2(int i2, CharSequence charSequence) {
        this.B0.o().a(i2, charSequence);
    }

    public final /* synthetic */ void N2() {
        this.B0.o().b();
    }

    public final /* synthetic */ void O2(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.B0.o().c(authenticationResult);
    }

    public final /* synthetic */ void P2() {
        this.B0.f0(false);
    }

    public final void Q2() {
        Context u2 = u();
        KeyguardManager a2 = u2 != null ? KeyguardUtils.a(u2) : null;
        if (a2 == null) {
            L2(12, W(R.string.f1521k));
            return;
        }
        CharSequence E = this.B0.E();
        CharSequence D = this.B0.D();
        CharSequence s2 = this.B0.s();
        if (D == null) {
            D = s2;
        }
        Intent a3 = Api21Impl.a(a2, E, D);
        if (a3 == null) {
            L2(14, W(R.string.f1520j));
            return;
        }
        this.B0.b0(true);
        if (D2()) {
            q2();
        }
        a3.setFlags(134742016);
        startActivityForResult(a3, 1);
    }

    public void S2(int i2, CharSequence charSequence) {
        if (!ErrorUtils.b(i2)) {
            i2 = 8;
        }
        Context u2 = u();
        if (Build.VERSION.SDK_INT < 29 && ErrorUtils.c(i2) && u2 != null && KeyguardUtils.b(u2) && AuthenticatorUtils.d(this.B0.g())) {
            Q2();
        } else if (D2()) {
            if (charSequence == null) {
                charSequence = ErrorUtils.a(u(), i2);
            }
            if (i2 == 5) {
                int l2 = this.B0.l();
                if (l2 == 0 || l2 == 3) {
                    a3(i2, charSequence);
                }
                p2();
                return;
            }
            if (this.B0.L()) {
                L2(i2, charSequence);
            } else {
                g3(charSequence);
                this.C0.postDelayed(new c(this, i2, charSequence), (long) r2());
            }
            this.B0.f0(true);
        } else {
            if (charSequence == null) {
                charSequence = W(R.string.f1512b) + " " + i2;
            }
            L2(i2, charSequence);
        }
    }

    public void T2() {
        if (D2()) {
            g3(W(R.string.f1519i));
        }
        b3();
    }

    public void U2(CharSequence charSequence) {
        if (D2()) {
            g3(charSequence);
        }
    }

    public void V2(BiometricPrompt.AuthenticationResult authenticationResult) {
        c3(authenticationResult);
    }

    public void W0() {
        super.W0();
        if (Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.d(this.B0.g())) {
            this.B0.j0(true);
            this.C0.postDelayed(new StopIgnoringCancelRunnable(this.B0), 250);
        }
    }

    public void W2() {
        CharSequence C = this.B0.C();
        if (C == null) {
            C = W(R.string.f1512b);
        }
        L2(13, C);
        m2(2);
    }

    public void X0() {
        super.X0();
        if (Build.VERSION.SDK_INT < 29 && !this.B0.I() && !w2()) {
            m2(0);
        }
    }

    public void X2() {
        Q2();
    }

    public void Y2() {
        L2(16, "More options button in the content view is clicked.");
        m2(4);
    }

    /* renamed from: Z2 */
    public void L2(int i2, CharSequence charSequence) {
        a3(i2, charSequence);
        p2();
    }

    public final void a3(int i2, CharSequence charSequence) {
        if (this.B0.I()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.B0.G()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.B0.W(false);
            this.B0.p().execute(new l(this, i2, charSequence));
        }
    }

    public final void b3() {
        if (!this.B0.G()) {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        } else {
            this.B0.p().execute(new b(this));
        }
    }

    public final void c3(BiometricPrompt.AuthenticationResult authenticationResult) {
        d3(authenticationResult);
        p2();
    }

    public final void d3(BiometricPrompt.AuthenticationResult authenticationResult) {
        if (!this.B0.G()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
            return;
        }
        this.B0.W(false);
        this.B0.p().execute(new d(this, authenticationResult));
    }

    public final void e3() {
        BiometricPrompt.Builder d2 = Api28Impl.d(B1().getApplicationContext());
        CharSequence E = this.B0.E();
        CharSequence D = this.B0.D();
        CharSequence s2 = this.B0.s();
        if (E != null) {
            Api28Impl.h(d2, E);
        }
        if (D != null) {
            Api28Impl.g(d2, D);
        }
        if (s2 != null) {
            Api28Impl.e(d2, s2);
        }
        CharSequence C = this.B0.C();
        if (!TextUtils.isEmpty(C)) {
            Api28Impl.f(d2, C, this.B0.p(), this.B0.B());
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Api29Impl.a(d2, this.B0.H());
        }
        int g2 = this.B0.g();
        if (i2 >= 30) {
            Api30Impl.a(d2, g2);
        } else if (i2 >= 29) {
            Api29Impl.b(d2, AuthenticatorUtils.d(g2));
        }
        if (i2 >= 35) {
            int z2 = this.B0.z();
            Bitmap x2 = this.B0.x();
            String y2 = this.B0.y();
            PromptContentView a2 = PromptContentViewUtils.a(this.B0.q(), this.B0.p(), this.B0.A());
            if (z2 != -1) {
                Api35Impl.d(d2, z2);
            }
            if (x2 != null) {
                Api35Impl.b(d2, x2);
            }
            if (y2 != null && !y2.isEmpty()) {
                Api35Impl.c(d2, y2);
            }
            if (a2 != null) {
                Api35Impl.a(d2, a2);
            }
        }
        k2(Api28Impl.c(d2), u());
    }

    public final void f3() {
        Context applicationContext = B1().getApplicationContext();
        FingerprintManagerCompat c2 = FingerprintManagerCompat.c(applicationContext);
        int n2 = n2(c2);
        if (n2 != 0) {
            L2(n2, ErrorUtils.a(applicationContext, n2));
        } else if (h0()) {
            this.B0.f0(true);
            if (!DeviceUtils.f(applicationContext, Build.MODEL)) {
                this.C0.postDelayed(new a(this), 500);
                FingerprintDialogFragment.o2(z2()).j2(J(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.B0.X(0);
            l2(c2, applicationContext);
        }
    }

    public final void g3(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = W(R.string.f1512b);
        }
        this.B0.i0(2);
        this.B0.g0(charSequence);
    }

    public void h3() {
        if (this.B0.P()) {
            return;
        }
        if (u() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.B0.o0(true);
        this.B0.W(true);
        if (A2()) {
            Q2();
        } else if (D2()) {
            f3();
        } else {
            e3();
        }
    }

    public void j2(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        this.B0.n0(promptInfo);
        int c2 = AuthenticatorUtils.c(promptInfo, cryptoObject);
        if (Build.VERSION.SDK_INT < 30 && c2 == 15 && cryptoObject == null) {
            this.B0.c0(CryptoObjectUtils.a());
        } else {
            this.B0.c0(cryptoObject);
        }
        if (C2()) {
            this.B0.m0(W(R.string.f1511a));
        } else {
            this.B0.m0((CharSequence) null);
        }
        if (B2()) {
            this.B0.W(true);
            Q2();
        } else if (this.B0.J()) {
            this.C0.postDelayed(new ShowPromptForAuthenticationRunnable(this), 600);
        } else {
            h3();
        }
    }

    public void k2(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject d2 = CryptoObjectUtils.d(this.B0.r());
        CancellationSignal b2 = this.B0.m().b();
        PromptExecutor promptExecutor = new PromptExecutor();
        BiometricPrompt$AuthenticationCallback a2 = this.B0.h().a();
        if (d2 == null) {
            try {
                Api28Impl.b(biometricPrompt, b2, promptExecutor, a2);
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                L2(1, context != null ? context.getString(R.string.f1512b) : "");
            }
        } else {
            Api28Impl.a(biometricPrompt, d2, b2, promptExecutor, a2);
        }
    }

    public void l2(FingerprintManagerCompat fingerprintManagerCompat, Context context) {
        try {
            fingerprintManagerCompat.b(CryptoObjectUtils.e(this.B0.r()), 0, this.B0.m().c(), this.B0.h().b(), (Handler) null);
        } catch (NullPointerException e2) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
            L2(1, ErrorUtils.a(context, 1));
        }
    }

    public void m2(int i2) {
        if (i2 == 3 || !this.B0.M()) {
            if (D2()) {
                this.B0.X(i2);
                if (i2 == 1) {
                    a3(10, ErrorUtils.a(u(), 10));
                }
            }
            this.B0.m().a();
        }
    }

    public final void o2() {
        this.B0.Y(l());
        this.B0.k().i(this, new e(this));
        this.B0.i().i(this, new f(this));
        this.B0.j().i(this, new g(this));
        this.B0.F().i(this, new h(this));
        this.B0.O().i(this, new i(this));
        this.B0.N().i(this, new j(this));
        this.B0.K().i(this, new k(this));
    }

    public void p2() {
        q2();
        this.B0.o0(false);
        if (!this.B0.I() && h0()) {
            J().p().p(this).i();
        }
        Context u2 = u();
        if (u2 != null && DeviceUtils.e(u2, Build.MODEL)) {
            this.B0.d0(true);
            this.C0.postDelayed(new StopDelayingPromptRunnable(this.B0), 600);
        }
    }

    public final void q2() {
        this.B0.o0(false);
        if (h0()) {
            FragmentManager J = J();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) J.l0("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment == null) {
                return;
            }
            if (fingerprintDialogFragment.h0()) {
                fingerprintDialogFragment.a2();
            } else {
                J.p().p(fingerprintDialogFragment).i();
            }
        }
    }

    public final int r2() {
        Context u2 = u();
        return (u2 == null || !DeviceUtils.f(u2, Build.MODEL)) ? 2000 : 0;
    }

    public final void s2(int i2) {
        int i3 = -1;
        if (i2 == -1) {
            if (this.B0.Q()) {
                this.B0.p0(false);
            } else {
                i3 = 1;
            }
            c3(new BiometricPrompt.AuthenticationResult((BiometricPrompt.CryptoObject) null, i3));
            return;
        }
        L2(10, W(R.string.f1522l));
    }

    public final boolean t2() {
        return r().getBoolean("has_face", PackageUtils.a(u()));
    }

    public void u0(int i2, int i3, Intent intent) {
        super.u0(i2, i3, intent);
        if (i2 == 1) {
            this.B0.b0(false);
            s2(i3);
        }
    }

    public final boolean u2() {
        return r().getBoolean("has_fingerprint", PackageUtils.b(u()));
    }

    public final boolean v2() {
        return r().getBoolean("has_iris", PackageUtils.c(u()));
    }

    public final boolean x2() {
        Context u2 = u();
        return (u2 == null || this.B0.r() == null || !DeviceUtils.g(u2, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    public final boolean y2() {
        return Build.VERSION.SDK_INT == 28 && !u2();
    }

    public void z0(Bundle bundle) {
        super.z0(bundle);
        if (this.B0 == null) {
            this.B0 = BiometricPrompt.f(this, z2());
        }
        o2();
    }

    public final boolean z2() {
        return r().getBoolean("host_activity", true);
    }
}
