package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata
public final class HashedWeakRef<T> extends WeakReference<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f41564a;

    public HashedWeakRef(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.f41564a = obj != null ? obj.hashCode() : 0;
    }
}
