package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;

@Metadata
public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    public void c(Http2Stream http2Stream) {
        Intrinsics.i(http2Stream, "stream");
        http2Stream.d(ErrorCode.REFUSED_STREAM, (IOException) null);
    }
}
