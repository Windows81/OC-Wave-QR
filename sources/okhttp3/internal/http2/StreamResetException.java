package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StreamResetException extends IOException {

    /* renamed from: z  reason: collision with root package name */
    public final ErrorCode f43168z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.i(errorCode, "errorCode");
        this.f43168z = errorCode;
    }
}
