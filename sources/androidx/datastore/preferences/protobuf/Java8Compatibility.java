package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;

final class Java8Compatibility {
    public static void a(Buffer buffer, int i2) {
        buffer.limit(i2);
    }

    public static void b(Buffer buffer) {
        buffer.mark();
    }

    public static void c(Buffer buffer, int i2) {
        buffer.position(i2);
    }

    public static void d(Buffer buffer) {
        buffer.reset();
    }
}
