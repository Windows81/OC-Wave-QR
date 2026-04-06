package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
public final class AtomicLongMap<K> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final ConcurrentHashMap f29379z;

    /* renamed from: com.google.common.util.concurrent.AtomicLongMap$1  reason: invalid class name */
    class AnonymousClass1 implements Function<AtomicLong, Long> {
        /* renamed from: a */
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    public String toString() {
        return this.f29379z.toString();
    }
}
