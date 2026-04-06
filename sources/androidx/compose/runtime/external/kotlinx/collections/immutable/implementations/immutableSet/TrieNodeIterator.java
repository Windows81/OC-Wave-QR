package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TrieNodeIterator<E> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f15082a = TrieNode.f15076d.a().n();

    /* renamed from: b  reason: collision with root package name */
    public int f15083b;

    public static /* synthetic */ void i(TrieNodeIterator trieNodeIterator, Object[] objArr, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        trieNodeIterator.h(objArr, i2);
    }

    public final Object a() {
        CommonFunctionsKt.a(d());
        return this.f15082a[this.f15083b];
    }

    public final TrieNode b() {
        CommonFunctionsKt.a(e());
        Object obj = this.f15082a[this.f15083b];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean c() {
        return this.f15083b < this.f15082a.length;
    }

    public final boolean d() {
        return c() && !(this.f15082a[this.f15083b] instanceof TrieNode);
    }

    public final boolean e() {
        return c() && (this.f15082a[this.f15083b] instanceof TrieNode);
    }

    public final void f() {
        CommonFunctionsKt.a(c());
        this.f15083b++;
    }

    public final Object g() {
        CommonFunctionsKt.a(d());
        Object[] objArr = this.f15082a;
        int i2 = this.f15083b;
        this.f15083b = i2 + 1;
        return objArr[i2];
    }

    public final void h(Object[] objArr, int i2) {
        this.f15082a = objArr;
        this.f15083b = i2;
    }
}
