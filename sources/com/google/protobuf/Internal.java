package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

public final class Internal {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f32167a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f32168b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f32169c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f32170d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f32171e;

    /* renamed from: f  reason: collision with root package name */
    public static final CodedInputStream f32172f;

    public interface BooleanList extends ProtobufList<Boolean> {
    }

    public interface DoubleList extends ProtobufList<Double> {
    }

    public interface EnumLite {
        int i();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        EnumLite a(int i2);
    }

    public interface EnumVerifier {
        boolean a(int i2);
    }

    public interface FloatList extends ProtobufList<Float> {
    }

    public interface IntList extends ProtobufList<Integer> {
        IntList f(int i2);

        void g0(int i2);

        int getInt(int i2);
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* renamed from: A  reason: collision with root package name */
        public final Converter f32173A;

        /* renamed from: z  reason: collision with root package name */
        public final List f32174z;

        public interface Converter<F, T> {
            Object a(Object obj);
        }

        public Object get(int i2) {
            return this.f32173A.a(this.f32174z.get(i2));
        }

        public int size() {
            return this.f32174z.size();
        }
    }

    public interface LongList extends ProtobufList<Long> {
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final Converter f32175A;

        /* renamed from: z  reason: collision with root package name */
        public final Map f32176z;

        /* renamed from: com.google.protobuf.Internal$MapAdapter$1  reason: invalid class name */
        class AnonymousClass1 implements Converter<Integer, EnumLite> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EnumLiteMap f32177a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ EnumLite f32178b;

            /* renamed from: c */
            public Integer b(EnumLite enumLite) {
                return Integer.valueOf(enumLite.i());
            }

            /* renamed from: d */
            public EnumLite a(Integer num) {
                EnumLite a2 = this.f32177a.a(num.intValue());
                return a2 == null ? this.f32178b : a2;
            }
        }

        public interface Converter<A, B> {
            Object a(Object obj);

            Object b(Object obj);
        }

        public class EntryAdapter implements Map.Entry<K, V> {

            /* renamed from: z  reason: collision with root package name */
            public final Map.Entry f32180z;

            public EntryAdapter(Map.Entry entry) {
                this.f32180z = entry;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
            }

            public Object getKey() {
                return this.f32180z.getKey();
            }

            public Object getValue() {
                return MapAdapter.this.f32175A.a(this.f32180z.getValue());
            }

            public int hashCode() {
                return this.f32180z.hashCode();
            }

            public Object setValue(Object obj) {
                Object value = this.f32180z.setValue(MapAdapter.this.f32175A.b(obj));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.f32175A.a(value);
            }
        }

        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {

            /* renamed from: z  reason: collision with root package name */
            public final Iterator f32182z;

            public IteratorAdapter(Iterator it) {
                this.f32182z = it;
            }

            /* renamed from: b */
            public Map.Entry next() {
                return new EntryAdapter((Map.Entry) this.f32182z.next());
            }

            public boolean hasNext() {
                return this.f32182z.hasNext();
            }

            public void remove() {
                this.f32182z.remove();
            }
        }

        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: z  reason: collision with root package name */
            public final Set f32184z;

            public SetAdapter(Set set) {
                this.f32184z = set;
            }

            public Iterator iterator() {
                return new IteratorAdapter(this.f32184z.iterator());
            }

            public int size() {
                return this.f32184z.size();
            }
        }

        public Set entrySet() {
            return new SetAdapter(this.f32176z.entrySet());
        }

        public Object get(Object obj) {
            Object obj2 = this.f32176z.get(obj);
            if (obj2 == null) {
                return null;
            }
            return this.f32175A.a(obj2);
        }

        public Object put(Object obj, Object obj2) {
            Object put = this.f32176z.put(obj, this.f32175A.b(obj2));
            if (put == null) {
                return null;
            }
            return this.f32175A.a(put);
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean I();

        ProtobufList f(int i2);

        void r();
    }

    static {
        byte[] bArr = new byte[0];
        f32170d = bArr;
        f32171e = ByteBuffer.wrap(bArr);
        f32172f = CodedInputStream.j(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return Utf8.t(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((MessageLite) obj).e().U0((MessageLite) obj2).C();
    }

    public static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static byte[] j(String str) {
        return str.getBytes(f32168b);
    }

    public static String k(byte[] bArr) {
        return new String(bArr, f32168b);
    }
}
