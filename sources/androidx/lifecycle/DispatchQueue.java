package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata
public final class DispatchQueue {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21883a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21884b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21885c;

    /* renamed from: d  reason: collision with root package name */
    public final Queue f21886d = new ArrayDeque();

    public static final void d(DispatchQueue dispatchQueue, Runnable runnable) {
        dispatchQueue.f(runnable);
    }

    public final boolean b() {
        return this.f21884b || !this.f21883a;
    }

    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        Intrinsics.i(coroutineContext, "context");
        Intrinsics.i(runnable, "runnable");
        MainCoroutineDispatcher H0 = Dispatchers.c().H0();
        if (H0.w0(coroutineContext) || b()) {
            H0.o0(coroutineContext, new b(this, runnable));
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (!this.f21885c) {
            boolean z2 = true;
            z2 = false;
            try {
                while (true) {
                    if (this.f21886d.isEmpty()) {
                        break;
                    } else if (!b()) {
                        break;
                    } else {
                        Runnable runnable = (Runnable) this.f21886d.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                this.f21885c = z2;
            } finally {
                this.f21885c = z2;
            }
        }
    }

    public final void f(Runnable runnable) {
        if (this.f21886d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables");
    }

    public final void g() {
        this.f21884b = true;
        e();
    }

    public final void h() {
        this.f21883a = true;
    }

    public final void i() {
        if (this.f21883a) {
            if (!this.f21884b) {
                this.f21883a = false;
                e();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher");
        }
    }
}
