package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata
final class MutableValues<K, V> implements Collection<V>, KMutableCollection {

    /* renamed from: z  reason: collision with root package name */
    public final MutableScatterMap f1920z;

    public MutableValues(MutableScatterMap mutableScatterMap) {
        Intrinsics.i(mutableScatterMap, "parent");
        this.f1920z = mutableScatterMap;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f1920z.k();
    }

    public boolean contains(Object obj) {
        return this.f1920z.d(obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object d2 : iterable) {
            if (!this.f1920z.d(d2)) {
                return false;
            }
        }
        return true;
    }

    public int g() {
        return this.f1920z.f1963e;
    }

    public boolean isEmpty() {
        return this.f1920z.h();
    }

    public Iterator iterator() {
        return new MutableValues$iterator$1(this);
    }

    public boolean remove(Object obj) {
        long[] jArr = this.f1920z.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (Intrinsics.d(this.f1920z.f1961c[i5], obj)) {
                                this.f1920z.v(i5);
                                return true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        long[] jArr = this.f1920z.f1959a;
        int length = jArr.length - 2;
        boolean z2 = false;
        if (length >= 0) {
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (CollectionsKt.W(collection, this.f1920z.f1961c[i5])) {
                                this.f1920z.v(i5);
                                z3 = true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return z3;
                    }
                }
                if (i2 == length) {
                    z2 = z3;
                    break;
                }
                i2++;
            }
        }
        return z2;
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        long[] jArr = this.f1920z.f1959a;
        int length = jArr.length - 2;
        boolean z2 = false;
        if (length >= 0) {
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.W(collection, this.f1920z.f1961c[i5])) {
                                this.f1920z.v(i5);
                                z3 = true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return z3;
                    }
                }
                if (i2 == length) {
                    z2 = z3;
                    break;
                }
                i2++;
            }
        }
        return z2;
    }

    public final /* bridge */ int size() {
        return g();
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
