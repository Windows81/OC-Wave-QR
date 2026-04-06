package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzap implements zzak, zzaq {

    /* renamed from: z  reason: collision with root package name */
    public final Map f25335z = new HashMap();

    public final List a() {
        return new ArrayList(this.f25335z.keySet());
    }

    public final zzaq c() {
        zzap zzap = new zzap();
        for (Map.Entry entry : this.f25335z.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                zzap.f25335z.put((String) entry.getKey(), (zzaq) entry.getValue());
            } else {
                zzap.f25335z.put((String) entry.getKey(), ((zzaq) entry.getValue()).c());
            }
        }
        return zzap;
    }

    public final Boolean e() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        return this.f25335z.equals(((zzap) obj).f25335z);
    }

    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    public final String h() {
        return "[object Object]";
    }

    public int hashCode() {
        return this.f25335z.hashCode();
    }

    public final Iterator i() {
        return zzan.b(this.f25335z);
    }

    public final zzaq m(String str) {
        return this.f25335z.containsKey(str) ? (zzaq) this.f25335z.get(str) : zzaq.f25336m;
    }

    public final boolean n(String str) {
        return this.f25335z.containsKey(str);
    }

    public zzaq o(String str, zzh zzh, List list) {
        return "toString".equals(str) ? new zzas(toString()) : zzan.a(this, new zzas(str), zzh, list);
    }

    public final void p(String str, zzaq zzaq) {
        if (zzaq == null) {
            this.f25335z.remove(str);
        } else {
            this.f25335z.put(str, zzaq);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f25335z.isEmpty()) {
            for (String str : this.f25335z.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f25335z.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
