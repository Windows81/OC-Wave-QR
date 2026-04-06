package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import kotlin.Metadata;
import kotlinx.collections.immutable.internal.EndOfChain;

@Metadata
public final class LinkedValue<V> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41308a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f41309b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f41310c;

    public LinkedValue(Object obj, Object obj2, Object obj3) {
        this.f41308a = obj;
        this.f41309b = obj2;
        this.f41310c = obj3;
    }

    public final boolean a() {
        return this.f41310c != EndOfChain.f41356a;
    }

    public final boolean b() {
        return this.f41309b != EndOfChain.f41356a;
    }

    public final Object c() {
        return this.f41310c;
    }

    public final Object d() {
        return this.f41309b;
    }

    public final Object e() {
        return this.f41308a;
    }

    public final LinkedValue f(Object obj) {
        return new LinkedValue(this.f41308a, this.f41309b, obj);
    }

    public final LinkedValue g(Object obj) {
        return new LinkedValue(this.f41308a, obj, this.f41310c);
    }

    public final LinkedValue h(Object obj) {
        return new LinkedValue(obj, this.f41309b, this.f41310c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LinkedValue(java.lang.Object r2) {
        /*
            r1 = this;
            kotlinx.collections.immutable.internal.EndOfChain r0 = kotlinx.collections.immutable.internal.EndOfChain.f41356a
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue.<init>(java.lang.Object):void");
    }

    public LinkedValue(Object obj, Object obj2) {
        this(obj, obj2, EndOfChain.f41356a);
    }
}
