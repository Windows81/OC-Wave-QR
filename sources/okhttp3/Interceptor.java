package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata
public interface Interceptor {

    @Metadata
    public interface Chain {
        Chain a(int i2, TimeUnit timeUnit);

        Response b(Request request);

        Connection c();

        Call call();

        Chain d(int i2, TimeUnit timeUnit);

        Request m();
    }

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f42678a = new Companion();
    }

    Response intercept(Chain chain);
}
