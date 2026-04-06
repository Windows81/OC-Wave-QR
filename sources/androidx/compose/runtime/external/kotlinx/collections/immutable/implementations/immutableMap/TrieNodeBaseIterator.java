package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f15065A;

    /* renamed from: B  reason: collision with root package name */
    public int f15066B;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f15067z = TrieNode.f15056e.a().p();

    public final Object b() {
        CommonFunctionsKt.a(g());
        return this.f15067z[this.f15066B];
    }

    public final TrieNode c() {
        CommonFunctionsKt.a(h());
        Object obj = this.f15067z[this.f15066B];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    public final Object[] e() {
        return this.f15067z;
    }

    public final int f() {
        return this.f15066B;
    }

    public final boolean g() {
        return this.f15066B < this.f15065A;
    }

    public final boolean h() {
        CommonFunctionsKt.a(this.f15066B >= this.f15065A);
        return this.f15066B < this.f15067z.length;
    }

    public boolean hasNext() {
        return g();
    }

    public final void i() {
        CommonFunctionsKt.a(g());
        this.f15066B += 2;
    }

    public final void j() {
        CommonFunctionsKt.a(h());
        this.f15066B++;
    }

    public final void k(Object[] objArr, int i2) {
        m(objArr, i2, 0);
    }

    public final void m(Object[] objArr, int i2, int i3) {
        this.f15067z = objArr;
        this.f15065A = i2;
        this.f15066B = i3;
    }

    public final void n(int i2) {
        this.f15066B = i2;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
