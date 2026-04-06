package androidx.datastore.core.okio;

import kotlin.Metadata;

@Metadata
public final class AtomicBoolean {

    /* renamed from: a  reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f20650a;

    public AtomicBoolean(boolean z2) {
        this.f20650a = new java.util.concurrent.atomic.AtomicBoolean(z2);
    }

    public final boolean a() {
        return this.f20650a.get();
    }

    public final void b(boolean z2) {
        this.f20650a.set(z2);
    }
}
