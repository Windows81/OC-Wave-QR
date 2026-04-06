package org.slf4j.helpers;

import org.slf4j.Logger;

public class SubstituteLogger implements Logger {

    /* renamed from: A  reason: collision with root package name */
    public volatile Logger f44114A;

    /* renamed from: z  reason: collision with root package name */
    public final String f44115z;

    public SubstituteLogger(String str) {
        this.f44115z = str;
    }

    public boolean a() {
        return d().a();
    }

    public void b(String str, Throwable th) {
        d().b(str, th);
    }

    public void c(String str) {
        d().c(str);
    }

    public Logger d() {
        return this.f44114A != null ? this.f44114A : NOPLogger.f44112A;
    }

    public String e() {
        return this.f44115z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f44115z.equals(((SubstituteLogger) obj).f44115z);
    }

    public void f(Logger logger) {
        this.f44114A = logger;
    }

    public int hashCode() {
        return this.f44115z.hashCode();
    }
}
