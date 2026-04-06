package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.RealWebSocket;

@Metadata
public final class RealWebSocket$connect$1 implements Callback {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Request f43291A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RealWebSocket f43292z;

    public void b(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
        Exchange g2 = response.g();
        try {
            this.f43292z.k(response, g2);
            Intrinsics.f(g2);
            RealWebSocket.Streams n2 = g2.n();
            WebSocketExtensions a2 = WebSocketExtensions.f43293g.a(response.m());
            this.f43292z.f43258d = a2;
            if (!this.f43292z.q(a2)) {
                RealWebSocket realWebSocket = this.f43292z;
                synchronized (realWebSocket) {
                    realWebSocket.f43269o.clear();
                    realWebSocket.l(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f43292z.p(Util.f42806i + " WebSocket " + this.f43291A.k().q(), n2);
                this.f43292z.o().f(this.f43292z, response);
                this.f43292z.r();
            } catch (Exception e2) {
                this.f43292z.n(e2, (Response) null);
            }
        } catch (IOException e3) {
            this.f43292z.n(e3, response);
            Util.m(response);
            if (g2 != null) {
                g2.v();
            }
        }
    }

    public void c(Call call, IOException iOException) {
        Intrinsics.i(call, "call");
        Intrinsics.i(iOException, "e");
        this.f43292z.n(iOException, (Response) null);
    }
}
