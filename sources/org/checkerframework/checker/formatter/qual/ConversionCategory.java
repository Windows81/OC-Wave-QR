package org.checkerframework.checker.formatter.qual;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

public enum ConversionCategory {
    GENERAL("bBhHsS", (int) null),
    CHAR("cC", Character.class, r5, r6, r7),
    INT("doxX", r5, r6, r7, r9, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", r9, Calendar.class, Date.class),
    CHAR_AND_INT((String) null, r5, r6, r7),
    INT_AND_TIME((String) null, r9),
    NULL((String) null, new Class[0]),
    UNUSED((String) null, (int) null);
    

    /* renamed from: A  reason: collision with root package name */
    public final String f44072A;

    /* renamed from: z  reason: collision with root package name */
    public final Class[] f44073z;

    /* access modifiers changed from: public */
    ConversionCategory(String str, Class... clsArr) {
        this.f44072A = str;
        if (clsArr == null) {
            this.f44073z = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class d2 = d(cls);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        this.f44073z = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    public static Class d(Class cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class[] clsArr = this.f44073z;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
        for (Class simpleName : this.f44073z) {
            stringJoiner.add(simpleName.getSimpleName());
        }
        sb.append(" ");
        sb.append(stringJoiner);
        return sb.toString();
    }
}
