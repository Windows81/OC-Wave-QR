package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ThreadLocalKey implements CoroutineContext.Key<ThreadLocalElement<?>> {

    /* renamed from: z  reason: collision with root package name */
    public final ThreadLocal f41878z;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreadLocalKey) && Intrinsics.d(this.f41878z, ((ThreadLocalKey) obj).f41878z);
    }

    public int hashCode() {
        return this.f41878z.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f41878z + ')';
    }
}
