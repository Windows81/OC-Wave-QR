package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata
final class WeakMapCtorCache extends CtorCache {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakMapCtorCache f41885a = new WeakMapCtorCache();

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantReadWriteLock f41886b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap f41887c = new WeakHashMap();
}
