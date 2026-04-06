package androidx.biometric.auth;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class CoroutineAuthPromptCallback extends AuthPromptCallback {

    /* renamed from: a  reason: collision with root package name */
    public final CancellableContinuation f1534a;

    public void a(FragmentActivity fragmentActivity, int i2, CharSequence charSequence) {
        CancellableContinuation cancellableContinuation = this.f1534a;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(new AuthPromptErrorException(i2, charSequence))));
    }

    public void b(FragmentActivity fragmentActivity) {
        CancellableContinuation cancellableContinuation = this.f1534a;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(new AuthPromptFailureException())));
    }

    public void c(FragmentActivity fragmentActivity, BiometricPrompt.AuthenticationResult authenticationResult) {
        this.f1534a.q(Result.b(authenticationResult));
    }
}
