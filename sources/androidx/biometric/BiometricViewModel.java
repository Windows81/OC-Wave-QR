package androidx.biometric;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.AuthenticationCallbackProvider;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public class BiometricViewModel extends ViewModel {

    /* renamed from: A  reason: collision with root package name */
    public int f1453A = 0;

    /* renamed from: B  reason: collision with root package name */
    public MutableLiveData f1454B;
    public MutableLiveData C;

    /* renamed from: b  reason: collision with root package name */
    public Executor f1455b;

    /* renamed from: c  reason: collision with root package name */
    public BiometricPrompt.AuthenticationCallback f1456c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f1457d;

    /* renamed from: e  reason: collision with root package name */
    public BiometricPrompt.PromptInfo f1458e;

    /* renamed from: f  reason: collision with root package name */
    public BiometricPrompt.CryptoObject f1459f;

    /* renamed from: g  reason: collision with root package name */
    public AuthenticationCallbackProvider f1460g;

    /* renamed from: h  reason: collision with root package name */
    public CancellationSignalProvider f1461h;

    /* renamed from: i  reason: collision with root package name */
    public DialogInterface.OnClickListener f1462i;

    /* renamed from: j  reason: collision with root package name */
    public DialogInterface.OnClickListener f1463j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1464k;

    /* renamed from: l  reason: collision with root package name */
    public int f1465l = 0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1466m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1467n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1468o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1469p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1470q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1471r;

    /* renamed from: s  reason: collision with root package name */
    public MutableLiveData f1472s;

    /* renamed from: t  reason: collision with root package name */
    public MutableLiveData f1473t;

    /* renamed from: u  reason: collision with root package name */
    public MutableLiveData f1474u;

    /* renamed from: v  reason: collision with root package name */
    public MutableLiveData f1475v;

    /* renamed from: w  reason: collision with root package name */
    public MutableLiveData f1476w;

    /* renamed from: x  reason: collision with root package name */
    public MutableLiveData f1477x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1478y = true;

    /* renamed from: z  reason: collision with root package name */
    public MutableLiveData f1479z;

    public static final class CallbackListener extends AuthenticationCallbackProvider.Listener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f1481a;

        public CallbackListener(BiometricViewModel biometricViewModel) {
            this.f1481a = new WeakReference(biometricViewModel);
        }

        public void a(int i2, CharSequence charSequence) {
            if (this.f1481a.get() != null && !((BiometricViewModel) this.f1481a.get()).I() && ((BiometricViewModel) this.f1481a.get()).G()) {
                ((BiometricViewModel) this.f1481a.get()).S(new BiometricErrorData(i2, charSequence));
            }
        }

        public void b() {
            if (this.f1481a.get() != null && ((BiometricViewModel) this.f1481a.get()).G()) {
                ((BiometricViewModel) this.f1481a.get()).T(true);
            }
        }

        public void c(CharSequence charSequence) {
            if (this.f1481a.get() != null) {
                ((BiometricViewModel) this.f1481a.get()).U(charSequence);
            }
        }

        public void d(BiometricPrompt.AuthenticationResult authenticationResult) {
            if (this.f1481a.get() != null && ((BiometricViewModel) this.f1481a.get()).G()) {
                if (authenticationResult.a() == -1) {
                    authenticationResult = new BiometricPrompt.AuthenticationResult(authenticationResult.b(), ((BiometricViewModel) this.f1481a.get()).w());
                }
                ((BiometricViewModel) this.f1481a.get()).V(authenticationResult);
            }
        }
    }

    public static class DefaultExecutor implements Executor {

        /* renamed from: z  reason: collision with root package name */
        public final Handler f1482z = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.f1482z.post(runnable);
        }
    }

    public static class MoreOptionsButtonListener implements DialogInterface.OnClickListener {

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f1483z;

        public MoreOptionsButtonListener(BiometricViewModel biometricViewModel) {
            this.f1483z = new WeakReference(biometricViewModel);
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            if (this.f1483z.get() != null) {
                ((BiometricViewModel) this.f1483z.get()).k0(true);
            }
        }
    }

    public static class NegativeButtonListener implements DialogInterface.OnClickListener {

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f1484z;

        public NegativeButtonListener(BiometricViewModel biometricViewModel) {
            this.f1484z = new WeakReference(biometricViewModel);
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            if (this.f1484z.get() != null) {
                ((BiometricViewModel) this.f1484z.get()).l0(true);
            }
        }
    }

    public static void q0(MutableLiveData mutableLiveData, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.o(obj);
        } else {
            mutableLiveData.m(obj);
        }
    }

    public DialogInterface.OnClickListener A() {
        if (this.f1463j == null) {
            this.f1463j = new MoreOptionsButtonListener(this);
        }
        return this.f1463j;
    }

    public DialogInterface.OnClickListener B() {
        if (this.f1462i == null) {
            this.f1462i = new NegativeButtonListener(this);
        }
        return this.f1462i;
    }

    public CharSequence C() {
        CharSequence charSequence = this.f1464k;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.g();
        }
        return null;
    }

    public CharSequence D() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.h();
        }
        return null;
    }

    public CharSequence E() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.i();
        }
        return null;
    }

    public LiveData F() {
        if (this.f1475v == null) {
            this.f1475v = new MutableLiveData();
        }
        return this.f1475v;
    }

    public boolean G() {
        return this.f1467n;
    }

    public boolean H() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        return promptInfo == null || promptInfo.j();
    }

    public boolean I() {
        return this.f1468o;
    }

    public boolean J() {
        return this.f1469p;
    }

    public LiveData K() {
        if (this.f1479z == null) {
            this.f1479z = new MutableLiveData();
        }
        return this.f1479z;
    }

    public boolean L() {
        return this.f1478y;
    }

    public boolean M() {
        return this.f1470q;
    }

    public LiveData N() {
        if (this.f1477x == null) {
            this.f1477x = new MutableLiveData();
        }
        return this.f1477x;
    }

    public LiveData O() {
        if (this.f1476w == null) {
            this.f1476w = new MutableLiveData();
        }
        return this.f1476w;
    }

    public boolean P() {
        return this.f1466m;
    }

    public boolean Q() {
        return this.f1471r;
    }

    public void R() {
        this.f1456c = null;
    }

    public void S(BiometricErrorData biometricErrorData) {
        if (this.f1473t == null) {
            this.f1473t = new MutableLiveData();
        }
        q0(this.f1473t, biometricErrorData);
    }

    public void T(boolean z2) {
        if (this.f1475v == null) {
            this.f1475v = new MutableLiveData();
        }
        q0(this.f1475v, Boolean.valueOf(z2));
    }

    public void U(CharSequence charSequence) {
        if (this.f1474u == null) {
            this.f1474u = new MutableLiveData();
        }
        q0(this.f1474u, charSequence);
    }

    public void V(BiometricPrompt.AuthenticationResult authenticationResult) {
        if (this.f1472s == null) {
            this.f1472s = new MutableLiveData();
        }
        q0(this.f1472s, authenticationResult);
    }

    public void W(boolean z2) {
        this.f1467n = z2;
    }

    public void X(int i2) {
        this.f1465l = i2;
    }

    public void Y(FragmentActivity fragmentActivity) {
        this.f1457d = new WeakReference(fragmentActivity);
    }

    public void Z(BiometricPrompt.AuthenticationCallback authenticationCallback) {
        this.f1456c = authenticationCallback;
    }

    public void a0(Executor executor) {
        this.f1455b = executor;
    }

    public void b0(boolean z2) {
        this.f1468o = z2;
    }

    public void c0(BiometricPrompt.CryptoObject cryptoObject) {
        this.f1459f = cryptoObject;
    }

    public void d0(boolean z2) {
        this.f1469p = z2;
    }

    public void e0(boolean z2) {
        if (this.f1479z == null) {
            this.f1479z = new MutableLiveData();
        }
        q0(this.f1479z, Boolean.valueOf(z2));
    }

    public void f0(boolean z2) {
        this.f1478y = z2;
    }

    public int g() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return AuthenticatorUtils.c(promptInfo, this.f1459f);
        }
        return 0;
    }

    public void g0(CharSequence charSequence) {
        if (this.C == null) {
            this.C = new MutableLiveData();
        }
        q0(this.C, charSequence);
    }

    public AuthenticationCallbackProvider h() {
        if (this.f1460g == null) {
            this.f1460g = new AuthenticationCallbackProvider(new CallbackListener(this));
        }
        return this.f1460g;
    }

    public void h0(int i2) {
        this.f1453A = i2;
    }

    public MutableLiveData i() {
        if (this.f1473t == null) {
            this.f1473t = new MutableLiveData();
        }
        return this.f1473t;
    }

    public void i0(int i2) {
        if (this.f1454B == null) {
            this.f1454B = new MutableLiveData();
        }
        q0(this.f1454B, Integer.valueOf(i2));
    }

    public LiveData j() {
        if (this.f1474u == null) {
            this.f1474u = new MutableLiveData();
        }
        return this.f1474u;
    }

    public void j0(boolean z2) {
        this.f1470q = z2;
    }

    public LiveData k() {
        if (this.f1472s == null) {
            this.f1472s = new MutableLiveData();
        }
        return this.f1472s;
    }

    public void k0(boolean z2) {
        if (this.f1477x == null) {
            this.f1477x = new MutableLiveData();
        }
        q0(this.f1477x, Boolean.valueOf(z2));
    }

    public int l() {
        return this.f1465l;
    }

    public void l0(boolean z2) {
        if (this.f1476w == null) {
            this.f1476w = new MutableLiveData();
        }
        q0(this.f1476w, Boolean.valueOf(z2));
    }

    public CancellationSignalProvider m() {
        if (this.f1461h == null) {
            this.f1461h = new CancellationSignalProvider();
        }
        return this.f1461h;
    }

    public void m0(CharSequence charSequence) {
        this.f1464k = charSequence;
    }

    public FragmentActivity n() {
        WeakReference weakReference = this.f1457d;
        if (weakReference != null) {
            return (FragmentActivity) weakReference.get();
        }
        return null;
    }

    public void n0(BiometricPrompt.PromptInfo promptInfo) {
        this.f1458e = promptInfo;
    }

    public BiometricPrompt.AuthenticationCallback o() {
        if (this.f1456c == null) {
            this.f1456c = new BiometricPrompt.AuthenticationCallback() {
            };
        }
        return this.f1456c;
    }

    public void o0(boolean z2) {
        this.f1466m = z2;
    }

    public Executor p() {
        Executor executor = this.f1455b;
        return executor != null ? executor : new DefaultExecutor();
    }

    public void p0(boolean z2) {
        this.f1471r = z2;
    }

    public PromptContentView q() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.b();
        }
        return null;
    }

    public BiometricPrompt.CryptoObject r() {
        return this.f1459f;
    }

    public CharSequence s() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.c();
        }
        return null;
    }

    public LiveData t() {
        if (this.C == null) {
            this.C = new MutableLiveData();
        }
        return this.C;
    }

    public int u() {
        return this.f1453A;
    }

    public LiveData v() {
        if (this.f1454B == null) {
            this.f1454B = new MutableLiveData();
        }
        return this.f1454B;
    }

    public int w() {
        int g2 = g();
        return (!AuthenticatorUtils.e(g2) || AuthenticatorUtils.d(g2)) ? -1 : 2;
    }

    public Bitmap x() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.d();
        }
        return null;
    }

    public String y() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.e();
        }
        return null;
    }

    public int z() {
        BiometricPrompt.PromptInfo promptInfo = this.f1458e;
        if (promptInfo != null) {
            return promptInfo.f();
        }
        return -1;
    }
}
