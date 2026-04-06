package com.google.common.cache;

import com.google.common.cache.LocalCache;

@ElementTypesAreNonnullByDefault
interface ReferenceEntry<K, V> {
    ReferenceEntry A();

    LocalCache.ValueReference d();

    ReferenceEntry f();

    Object getKey();

    int h();

    ReferenceEntry j();

    void k(LocalCache.ValueReference valueReference);

    long l();

    void m(long j2);

    ReferenceEntry n();

    long o();

    void p(long j2);

    ReferenceEntry r();

    void t(ReferenceEntry referenceEntry);

    void x(ReferenceEntry referenceEntry);

    void y(ReferenceEntry referenceEntry);

    void z(ReferenceEntry referenceEntry);
}
