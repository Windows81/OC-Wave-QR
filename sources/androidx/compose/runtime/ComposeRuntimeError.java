package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: z  reason: collision with root package name */
    public final String f14562z;

    public ComposeRuntimeError(String str) {
        this.f14562z = str;
    }

    public String getMessage() {
        return this.f14562z;
    }
}
