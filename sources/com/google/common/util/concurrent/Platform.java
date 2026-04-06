package com.google.common.util.concurrent;

@ElementTypesAreNonnullByDefault
final class Platform {
    public static boolean a(Throwable th, Class cls) {
        return cls.isInstance(th);
    }
}
