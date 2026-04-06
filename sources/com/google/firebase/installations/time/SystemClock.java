package com.google.firebase.installations.time;

public class SystemClock implements Clock {

    /* renamed from: a  reason: collision with root package name */
    public static SystemClock f30873a;

    public static SystemClock b() {
        if (f30873a == null) {
            f30873a = new SystemClock();
        }
        return f30873a;
    }

    public long a() {
        return System.currentTimeMillis();
    }
}
