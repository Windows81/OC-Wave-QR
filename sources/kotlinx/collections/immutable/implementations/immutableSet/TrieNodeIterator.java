package kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;

@Metadata
public final class TrieNodeIterator<E> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f41305a = TrieNode.f41300d.a().l();

    /* renamed from: b  reason: collision with root package name */
    public int f41306b;

    public static /* synthetic */ void i(TrieNodeIterator trieNodeIterator, Object[] objArr, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        trieNodeIterator.h(objArr, i2);
    }

    public final Object a() {
        CommonFunctionsKt.a(d());
        return this.f41305a[this.f41306b];
    }

    public final TrieNode b() {
        CommonFunctionsKt.a(e());
        Object obj = this.f41305a[this.f41306b];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean c() {
        return this.f41306b < this.f41305a.length;
    }

    public final boolean d() {
        return c() && !(this.f41305a[this.f41306b] instanceof TrieNode);
    }

    public final boolean e() {
        return c() && (this.f41305a[this.f41306b] instanceof TrieNode);
    }

    public final void f() {
        CommonFunctionsKt.a(c());
        this.f41306b++;
    }

    public final Object g() {
        CommonFunctionsKt.a(d());
        Object[] objArr = this.f41305a;
        int i2 = this.f41306b;
        this.f41306b = i2 + 1;
        return objArr[i2];
    }

    public final void h(Object[] objArr, int i2) {
        Intrinsics.i(objArr, "buffer");
        this.f41305a = objArr;
        this.f41306b = i2;
    }
}
