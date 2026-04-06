package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

public interface EventStore extends Closeable {
    int L();

    void P(Iterable iterable);

    Iterable a0(TransportContext transportContext);

    PersistedEvent g1(TransportContext transportContext, EventInternal eventInternal);

    void j0(TransportContext transportContext, long j2);

    long n1(TransportContext transportContext);

    Iterable p0();

    boolean s1(TransportContext transportContext);

    void u1(Iterable iterable);
}
