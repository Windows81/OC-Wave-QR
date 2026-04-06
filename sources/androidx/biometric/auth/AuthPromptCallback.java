package androidx.biometric.auth;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;

public abstract class AuthPromptCallback {
    public void a(FragmentActivity fragmentActivity, int i2, CharSequence charSequence) {
    }

    public void b(FragmentActivity fragmentActivity) {
    }

    public void c(FragmentActivity fragmentActivity, BiometricPrompt.AuthenticationResult authenticationResult) {
    }
}
