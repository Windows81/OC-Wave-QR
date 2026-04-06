package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class zzas implements zzaq, Iterable<zzaq> {

    /* renamed from: z  reason: collision with root package name */
    public final String f25345z;

    public zzas(String str) {
        if (str != null) {
            this.f25345z = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final zzaq c() {
        return new zzas(this.f25345z);
    }

    public final Boolean e() {
        return Boolean.valueOf(!this.f25345z.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        return this.f25345z.equals(((zzas) obj).f25345z);
    }

    public final Double g() {
        if (this.f25345z.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f25345z);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final String h() {
        return this.f25345z;
    }

    public final int hashCode() {
        return this.f25345z.hashCode();
    }

    public final Iterator i() {
        return new zzav(this);
    }

    public final Iterator iterator() {
        return new zzau(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c5, code lost:
        r5 = r23;
        r3 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01db, code lost:
        if (r24.size() >= 2) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01dd, code lost:
        r14 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e0, code lost:
        r14 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(1)).g().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0206, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r2.indexOf(r3, (int) com.google.android.gms.internal.measurement.zzg.a(r14))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0207, code lost:
        r1 = r21;
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("replace", 2, r0);
        r2 = com.google.android.gms.internal.measurement.zzaq.f25336m;
        r3 = r2.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021b, code lost:
        if (r24.isEmpty() != false) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021d, code lost:
        r3 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0231, code lost:
        if (r24.size() <= 1) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0233, code lost:
        r2 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023d, code lost:
        r0 = r1.f25345z;
        r4 = r0.indexOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0243, code lost:
        if (r4 >= 0) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0245, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0248, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzal) == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024a, code lost:
        r9 = 0;
        r2 = ((com.google.android.gms.internal.measurement.zzal) r2).a(r5, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzaq[]{new com.google.android.gms.internal.measurement.zzas(r3), new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r4)), r1}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0270, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0299, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r0.substring(r9, r4) + r2.h() + r0.substring(r4 + r3.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x029a, code lost:
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("substring", 2, r0);
        r2 = r21.f25345z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02aa, code lost:
        if (r24.isEmpty() != false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ac, code lost:
        r3 = (int) com.google.android.gms.internal.measurement.zzg.a(r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).g().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c5, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02cb, code lost:
        if (r24.size() <= 1) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02cd, code lost:
        r0 = (int) com.google.android.gms.internal.measurement.zzg.a(r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(1)).g().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e6, code lost:
        r0 = r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02eb, code lost:
        r3 = java.lang.Math.min(java.lang.Math.max(r3, 0), r2.length());
        r0 = java.lang.Math.min(java.lang.Math.max(r0, 0), r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0314, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r2.substring(java.lang.Math.min(r3, r0), java.lang.Math.max(r3, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0315, code lost:
        r1 = r21;
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("split", 2, r0);
        r2 = r1.f25345z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0325, code lost:
        if (r2.length() != 0) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0332, code lost:
        return new com.google.android.gms.internal.measurement.zzaf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0333, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x033d, code lost:
        if (r24.isEmpty() == false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x033f, code lost:
        r4.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0344, code lost:
        r3 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0357, code lost:
        if (r24.size() <= 1) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0359, code lost:
        r5 = com.google.android.gms.internal.measurement.zzg.m(r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(1)).g().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0370, code lost:
        r5 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0377, code lost:
        if (r5 != 0) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x037e, code lost:
        return new com.google.android.gms.internal.measurement.zzaf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x037f, code lost:
        r0 = r2.split(java.util.regex.Pattern.quote(r3), ((int) r5) + 1);
        r2 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x038f, code lost:
        if (r3.isEmpty() == false) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0392, code lost:
        if (r0.length <= 0) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0394, code lost:
        r9 = r0[0].isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03a3, code lost:
        if (r0[r0.length - 1].isEmpty() == false) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03a5, code lost:
        r2 = r0.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03a8, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ad, code lost:
        if (((long) r0.length) <= r5) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03af, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b1, code lost:
        if (r9 >= r2) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b3, code lost:
        r4.add(new com.google.android.gms.internal.measurement.zzas(r0[r9]));
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03c5, code lost:
        return new com.google.android.gms.internal.measurement.zzaf((java.util.List) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c6, code lost:
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("slice", 2, r0);
        r2 = r21.f25345z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d6, code lost:
        if (r24.isEmpty() != false) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d8, code lost:
        r3 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).g().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03ec, code lost:
        r3 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ee, code lost:
        r3 = com.google.android.gms.internal.measurement.zzg.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03f6, code lost:
        if (r3 >= 0.0d) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03f8, code lost:
        r3 = java.lang.Math.max(((double) r2.length()) + r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0403, code lost:
        r3 = java.lang.Math.min(r3, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x040c, code lost:
        r3 = (int) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0412, code lost:
        if (r24.size() <= 1) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0414, code lost:
        r4 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(1)).g().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0427, code lost:
        r4 = (double) r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x042c, code lost:
        r4 = com.google.android.gms.internal.measurement.zzg.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0434, code lost:
        if (r4 >= 0.0d) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0436, code lost:
        r4 = java.lang.Math.max(((double) r2.length()) + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0441, code lost:
        r4 = java.lang.Math.min(r4, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x045b, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r2.substring(r3, java.lang.Math.max(0, ((int) r4) - r3) + r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x045c, code lost:
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("match", 1, r0);
        r2 = r21.f25345z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x046d, code lost:
        if (r24.size() > 0) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x046f, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0472, code lost:
        r0 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0481, code lost:
        r0 = java.util.regex.Pattern.compile(r0).matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x048d, code lost:
        if (r0.find() == false) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04a3, code lost:
        return new com.google.android.gms.internal.measurement.zzaf(new com.google.android.gms.internal.measurement.zzas(r0.group()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04a6, code lost:
        return com.google.android.gms.internal.measurement.zzaq.f25337n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04a7, code lost:
        com.google.android.gms.internal.measurement.zzg.g("toUpperCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04ba, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.f25345z.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04bb, code lost:
        com.google.android.gms.internal.measurement.zzg.g("toUpperCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04d0, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.f25345z.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04d1, code lost:
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("lastIndexOf", 2, r0);
        r2 = r21.f25345z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04e2, code lost:
        if (r24.size() > 0) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04e4, code lost:
        r3 = com.google.android.gms.internal.measurement.zzaq.f25336m.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04eb, code lost:
        r3 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04ff, code lost:
        if (r24.size() >= 2) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0501, code lost:
        r4 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0504, code lost:
        r4 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(1)).g().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x051b, code lost:
        if (java.lang.Double.isNaN(r4) == false) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x051d, code lost:
        r4 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0520, code lost:
        r4 = com.google.android.gms.internal.measurement.zzg.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0533, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r2.lastIndexOf(r3, (int) r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0534, code lost:
        com.google.android.gms.internal.measurement.zzg.g(r12, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0547, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.f25345z.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0548, code lost:
        r1 = r21;
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("search", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0557, code lost:
        if (r24.isEmpty() != false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0559, code lost:
        r0 = r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0568, code lost:
        r0 = com.google.android.gms.internal.measurement.zzaq.f25336m.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x056e, code lost:
        r0 = java.util.regex.Pattern.compile(r0).matcher(r1.f25345z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x057c, code lost:
        if (r0.find() == false) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x058c, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf((double) r0.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0598, code lost:
        return new com.google.android.gms.internal.measurement.zzai(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0599, code lost:
        com.google.android.gms.internal.measurement.zzg.g("toLowerCase", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05ae, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.f25345z.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05af, code lost:
        r1 = r21;
        r5 = r23;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05b9, code lost:
        if (r24.isEmpty() == false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05bb, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05bc, code lost:
        r2 = new java.lang.StringBuilder(r1.f25345z);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05c8, code lost:
        if (r9 >= r24.size()) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05ca, code lost:
        r2.append(r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(r9)).h());
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05e7, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05e8, code lost:
        r1 = r21;
        r5 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n(r6, 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05f6, code lost:
        if (r24.isEmpty() != false) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05f8, code lost:
        r9 = (int) com.google.android.gms.internal.measurement.zzg.a(r5.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0)).g().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0611, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0612, code lost:
        r0 = r1.f25345z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0614, code lost:
        if (r9 < 0) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x061a, code lost:
        if (r9 < r0.length()) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x062a, code lost:
        return new com.google.android.gms.internal.measurement.zzas(java.lang.String.valueOf(r0.charAt(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x062d, code lost:
        return com.google.android.gms.internal.measurement.zzaq.f25343t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x062e, code lost:
        com.google.android.gms.internal.measurement.zzg.g(r7, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0641, code lost:
        return new com.google.android.gms.internal.measurement.zzas(r21.f25345z.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0642, code lost:
        r1 = r21;
        com.google.android.gms.internal.measurement.zzg.g(r14, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x064a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x064b, code lost:
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.g(r15, 1, r0);
        r3 = r21.f25345z;
        r0 = r23.b((com.google.android.gms.internal.measurement.zzaq) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x066c, code lost:
        if ("length".equals(r0.h()) == false) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0670, code lost:
        return com.google.android.gms.internal.measurement.zzaq.f25341r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0671, code lost:
        r4 = r0.g().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x067f, code lost:
        if (r4 != java.lang.Math.floor(r4)) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0681, code lost:
        r0 = (int) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0682, code lost:
        if (r0 < 0) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0688, code lost:
        if (r0 >= r3.length()) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x068c, code lost:
        return com.google.android.gms.internal.measurement.zzaq.f25341r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x068f, code lost:
        return com.google.android.gms.internal.measurement.zzaq.f25342s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c3, code lost:
        r6 = r16;
        r14 = r17;
        r15 = r18;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0151, code lost:
        r6 = r16;
        r14 = r17;
        r15 = r18;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a1, code lost:
        switch(r1) {
            case 0: goto L_0x064b;
            case 1: goto L_0x0642;
            case 2: goto L_0x062e;
            case 3: goto L_0x05e8;
            case 4: goto L_0x05af;
            case 5: goto L_0x0599;
            case 6: goto L_0x0548;
            case 7: goto L_0x0534;
            case 8: goto L_0x04d1;
            case 9: goto L_0x04bb;
            case 10: goto L_0x04a7;
            case 11: goto L_0x045c;
            case 12: goto L_0x03c6;
            case 13: goto L_0x0315;
            case 14: goto L_0x029a;
            case 15: goto L_0x0207;
            case 16: goto L_0x01ac;
            default: goto L_0x01a4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ab, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ac, code lost:
        r0 = r24;
        com.google.android.gms.internal.measurement.zzg.n("indexOf", 2, r0);
        r2 = r21.f25345z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ba, code lost:
        if (r24.size() > 0) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01bc, code lost:
        r3 = com.google.android.gms.internal.measurement.zzaq.f25336m.h();
        r5 = r23;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzaq o(java.lang.String r22, com.google.android.gms.internal.measurement.zzh r23, java.util.List r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r6 = "trim"
            java.lang.String r7 = "concat"
            java.lang.String r11 = "charAt"
            boolean r12 = r11.equals(r1)
            java.lang.String r13 = "toLocaleUpperCase"
            java.lang.String r14 = "toString"
            java.lang.String r15 = "toLocaleLowerCase"
            java.lang.String r5 = "toLowerCase"
            java.lang.String r4 = "substring"
            java.lang.String r10 = "split"
            java.lang.String r9 = "slice"
            java.lang.String r8 = "search"
            java.lang.String r2 = "replace"
            java.lang.String r0 = "match"
            java.lang.String r3 = "lastIndexOf"
            r16 = r11
            java.lang.String r11 = "indexOf"
            r17 = r6
            java.lang.String r6 = "hasOwnProperty"
            r18 = r13
            java.lang.String r13 = "toUpperCase"
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r7.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r6.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r11.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r3.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r0.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r2.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r8.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r9.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r10.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r4.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r5.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r15.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r14.equals(r1)
            if (r12 != 0) goto L_0x00b2
            boolean r12 = r13.equals(r1)
            if (r12 != 0) goto L_0x00b2
            r12 = r18
            boolean r18 = r12.equals(r1)
            if (r18 != 0) goto L_0x00ad
            r18 = r6
            r6 = r17
            boolean r17 = r6.equals(r1)
            if (r17 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "%s is not a String function"
            java.lang.Object[] r1 = new java.lang.Object[]{r22}
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x00ad:
            r18 = r6
            r6 = r17
            goto L_0x00b5
        L_0x00b2:
            r12 = r18
            goto L_0x00ad
        L_0x00b5:
            r22.hashCode()
            r17 = r14
            r19 = r15
            int r20 = r22.hashCode()
            switch(r20) {
                case -1789698943: goto L_0x0190;
                case -1776922004: goto L_0x017e;
                case -1464939364: goto L_0x016c;
                case -1361633751: goto L_0x015a;
                case -1354795244: goto L_0x0148;
                case -1137582698: goto L_0x013e;
                case -906336856: goto L_0x0135;
                case -726908483: goto L_0x012c;
                case -467511597: goto L_0x0122;
                case -399551817: goto L_0x0118;
                case 3568674: goto L_0x010e;
                case 103668165: goto L_0x0104;
                case 109526418: goto L_0x00fa;
                case 109648666: goto L_0x00ef;
                case 530542161: goto L_0x00e4;
                case 1094496948: goto L_0x00d9;
                case 1943291465: goto L_0x00ce;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            r6 = r16
            r14 = r17
            r15 = r18
            r7 = r19
        L_0x00cb:
            r1 = -1
            goto L_0x01a1
        L_0x00ce:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x00d5
            goto L_0x00c3
        L_0x00d5:
            r1 = 16
            goto L_0x0151
        L_0x00d9:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e0
            goto L_0x00c3
        L_0x00e0:
            r1 = 15
            goto L_0x0151
        L_0x00e4:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00eb
            goto L_0x00c3
        L_0x00eb:
            r1 = 14
            goto L_0x0151
        L_0x00ef:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x00f6
            goto L_0x00c3
        L_0x00f6:
            r1 = 13
            goto L_0x0151
        L_0x00fa:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0101
            goto L_0x00c3
        L_0x0101:
            r1 = 12
            goto L_0x0151
        L_0x0104:
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x010b
            goto L_0x00c3
        L_0x010b:
            r1 = 11
            goto L_0x0151
        L_0x010e:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0115
            goto L_0x00c3
        L_0x0115:
            r1 = 10
            goto L_0x0151
        L_0x0118:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x011f
            goto L_0x00c3
        L_0x011f:
            r1 = 9
            goto L_0x0151
        L_0x0122:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0129
            goto L_0x00c3
        L_0x0129:
            r1 = 8
            goto L_0x0151
        L_0x012c:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x0133
            goto L_0x00c3
        L_0x0133:
            r1 = 7
            goto L_0x0151
        L_0x0135:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x013c
            goto L_0x00c3
        L_0x013c:
            r1 = 6
            goto L_0x0151
        L_0x013e:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0146
            goto L_0x00c3
        L_0x0146:
            r1 = 5
            goto L_0x0151
        L_0x0148:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0150
            goto L_0x00c3
        L_0x0150:
            r1 = 4
        L_0x0151:
            r6 = r16
            r14 = r17
            r15 = r18
            r7 = r19
            goto L_0x01a1
        L_0x015a:
            r6 = r16
            boolean r1 = r1.equals(r6)
            r14 = r17
            r15 = r18
            r7 = r19
            if (r1 != 0) goto L_0x016a
            goto L_0x00cb
        L_0x016a:
            r1 = 3
            goto L_0x01a1
        L_0x016c:
            r6 = r16
            r7 = r19
            boolean r1 = r1.equals(r7)
            r14 = r17
            r15 = r18
            if (r1 != 0) goto L_0x017c
            goto L_0x00cb
        L_0x017c:
            r1 = 2
            goto L_0x01a1
        L_0x017e:
            r6 = r16
            r14 = r17
            r7 = r19
            boolean r1 = r1.equals(r14)
            r15 = r18
            if (r1 != 0) goto L_0x018e
            goto L_0x00cb
        L_0x018e:
            r1 = 1
            goto L_0x01a1
        L_0x0190:
            r6 = r16
            r14 = r17
            r15 = r18
            r7 = r19
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x01a0
            goto L_0x00cb
        L_0x01a0:
            r1 = 0
        L_0x01a1:
            switch(r1) {
                case 0: goto L_0x064b;
                case 1: goto L_0x0642;
                case 2: goto L_0x062e;
                case 3: goto L_0x05e8;
                case 4: goto L_0x05af;
                case 5: goto L_0x0599;
                case 6: goto L_0x0548;
                case 7: goto L_0x0534;
                case 8: goto L_0x04d1;
                case 9: goto L_0x04bb;
                case 10: goto L_0x04a7;
                case 11: goto L_0x045c;
                case 12: goto L_0x03c6;
                case 13: goto L_0x0315;
                case 14: goto L_0x029a;
                case 15: goto L_0x0207;
                case 16: goto L_0x01ac;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x01ac:
            r0 = r24
            r1 = 2
            com.google.android.gms.internal.measurement.zzg.n(r11, r1, r0)
            r1 = r21
            java.lang.String r2 = r1.f25345z
            int r3 = r24.size()
            if (r3 > 0) goto L_0x01c5
            com.google.android.gms.internal.measurement.zzaq r3 = com.google.android.gms.internal.measurement.zzaq.f25336m
            java.lang.String r3 = r3.h()
            r5 = r23
            goto L_0x01d6
        L_0x01c5:
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            r5 = r23
            com.google.android.gms.internal.measurement.zzaq r3 = r5.b(r3)
            java.lang.String r3 = r3.h()
        L_0x01d6:
            int r4 = r24.size()
            r6 = 2
            if (r4 >= r6) goto L_0x01e0
            r14 = 0
            goto L_0x01f3
        L_0x01e0:
            r4 = 1
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.Double r0 = r0.g()
            double r14 = r0.doubleValue()
        L_0x01f3:
            double r4 = com.google.android.gms.internal.measurement.zzg.a(r14)
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            int r4 = (int) r4
            int r2 = r2.indexOf(r3, r4)
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            return r0
        L_0x0207:
            r1 = r21
            r5 = r23
            r0 = r24
            r3 = 2
            com.google.android.gms.internal.measurement.zzg.n(r2, r3, r0)
            com.google.android.gms.internal.measurement.zzaq r2 = com.google.android.gms.internal.measurement.zzaq.f25336m
            java.lang.String r3 = r2.h()
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L_0x023d
            r4 = 0
            java.lang.Object r3 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r5.b(r3)
            java.lang.String r3 = r3.h()
            int r4 = r24.size()
            r6 = 1
            if (r4 <= r6) goto L_0x023d
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r2 = r5.b(r0)
        L_0x023d:
            java.lang.String r0 = r1.f25345z
            int r4 = r0.indexOf(r3)
            if (r4 >= 0) goto L_0x0246
            return r1
        L_0x0246:
            boolean r6 = r2 instanceof com.google.android.gms.internal.measurement.zzal
            if (r6 == 0) goto L_0x0270
            com.google.android.gms.internal.measurement.zzal r2 = (com.google.android.gms.internal.measurement.zzal) r2
            com.google.android.gms.internal.measurement.zzas r6 = new com.google.android.gms.internal.measurement.zzas
            r6.<init>(r3)
            com.google.android.gms.internal.measurement.zzai r7 = new com.google.android.gms.internal.measurement.zzai
            double r8 = (double) r4
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 3
            com.google.android.gms.internal.measurement.zzaq[] r8 = new com.google.android.gms.internal.measurement.zzaq[r8]
            r9 = 0
            r8[r9] = r6
            r6 = 1
            r8[r6] = r7
            r6 = 2
            r8[r6] = r1
            java.util.List r6 = java.util.Arrays.asList(r8)
            com.google.android.gms.internal.measurement.zzaq r2 = r2.a(r5, r6)
            goto L_0x0271
        L_0x0270:
            r9 = 0
        L_0x0271:
            com.google.android.gms.internal.measurement.zzas r5 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r6 = r0.substring(r9, r4)
            java.lang.String r2 = r2.h()
            int r3 = r3.length()
            int r4 = r4 + r3
            java.lang.String r0 = r0.substring(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.<init>(r0)
            return r5
        L_0x029a:
            r1 = r21
            r5 = r23
            r0 = r24
            r2 = 2
            com.google.android.gms.internal.measurement.zzg.n(r4, r2, r0)
            java.lang.String r2 = r1.f25345z
            boolean r3 = r24.isEmpty()
            if (r3 != 0) goto L_0x02c5
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r4 = (com.google.android.gms.internal.measurement.zzaq) r4
            com.google.android.gms.internal.measurement.zzaq r3 = r5.b(r4)
            java.lang.Double r3 = r3.g()
            double r3 = r3.doubleValue()
            double r3 = com.google.android.gms.internal.measurement.zzg.a(r3)
            int r3 = (int) r3
            goto L_0x02c6
        L_0x02c5:
            r3 = 0
        L_0x02c6:
            int r4 = r24.size()
            r6 = 1
            if (r4 <= r6) goto L_0x02e6
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.Double r0 = r0.g()
            double r4 = r0.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.zzg.a(r4)
            int r0 = (int) r4
        L_0x02e4:
            r4 = 0
            goto L_0x02eb
        L_0x02e6:
            int r0 = r2.length()
            goto L_0x02e4
        L_0x02eb:
            int r3 = java.lang.Math.max(r3, r4)
            int r5 = r2.length()
            int r3 = java.lang.Math.min(r3, r5)
            int r0 = java.lang.Math.max(r0, r4)
            int r4 = r2.length()
            int r0 = java.lang.Math.min(r0, r4)
            com.google.android.gms.internal.measurement.zzas r4 = new com.google.android.gms.internal.measurement.zzas
            int r5 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r3, r0)
            java.lang.String r0 = r2.substring(r5, r0)
            r4.<init>(r0)
            return r4
        L_0x0315:
            r1 = r21
            r5 = r23
            r0 = r24
            r2 = 2
            com.google.android.gms.internal.measurement.zzg.n(r10, r2, r0)
            java.lang.String r2 = r1.f25345z
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0333
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r2 = 1
            com.google.android.gms.internal.measurement.zzaq[] r2 = new com.google.android.gms.internal.measurement.zzaq[r2]
            r3 = 0
            r2[r3] = r1
            r0.<init>((com.google.android.gms.internal.measurement.zzaq[]) r2)
            return r0
        L_0x0333:
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r6 = r24.isEmpty()
            if (r6 == 0) goto L_0x0344
            r4.add(r1)
            goto L_0x03c0
        L_0x0344:
            java.lang.Object r6 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r6 = (com.google.android.gms.internal.measurement.zzaq) r6
            com.google.android.gms.internal.measurement.zzaq r3 = r5.b(r6)
            java.lang.String r3 = r3.h()
            int r6 = r24.size()
            r7 = 1
            if (r6 <= r7) goto L_0x0370
            java.lang.Object r0 = r0.get(r7)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.Double r0 = r0.g()
            double r5 = r0.doubleValue()
            long r5 = com.google.android.gms.internal.measurement.zzg.m(r5)
            goto L_0x0373
        L_0x0370:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x0373:
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x037f
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>()
            return r0
        L_0x037f:
            java.lang.String r0 = java.util.regex.Pattern.quote(r3)
            int r7 = (int) r5
            r8 = 1
            int r7 = r7 + r8
            java.lang.String[] r0 = r2.split(r0, r7)
            int r2 = r0.length
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x03a8
            int r3 = r0.length
            if (r3 <= 0) goto L_0x03a8
            r3 = 0
            r3 = r0[r3]
            boolean r9 = r3.isEmpty()
            int r3 = r0.length
            int r3 = r3 - r8
            r3 = r0[r3]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x03a9
            int r2 = r0.length
            int r2 = r2 - r8
            goto L_0x03a9
        L_0x03a8:
            r9 = 0
        L_0x03a9:
            int r3 = r0.length
            long r7 = (long) r3
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03b1
            r3 = -1
            int r2 = r2 + r3
        L_0x03b1:
            if (r9 >= r2) goto L_0x03c0
            com.google.android.gms.internal.measurement.zzas r3 = new com.google.android.gms.internal.measurement.zzas
            r5 = r0[r9]
            r3.<init>(r5)
            r4.add(r3)
            r3 = 1
            int r9 = r9 + r3
            goto L_0x03b1
        L_0x03c0:
            com.google.android.gms.internal.measurement.zzaf r0 = new com.google.android.gms.internal.measurement.zzaf
            r0.<init>((java.util.List) r4)
            return r0
        L_0x03c6:
            r1 = r21
            r5 = r23
            r0 = r24
            r2 = 2
            com.google.android.gms.internal.measurement.zzg.n(r9, r2, r0)
            java.lang.String r2 = r1.f25345z
            boolean r3 = r24.isEmpty()
            if (r3 != 0) goto L_0x03ec
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r4 = (com.google.android.gms.internal.measurement.zzaq) r4
            com.google.android.gms.internal.measurement.zzaq r3 = r5.b(r4)
            java.lang.Double r3 = r3.g()
            double r3 = r3.doubleValue()
            goto L_0x03ee
        L_0x03ec:
            r3 = 0
        L_0x03ee:
            double r3 = com.google.android.gms.internal.measurement.zzg.a(r3)
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0403
            int r8 = r2.length()
            double r8 = (double) r8
            double r8 = r8 + r3
            double r3 = java.lang.Math.max(r8, r6)
            goto L_0x040c
        L_0x0403:
            int r6 = r2.length()
            double r6 = (double) r6
            double r3 = java.lang.Math.min(r3, r6)
        L_0x040c:
            int r3 = (int) r3
            int r4 = r24.size()
            r6 = 1
            if (r4 <= r6) goto L_0x0427
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.Double r0 = r0.g()
            double r4 = r0.doubleValue()
            goto L_0x042c
        L_0x0427:
            int r0 = r2.length()
            double r4 = (double) r0
        L_0x042c:
            double r4 = com.google.android.gms.internal.measurement.zzg.a(r4)
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0441
            int r0 = r2.length()
            double r8 = (double) r0
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L_0x044a
        L_0x0441:
            int r0 = r2.length()
            double r6 = (double) r0
            double r4 = java.lang.Math.min(r4, r6)
        L_0x044a:
            int r0 = (int) r4
            int r0 = r0 - r3
            r4 = 0
            int r0 = java.lang.Math.max(r4, r0)
            int r0 = r0 + r3
            com.google.android.gms.internal.measurement.zzas r4 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r2.substring(r3, r0)
            r4.<init>(r0)
            return r4
        L_0x045c:
            r1 = r21
            r5 = r23
            r2 = r0
            r3 = 1
            r0 = r24
            com.google.android.gms.internal.measurement.zzg.n(r2, r3, r0)
            java.lang.String r2 = r1.f25345z
            int r3 = r24.size()
            if (r3 > 0) goto L_0x0472
            java.lang.String r0 = ""
            goto L_0x0481
        L_0x0472:
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.String r0 = r0.h()
        L_0x0481:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r2 = r0.find()
            if (r2 == 0) goto L_0x04a4
            com.google.android.gms.internal.measurement.zzaf r2 = new com.google.android.gms.internal.measurement.zzaf
            com.google.android.gms.internal.measurement.zzas r3 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.group()
            r3.<init>(r0)
            r0 = 1
            com.google.android.gms.internal.measurement.zzaq[] r0 = new com.google.android.gms.internal.measurement.zzaq[r0]
            r4 = 0
            r0[r4] = r3
            r2.<init>((com.google.android.gms.internal.measurement.zzaq[]) r0)
            return r2
        L_0x04a4:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.f25337n
            return r0
        L_0x04a7:
            r4 = 0
            r1 = r21
            r0 = r24
            com.google.android.gms.internal.measurement.zzg.g(r13, r4, r0)
            java.lang.String r0 = r1.f25345z
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.trim()
            r2.<init>(r0)
            return r2
        L_0x04bb:
            r4 = 0
            r1 = r21
            r0 = r24
            com.google.android.gms.internal.measurement.zzg.g(r13, r4, r0)
            java.lang.String r0 = r1.f25345z
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r3)
            r2.<init>(r0)
            return r2
        L_0x04d1:
            r1 = r21
            r5 = r23
            r0 = r24
            r2 = r3
            r3 = 2
            com.google.android.gms.internal.measurement.zzg.n(r2, r3, r0)
            java.lang.String r2 = r1.f25345z
            int r3 = r24.size()
            if (r3 > 0) goto L_0x04eb
            com.google.android.gms.internal.measurement.zzaq r3 = com.google.android.gms.internal.measurement.zzaq.f25336m
            java.lang.String r3 = r3.h()
            goto L_0x04fa
        L_0x04eb:
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r5.b(r3)
            java.lang.String r3 = r3.h()
        L_0x04fa:
            int r4 = r24.size()
            r6 = 2
            if (r4 >= r6) goto L_0x0504
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0517
        L_0x0504:
            r4 = 1
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.Double r0 = r0.g()
            double r4 = r0.doubleValue()
        L_0x0517:
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 == 0) goto L_0x0520
            r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x0524
        L_0x0520:
            double r4 = com.google.android.gms.internal.measurement.zzg.a(r4)
        L_0x0524:
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            int r4 = (int) r4
            int r2 = r2.lastIndexOf(r3, r4)
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            return r0
        L_0x0534:
            r2 = 0
            r1 = r21
            r0 = r24
            com.google.android.gms.internal.measurement.zzg.g(r12, r2, r0)
            java.lang.String r0 = r1.f25345z
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.toUpperCase()
            r2.<init>(r0)
            return r2
        L_0x0548:
            r1 = r21
            r5 = r23
            r0 = r24
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.measurement.zzg.n(r8, r3, r0)
            boolean r3 = r24.isEmpty()
            if (r3 != 0) goto L_0x0568
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.String r0 = r0.h()
            goto L_0x056e
        L_0x0568:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.f25336m
            java.lang.String r0 = r0.h()
        L_0x056e:
            java.lang.String r2 = r1.f25345z
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r2 = r0.find()
            if (r2 == 0) goto L_0x058d
            com.google.android.gms.internal.measurement.zzai r2 = new com.google.android.gms.internal.measurement.zzai
            int r0 = r0.start()
            double r3 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r2.<init>(r0)
            return r2
        L_0x058d:
            com.google.android.gms.internal.measurement.zzai r0 = new com.google.android.gms.internal.measurement.zzai
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            return r0
        L_0x0599:
            r2 = 0
            r1 = r21
            r0 = r24
            com.google.android.gms.internal.measurement.zzg.g(r5, r2, r0)
            java.lang.String r0 = r1.f25345z
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r3)
            r2.<init>(r0)
            return r2
        L_0x05af:
            r1 = r21
            r5 = r23
            r0 = r24
            boolean r2 = r24.isEmpty()
            if (r2 == 0) goto L_0x05bc
            return r1
        L_0x05bc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = r1.f25345z
            r2.<init>(r3)
            r9 = 0
        L_0x05c4:
            int r3 = r24.size()
            if (r9 >= r3) goto L_0x05de
            java.lang.Object r3 = r0.get(r9)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            com.google.android.gms.internal.measurement.zzaq r3 = r5.b(r3)
            java.lang.String r3 = r3.h()
            r2.append(r3)
            r3 = 1
            int r9 = r9 + r3
            goto L_0x05c4
        L_0x05de:
            com.google.android.gms.internal.measurement.zzas r0 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            return r0
        L_0x05e8:
            r1 = r21
            r5 = r23
            r0 = r24
            r3 = 1
            com.google.android.gms.internal.measurement.zzg.n(r6, r3, r0)
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x0611
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.Double r0 = r0.g()
            double r2 = r0.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.zzg.a(r2)
            int r9 = (int) r2
            goto L_0x0612
        L_0x0611:
            r9 = 0
        L_0x0612:
            java.lang.String r0 = r1.f25345z
            if (r9 < 0) goto L_0x062b
            int r2 = r0.length()
            if (r9 < r2) goto L_0x061d
            goto L_0x062b
        L_0x061d:
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            char r0 = r0.charAt(r9)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            return r2
        L_0x062b:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.f25343t
            return r0
        L_0x062e:
            r2 = 0
            r1 = r21
            r0 = r24
            com.google.android.gms.internal.measurement.zzg.g(r7, r2, r0)
            java.lang.String r0 = r1.f25345z
            com.google.android.gms.internal.measurement.zzas r2 = new com.google.android.gms.internal.measurement.zzas
            java.lang.String r0 = r0.toLowerCase()
            r2.<init>(r0)
            return r2
        L_0x0642:
            r2 = 0
            r1 = r21
            r0 = r24
            com.google.android.gms.internal.measurement.zzg.g(r14, r2, r0)
            return r1
        L_0x064b:
            r1 = r21
            r5 = r23
            r0 = r24
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.measurement.zzg.g(r15, r3, r0)
            java.lang.String r3 = r1.f25345z
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzaq r0 = (com.google.android.gms.internal.measurement.zzaq) r0
            com.google.android.gms.internal.measurement.zzaq r0 = r5.b(r0)
            java.lang.String r2 = r0.h()
            java.lang.String r4 = "length"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0671
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.f25341r
            return r0
        L_0x0671:
            java.lang.Double r0 = r0.g()
            double r4 = r0.doubleValue()
            double r6 = java.lang.Math.floor(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x068d
            int r0 = (int) r4
            if (r0 < 0) goto L_0x068d
            int r2 = r3.length()
            if (r0 >= r2) goto L_0x068d
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.f25341r
            return r0
        L_0x068d:
            com.google.android.gms.internal.measurement.zzaq r0 = com.google.android.gms.internal.measurement.zzaq.f25342s
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.o(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }

    public final String toString() {
        String str = this.f25345z;
        return "\"" + str + "\"";
    }
}
