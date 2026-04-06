package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import kotlin.Metadata;

@Metadata
public final class LinkedValue<V> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15085a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15086b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15087c;

    public LinkedValue(Object obj, Object obj2, Object obj3) {
        this.f15085a = obj;
        this.f15086b = obj2;
        this.f15087c = obj3;
    }

    public final boolean a() {
        return this.f15087c != EndOfChain.f15121a;
    }

    public final boolean b() {
        return this.f15086b != EndOfChain.f15121a;
    }

    public final Object c() {
        return this.f15087c;
    }

    public final Object d() {
        return this.f15086b;
    }

    public final Object e() {
        return this.f15085a;
    }

    public final LinkedValue f(Object obj) {
        return new LinkedValue(this.f15085a, this.f15086b, obj);
    }

    public final LinkedValue g(Object obj) {
        return new LinkedValue(this.f15085a, obj, this.f15087c);
    }

    public final LinkedValue h(Object obj) {
        return new LinkedValue(obj, this.f15086b, this.f15087c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LinkedValue(java.lang.Object r2) {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.f15121a
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue.<init>(java.lang.Object):void");
    }

    public LinkedValue(Object obj, Object obj2) {
        this(obj, obj2, EndOfChain.f15121a);
    }
}
