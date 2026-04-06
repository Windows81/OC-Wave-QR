package com.google.common.base;

@ElementTypesAreNonnullByDefault
public abstract class Ticker {

    /* renamed from: a  reason: collision with root package name */
    public static final Ticker f27804a = new Ticker() {
        public long a() {
            return Platform.f();
        }
    };

    public static Ticker b() {
        return f27804a;
    }

    public abstract long a();
}
