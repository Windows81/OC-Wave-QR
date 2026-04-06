package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public final class Closer implements Closeable {
    public static final Suppressor C;

    /* renamed from: A  reason: collision with root package name */
    public final Deque f29002A = new ArrayDeque(4);

    /* renamed from: B  reason: collision with root package name */
    public Throwable f29003B;

    /* renamed from: z  reason: collision with root package name */
    public final Suppressor f29004z;

    public static final class LoggingSuppressor implements Suppressor {

        /* renamed from: a  reason: collision with root package name */
        public static final LoggingSuppressor f29005a = new LoggingSuppressor();

        public void a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = Closeables.f29001a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(closeable);
            StringBuilder sb = new StringBuilder(valueOf.length() + 42);
            sb.append("Suppressing exception thrown when closing ");
            sb.append(valueOf);
            logger.log(level, sb.toString(), th2);
        }
    }

    public static final class SuppressingSuppressor implements Suppressor {

        /* renamed from: a  reason: collision with root package name */
        public final Method f29006a;

        public SuppressingSuppressor(Method method) {
            this.f29006a = method;
        }

        public static SuppressingSuppressor b() {
            Class<Throwable> cls = Throwable.class;
            try {
                return new SuppressingSuppressor(cls.getMethod("addSuppressed", new Class[]{cls}));
            } catch (Throwable unused) {
                return null;
            }
        }

        public void a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    this.f29006a.invoke(th, new Object[]{th2});
                } catch (Throwable unused) {
                    LoggingSuppressor.f29005a.a(closeable, th, th2);
                }
            }
        }
    }

    public interface Suppressor {
        void a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        Suppressor b2 = SuppressingSuppressor.b();
        if (b2 == null) {
            b2 = LoggingSuppressor.f29005a;
        }
        C = b2;
    }

    public Closer(Suppressor suppressor) {
        this.f29004z = (Suppressor) Preconditions.q(suppressor);
    }

    public static Closer a() {
        return new Closer(C);
    }

    public Closeable b(Closeable closeable) {
        if (closeable != null) {
            this.f29002A.addFirst(closeable);
        }
        return closeable;
    }

    public RuntimeException c(Throwable th) {
        Preconditions.q(th);
        this.f29003B = th;
        Throwables.m(th, IOException.class);
        throw new RuntimeException(th);
    }

    public void close() {
        Throwable th = this.f29003B;
        while (!this.f29002A.isEmpty()) {
            Closeable closeable = (Closeable) this.f29002A.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f29004z.a(closeable, th, th2);
                }
            }
        }
        if (this.f29003B == null && th != null) {
            Throwables.m(th, IOException.class);
            throw new AssertionError(th);
        }
    }
}
