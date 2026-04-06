package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import kotlin.Metadata;

@Metadata
public final class Links {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15110a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15111b;

    public Links(Object obj, Object obj2) {
        this.f15110a = obj;
        this.f15111b = obj2;
    }

    public final boolean a() {
        return this.f15111b != EndOfChain.f15121a;
    }

    public final boolean b() {
        return this.f15110a != EndOfChain.f15121a;
    }

    public final Object c() {
        return this.f15111b;
    }

    public final Object d() {
        return this.f15110a;
    }

    public final Links e(Object obj) {
        return new Links(this.f15110a, obj);
    }

    public final Links f(Object obj) {
        return new Links(obj, this.f15111b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Links() {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.f15121a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links.<init>():void");
    }

    public Links(Object obj) {
        this(obj, EndOfChain.f15121a);
    }
}
