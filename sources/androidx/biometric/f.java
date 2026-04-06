package androidx.biometric;

import androidx.lifecycle.Observer;

public final /* synthetic */ class f implements Observer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1543z;

    public /* synthetic */ f(BiometricFragment biometricFragment) {
        this.f1543z = biometricFragment;
    }

    public final void a(Object obj) {
        this.f1543z.F2((BiometricErrorData) obj);
    }
}
