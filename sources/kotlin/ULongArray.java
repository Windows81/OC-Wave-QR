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
public final class ULongArray implements Collection<ULong>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final long[] f40543z;

    @Metadata
    public static final class Iterator implements java.util.Iterator<ULong>, KMappedMarker {

        /* renamed from: A  reason: collision with root package name */
        public int f40544A;

        /* renamed from: z  reason: collision with root package name */
        public final long[] f40545z;

        public Iterator(long[] jArr) {
            Intrinsics.i(jArr, "array");
            this.f40545z = jArr;
        }

        public long b() {
            int i2 = this.f40544A;
            long[] jArr = this.f40545z;
            if (i2 < jArr.length) {
                this.f40544A = i2 + 1;
                return ULong.f(jArr[i2]);
            }
            throw new NoSuchElementException(String.valueOf(this.f40544A));
        }

        public boolean hasNext() {
            return this.f40544A < this.f40545z.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return ULong.d(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ ULongArray(long[] jArr) {
        this.f40543z = jArr;
    }

    public static String A(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ ULongArray e(long[] jArr) {
        return new ULongArray(jArr);
    }

    public static long[] g(int i2) {
        return h(new long[i2]);
    }

    public static long[] h(long[] jArr) {
        Intrinsics.i(jArr, "storage");
        return jArr;
    }

    public static boolean m(long[] jArr, long j2) {
        return ArraysKt.X(jArr, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(long[] r4, java.util.Collection r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof kotlin.ULong
            if (r2 == 0) goto L_0x0031
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r2 = r0.m()
            boolean r0 = kotlin.collections.ArraysKt.X(r4, r2)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULongArray.n(long[], java.util.Collection):boolean");
    }

    public static boolean o(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.d(jArr, ((ULongArray) obj).B());
    }

    public static final long p(long[] jArr, int i2) {
        return ULong.f(jArr[i2]);
    }

    public static int s(long[] jArr) {
        return jArr.length;
    }

    public static int u(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean v(long[] jArr) {
        return jArr.length == 0;
    }

    public static java.util.Iterator w(long[] jArr) {
        return new Iterator(jArr);
    }

    public static final void z(long[] jArr, int i2, long j2) {
        jArr[i2] = j2;
    }

    public final /* synthetic */ long[] B() {
        return this.f40543z;
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
        if (!(obj instanceof ULong)) {
            return false;
        }
        return i(((ULong) obj).m());
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return n(this.f40543z, collection);
    }

    public boolean equals(Object obj) {
        return o(this.f40543z, obj);
    }

    public int hashCode() {
        return u(this.f40543z);
    }

    public boolean i(long j2) {
        return m(this.f40543z, j2);
    }

    public boolean isEmpty() {
        return v(this.f40543z);
    }

    public java.util.Iterator iterator() {
        return w(this.f40543z);
    }

    /* renamed from: q */
    public int size() {
        return s(this.f40543z);
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
        return A(this.f40543z);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
