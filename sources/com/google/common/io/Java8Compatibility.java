package com.google.common.io;

import java.nio.Buffer;

@ElementTypesAreNonnullByDefault
final class Java8Compatibility {
    public static void a(Buffer buffer) {
        buffer.clear();
    }

    public static void b(Buffer buffer) {
        buffer.flip();
    }

    public static void c(Buffer buffer, int i2) {
        buffer.limit(i2);
    }

    public static void d(Buffer buffer, int i2) {
        buffer.position(i2);
    }
}
