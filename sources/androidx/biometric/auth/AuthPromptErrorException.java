package androidx.biometric.auth;

import kotlin.Metadata;

@Metadata
public final class AuthPromptErrorException extends Exception {

    /* renamed from: A  reason: collision with root package name */
    public final CharSequence f1524A;

    /* renamed from: z  reason: collision with root package name */
    public final int f1525z;

    public AuthPromptErrorException(int i2, CharSequence charSequence) {
        super(charSequence.toString());
        this.f1525z = i2;
        this.f1524A = charSequence;
    }
}
