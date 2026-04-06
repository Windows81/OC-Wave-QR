package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata
public final class AtomicInt {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f20543a;

    public AtomicInt(int i2) {
        this.f20543a = new AtomicInteger(i2);
    }

    public final int a() {
        return this.f20543a.decrementAndGet();
    }

    public final int b() {
        return this.f20543a.get();
    }

    public final int c() {
        return this.f20543a.getAndIncrement();
    }

    public final int d() {
        return this.f20543a.incrementAndGet();
    }
}
