package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public final class UncaughtExceptionHandlers {

    public static final class Exiter implements Thread.UncaughtExceptionHandler {

        /* renamed from: b  reason: collision with root package name */
        public static final Logger f29609b = Logger.getLogger(Exiter.class.getName());

        /* renamed from: a  reason: collision with root package name */
        public final Runtime f29610a;

        public void uncaughtException(Thread thread, Throwable th) {
            try {
                f29609b.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", new Object[]{thread}), th);
            } catch (Throwable th2) {
                this.f29610a.exit(1);
                throw th2;
            }
            this.f29610a.exit(1);
        }
    }
}
