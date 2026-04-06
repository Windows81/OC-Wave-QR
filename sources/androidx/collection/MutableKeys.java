package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
final class MutableKeys<K, V> implements Set<K>, KMutableSet {

    /* renamed from: z  reason: collision with root package name */
    public final MutableScatterMap f1884z;

    public MutableKeys(MutableScatterMap mutableScatterMap) {
        Intrinsics.i(mutableScatterMap, "parent");
        this.f1884z = mutableScatterMap;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f1884z.k();
    }

    public boolean contains(Object obj) {
        return this.f1884z.c(obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object c2 : iterable) {
            if (!this.f1884z.c(c2)) {
                return false;
            }
        }
        return true;
    }

    public int g() {
        return this.f1884z.f1963e;
    }

    public boolean isEmpty() {
        return this.f1884z.h();
    }

    public Iterator iterator() {
        return new MutableKeys$iterator$1(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (((r8 & ((~r8) << 6)) & -9187201950435737472L) == 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        r12 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean remove(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.collection.MutableScatterMap r2 = r0.f1884z
            if (r1 == 0) goto L_0x000d
            int r4 = r19.hashCode()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r2.f1962d
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L_0x001d:
            long[] r8 = r2.f1959a
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r14
            long r10 = r10 ^ r8
            long r14 = r10 - r14
            long r10 = ~r10
            long r10 = r10 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L_0x0049:
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 == 0) goto L_0x0069
            int r12 = java.lang.Long.numberOfTrailingZeros(r10)
            int r12 = r12 >> 3
            int r12 = r12 + r4
            r12 = r12 & r6
            java.lang.Object[] r3 = r2.f1960b
            r3 = r3[r12]
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r1)
            if (r3 == 0) goto L_0x0062
            goto L_0x0073
        L_0x0062:
            r16 = 1
            long r16 = r10 - r16
            long r10 = r10 & r16
            goto L_0x0049
        L_0x0069:
            long r10 = ~r8
            r3 = 6
            long r10 = r10 << r3
            long r8 = r8 & r10
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x007d
            r12 = -1
        L_0x0073:
            if (r12 < 0) goto L_0x007b
            androidx.collection.MutableScatterMap r1 = r0.f1884z
            r1.v(r12)
            return r13
        L_0x007b:
            r3 = 0
            return r3
        L_0x007d:
            r3 = 0
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableKeys.remove(java.lang.Object):boolean");
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        long[] jArr = this.f1884z.f1959a;
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
                            if (CollectionsKt.W(collection, this.f1884z.f1960b[i5])) {
                                this.f1884z.v(i5);
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
        long[] jArr = this.f1884z.f1959a;
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
                            if (!CollectionsKt.W(collection, this.f1884z.f1960b[i5])) {
                                this.f1884z.v(i5);
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
