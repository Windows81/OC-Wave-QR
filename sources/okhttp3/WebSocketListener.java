package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata
public abstract class WebSocketListener {
    public void a(WebSocket webSocket, int i2, String str) {
        Intrinsics.i(webSocket, "webSocket");
        Intrinsics.i(str, "reason");
    }

    public void b(WebSocket webSocket, int i2, String str) {
        Intrinsics.i(webSocket, "webSocket");
        Intrinsics.i(str, "reason");
    }

    public void c(WebSocket webSocket, Throwable th, Response response) {
        Intrinsics.i(webSocket, "webSocket");
        Intrinsics.i(th, "t");
    }

    public void d(WebSocket webSocket, String str) {
        Intrinsics.i(webSocket, "webSocket");
        Intrinsics.i(str, "text");
    }

    public void e(WebSocket webSocket, ByteString byteString) {
        Intrinsics.i(webSocket, "webSocket");
        Intrinsics.i(byteString, "bytes");
    }

    public void f(WebSocket webSocket, Response response) {
        Intrinsics.i(webSocket, "webSocket");
        Intrinsics.i(response, "response");
    }
}
