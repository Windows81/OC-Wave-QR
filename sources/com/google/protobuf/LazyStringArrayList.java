package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    /* renamed from: B  reason: collision with root package name */
    public static final LazyStringArrayList f32201B;
    public static final LazyStringList C;

    /* renamed from: A  reason: collision with root package name */
    public final List f32202A;

    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: z  reason: collision with root package name */
        public final LazyStringArrayList f32203z;

        /* renamed from: e */
        public void add(int i2, byte[] bArr) {
            this.f32203z.s(i2, bArr);
            this.modCount++;
        }

        /* renamed from: g */
        public byte[] get(int i2) {
            return this.f32203z.A(i2);
        }

        /* renamed from: h */
        public byte[] remove(int i2) {
            String D = this.f32203z.remove(i2);
            this.modCount++;
            return LazyStringArrayList.u(D);
        }

        /* renamed from: i */
        public byte[] set(int i2, byte[] bArr) {
            Object g2 = this.f32203z.H(i2, bArr);
            this.modCount++;
            return LazyStringArrayList.u(g2);
        }

        public int size() {
            return this.f32203z.size();
        }
    }

    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {

        /* renamed from: z  reason: collision with root package name */
        public final LazyStringArrayList f32204z;

        /* renamed from: e */
        public void add(int i2, ByteString byteString) {
            this.f32204z.p(i2, byteString);
            this.modCount++;
        }

        /* renamed from: g */
        public ByteString get(int i2) {
            return this.f32204z.B(i2);
        }

        /* renamed from: h */
        public ByteString remove(int i2) {
            String D = this.f32204z.remove(i2);
            this.modCount++;
            return LazyStringArrayList.v(D);
        }

        /* renamed from: i */
        public ByteString set(int i2, ByteString byteString) {
            Object m2 = this.f32204z.F(i2, byteString);
            this.modCount++;
            return LazyStringArrayList.v(m2);
        }

        public int size() {
            return this.f32204z.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
        f32201B = lazyStringArrayList;
        lazyStringArrayList.r();
        C = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    public static byte[] u(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? Internal.j((String) obj) : ((ByteString) obj).P();
    }

    public static ByteString v(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.u((String) obj) : ByteString.q((byte[]) obj);
    }

    public static String w(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).U() : Internal.k((byte[]) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A(int r3) {
        /*
            r2 = this;
            java.util.List r0 = r2.f32202A
            java.lang.Object r0 = r0.get(r3)
            byte[] r1 = u(r0)
            if (r1 == r0) goto L_0x0011
            java.util.List r0 = r2.f32202A
            r0.set(r3, r1)
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyStringArrayList.A(int):byte[]");
    }

    public ByteString B(int i2) {
        Object obj = this.f32202A.get(i2);
        ByteString v2 = v(obj);
        if (v2 != obj) {
            this.f32202A.set(i2, v2);
        }
        return v2;
    }

    /* renamed from: C */
    public LazyStringArrayList f(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f32202A);
            return new LazyStringArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: D */
    public String remove(int i2) {
        e();
        Object remove = this.f32202A.remove(i2);
        this.modCount++;
        return w(remove);
    }

    /* renamed from: E */
    public String set(int i2, String str) {
        e();
        return w(this.f32202A.set(i2, str));
    }

    public final Object F(int i2, ByteString byteString) {
        e();
        return this.f32202A.set(i2, byteString);
    }

    public Object G(int i2) {
        return this.f32202A.get(i2);
    }

    public final Object H(int i2, byte[] bArr) {
        e();
        return this.f32202A.set(i2, bArr);
    }

    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public void c0(ByteString byteString) {
        e();
        this.f32202A.add(byteString);
        this.modCount++;
    }

    public void clear() {
        e();
        this.f32202A.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public LazyStringList j1() {
        return I() ? new UnmodifiableLazyStringList(this) : this;
    }

    public final void p(int i2, ByteString byteString) {
        e();
        this.f32202A.add(i2, byteString);
        this.modCount++;
    }

    /* renamed from: q */
    public void add(int i2, String str) {
        e();
        this.f32202A.add(i2, str);
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
        this.f32202A.add(i2, bArr);
        this.modCount++;
    }

    public int size() {
        return this.f32202A.size();
    }

    public List y() {
        return Collections.unmodifiableList(this.f32202A);
    }

    /* renamed from: z */
    public String get(int i2) {
        Object obj = this.f32202A.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String U = byteString.U();
            if (byteString.C()) {
                this.f32202A.set(i2, U);
            }
            return U;
        }
        byte[] bArr = (byte[]) obj;
        String k2 = Internal.k(bArr);
        if (Internal.g(bArr)) {
            this.f32202A.set(i2, k2);
        }
        return k2;
    }

    public LazyStringArrayList(int i2) {
        this(new ArrayList(i2));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i2, Collection collection) {
        e();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).y();
        }
        boolean addAll = this.f32202A.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f32202A = arrayList;
    }
}
