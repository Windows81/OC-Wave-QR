package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzqb;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzx {

    /* renamed from: a  reason: collision with root package name */
    public String f26989a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26990b;

    /* renamed from: c  reason: collision with root package name */
    public zzgn.zzm f26991c;

    /* renamed from: d  reason: collision with root package name */
    public BitSet f26992d;

    /* renamed from: e  reason: collision with root package name */
    public BitSet f26993e;

    /* renamed from: f  reason: collision with root package name */
    public Map f26994f;

    /* renamed from: g  reason: collision with root package name */
    public Map f26995g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ zzv f26996h;

    public final zzgn.zzd a(int i2) {
        ArrayList arrayList;
        List list;
        zzgn.zzd.zza M = zzgn.zzd.M();
        M.y(i2);
        M.G(this.f26990b);
        zzgn.zzm zzm = this.f26991c;
        if (zzm != null) {
            M.B(zzm);
        }
        zzgn.zzm.zza K = zzgn.zzm.V().G(zzol.O(this.f26992d)).K(zzol.O(this.f26993e));
        if (this.f26994f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f26994f.size());
            for (Integer num : this.f26994f.keySet()) {
                int intValue = num.intValue();
                Long l2 = (Long) this.f26994f.get(num);
                if (l2 != null) {
                    arrayList.add((zzgn.zze) ((zzlc) zzgn.zze.M().y(intValue).z(l2.longValue()).F()));
                }
            }
        }
        if (arrayList != null) {
            K.z(arrayList);
        }
        if (this.f26995g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f26995g.size());
            for (Integer num2 : this.f26995g.keySet()) {
                zzgn.zzn.zza y2 = zzgn.zzn.N().y(num2.intValue());
                List list2 = (List) this.f26995g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    y2.z(list2);
                }
                arrayList2.add((zzgn.zzn) ((zzlc) y2.F()));
            }
            list = arrayList2;
        }
        K.I(list);
        M.z(K);
        return (zzgn.zzd) ((zzlc) M.F());
    }

    public final void c(zzaa zzaa) {
        int a2 = zzaa.a();
        Boolean bool = zzaa.f26166c;
        if (bool != null) {
            this.f26993e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = zzaa.f26167d;
        if (bool2 != null) {
            this.f26992d.set(a2, bool2.booleanValue());
        }
        if (zzaa.f26168e != null) {
            Long l2 = (Long) this.f26994f.get(Integer.valueOf(a2));
            long longValue = zzaa.f26168e.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.f26994f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (zzaa.f26169f != null) {
            List list = (List) this.f26995g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList();
                this.f26995g.put(Integer.valueOf(a2), list);
            }
            if (zzaa.j()) {
                list.clear();
            }
            if (zzqb.a() && this.f26996h.d().J(this.f26989a, zzbj.p0) && zzaa.i()) {
                list.clear();
            }
            if (!zzqb.a() || !this.f26996h.d().J(this.f26989a, zzbj.p0)) {
                list.add(Long.valueOf(zzaa.f26169f.longValue() / 1000));
                return;
            }
            long longValue2 = zzaa.f26169f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    public zzx(zzv zzv, String str) {
        this.f26996h = zzv;
        this.f26989a = str;
        this.f26990b = true;
        this.f26992d = new BitSet();
        this.f26993e = new BitSet();
        this.f26994f = new ArrayMap();
        this.f26995g = new ArrayMap();
    }

    public zzx(zzv zzv, String str, zzgn.zzm zzm, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f26996h = zzv;
        this.f26989a = str;
        this.f26992d = bitSet;
        this.f26993e = bitSet2;
        this.f26994f = map;
        this.f26995g = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f26995g.put(num, arrayList);
            }
        }
        this.f26990b = false;
        this.f26991c = zzm;
    }
}
