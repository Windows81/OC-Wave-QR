package androidx.biometric;

import androidx.biometric.BiometricPrompt;
import androidx.lifecycle.Observer;

public final /* synthetic */ class e implements Observer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1542z;

    public /* synthetic */ e(BiometricFragment biometricFragment) {
        this.f1542z = biometricFragment;
    }

    public final void a(Object obj) {
        this.f1542z.E2((BiometricPrompt.AuthenticationResult) obj);
    }
}
