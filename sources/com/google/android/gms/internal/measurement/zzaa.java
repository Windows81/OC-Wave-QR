package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

public final class zzaa {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f25313a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap f25314b = new TreeMap();

    public static int a(zzh zzh, zzar zzar, zzaq zzaq) {
        zzaq a2 = zzar.a(zzh, Collections.singletonList(zzaq));
        if (a2 instanceof zzai) {
            return zzg.i(a2.g().doubleValue());
        }
        return -1;
    }

    public final void b(zzh zzh, zzac zzac) {
        zzn zzn = new zzn(zzac);
        for (Integer num : this.f25313a.keySet()) {
            zzad zzad = (zzad) zzac.d().clone();
            int a2 = a(zzh, (zzar) this.f25313a.get(num), zzn);
            if (a2 == 2 || a2 == -1) {
                zzac.e(zzad);
            }
        }
        for (Integer num2 : this.f25314b.keySet()) {
            a(zzh, (zzar) this.f25314b.get(num2), zzn);
        }
    }

    public final void c(String str, int i2, zzar zzar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f25314b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f25313a;
        } else {
            throw new IllegalStateException("Unknown callback type: " + str2);
        }
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            i2 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i2), zzar);
    }
}
