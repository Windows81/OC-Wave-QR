package org.bson;

import java.util.List;
import org.bson.util.ClassMap;

@Deprecated
public class BSON {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f43592a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f43593b = false;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f43594c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final ClassMap f43595d = new ClassMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ClassMap f43596e = new ClassMap();

    static {
        int[] iArr = new int[65535];
        f43592a = iArr;
        iArr[103] = 256;
        iArr[105] = 2;
        iArr[109] = 8;
        iArr[115] = 32;
        iArr[99] = 128;
        iArr[120] = 4;
        iArr[100] = 1;
        iArr[116] = 16;
        iArr[117] = 64;
    }

    public static Object a(Object obj) {
        List<Transformer> list;
        if (!c() || obj == null) {
            return obj;
        }
        ClassMap classMap = f43596e;
        if (classMap.d() == 0 || (list = (List) classMap.b(obj.getClass())) == null) {
            return obj;
        }
        Object obj2 = obj;
        for (Transformer a2 : list) {
            obj2 = a2.a(obj);
        }
        return obj2;
    }

    public static Object b(Object obj) {
        List<Transformer> list;
        if (!d() || obj == null) {
            return obj;
        }
        ClassMap classMap = f43595d;
        if (classMap.d() == 0 || (list = (List) classMap.b(obj.getClass())) == null) {
            return obj;
        }
        Object obj2 = obj;
        for (Transformer a2 : list) {
            obj2 = a2.a(obj);
        }
        return obj2;
    }

    public static boolean c() {
        return f43594c;
    }

    public static boolean d() {
        return f43593b;
    }

    public static int e(char c2) {
        int i2 = f43592a[c2];
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException(String.format("Unrecognized flag [%c]", new Object[]{Character.valueOf(c2)}));
    }

    public static int f(String str) {
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        for (char e2 : str.toLowerCase().toCharArray()) {
            i2 |= e(e2);
        }
        return i2;
    }

    public static String g(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int[] iArr = f43592a;
            if (i3 >= iArr.length) {
                break;
            }
            if ((iArr[i3] & i2) > 0) {
                sb.append((char) i3);
                i2 -= iArr[i3];
            }
            i3++;
        }
        if (i2 <= 0) {
            return sb.toString();
        }
        throw new IllegalArgumentException("Some flags could not be recognized.");
    }
}
