package com.google.common.cache;

import com.google.common.base.Preconditions;
import java.util.AbstractMap;

@ElementTypesAreNonnullByDefault
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /* renamed from: z  reason: collision with root package name */
    public final RemovalCause f27933z;

    public RemovalNotification(Object obj, Object obj2, RemovalCause removalCause) {
        super(obj, obj2);
        this.f27933z = (RemovalCause) Preconditions.q(removalCause);
    }

    public static RemovalNotification a(Object obj, Object obj2, RemovalCause removalCause) {
        return new RemovalNotification(obj, obj2, removalCause);
    }
}
