package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzqb;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzv extends zznr {

    /* renamed from: d  reason: collision with root package name */
    public String f26984d;

    /* renamed from: e  reason: collision with root package name */
    public Set f26985e;

    /* renamed from: f  reason: collision with root package name */
    public Map f26986f;

    /* renamed from: g  reason: collision with root package name */
    public Long f26987g;

    /* renamed from: h  reason: collision with root package name */
    public Long f26988h;

    public zzv(zznv zznv) {
        super(zznv);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
        if (r7.S() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010f, code lost:
        r9 = java.lang.Integer.valueOf(r7.n());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        r5.c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void B(java.util.List r14) {
        /*
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0010:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x012a
            java.lang.Object r1 = r14.next()
            com.google.android.gms.internal.measurement.zzgn$zzo r1 = (com.google.android.gms.internal.measurement.zzgn.zzo) r1
            java.lang.String r2 = r1.Y()
            java.lang.Object r3 = r0.get(r2)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.zzam r3 = r13.q()
            java.lang.String r4 = r13.f26984d
            java.util.Map r3 = r3.Q0(r4, r2)
            r0.put(r2, r3)
        L_0x0035:
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0010
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            java.util.Set r6 = r13.f26985e
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x0063
            com.google.android.gms.measurement.internal.zzgi r1 = r13.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            java.lang.String r2 = "Skipping failed audience ID"
            r1.b(r2, r4)
            goto L_0x0010
        L_0x0063:
            java.lang.Object r6 = r3.get(r4)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x006e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0121
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzfn$zze r7 = (com.google.android.gms.internal.measurement.zzfn.zze) r7
            com.google.android.gms.measurement.internal.zzgi r8 = r13.m()
            r9 = 2
            boolean r8 = r8.C(r9)
            r9 = 0
            if (r8 == 0) goto L_0x00c4
            com.google.android.gms.measurement.internal.zzgi r8 = r13.m()
            com.google.android.gms.measurement.internal.zzgk r8 = r8.K()
            boolean r10 = r7.S()
            if (r10 == 0) goto L_0x009d
            int r10 = r7.n()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x009e
        L_0x009d:
            r10 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.zzgh r11 = r13.h()
            java.lang.String r12 = r7.N()
            java.lang.String r11 = r11.g(r12)
            java.lang.String r12 = "Evaluating filter. audience, filter, property"
            r8.d(r12, r4, r10, r11)
            com.google.android.gms.measurement.internal.zzgi r8 = r13.m()
            com.google.android.gms.measurement.internal.zzgk r8 = r8.K()
            com.google.android.gms.measurement.internal.zzol r10 = r13.o()
            java.lang.String r10 = r10.L(r7)
            java.lang.String r11 = "Filter definition"
            r8.b(r11, r10)
        L_0x00c4:
            boolean r8 = r7.S()
            if (r8 == 0) goto L_0x00fb
            int r8 = r7.n()
            r10 = 256(0x100, float:3.59E-43)
            if (r8 <= r10) goto L_0x00d3
            goto L_0x00fb
        L_0x00d3:
            com.google.android.gms.measurement.internal.zzad r8 = new com.google.android.gms.measurement.internal.zzad
            java.lang.String r9 = r13.f26984d
            r8.<init>(r13, r9, r5, r7)
            java.lang.Long r9 = r13.f26987g
            java.lang.Long r10 = r13.f26988h
            int r7 = r7.n()
            boolean r7 = r13.D(r5, r7)
            boolean r7 = r8.k(r9, r10, r1, r7)
            if (r7 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.zzx r9 = r13.y(r4)
            r9.c(r8)
            goto L_0x006e
        L_0x00f5:
            java.util.Set r5 = r13.f26985e
            r5.add(r4)
            goto L_0x0121
        L_0x00fb:
            com.google.android.gms.measurement.internal.zzgi r5 = r13.m()
            com.google.android.gms.measurement.internal.zzgk r5 = r5.L()
            java.lang.String r6 = r13.f26984d
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r6)
            boolean r8 = r7.S()
            if (r8 == 0) goto L_0x0117
            int r7 = r7.n()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
        L_0x0117:
            java.lang.String r7 = java.lang.String.valueOf(r9)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r5.c(r8, r6, r7)
            r7 = 0
        L_0x0121:
            if (r7 != 0) goto L_0x003d
            java.util.Set r5 = r13.f26985e
            r5.add(r4)
            goto L_0x003d
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzv.B(java.util.List):void");
    }

    private final List E() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.f26986f.keySet();
        keySet.removeAll(this.f26985e);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            zzx zzx = (zzx) this.f26986f.get(num);
            Preconditions.m(zzx);
            zzgn.zzd a2 = zzx.a(intValue);
            arrayList.add(a2);
            zzam q2 = q();
            String str = this.f26984d;
            zzgn.zzm P = a2.P();
            q2.u();
            q2.n();
            Preconditions.g(str);
            Preconditions.m(P);
            byte[] m2 = P.m();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", m2);
            try {
                if (q2.B().insertWithOnConflict("audience_filter_values", (String) null, contentValues, 5) == -1) {
                    q2.m().G().b("Failed to insert filter results (got -1). appId", zzgi.v(str));
                }
            } catch (SQLiteException e2) {
                q2.m().G().c("Error storing filter results. appId", zzgi.v(str), e2);
            }
        }
        return arrayList;
    }

    public final List A(String str, List list, List list2, Long l2, Long l3, boolean z2) {
        boolean z3;
        ArrayMap arrayMap;
        List<zzfn.zzb> list3;
        Iterator it;
        Map map;
        Iterator it2;
        Iterator it3;
        Map map2;
        List list4 = list;
        List list5 = list2;
        boolean z4 = z2;
        Preconditions.g(str);
        Preconditions.m(list);
        Preconditions.m(list2);
        this.f26984d = str;
        this.f26985e = new HashSet();
        this.f26986f = new ArrayMap();
        this.f26987g = l2;
        this.f26988h = l3;
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                if ("_s".equals(((zzgn.zzf) it4.next()).Y())) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        boolean z5 = zzqb.a() && d().J(this.f26984d, zzbj.p0);
        boolean z6 = zzqb.a() && d().J(this.f26984d, zzbj.o0);
        if (z3) {
            zzam q2 = q();
            String str2 = this.f26984d;
            q2.u();
            q2.n();
            Preconditions.g(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", 0);
            try {
                q2.B().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e2) {
                q2.m().G().c("Error resetting session-scoped event counts. appId", zzgi.v(str2), e2);
            }
        }
        Map emptyMap = Collections.emptyMap();
        if (z6 && z5) {
            emptyMap = q().Z0(this.f26984d);
        }
        Map Y0 = q().Y0(this.f26984d);
        if (!Y0.isEmpty()) {
            HashSet hashSet = new HashSet(Y0.keySet());
            if (z3) {
                String str3 = this.f26984d;
                Map a1 = q().a1(this.f26984d);
                Preconditions.g(str3);
                Preconditions.m(Y0);
                ArrayMap arrayMap2 = new ArrayMap();
                if (!Y0.isEmpty()) {
                    Iterator it5 = Y0.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer num = (Integer) it5.next();
                        num.intValue();
                        zzgn.zzm zzm = (zzgn.zzm) Y0.get(num);
                        List list6 = (List) a1.get(num);
                        if (list6 == null || list6.isEmpty()) {
                            map2 = a1;
                            it3 = it5;
                            arrayMap2.put(num, zzm);
                        } else {
                            List P = o().P(zzm.Z(), list6);
                            if (!P.isEmpty()) {
                                zzgn.zzm.zza G = ((zzgn.zzm.zza) zzm.z()).B().G(P);
                                G.J().K(o().P(zzm.b0(), list6));
                                ArrayList arrayList = new ArrayList();
                                for (zzgn.zze zze : zzm.Y()) {
                                    Map map3 = a1;
                                    Iterator it6 = it5;
                                    if (!list6.contains(Integer.valueOf(zze.n()))) {
                                        arrayList.add(zze);
                                    }
                                    a1 = map3;
                                    it5 = it6;
                                }
                                map2 = a1;
                                it3 = it5;
                                G.y().z(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzgn.zzn zzn : zzm.a0()) {
                                    if (!list6.contains(Integer.valueOf(zzn.M()))) {
                                        arrayList2.add(zzn);
                                    }
                                }
                                G.H().I(arrayList2);
                                arrayMap2.put(num, (zzgn.zzm) ((zzlc) G.F()));
                            }
                        }
                        a1 = map2;
                        it5 = it3;
                    }
                }
                arrayMap = arrayMap2;
            } else {
                arrayMap = Y0;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num2 = (Integer) it7.next();
                num2.intValue();
                zzgn.zzm zzm2 = (zzgn.zzm) arrayMap.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap3 = new ArrayMap();
                if (!(zzm2 == null || zzm2.n() == 0)) {
                    for (zzgn.zze zze2 : zzm2.Y()) {
                        if (zze2.P()) {
                            arrayMap3.put(Integer.valueOf(zze2.n()), zze2.O() ? Long.valueOf(zze2.L()) : null);
                        }
                    }
                }
                ArrayMap arrayMap4 = new ArrayMap();
                if (!(zzm2 == null || zzm2.O() == 0)) {
                    Iterator it8 = zzm2.a0().iterator();
                    while (it8.hasNext()) {
                        zzgn.zzn zzn2 = (zzgn.zzn) it8.next();
                        if (!zzn2.R() || zzn2.n() <= 0) {
                            it2 = it8;
                            map = arrayMap;
                        } else {
                            it2 = it8;
                            map = arrayMap;
                            arrayMap4.put(Integer.valueOf(zzn2.M()), Long.valueOf(zzn2.J(zzn2.n() - 1)));
                        }
                        it8 = it2;
                        arrayMap = map;
                    }
                }
                Map map4 = arrayMap;
                if (zzm2 != null) {
                    int i2 = 0;
                    while (i2 < (zzm2.S() << 6)) {
                        if (zzol.f0(zzm2.b0(), i2)) {
                            it = it7;
                            m().K().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i2));
                            bitSet2.set(i2);
                            if (zzol.f0(zzm2.Z(), i2)) {
                                bitSet.set(i2);
                                i2++;
                                it7 = it;
                            }
                        } else {
                            it = it7;
                        }
                        arrayMap3.remove(Integer.valueOf(i2));
                        i2++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                zzgn.zzm zzm3 = (zzgn.zzm) Y0.get(num2);
                if (!(!z6 || !z5 || (list3 = (List) emptyMap.get(num2)) == null || this.f26988h == null || this.f26987g == null)) {
                    for (zzfn.zzb zzb : list3) {
                        int M = zzb.M();
                        long longValue = this.f26988h.longValue() / 1000;
                        if (zzb.U()) {
                            longValue = this.f26987g.longValue() / 1000;
                        }
                        if (arrayMap3.containsKey(Integer.valueOf(M))) {
                            arrayMap3.put(Integer.valueOf(M), Long.valueOf(longValue));
                        }
                        if (arrayMap4.containsKey(Integer.valueOf(M))) {
                            arrayMap4.put(Integer.valueOf(M), Long.valueOf(longValue));
                        }
                    }
                }
                this.f26986f.put(num2, new zzx(this, this.f26984d, zzm3, bitSet, bitSet2, arrayMap3, arrayMap4));
                it7 = it9;
                Y0 = Y0;
                arrayMap = map4;
            }
        }
        if (!zzpd.a() || !d().J((String) null, zzbj.d1)) {
            C(list4, true);
            B(list5);
            return E();
        }
        C(list4, z4);
        if (z4) {
            return new ArrayList();
        }
        B(list5);
        return E();
    }

    public final void C(List list, boolean z2) {
        zzbd zzbd;
        zzz zzz;
        Integer num;
        Map map;
        long j2;
        if (!list.isEmpty()) {
            String str = null;
            zzz zzz2 = new zzz(this);
            ArrayMap arrayMap = new ArrayMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzgn.zzf zzf = (zzgn.zzf) it.next();
                zzgn.zzf a2 = zzz2.a(this.f26984d, zzf);
                if (a2 != null) {
                    zzam q2 = q();
                    String str2 = this.f26984d;
                    String Y = a2.Y();
                    zzbd K0 = q2.K0(str2, zzf.Y());
                    if (K0 == null) {
                        q2.m().L().c("Event aggregate wasn't created during raw event logging. appId, event", zzgi.v(str2), q2.h().c(Y));
                        zzbd = new zzbd(str2, zzf.Y(), 1, 1, 1, zzf.V(), 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                    } else {
                        zzbd = new zzbd(K0.f26241a, K0.f26242b, K0.f26243c + 1, K0.f26244d + 1, K0.f26245e + 1, K0.f26246f, K0.f26247g, K0.f26248h, K0.f26249i, K0.f26250j, K0.f26251k);
                    }
                    zzbd zzbd2 = zzbd;
                    q().U(zzbd2);
                    if (!zzpd.a() || !d().J(str, zzbj.d1) || !z2) {
                        long j3 = zzbd2.f26243c;
                        String Y2 = a2.Y();
                        Map map2 = (Map) arrayMap.get(Y2);
                        if (map2 == null) {
                            map2 = q().O0(this.f26984d, Y2);
                            arrayMap.put(Y2, map2);
                        }
                        Map map3 = map2;
                        for (Integer num2 : map3.keySet()) {
                            int intValue = num2.intValue();
                            if (this.f26985e.contains(num2)) {
                                m().K().b("Skipping failed audience ID", num2);
                            } else {
                                Iterator it2 = ((List) map3.get(num2)).iterator();
                                boolean z3 = true;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        zzz = zzz2;
                                        num = num2;
                                        map = map3;
                                        j2 = j3;
                                        break;
                                    }
                                    zzfn.zzb zzb = (zzfn.zzb) it2.next();
                                    zzab zzab = new zzab(this, this.f26984d, intValue, zzb);
                                    zzab zzab2 = zzab;
                                    zzz = zzz2;
                                    num = num2;
                                    int i2 = intValue;
                                    map = map3;
                                    j2 = j3;
                                    z3 = zzab.k(this.f26987g, this.f26988h, a2, j3, zzbd2, D(intValue, zzb.M()));
                                    if (!z3) {
                                        this.f26985e.add(num);
                                        break;
                                    }
                                    y(num).c(zzab2);
                                    num2 = num;
                                    zzz2 = zzz;
                                    intValue = i2;
                                    map3 = map;
                                    j3 = j2;
                                }
                                if (!z3) {
                                    this.f26985e.add(num);
                                }
                                zzz2 = zzz;
                                map3 = map;
                                j3 = j2;
                                str = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean D(int i2, int i3) {
        zzx zzx = (zzx) this.f26986f.get(Integer.valueOf(i2));
        if (zzx == null) {
            return false;
        }
        return zzx.f26992d.get(i3);
    }

    public final boolean x() {
        return false;
    }

    public final zzx y(Integer num) {
        if (this.f26986f.containsKey(num)) {
            return (zzx) this.f26986f.get(num);
        }
        zzx zzx = new zzx(this, this.f26984d);
        this.f26986f.put(num, zzx);
        return zzx;
    }

    public final List z(String str, List list, List list2, Long l2, Long l3) {
        return A(str, list, list2, l2, l3, false);
    }
}
