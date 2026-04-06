package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class zzmm {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f25658a;

    static {
        char[] cArr = new char[80];
        f25658a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(zzml zzml, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(zzml, sb, 0);
        return sb.toString();
    }

    public static void b(int i2, StringBuilder sb) {
        while (i2 > 0) {
            char[] cArr = f25658a;
            int length = i2 > cArr.length ? cArr.length : i2;
            sb.append(cArr, 0, length);
            i2 -= length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0164, code lost:
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0194, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a7, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b9, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cf, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.google.android.gms.internal.measurement.zzml r20, java.lang.StringBuilder r21, int r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r20.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L_0x0088
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 != 0) goto L_0x0085
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 < r13) goto L_0x0085
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x0051
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L_0x0085
        L_0x0051:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L_0x0085
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L_0x0085
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L_0x0074
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L_0x0085
        L_0x0074:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x0085
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L_0x0085:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x0088:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0090:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x021c
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto L_0x00e5
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto L_0x00e5
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x00e5
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L_0x00e5
            java.lang.Class r15 = r14.getReturnType()
            java.lang.Class<java.util.List> r13 = java.util.List.class
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x00e5
            int r7 = r9.length()
            int r7 = r7 + -4
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzlc.u(r14, r0, r9)
            d(r1, r2, r7, r9)
            r13 = 3
            goto L_0x0090
        L_0x00e5:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L_0x012f
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x012f
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L_0x012f
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x012f
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L_0x012f
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L_0x012f
            int r7 = r9.length()
            r14 = 3
            int r7 = r7 - r14
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.android.gms.internal.measurement.zzlc.u(r13, r0, r9)
            d(r1, r2, r7, r9)
        L_0x012c:
            r13 = r14
            goto L_0x0090
        L_0x012f:
            r14 = 3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 == 0) goto L_0x012c
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L_0x0166
            int r13 = r9.length()
            int r13 = r13 + -5
            java.lang.String r13 = r9.substring(r8, r13)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r10)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            boolean r13 = r5.containsKey(r13)
            if (r13 != 0) goto L_0x012c
        L_0x0166:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r11)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto L_0x012c
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzlc.u(r7, r0, r15)
            if (r13 != 0) goto L_0x0209
            boolean r13 = r7 instanceof java.lang.Boolean
            r15 = 1
            if (r13 == 0) goto L_0x019c
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0199
        L_0x0196:
            r13 = r15
            goto L_0x0204
        L_0x0199:
            r13 = r8
            goto L_0x0204
        L_0x019c:
            boolean r13 = r7 instanceof java.lang.Integer
            if (r13 == 0) goto L_0x01aa
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 != 0) goto L_0x0199
            goto L_0x0196
        L_0x01aa:
            boolean r13 = r7 instanceof java.lang.Float
            if (r13 == 0) goto L_0x01bc
            r13 = r7
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            if (r13 != 0) goto L_0x0199
            goto L_0x0196
        L_0x01bc:
            boolean r13 = r7 instanceof java.lang.Double
            if (r13 == 0) goto L_0x01d2
            r13 = r7
            java.lang.Double r13 = (java.lang.Double) r13
            double r16 = r13.doubleValue()
            long r16 = java.lang.Double.doubleToRawLongBits(r16)
            r18 = 0
            int r13 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x0199
            goto L_0x0196
        L_0x01d2:
            boolean r13 = r7 instanceof java.lang.String
            if (r13 == 0) goto L_0x01dd
            java.lang.String r13 = ""
            boolean r13 = r7.equals(r13)
            goto L_0x0204
        L_0x01dd:
            boolean r13 = r7 instanceof com.google.android.gms.internal.measurement.zzjs
            if (r13 == 0) goto L_0x01e8
            com.google.android.gms.internal.measurement.zzjs r13 = com.google.android.gms.internal.measurement.zzjs.f25568A
            boolean r13 = r7.equals(r13)
            goto L_0x0204
        L_0x01e8:
            boolean r13 = r7 instanceof com.google.android.gms.internal.measurement.zzml
            if (r13 == 0) goto L_0x01f6
            r13 = r7
            com.google.android.gms.internal.measurement.zzml r13 = (com.google.android.gms.internal.measurement.zzml) r13
            com.google.android.gms.internal.measurement.zzml r13 = r13.e()
            if (r7 != r13) goto L_0x0199
            goto L_0x0196
        L_0x01f6:
            boolean r13 = r7 instanceof java.lang.Enum
            if (r13 == 0) goto L_0x0199
            r13 = r7
            java.lang.Enum r13 = (java.lang.Enum) r13
            int r13 = r13.ordinal()
            if (r13 != 0) goto L_0x0199
            goto L_0x0196
        L_0x0204:
            if (r13 != 0) goto L_0x0207
            goto L_0x0215
        L_0x0207:
            r15 = r8
            goto L_0x0215
        L_0x0209:
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzlc.u(r13, r0, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r15 = r13.booleanValue()
        L_0x0215:
            if (r15 == 0) goto L_0x012c
            d(r1, r2, r9, r7)
            goto L_0x012c
        L_0x021c:
            boolean r3 = r0 instanceof com.google.android.gms.internal.measurement.zzlc.zzd
            if (r3 == 0) goto L_0x0242
            r3 = r0
            com.google.android.gms.internal.measurement.zzlc$zzd r3 = (com.google.android.gms.internal.measurement.zzlc.zzd) r3
            com.google.android.gms.internal.measurement.zzkv<com.google.android.gms.internal.measurement.zzlc$zzc> r3 = r3.zzc
            java.util.Iterator r3 = r3.p()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x0230
            goto L_0x0242
        L_0x0230:
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            com.google.android.gms.internal.measurement.zzlc$zzc r0 = (com.google.android.gms.internal.measurement.zzlc.zzc) r0
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0242:
            com.google.android.gms.internal.measurement.zzlc r0 = (com.google.android.gms.internal.measurement.zzlc) r0
            com.google.android.gms.internal.measurement.zznw r0 = r0.zzb
            if (r0 == 0) goto L_0x024b
            r0.h(r1, r2)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmm.c(com.google.android.gms.internal.measurement.zzml, java.lang.StringBuilder, int):void");
    }

    public static void d(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object d2 : (List) obj) {
                d(sb, i2, str, d2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d3 : ((Map) obj).entrySet()) {
                d(sb, i2, str, d3);
            }
        } else {
            sb.append(10);
            b(i2, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i3 = 1; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zznt.a(zzjs.n((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzjs) {
                sb.append(": \"");
                sb.append(zznt.a((zzjs) obj));
                sb.append('\"');
            } else if (obj instanceof zzlc) {
                sb.append(" {");
                c((zzlc) obj, sb, i2 + 2);
                sb.append("\n");
                b(i2, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i2 + 2;
                d(sb, i4, "key", entry.getKey());
                d(sb, i4, "value", entry.getValue());
                sb.append("\n");
                b(i2, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }
}
