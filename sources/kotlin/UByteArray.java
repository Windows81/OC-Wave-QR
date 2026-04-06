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
public final class UByteArray implements Collection<UByte>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f40533z;

    @Metadata
    public static final class Iterator implements java.util.Iterator<UByte>, KMappedMarker {

        /* renamed from: A  reason: collision with root package name */
        public int f40534A;

        /* renamed from: z  reason: collision with root package name */
        public final byte[] f40535z;

        public Iterator(byte[] bArr) {
            Intrinsics.i(bArr, "array");
            this.f40535z = bArr;
        }

        public byte b() {
            int i2 = this.f40534A;
            byte[] bArr = this.f40535z;
            if (i2 < bArr.length) {
                this.f40534A = i2 + 1;
                return UByte.f(bArr[i2]);
            }
            throw new NoSuchElementException(String.valueOf(this.f40534A));
        }

        public boolean hasNext() {
            return this.f40534A < this.f40535z.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return UByte.d(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ UByteArray(byte[] bArr) {
        this.f40533z = bArr;
    }

    public static String A(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ UByteArray e(byte[] bArr) {
        return new UByteArray(bArr);
    }

    public static byte[] g(int i2) {
        return h(new byte[i2]);
    }

    public static byte[] h(byte[] bArr) {
        Intrinsics.i(bArr, "storage");
        return bArr;
    }

    public static boolean m(byte[] bArr, byte b2) {
        return ArraysKt.U(bArr, b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(byte[] r3, java.util.Collection r4) {
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
            boolean r2 = r0 instanceof kotlin.UByte
            if (r2 == 0) goto L_0x0031
            kotlin.UByte r0 = (kotlin.UByte) r0
            byte r0 = r0.l()
            boolean r0 = kotlin.collections.ArraysKt.U(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UByteArray.n(byte[], java.util.Collection):boolean");
    }

    public static boolean o(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.d(bArr, ((UByteArray) obj).B());
    }

    public static final byte p(byte[] bArr, int i2) {
        return UByte.f(bArr[i2]);
    }

    public static int s(byte[] bArr) {
        return bArr.length;
    }

    public static int u(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean v(byte[] bArr) {
        return bArr.length == 0;
    }

    public static java.util.Iterator w(byte[] bArr) {
        return new Iterator(bArr);
    }

    public static final void z(byte[] bArr, int i2, byte b2) {
        bArr[i2] = b2;
    }

    public final /* synthetic */ byte[] B() {
        return this.f40533z;
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
        if (!(obj instanceof UByte)) {
            return false;
        }
        return i(((UByte) obj).l());
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return n(this.f40533z, collection);
    }

    public boolean equals(Object obj) {
        return o(this.f40533z, obj);
    }

    public int hashCode() {
        return u(this.f40533z);
    }

    public boolean i(byte b2) {
        return m(this.f40533z, b2);
    }

    public boolean isEmpty() {
        return v(this.f40533z);
    }

    public java.util.Iterator iterator() {
        return w(this.f40533z);
    }

    /* renamed from: q */
    public int size() {
        return s(this.f40533z);
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
        return A(this.f40533z);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
