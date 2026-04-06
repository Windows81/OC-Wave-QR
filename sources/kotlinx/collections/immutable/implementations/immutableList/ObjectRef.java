package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;

@Metadata
public final class ObjectRef {

    /* renamed from: a  reason: collision with root package name */
    public Object f41246a;

    public ObjectRef(Object obj) {
        this.f41246a = obj;
    }

    public final Object a() {
        return this.f41246a;
    }

    public final void b(Object obj) {
        this.f41246a = obj;
    }
}
