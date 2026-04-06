package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okio.Buffer;

@Metadata
public final class Utf8Kt {
    public static final boolean a(Buffer buffer) {
        Intrinsics.i(buffer, "<this>");
        try {
            Buffer buffer2 = new Buffer();
            buffer.j(buffer2, 0, RangesKt.k(buffer.n0(), 64));
            for (int i2 = 0; i2 < 16; i2++) {
                if (buffer2.l0()) {
                    return true;
                }
                int g0 = buffer2.g0();
                if (Character.isISOControl(g0) && !Character.isWhitespace(g0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
