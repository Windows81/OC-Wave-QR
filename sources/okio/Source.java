package okio;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata
public interface Source extends Closeable {
    void close();

    long o1(Buffer buffer, long j2);

    Timeout u();
}
