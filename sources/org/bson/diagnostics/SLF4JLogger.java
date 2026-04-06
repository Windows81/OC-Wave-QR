package org.bson.diagnostics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SLF4JLogger implements Logger {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f43882a;

    public SLF4JLogger(String str) {
        this.f43882a = LoggerFactory.g(str);
    }

    public boolean a() {
        return this.f43882a.a();
    }

    public void b(String str, Throwable th) {
        this.f43882a.b(str, th);
    }

    public void c(String str) {
        this.f43882a.c(str);
    }
}
