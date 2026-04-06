package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@JvmInline
@Metadata
public final class UIntArray implements Collection<UInt>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final int[] f40538z;

    @Metadata
    public static final class Iterator implements java.util.Iterator<UInt>, KMappedMarker {

        /* renamed from: A  reason: collision with root package name */
        public int f40539A;

        /* renamed from: z  reason: collision with root package name */
        public final int[] f40540z;

        public Iterator(int[] iArr) {
            Intrinsics.i(iArr, "array");
            this.f40540z = iArr;
        }

        public int b() {
            int i2 = this.f40539A;
            int[] iArr = this.f40540z;
            if (i2 < iArr.length) {
                this.f40539A = i2 + 1;
                return UInt.f(iArr[i2]);
            }
            throw new NoSuchElementException(String.valueOf(this.f40539A));
        }

        public boolean hasNext() {
            return this.f40539A < this.f40540z.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return UInt.d(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ UIntArray(int[] iArr) {
        this.f40538z = iArr;
    }

    public static String A(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ UIntArray e(int[] iArr) {
        return new UIntArray(iArr);
    }

    public static int[] g(int i2) {
        return h(new int[i2]);
    }

    public static int[] h(int[] iArr) {
        Intrinsics.i(iArr, "storage");
        return iArr;
    }

    public static boolean m(int[] iArr, int i2) {
        return ArraysKt.W(iArr, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(int[] r3, java.util.Collection r4) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r4 = r4.iterator()
        L_0x0016:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r4.next()
            boolean r2 = r0 instanceof kotlin.UInt
            if (r2 == 0) goto L_0x0031
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.l()
            boolean r0 = kotlin.collections.ArraysKt.W(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UIntArray.n(int[], java.util.Collection):boolean");
    }

    public static boolean o(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && Intrinsics.d(iArr, ((UIntArray) obj).B());
    }

    public static final int p(int[] iArr, int i2) {
        return UInt.f(iArr[i2]);
    }

    public static int s(int[] iArr) {
        return iArr.length;
    }

    public static int u(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean v(int[] iArr) {
        return iArr.length == 0;
    }

    public static java.util.Iterator w(int[] iArr) {
        return new Iterator(iArr);
    }

    public static final void z(int[] iArr, int i2, int i3) {
        iArr[i2] = i3;
    }

    public final /* synthetic */ int[] B() {
        return this.f40538z;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof UInt)) {
            return false;
        }
        return i(((UInt) obj).l());
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return n(this.f40538z, collection);
    }

    public boolean equals(Object obj) {
        return o(this.f40538z, obj);
    }

    public int hashCode() {
        return u(this.f40538z);
    }

    public boolean i(int i2) {
        return m(this.f40538z, i2);
    }

    public boolean isEmpty() {
        return v(this.f40538z);
    }

    public java.util.Iterator iterator() {
        return w(this.f40538z);
    }

    /* renamed from: q */
    public int size() {
        return s(this.f40538z);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return A(this.f40538z);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
