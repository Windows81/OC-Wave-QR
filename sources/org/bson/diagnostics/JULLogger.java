package org.bson.diagnostics;

import java.util.logging.Level;
import java.util.logging.Logger;

class JULLogger implements Logger {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f43880a;

    public JULLogger(String str) {
        this.f43880a = Logger.getLogger(str);
    }

    public boolean a() {
        return d(Level.FINER);
    }

    public void b(String str, Throwable th) {
        f(Level.WARNING, str, th);
    }

    public void c(String str) {
        e(Level.FINER, str);
    }

    public final boolean d(Level level) {
        return this.f43880a.isLoggable(level);
    }

    public final void e(Level level, String str) {
        this.f43880a.log(level, str);
    }

    public void f(Level level, String str, Throwable th) {
        this.f43880a.log(level, str, th);
    }
}
