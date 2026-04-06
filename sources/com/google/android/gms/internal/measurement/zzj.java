package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzj {
    public static zzaq a(zzhg.zzd zzd) {
        if (zzd == null) {
            return zzaq.f25336m;
        }
        int i2 = zzi.f25500a[zzd.K().ordinal()];
        if (i2 == 1) {
            return zzd.T() ? new zzas(zzd.N()) : zzaq.f25343t;
        }
        if (i2 == 2) {
            return zzd.S() ? new zzai(Double.valueOf(zzd.J())) : new zzai((Double) null);
        }
        if (i2 == 3) {
            return zzd.R() ? new zzag(Boolean.valueOf(zzd.P())) : new zzag((Boolean) null);
        }
        if (i2 == 4) {
            List<zzhg.zzd> O = zzd.O();
            ArrayList arrayList = new ArrayList();
            for (zzhg.zzd a2 : O) {
                arrayList.add(a(a2));
            }
            return new zzat(zzd.M(), arrayList);
        } else if (i2 != 5) {
            String valueOf = String.valueOf(zzd);
            throw new IllegalStateException("Invalid entity: " + valueOf);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static zzaq b(Object obj) {
        if (obj == null) {
            return zzaq.f25337n;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzai((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzai(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzai(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzag((Boolean) obj);
        }
        if (obj instanceof Map) {
            zzap zzap = new zzap();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                zzaq b2 = b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    zzap.p((String) next, b2);
                }
            }
            return zzap;
        } else if (obj instanceof List) {
            zzaf zzaf = new zzaf();
            for (Object b3 : (List) obj) {
                zzaf.v(b(b3));
            }
            return zzaf;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
