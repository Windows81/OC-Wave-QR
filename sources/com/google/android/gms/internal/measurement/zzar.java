package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzar extends zzal implements zzak {

    /* renamed from: B  reason: collision with root package name */
    public final List f25344B;
    public final List C;
    public zzh D;

    public zzar(zzar zzar) {
        super(zzar.f25333z);
        ArrayList arrayList = new ArrayList(zzar.f25344B.size());
        this.f25344B = arrayList;
        arrayList.addAll(zzar.f25344B);
        ArrayList arrayList2 = new ArrayList(zzar.C.size());
        this.C = arrayList2;
        arrayList2.addAll(zzar.C);
        this.D = zzar.D;
    }

    public final zzaq a(zzh zzh, List list) {
        zzh d2 = this.D.d();
        for (int i2 = 0; i2 < this.f25344B.size(); i2++) {
            if (i2 < list.size()) {
                d2.e((String) this.f25344B.get(i2), zzh.b((zzaq) list.get(i2)));
            } else {
                d2.e((String) this.f25344B.get(i2), zzaq.f25336m);
            }
        }
        for (zzaq zzaq : this.C) {
            zzaq b2 = d2.b(zzaq);
            if (b2 instanceof zzat) {
                b2 = d2.b(zzaq);
            }
            if (b2 instanceof zzaj) {
                return ((zzaj) b2).a();
            }
        }
        return zzaq.f25336m;
    }

    public final zzaq c() {
        return new zzar(this);
    }

    public zzar(String str, List list, List list2, zzh zzh) {
        super(str);
        this.f25344B = new ArrayList();
        this.D = zzh;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f25344B.add(((zzaq) it.next()).h());
            }
        }
        this.C = new ArrayList(list2);
    }
}
