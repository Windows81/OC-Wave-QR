package kotlin;

import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NotImplementedError extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String str) {
        super(str);
        Intrinsics.i(str, "message");
    }
}
