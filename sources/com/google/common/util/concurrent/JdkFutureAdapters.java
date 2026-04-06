package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@ElementTypesAreNonnullByDefault
public final class JdkFutureAdapters {

    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        public static final ThreadFactory D;
        public static final Executor E;

        /* renamed from: A  reason: collision with root package name */
        public final ExecutionList f29522A;

        /* renamed from: B  reason: collision with root package name */
        public final AtomicBoolean f29523B;
        public final Future C;

        /* renamed from: z  reason: collision with root package name */
        public final Executor f29524z;

        static {
            ThreadFactory b2 = new ThreadFactoryBuilder().e(true).f("ListenableFutureAdapter-thread-%d").b();
            D = b2;
            E = Executors.newCachedThreadPool(b2);
        }

        public void C(Runnable runnable, Executor executor) {
            this.f29522A.a(runnable, executor);
            if (!this.f29523B.compareAndSet(false, true)) {
                return;
            }
            if (this.C.isDone()) {
                this.f29522A.b();
            } else {
                this.f29524z.execute(new d(this));
            }
        }

        /* renamed from: Q */
        public Future M() {
            return this.C;
        }

        public final /* synthetic */ void S() {
            try {
                Uninterruptibles.a(this.C);
            } catch (Throwable unused) {
            }
            this.f29522A.b();
        }
    }
}
