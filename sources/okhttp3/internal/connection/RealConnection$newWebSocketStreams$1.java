package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;

@Metadata
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    public final /* synthetic */ Exchange C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$newWebSocketStreams$1(BufferedSource bufferedSource, BufferedSink bufferedSink, Exchange exchange) {
        super(true, bufferedSource, bufferedSink);
        this.C = exchange;
    }

    public void close() {
        this.C.a(-1, true, true, (IOException) null);
    }
}
