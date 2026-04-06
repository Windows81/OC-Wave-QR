package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;

@Metadata
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41289A;

    /* renamed from: B  reason: collision with root package name */
    public int f41290B;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f41291z = TrieNode.f41283e.a().m();

    public final Object b() {
        CommonFunctionsKt.a(g());
        return this.f41291z[this.f41290B];
    }

    public final TrieNode c() {
        CommonFunctionsKt.a(h());
        Object obj = this.f41291z[this.f41290B];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    public final Object[] e() {
        return this.f41291z;
    }

    public final int f() {
        return this.f41290B;
    }

    public final boolean g() {
        return this.f41290B < this.f41289A;
    }

    public final boolean h() {
        CommonFunctionsKt.a(this.f41290B >= this.f41289A);
        return this.f41290B < this.f41291z.length;
    }

    public boolean hasNext() {
        return g();
    }

    public final void i() {
        CommonFunctionsKt.a(g());
        this.f41290B += 2;
    }

    public final void j() {
        CommonFunctionsKt.a(h());
        this.f41290B++;
    }

    public final void k(Object[] objArr, int i2) {
        Intrinsics.i(objArr, "buffer");
        m(objArr, i2, 0);
    }

    public final void m(Object[] objArr, int i2, int i3) {
        Intrinsics.i(objArr, "buffer");
        this.f41291z = objArr;
        this.f41289A = i2;
        this.f41290B = i3;
    }

    public final void n(int i2) {
        this.f41290B = i2;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
