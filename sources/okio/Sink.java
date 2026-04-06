package okio;

import java.io.Closeable;
import java.io.Flushable;
import kotlin.Metadata;

@Metadata
public interface Sink extends Closeable, Flushable {
    void N0(Buffer buffer, long j2);

    void close();

    void flush();

    Timeout u();
}
