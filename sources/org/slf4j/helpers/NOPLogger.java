package org.slf4j.helpers;

public class NOPLogger extends MarkerIgnoringBase {

    /* renamed from: A  reason: collision with root package name */
    public static final NOPLogger f44112A = new NOPLogger();

    public final boolean a() {
        return false;
    }

    public final void b(String str, Throwable th) {
    }

    public final void c(String str) {
    }

    public String getName() {
        return "NOP";
    }
}
