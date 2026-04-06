package androidx.core.util;

import kotlin.Metadata;

@Metadata
public final class Pools {

    @Metadata
    public interface Pool<T> {
    }

    @Metadata
    public static class SimplePool<T> implements Pool<T> {
    }

    @Metadata
    public static class SynchronizedPool<T> extends SimplePool<T> {
    }
}
