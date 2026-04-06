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
public final class UShortArray implements Collection<UShort>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final short[] f40549z;

    @Metadata
    public static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {

        /* renamed from: A  reason: collision with root package name */
        public int f40550A;

        /* renamed from: z  reason: collision with root package name */
        public final short[] f40551z;

        public Iterator(short[] sArr) {
            Intrinsics.i(sArr, "array");
            this.f40551z = sArr;
        }

        public short b() {
            int i2 = this.f40550A;
            short[] sArr = this.f40551z;
            if (i2 < sArr.length) {
                this.f40550A = i2 + 1;
                return UShort.f(sArr[i2]);
            }
            throw new NoSuchElementException(String.valueOf(this.f40550A));
        }

        public boolean hasNext() {
            return this.f40550A < this.f40551z.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return UShort.d(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ UShortArray(short[] sArr) {
        this.f40549z = sArr;
    }

    public static String A(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ UShortArray e(short[] sArr) {
        return new UShortArray(sArr);
    }

    public static short[] g(int i2) {
        return h(new short[i2]);
    }

    public static short[] h(short[] sArr) {
        Intrinsics.i(sArr, "storage");
        return sArr;
    }

    public static boolean m(short[] sArr, short s2) {
        return ArraysKt.Z(sArr, s2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(short[] r3, java.util.Collection r4) {
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
            boolean r2 = r0 instanceof kotlin.UShort
            if (r2 == 0) goto L_0x0031
            kotlin.UShort r0 = (kotlin.UShort) r0
            short r0 = r0.l()
            boolean r0 = kotlin.collections.ArraysKt.Z(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UShortArray.n(short[], java.util.Collection):boolean");
    }

    public static boolean o(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.d(sArr, ((UShortArray) obj).B());
    }

    public static final short p(short[] sArr, int i2) {
        return UShort.f(sArr[i2]);
    }

    public static int s(short[] sArr) {
        return sArr.length;
    }

    public static int u(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean v(short[] sArr) {
        return sArr.length == 0;
    }

    public static java.util.Iterator w(short[] sArr) {
        return new Iterator(sArr);
    }

    public static final void z(short[] sArr, int i2, short s2) {
        sArr[i2] = s2;
    }

    public final /* synthetic */ short[] B() {
        return this.f40549z;
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
        if (!(obj instanceof UShort)) {
            return false;
        }
        return i(((UShort) obj).l());
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return n(this.f40549z, collection);
    }

    public boolean equals(Object obj) {
        return o(this.f40549z, obj);
    }

    public int hashCode() {
        return u(this.f40549z);
    }

    public boolean i(short s2) {
        return m(this.f40549z, s2);
    }

    public boolean isEmpty() {
        return v(this.f40549z);
    }

    public java.util.Iterator iterator() {
        return w(this.f40549z);
    }

    /* renamed from: q */
    public int size() {
        return s(this.f40549z);
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
        return A(this.f40549z);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
