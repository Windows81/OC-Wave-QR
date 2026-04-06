package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okio.Sink;
import okio.Source;

@Metadata
public interface ExchangeCodec {

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f42985a = new Companion();
    }

    void a();

    void b(Request request);

    Source c(Response response);

    void cancel();

    Response.Builder d(boolean z2);

    RealConnection e();

    void f();

    long g(Response response);

    Sink h(Request request, long j2);
}
