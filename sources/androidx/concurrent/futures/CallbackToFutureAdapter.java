package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class CallbackToFutureAdapter {

    public static final class Completer<T> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19368a;

        /* renamed from: b  reason: collision with root package name */
        public SafeFuture f19369b;

        /* renamed from: c  reason: collision with root package name */
        public ResolvableFuture f19370c = ResolvableFuture.E();

        /* renamed from: d  reason: collision with root package name */
        public boolean f19371d;

        public void a() {
            this.f19368a = null;
            this.f19369b = null;
            this.f19370c.z((Object) null);
        }

        public boolean b(Object obj) {
            boolean z2 = true;
            this.f19371d = true;
            SafeFuture safeFuture = this.f19369b;
            if (safeFuture == null || !safeFuture.b(obj)) {
                z2 = false;
            }
            if (z2) {
                d();
            }
            return z2;
        }

        public boolean c() {
            boolean z2 = true;
            this.f19371d = true;
            SafeFuture safeFuture = this.f19369b;
            if (safeFuture == null || !safeFuture.a(true)) {
                z2 = false;
            }
            if (z2) {
                d();
            }
            return z2;
        }

        public final void d() {
            this.f19368a = null;
            this.f19369b = null;
            this.f19370c = null;
        }

        public boolean e(Throwable th) {
            boolean z2 = true;
            this.f19371d = true;
            SafeFuture safeFuture = this.f19369b;
            if (safeFuture == null || !safeFuture.c(th)) {
                z2 = false;
            }
            if (z2) {
                d();
            }
            return z2;
        }

        public void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.f19369b;
            if (safeFuture != null && !safeFuture.isDone()) {
                safeFuture.c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f19368a));
            }
            if (!this.f19371d && (resolvableFuture = this.f19370c) != null) {
                resolvableFuture.z((Object) null);
            }
        }
    }

    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface Resolver<T> {
        Object a(Completer completer);
    }

    public static final class SafeFuture<T> implements ListenableFuture<T> {

        /* renamed from: A  reason: collision with root package name */
        public final AbstractResolvableFuture f19372A = new AbstractResolvableFuture<T>() {
            public String t() {
                Completer completer = (Completer) SafeFuture.this.f19373z.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + completer.f19368a + "]";
            }
        };

        /* renamed from: z  reason: collision with root package name */
        public final WeakReference f19373z;

        public SafeFuture(Completer completer) {
            this.f19373z = new WeakReference(completer);
        }

        public void C(Runnable runnable, Executor executor) {
            this.f19372A.C(runnable, executor);
        }

        public boolean a(boolean z2) {
            return this.f19372A.cancel(z2);
        }

        public boolean b(Object obj) {
            return this.f19372A.z(obj);
        }

        public boolean c(Throwable th) {
            return this.f19372A.A(th);
        }

        public boolean cancel(boolean z2) {
            Completer completer = (Completer) this.f19373z.get();
            boolean cancel = this.f19372A.cancel(z2);
            if (cancel && completer != null) {
                completer.a();
            }
            return cancel;
        }

        public Object get() {
            return this.f19372A.get();
        }

        public boolean isCancelled() {
            return this.f19372A.isCancelled();
        }

        public boolean isDone() {
            return this.f19372A.isDone();
        }

        public String toString() {
            return this.f19372A.toString();
        }

        public Object get(long j2, TimeUnit timeUnit) {
            return this.f19372A.get(j2, timeUnit);
        }
    }

    public static ListenableFuture a(Resolver resolver) {
        Completer completer = new Completer();
        SafeFuture safeFuture = new SafeFuture(completer);
        completer.f19369b = safeFuture;
        completer.f19368a = resolver.getClass();
        try {
            Object a2 = resolver.a(completer);
            if (a2 != null) {
                completer.f19368a = a2;
            }
        } catch (Exception e2) {
            safeFuture.c(e2);
        }
        return safeFuture;
    }
}
