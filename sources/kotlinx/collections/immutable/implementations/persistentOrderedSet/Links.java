package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import kotlin.Metadata;
import kotlinx.collections.immutable.internal.EndOfChain;

@Metadata
public final class Links {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41341a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f41342b;

    public Links(Object obj, Object obj2) {
        this.f41341a = obj;
        this.f41342b = obj2;
    }

    public final boolean a() {
        return this.f41342b != EndOfChain.f41356a;
    }

    public final boolean b() {
        return this.f41341a != EndOfChain.f41356a;
    }

    public final Object c() {
        return this.f41342b;
    }

    public final Object d() {
        return this.f41341a;
    }

    public final Links e(Object obj) {
        return new Links(this.f41341a, obj);
    }

    public final Links f(Object obj) {
        return new Links(obj, this.f41342b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Links() {
        /*
            r1 = this;
            kotlinx.collections.immutable.internal.EndOfChain r0 = kotlinx.collections.immutable.internal.EndOfChain.f41356a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.collections.immutable.implementations.persistentOrderedSet.Links.<init>():void");
    }

    public Links(Object obj) {
        this(obj, EndOfChain.f41356a);
    }
}
