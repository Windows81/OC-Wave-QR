package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final /* synthetic */ class Okio__OkioKt {
    public static final Sink a() {
        return new BlackholeSink();
    }

    public static final BufferedSink b(Sink sink) {
        Intrinsics.i(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    public static final BufferedSource c(Source source) {
        Intrinsics.i(source, "<this>");
        return new RealBufferedSource(source);
    }
}
