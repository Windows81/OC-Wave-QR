package androidx.biometric.auth;

import android.os.Handler;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

class AuthPromptUtils {

    public static class AuthPromptWrapper implements AuthPrompt {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f1526a;

        public void a() {
            if (this.f1526a.get() != null) {
                ((BiometricPrompt) this.f1526a.get()).c();
            }
        }
    }

    public static class AuthenticationCallbackWrapper extends BiometricPrompt.AuthenticationCallback {

        /* renamed from: a  reason: collision with root package name */
        public final AuthPromptCallback f1527a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f1528b;

        public static FragmentActivity d(WeakReference weakReference) {
            if (weakReference.get() != null) {
                return ((BiometricViewModel) weakReference.get()).n();
            }
            return null;
        }

        public void a(int i2, CharSequence charSequence) {
            this.f1527a.a(d(this.f1528b), i2, charSequence);
        }

        public void b() {
            this.f1527a.b(d(this.f1528b));
        }

        public void c(BiometricPrompt.AuthenticationResult authenticationResult) {
            this.f1527a.c(d(this.f1528b), authenticationResult);
        }
    }

    public static class DefaultExecutor implements Executor {

        /* renamed from: z  reason: collision with root package name */
        public final Handler f1529z;

        public void execute(Runnable runnable) {
            this.f1529z.post(runnable);
        }
    }
}
