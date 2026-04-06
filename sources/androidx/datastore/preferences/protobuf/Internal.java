package androidx.datastore.preferences.protobuf;

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
    public static final Charset f21002a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f21003b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f21004c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f21005d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f21006e;

    /* renamed from: f  reason: collision with root package name */
    public static final CodedInputStream f21007f;

    public interface BooleanList extends ProtobufList<Boolean> {
        BooleanList f(int i2);
    }

    public interface DoubleList extends ProtobufList<Double> {
        DoubleList f(int i2);
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
        FloatList f(int i2);
    }

    public interface IntList extends ProtobufList<Integer> {
        IntList f(int i2);

        int getInt(int i2);
    }

    public static class IntListAdapter<T> extends AbstractList<T> {

        /* renamed from: A  reason: collision with root package name */
        public final IntConverter f21008A;

        /* renamed from: z  reason: collision with root package name */
        public final IntList f21009z;

        public interface IntConverter<T> {
            Object a(int i2);
        }

        public Object get(int i2) {
            return this.f21008A.a(this.f21009z.getInt(i2));
        }

        public int size() {
            return this.f21009z.size();
        }
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* renamed from: A  reason: collision with root package name */
        public final Converter f21010A;

        /* renamed from: z  reason: collision with root package name */
        public final List f21011z;

        public interface Converter<F, T> {
            Object a(Object obj);
        }

        public Object get(int i2) {
            return this.f21010A.a(this.f21011z.get(i2));
        }

        public int size() {
            return this.f21011z.size();
        }
    }

    public interface LongList extends ProtobufList<Long> {
        LongList f(int i2);
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: A  reason: collision with root package name */
        public final Converter f21012A;

        /* renamed from: z  reason: collision with root package name */
        public final Map f21013z;

        /* renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$1  reason: invalid class name */
        class AnonymousClass1 implements Converter<Integer, EnumLite> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EnumLiteMap f21014a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ EnumLite f21015b;

            /* renamed from: c */
            public Integer b(EnumLite enumLite) {
                return Integer.valueOf(enumLite.i());
            }

            /* renamed from: d */
            public EnumLite a(Integer num) {
                EnumLite a2 = this.f21014a.a(num.intValue());
                return a2 == null ? this.f21015b : a2;
            }
        }

        public interface Converter<A, B> {
            Object a(Object obj);

            Object b(Object obj);
        }

        public class EntryAdapter implements Map.Entry<K, V> {

            /* renamed from: z  reason: collision with root package name */
            public final Map.Entry f21017z;

            public EntryAdapter(Map.Entry entry) {
                this.f21017z = entry;
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
                return this.f21017z.getKey();
            }

            public Object getValue() {
                return MapAdapter.this.f21012A.a(this.f21017z.getValue());
            }

            public int hashCode() {
                return this.f21017z.hashCode();
            }

            public Object setValue(Object obj) {
                Object value = this.f21017z.setValue(MapAdapter.this.f21012A.b(obj));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.f21012A.a(value);
            }
        }

        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {

            /* renamed from: z  reason: collision with root package name */
            public final Iterator f21019z;

            public IteratorAdapter(Iterator it) {
                this.f21019z = it;
            }

            /* renamed from: b */
            public Map.Entry next() {
                return new EntryAdapter((Map.Entry) this.f21019z.next());
            }

            public boolean hasNext() {
                return this.f21019z.hasNext();
            }

            public void remove() {
                this.f21019z.remove();
            }
        }

        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: z  reason: collision with root package name */
            public final Set f21021z;

            public SetAdapter(Set set) {
                this.f21021z = set;
            }

            public Iterator iterator() {
                return new IteratorAdapter(this.f21021z.iterator());
            }

            public int size() {
                return this.f21021z.size();
            }
        }

        public Set entrySet() {
            return new SetAdapter(this.f21013z.entrySet());
        }

        public Object get(Object obj) {
            Object obj2 = this.f21013z.get(obj);
            if (obj2 == null) {
                return null;
            }
            return this.f21012A.a(obj2);
        }

        public Object put(Object obj, Object obj2) {
            Object put = this.f21013z.put(obj, this.f21012A.b(obj2));
            if (put == null) {
                return null;
            }
            return this.f21012A.a(put);
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean I();

        ProtobufList f(int i2);

        void r();
    }

    static {
        byte[] bArr = new byte[0];
        f21005d = bArr;
        f21006e = ByteBuffer.wrap(bArr);
        f21007f = CodedInputStream.k(bArr);
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
        return ((MessageLite) obj).e().S((MessageLite) obj2).C();
    }

    public static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static byte[] j(String str) {
        return str.getBytes(f21003b);
    }

    public static String k(byte[] bArr) {
        return new String(bArr, f21003b);
    }
}
