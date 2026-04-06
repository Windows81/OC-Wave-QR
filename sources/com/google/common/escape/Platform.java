package com.google.common.escape;

@ElementTypesAreNonnullByDefault
final class Platform {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f28707a = new ThreadLocal<char[]>() {
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    public static char[] a() {
        return (char[]) f28707a.get();
    }
}
