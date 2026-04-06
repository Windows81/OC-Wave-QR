package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    /* renamed from: B  reason: collision with root package name */
    public static final LazyStringArrayList f21043B;
    public static final LazyStringList C;

    /* renamed from: A  reason: collision with root package name */
    public final List f21044A;

    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: z  reason: collision with root package name */
        public final LazyStringArrayList f21045z;

        /* renamed from: e */
        public void add(int i2, byte[] bArr) {
            this.f21045z.s(i2, bArr);
            this.modCount++;
        }

        /* renamed from: g */
        public byte[] get(int i2) {
            return this.f21045z.B(i2);
        }

        /* renamed from: h */
        public byte[] remove(int i2) {
            String E = this.f21045z.remove(i2);
            this.modCount++;
            return LazyStringArrayList.v(E);
        }

        /* renamed from: i */
        public byte[] set(int i2, byte[] bArr) {
            Object g2 = this.f21045z.J(i2, bArr);
            this.modCount++;
            return LazyStringArrayList.v(g2);
        }

        public int size() {
            return this.f21045z.size();
        }
    }

    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {

        /* renamed from: z  reason: collision with root package name */
        public final LazyStringArrayList f21046z;

        /* renamed from: e */
        public void add(int i2, ByteString byteString) {
            this.f21046z.p(i2, byteString);
            this.modCount++;
        }

        /* renamed from: g */
        public ByteString get(int i2) {
            return this.f21046z.C(i2);
        }

        /* renamed from: h */
        public ByteString remove(int i2) {
            String E = this.f21046z.remove(i2);
            this.modCount++;
            return LazyStringArrayList.w(E);
        }

        /* renamed from: i */
        public ByteString set(int i2, ByteString byteString) {
            Object m2 = this.f21046z.H(i2, byteString);
            this.modCount++;
            return LazyStringArrayList.w(m2);
        }

        public int size() {
            return this.f21046z.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(false);
        f21043B = lazyStringArrayList;
        C = lazyStringArrayList;
    }

    public LazyStringArrayList(boolean z2) {
        super(z2);
        this.f21044A = Collections.emptyList();
    }

    public static byte[] v(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? Internal.j((String) obj) : ((ByteString) obj).P();
    }

    public static ByteString w(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.u((String) obj) : ByteString.q((byte[]) obj);
    }

    public static String z(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).U() : Internal.k((byte[]) obj);
    }

    /* renamed from: A */
    public String get(int i2) {
        Object obj = this.f21044A.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String U = byteString.U();
            if (byteString.C()) {
                this.f21044A.set(i2, U);
            }
            return U;
        }
        byte[] bArr = (byte[]) obj;
        String k2 = Internal.k(bArr);
        if (Internal.g(bArr)) {
            this.f21044A.set(i2, k2);
        }
        return k2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] B(int r3) {
        /*
            r2 = this;
            java.util.List r0 = r2.f21044A
            java.lang.Object r0 = r0.get(r3)
            byte[] r1 = v(r0)
            if (r1 == r0) goto L_0x0011
            java.util.List r0 = r2.f21044A
            r0.set(r3, r1)
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.LazyStringArrayList.B(int):byte[]");
    }

    public ByteString C(int i2) {
        Object obj = this.f21044A.get(i2);
        ByteString w2 = w(obj);
        if (w2 != obj) {
            this.f21044A.set(i2, w2);
        }
        return w2;
    }

    /* renamed from: D */
    public LazyStringArrayList f(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f21044A);
            return new LazyStringArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: E */
    public String remove(int i2) {
        e();
        Object remove = this.f21044A.remove(i2);
        this.modCount++;
        return z(remove);
    }

    /* renamed from: F */
    public String set(int i2, String str) {
        e();
        return z(this.f21044A.set(i2, str));
    }

    public Object G(int i2) {
        return this.f21044A.get(i2);
    }

    public final Object H(int i2, ByteString byteString) {
        e();
        return this.f21044A.set(i2, byteString);
    }

    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    public final Object J(int i2, byte[] bArr) {
        e();
        return this.f21044A.set(i2, bArr);
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        e();
        this.f21044A.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final void p(int i2, ByteString byteString) {
        e();
        this.f21044A.add(i2, byteString);
        this.modCount++;
    }

    /* renamed from: q */
    public void add(int i2, String str) {
        e();
        this.f21044A.add(i2, str);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final void s(int i2, byte[] bArr) {
        e();
        this.f21044A.add(i2, bArr);
        this.modCount++;
    }

    public void s0(ByteString byteString) {
        e();
        this.f21044A.add(byteString);
        this.modCount++;
    }

    public int size() {
        return this.f21044A.size();
    }

    /* renamed from: u */
    public boolean add(String str) {
        e();
        this.f21044A.add(str);
        this.modCount++;
        return true;
    }

    public List y() {
        return Collections.unmodifiableList(this.f21044A);
    }

    public boolean addAll(int i2, Collection collection) {
        e();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).y();
        }
        boolean addAll = this.f21044A.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f21044A = arrayList;
    }
}
