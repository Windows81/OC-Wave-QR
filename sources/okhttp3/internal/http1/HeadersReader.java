package okhttp3.internal.http1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.BufferedSource;

@Metadata
public final class HeadersReader {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f43006c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f43007a;

    /* renamed from: b  reason: collision with root package name */
    public long f43008b = 262144;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public HeadersReader(BufferedSource bufferedSource) {
        Intrinsics.i(bufferedSource, "source");
        this.f43007a = bufferedSource;
    }

    public final Headers a() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String b2 = b();
            if (b2.length() == 0) {
                return builder.f();
            }
            builder.c(b2);
        }
    }

    public final String b() {
        String x0 = this.f43007a.x0(this.f43008b);
        this.f43008b -= (long) x0.length();
        return x0;
    }
}
