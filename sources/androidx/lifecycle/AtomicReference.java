package androidx.lifecycle;

import androidx.compose.animation.core.h;
import kotlin.Metadata;

@Metadata
public final class AtomicReference<V> {

    /* renamed from: a  reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f21858a;

    public AtomicReference(Object obj) {
        this.f21858a = new java.util.concurrent.atomic.AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return h.a(this.f21858a, obj, obj2);
    }

    public final Object b() {
        return this.f21858a.get();
    }
}
