package androidx.biometric;

import androidx.biometric.BiometricPrompt;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BiometricPrompt.AuthenticationResult f1540A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BiometricFragment f1541z;

    public /* synthetic */ d(BiometricFragment biometricFragment, BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f1541z = biometricFragment;
        this.f1540A = authenticationResult;
    }

    public final void run() {
        this.f1541z.O2(this.f1540A);
    }
}
