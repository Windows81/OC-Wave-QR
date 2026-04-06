package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);
    public static final Object[] D = new Object[0];

    /* renamed from: A  reason: collision with root package name */
    public Object[] f40580A;

    /* renamed from: B  reason: collision with root package name */
    public int f40581B;

    /* renamed from: z  reason: collision with root package name */
    public int f40582z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ArrayDeque(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = D;
        } else if (i2 > 0) {
            objArr = new Object[i2];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i2);
        }
        this.f40580A = objArr;
    }

    private final void n(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.f40580A;
            if (i2 > objArr.length) {
                if (objArr == D) {
                    this.f40580A = new Object[RangesKt.e(i2, 10)];
                } else {
                    i(AbstractList.f40564z.e(objArr.length, i2));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    public final Object A() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public final void B(int i2, int i3) {
        int v2 = v(this.f40582z + (i2 - 1));
        int v3 = v(this.f40582z + (i3 - 1));
        while (i2 > 0) {
            int i4 = v2 + 1;
            int min = Math.min(i2, Math.min(i4, v3 + 1));
            Object[] objArr = this.f40580A;
            int i5 = v3 - min;
            int i6 = v2 - min;
            ArraysKt.l(objArr, objArr, i5 + 1, i6 + 1, i4);
            v2 = s(i6);
            v3 = s(i5);
            i2 -= min;
        }
    }

    public final void C(int i2, int i3) {
        int v2 = v(this.f40582z + i3);
        int v3 = v(this.f40582z + i2);
        int size = size();
        while (true) {
            size -= i3;
            if (size > 0) {
                Object[] objArr = this.f40580A;
                i3 = Math.min(size, Math.min(objArr.length - v2, objArr.length - v3));
                Object[] objArr2 = this.f40580A;
                int i4 = v2 + i3;
                ArraysKt.l(objArr2, objArr2, v3, v2, i4);
                v2 = v(i4);
                v3 = v(v3 + i3);
            } else {
                return;
            }
        }
    }

    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        w();
        n(size() + collection.size());
        h(v(this.f40582z + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        w();
        n(size() + 1);
        int m2 = m(this.f40582z);
        this.f40582z = m2;
        this.f40580A[m2] = obj;
        this.f40581B = size() + 1;
    }

    public final void addLast(Object obj) {
        w();
        n(size() + 1);
        this.f40580A[v(this.f40582z + size())] = obj;
        this.f40581B = size() + 1;
    }

    public void clear() {
        if (!isEmpty()) {
            w();
            u(this.f40582z, v(this.f40582z + size()));
        }
        this.f40582z = 0;
        this.f40581B = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public int e() {
        return this.f40581B;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f40580A[this.f40582z];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public Object g(int i2) {
        AbstractList.f40564z.b(i2, size());
        if (i2 == CollectionsKt.o(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        w();
        int v2 = v(this.f40582z + i2);
        Object obj = this.f40580A[v2];
        if (i2 < (size() >> 1)) {
            int i3 = this.f40582z;
            if (v2 >= i3) {
                Object[] objArr = this.f40580A;
                ArraysKt.l(objArr, objArr, i3 + 1, i3, v2);
            } else {
                Object[] objArr2 = this.f40580A;
                ArraysKt.l(objArr2, objArr2, 1, 0, v2);
                Object[] objArr3 = this.f40580A;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.f40582z;
                ArraysKt.l(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.f40580A;
            int i5 = this.f40582z;
            objArr4[i5] = null;
            this.f40582z = p(i5);
        } else {
            int v3 = v(this.f40582z + CollectionsKt.o(this));
            if (v2 <= v3) {
                Object[] objArr5 = this.f40580A;
                ArraysKt.l(objArr5, objArr5, v2, v2 + 1, v3 + 1);
            } else {
                Object[] objArr6 = this.f40580A;
                ArraysKt.l(objArr6, objArr6, v2, v2 + 1, objArr6.length);
                Object[] objArr7 = this.f40580A;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.l(objArr7, objArr7, 0, 1, v3 + 1);
            }
            this.f40580A[v3] = null;
        }
        this.f40581B = size() - 1;
        return obj;
    }

    public Object get(int i2) {
        AbstractList.f40564z.b(i2, size());
        return this.f40580A[v(this.f40582z + i2)];
    }

    public final void h(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f40580A.length;
        while (i2 < length && it.hasNext()) {
            this.f40580A[i2] = it.next();
            i2++;
        }
        int i3 = this.f40582z;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f40580A[i4] = it.next();
        }
        this.f40581B = size() + collection.size();
    }

    public final void i(int i2) {
        Object[] objArr = new Object[i2];
        Object[] objArr2 = this.f40580A;
        ArraysKt.l(objArr2, objArr, 0, this.f40582z, objArr2.length);
        Object[] objArr3 = this.f40580A;
        int length = objArr3.length;
        int i3 = this.f40582z;
        ArraysKt.l(objArr3, objArr, length - i3, 0, i3);
        this.f40582z = 0;
        this.f40580A = objArr;
    }

    public int indexOf(Object obj) {
        int i2;
        int v2 = v(this.f40582z + size());
        int i3 = this.f40582z;
        if (i3 < v2) {
            while (i3 < v2) {
                if (Intrinsics.d(obj, this.f40580A[i3])) {
                    i2 = this.f40582z;
                } else {
                    i3++;
                }
            }
            return -1;
        } else if (i3 < v2) {
            return -1;
        } else {
            int length = this.f40580A.length;
            while (true) {
                if (i3 >= length) {
                    int i4 = 0;
                    while (i4 < v2) {
                        if (Intrinsics.d(obj, this.f40580A[i4])) {
                            i3 = i4 + this.f40580A.length;
                            i2 = this.f40582z;
                        } else {
                            i4++;
                        }
                    }
                    return -1;
                } else if (Intrinsics.d(obj, this.f40580A[i3])) {
                    i2 = this.f40582z;
                    break;
                } else {
                    i3++;
                }
            }
        }
        return i3 - i2;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f40580A[v(this.f40582z + CollectionsKt.o(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i2;
        int i3;
        int v2 = v(this.f40582z + size());
        int i4 = this.f40582z;
        if (i4 < v2) {
            i2 = v2 - 1;
            if (i4 <= i2) {
                while (!Intrinsics.d(obj, this.f40580A[i2])) {
                    if (i2 != i4) {
                        i2--;
                    }
                }
                i3 = this.f40582z;
            }
            return -1;
        }
        if (i4 > v2) {
            int i5 = v2 - 1;
            while (true) {
                if (-1 >= i5) {
                    int m0 = ArraysKt.m0(this.f40580A);
                    int i6 = this.f40582z;
                    if (i6 <= m0) {
                        while (!Intrinsics.d(obj, this.f40580A[i2])) {
                            if (i2 != i6) {
                                m0 = i2 - 1;
                            }
                        }
                        i3 = this.f40582z;
                    }
                } else if (Intrinsics.d(obj, this.f40580A[i5])) {
                    i2 = i5 + this.f40580A.length;
                    i3 = this.f40582z;
                    break;
                } else {
                    i5--;
                }
            }
        }
        return -1;
        return i2 - i3;
    }

    public final int m(int i2) {
        return i2 == 0 ? ArraysKt.m0(this.f40580A) : i2 - 1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.f40580A[this.f40582z];
    }

    public final int p(int i2) {
        if (i2 == ArraysKt.m0(this.f40580A)) {
            return 0;
        }
        return i2 + 1;
    }

    public final Object q() {
        if (isEmpty()) {
            return null;
        }
        return this.f40580A[v(this.f40582z + CollectionsKt.o(this))];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f40580A
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f40582z
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.v(r0)
            int r2 = r11.f40582z
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f40580A
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f40580A
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f40580A
            kotlin.collections.ArraysKt.w(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f40580A
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f40580A
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f40580A
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.v(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f40580A
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f40580A
            r2[r5] = r6
            int r5 = r11.p(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.w()
            int r12 = r11.f40582z
            int r5 = r5 - r12
            int r12 = r11.s(r5)
            r11.f40581B = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ArrayDeque.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            w();
            Object[] objArr = this.f40580A;
            int i2 = this.f40582z;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.f40582z = p(i2);
            this.f40581B = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            w();
            int v2 = v(this.f40582z + CollectionsKt.o(this));
            Object[] objArr = this.f40580A;
            Object obj = objArr[v2];
            objArr[v2] = null;
            this.f40581B = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public void removeRange(int i2, int i3) {
        AbstractList.f40564z.d(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 == size()) {
                clear();
            } else if (i4 == 1) {
                remove(i2);
            } else {
                w();
                if (i2 < size() - i3) {
                    B(i2, i3);
                    int v2 = v(this.f40582z + i4);
                    u(this.f40582z, v2);
                    this.f40582z = v2;
                } else {
                    C(i2, i3);
                    int v3 = v(this.f40582z + size());
                    u(s(v3 - i4), v3);
                }
                this.f40581B = size() - i4;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f40580A
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f40582z
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.v(r0)
            int r2 = r11.f40582z
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f40580A
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f40580A
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f40580A
            kotlin.collections.ArraysKt.w(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f40580A
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f40580A
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f40580A
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.v(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f40580A
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f40580A
            r2[r5] = r6
            int r5 = r11.p(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.w()
            int r12 = r11.f40582z
            int r5 = r5 - r12
            int r12 = r11.s(r5)
            r11.f40581B = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ArrayDeque.retainAll(java.util.Collection):boolean");
    }

    public final int s(int i2) {
        return i2 < 0 ? i2 + this.f40580A.length : i2;
    }

    public Object set(int i2, Object obj) {
        AbstractList.f40564z.b(i2, size());
        int v2 = v(this.f40582z + i2);
        Object[] objArr = this.f40580A;
        Object obj2 = objArr[v2];
        objArr[v2] = obj;
        return obj2;
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        if (objArr.length < size()) {
            objArr = ArraysKt__ArraysJVMKt.a(objArr, size());
        }
        int v2 = v(this.f40582z + size());
        int i2 = this.f40582z;
        if (i2 < v2) {
            ArraysKt.q(this.f40580A, objArr, 0, i2, v2, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f40580A;
            ArraysKt.l(objArr2, objArr, 0, this.f40582z, objArr2.length);
            Object[] objArr3 = this.f40580A;
            ArraysKt.l(objArr3, objArr, objArr3.length - this.f40582z, 0, v2);
        }
        return CollectionsKt.f(size(), objArr);
    }

    public final void u(int i2, int i3) {
        if (i2 < i3) {
            ArraysKt.w(this.f40580A, (Object) null, i2, i3);
            return;
        }
        Object[] objArr = this.f40580A;
        ArraysKt.w(objArr, (Object) null, i2, objArr.length);
        ArraysKt.w(this.f40580A, (Object) null, 0, i3);
    }

    public final int v(int i2) {
        Object[] objArr = this.f40580A;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void w() {
        this.modCount++;
    }

    public final Object z() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public void add(int i2, Object obj) {
        AbstractList.f40564z.c(i2, size());
        if (i2 == size()) {
            addLast(obj);
        } else if (i2 == 0) {
            addFirst(obj);
        } else {
            w();
            n(size() + 1);
            int v2 = v(this.f40582z + i2);
            if (i2 < ((size() + 1) >> 1)) {
                int m2 = m(v2);
                int m3 = m(this.f40582z);
                int i3 = this.f40582z;
                if (m2 >= i3) {
                    Object[] objArr = this.f40580A;
                    objArr[m3] = objArr[i3];
                    ArraysKt.l(objArr, objArr, i3, i3 + 1, m2 + 1);
                } else {
                    Object[] objArr2 = this.f40580A;
                    ArraysKt.l(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                    Object[] objArr3 = this.f40580A;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    ArraysKt.l(objArr3, objArr3, 0, 1, m2 + 1);
                }
                this.f40580A[m2] = obj;
                this.f40582z = m3;
            } else {
                int v3 = v(this.f40582z + size());
                if (v2 < v3) {
                    Object[] objArr4 = this.f40580A;
                    ArraysKt.l(objArr4, objArr4, v2 + 1, v2, v3);
                } else {
                    Object[] objArr5 = this.f40580A;
                    ArraysKt.l(objArr5, objArr5, 1, 0, v3);
                    Object[] objArr6 = this.f40580A;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    ArraysKt.l(objArr6, objArr6, v2 + 1, v2, objArr6.length - 1);
                }
                this.f40580A[v2] = obj;
            }
            this.f40581B = size() + 1;
        }
    }

    public boolean addAll(int i2, Collection collection) {
        Intrinsics.i(collection, "elements");
        AbstractList.f40564z.c(i2, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == size()) {
            return addAll(collection);
        }
        w();
        n(size() + collection.size());
        int v2 = v(this.f40582z + size());
        int v3 = v(this.f40582z + i2);
        int size = collection.size();
        if (i2 < ((size() + 1) >> 1)) {
            int i3 = this.f40582z;
            int i4 = i3 - size;
            if (v3 < i3) {
                Object[] objArr = this.f40580A;
                ArraysKt.l(objArr, objArr, i4, i3, objArr.length);
                if (size >= v3) {
                    Object[] objArr2 = this.f40580A;
                    ArraysKt.l(objArr2, objArr2, objArr2.length - size, 0, v3);
                } else {
                    Object[] objArr3 = this.f40580A;
                    ArraysKt.l(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f40580A;
                    ArraysKt.l(objArr4, objArr4, 0, size, v3);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f40580A;
                ArraysKt.l(objArr5, objArr5, i4, i3, v3);
            } else {
                Object[] objArr6 = this.f40580A;
                i4 += objArr6.length;
                int i5 = v3 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    ArraysKt.l(objArr6, objArr6, i4, i3, v3);
                } else {
                    ArraysKt.l(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.f40580A;
                    ArraysKt.l(objArr7, objArr7, 0, this.f40582z + length, v3);
                }
            }
            this.f40582z = i4;
            h(s(v3 - size), collection);
        } else {
            int i6 = v3 + size;
            if (v3 < v2) {
                int i7 = size + v2;
                Object[] objArr8 = this.f40580A;
                if (i7 <= objArr8.length) {
                    ArraysKt.l(objArr8, objArr8, i6, v3, v2);
                } else if (i6 >= objArr8.length) {
                    ArraysKt.l(objArr8, objArr8, i6 - objArr8.length, v3, v2);
                } else {
                    int length2 = v2 - (i7 - objArr8.length);
                    ArraysKt.l(objArr8, objArr8, 0, length2, v2);
                    Object[] objArr9 = this.f40580A;
                    ArraysKt.l(objArr9, objArr9, i6, v3, length2);
                }
            } else {
                Object[] objArr10 = this.f40580A;
                ArraysKt.l(objArr10, objArr10, size, 0, v2);
                Object[] objArr11 = this.f40580A;
                if (i6 >= objArr11.length) {
                    ArraysKt.l(objArr11, objArr11, i6 - objArr11.length, v3, objArr11.length);
                } else {
                    ArraysKt.l(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f40580A;
                    ArraysKt.l(objArr12, objArr12, i6, v3, objArr12.length - size);
                }
            }
            h(v3, collection);
        }
        return true;
    }

    public ArrayDeque() {
        this.f40580A = D;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
