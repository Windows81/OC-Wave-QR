package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@CheckReturnValue
final class SchemaUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f21133a = B();

    /* renamed from: b  reason: collision with root package name */
    public static final UnknownFieldSchema f21134b = C();

    /* renamed from: c  reason: collision with root package name */
    public static final UnknownFieldSchema f21135c = new UnknownFieldSetLiteSchema();

    public static Object A(Object obj, int i2, List list, Internal.EnumVerifier enumVerifier, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Integer num = (Integer) list.get(i4);
                int intValue = num.intValue();
                if (enumVerifier.a(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    obj2 = J(obj, i2, intValue, obj2, unknownFieldSchema);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!enumVerifier.a(intValue2)) {
                    obj2 = J(obj, i2, intValue2, obj2, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Class B() {
        if (Protobuf.f21108d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static UnknownFieldSchema C() {
        try {
            Class D = D();
            if (D == null) {
                return null;
            }
            return (UnknownFieldSchema) D.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class D() {
        if (Protobuf.f21108d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void E(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        FieldSet c2 = extensionSchema.c(obj2);
        if (!c2.n()) {
            extensionSchema.d(obj).v(c2);
        }
    }

    public static void F(MapFieldSchema mapFieldSchema, Object obj, Object obj2, long j2) {
        UnsafeUtil.Y(obj, j2, mapFieldSchema.a(UnsafeUtil.H(obj, j2), UnsafeUtil.H(obj2, j2)));
    }

    public static void G(UnknownFieldSchema unknownFieldSchema, Object obj, Object obj2) {
        unknownFieldSchema.p(obj, unknownFieldSchema.k(unknownFieldSchema.g(obj), unknownFieldSchema.g(obj2)));
    }

    public static void H(Class cls) {
        Class cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && !Protobuf.f21108d && (cls2 = f21133a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean I(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object J(Object obj, int i2, int i3, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.f(obj);
        }
        unknownFieldSchema.e(obj2, i2, (long) i3);
        return obj2;
    }

    public static UnknownFieldSchema K() {
        return f21134b;
    }

    public static UnknownFieldSchema L() {
        return f21135c;
    }

    public static void M(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.L(i2, list, z2);
        }
    }

    public static void N(int i2, List list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.X(i2, list);
        }
    }

    public static void O(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.V(i2, list, z2);
        }
    }

    public static void P(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.U(i2, list, z2);
        }
    }

    public static void Q(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.K(i2, list, z2);
        }
    }

    public static void R(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.H(i2, list, z2);
        }
    }

    public static void S(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.p(i2, list, z2);
        }
    }

    public static void T(int i2, List list, Writer writer, Schema schema) {
        if (list != null && !list.isEmpty()) {
            writer.Z(i2, list, schema);
        }
    }

    public static void U(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.C(i2, list, z2);
        }
    }

    public static void V(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.T(i2, list, z2);
        }
    }

    public static void W(int i2, List list, Writer writer, Schema schema) {
        if (list != null && !list.isEmpty()) {
            writer.Y(i2, list, schema);
        }
    }

    public static void X(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.I(i2, list, z2);
        }
    }

    public static void Y(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.u(i2, list, z2);
        }
    }

    public static void Z(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.R(i2, list, z2);
        }
    }

    public static int a(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(size) : size * CodedOutputStream.f(i2, true);
    }

    public static void a0(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.N(i2, list, z2);
        }
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i2, List list, Writer writer) {
        if (list != null && !list.isEmpty()) {
            writer.y(i2, list);
        }
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int M0 = size * CodedOutputStream.M0(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            M0 += CodedOutputStream.j((ByteString) list.get(i3));
        }
        return M0;
    }

    public static void c0(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.M(i2, list, z2);
        }
    }

    public static int d(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = e(list);
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(e2) : e2 + (size * CodedOutputStream.M0(i2));
    }

    public static void d0(int i2, List list, Writer writer, boolean z2) {
        if (list != null && !list.isEmpty()) {
            writer.v(i2, list, z2);
        }
    }

    public static int e(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.n(intArrayList.getInt(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.n(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int f(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(size * 4) : size * CodedOutputStream.e0(i2, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(size * 8) : size * CodedOutputStream.g0(i2, 0);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += CodedOutputStream.k0(i2, (MessageLite) list.get(i4), schema);
        }
        return i3;
    }

    public static int k(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l2 = l(list);
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(l2) : l2 + (size * CodedOutputStream.M0(i2));
    }

    public static int l(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.o0(intArrayList.getInt(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.o0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int m(int i2, List list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        int n2 = n(list);
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(n2) : n2 + (list.size() * CodedOutputStream.M0(i2));
    }

    public static int n(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.q0(longArrayList.p(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.q0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int o(int i2, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.s0(i2, (LazyFieldLite) obj) : CodedOutputStream.x0(i2, (MessageLite) obj, schema);
    }

    public static int p(int i2, List list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int M0 = CodedOutputStream.M0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            M0 += obj instanceof LazyFieldLite ? CodedOutputStream.t0((LazyFieldLite) obj) : CodedOutputStream.z0((MessageLite) obj, schema);
        }
        return M0;
    }

    public static int q(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r2 = r(list);
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(r2) : r2 + (size * CodedOutputStream.M0(i2));
    }

    public static int r(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.H0(intArrayList.getInt(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.H0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int s(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t2 = t(list);
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(t2) : t2 + (size * CodedOutputStream.M0(i2));
    }

    public static int t(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.J0(longArrayList.p(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.J0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int u(int i2, List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int M0 = CodedOutputStream.M0(i2) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < size) {
                Object G = lazyStringList.G(i3);
                M0 += G instanceof ByteString ? CodedOutputStream.j((ByteString) G) : CodedOutputStream.L0((String) G);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                M0 += obj instanceof ByteString ? CodedOutputStream.j((ByteString) obj) : CodedOutputStream.L0((String) obj);
                i3++;
            }
        }
        return M0;
    }

    public static int v(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w2 = w(list);
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(w2) : w2 + (size * CodedOutputStream.M0(i2));
    }

    public static int w(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.O0(intArrayList.getInt(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.O0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int x(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y2 = y(list);
        return z2 ? CodedOutputStream.M0(i2) + CodedOutputStream.u0(y2) : y2 + (size * CodedOutputStream.M0(i2));
    }

    public static int y(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.Q0(longArrayList.p(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + CodedOutputStream.Q0(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static Object z(Object obj, int i2, List list, Internal.EnumLiteMap enumLiteMap, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumLiteMap == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Integer num = (Integer) list.get(i4);
                int intValue = num.intValue();
                if (enumLiteMap.a(intValue) != null) {
                    if (i4 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    obj2 = J(obj, i2, intValue, obj2, unknownFieldSchema);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (enumLiteMap.a(intValue2) == null) {
                    obj2 = J(obj, i2, intValue2, obj2, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
