package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

@Metadata
final class ThreadState {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f41881a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f41882b;

    /* renamed from: c  reason: collision with root package name */
    public final ThreadContextElement[] f41883c;

    /* renamed from: d  reason: collision with root package name */
    public int f41884d;

    public ThreadState(CoroutineContext coroutineContext, int i2) {
        this.f41881a = coroutineContext;
        this.f41882b = new Object[i2];
        this.f41883c = new ThreadContextElement[i2];
    }

    public final void a(ThreadContextElement threadContextElement, Object obj) {
        Object[] objArr = this.f41882b;
        int i2 = this.f41884d;
        objArr[i2] = obj;
        ThreadContextElement[] threadContextElementArr = this.f41883c;
        this.f41884d = i2 + 1;
        Intrinsics.g(threadContextElement, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        threadContextElementArr[i2] = threadContextElement;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f41883c.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                ThreadContextElement threadContextElement = this.f41883c[length];
                Intrinsics.f(threadContextElement);
                threadContextElement.X(coroutineContext, this.f41882b[length]);
                if (i2 >= 0) {
                    length = i2;
                } else {
                    return;
                }
            }
        }
    }
}
