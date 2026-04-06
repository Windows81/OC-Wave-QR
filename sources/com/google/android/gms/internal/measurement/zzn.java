package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

public final class zzn extends zzap {

    /* renamed from: A  reason: collision with root package name */
    public final zzac f25691A;

    public zzn(zzac zzac) {
        this.f25691A = zzac;
    }

    public final zzaq o(String str, zzh zzh, List list) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c2 = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c2 = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c2 = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c2 = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                zzg.g("getEventName", 0, list);
                return new zzas(this.f25691A.d().e());
            case 1:
                zzg.g("getTimestamp", 0, list);
                return new zzai(Double.valueOf((double) this.f25691A.d().a()));
            case 2:
                zzg.g("getParamValue", 1, list);
                return zzj.b(this.f25691A.d().b(zzh.b((zzaq) list.get(0)).h()));
            case 3:
                zzg.g("getParams", 0, list);
                Map g2 = this.f25691A.d().g();
                zzap zzap = new zzap();
                for (String str2 : g2.keySet()) {
                    zzap.p(str2, zzj.b(g2.get(str2)));
                }
                return zzap;
            case 4:
                zzg.g("setParamValue", 2, list);
                String h2 = zzh.b((zzaq) list.get(0)).h();
                zzaq b2 = zzh.b((zzaq) list.get(1));
                this.f25691A.d().d(h2, zzg.d(b2));
                return b2;
            case 5:
                zzg.g("setEventName", 1, list);
                zzaq b3 = zzh.b((zzaq) list.get(0));
                if (zzaq.f25336m.equals(b3) || zzaq.f25337n.equals(b3)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f25691A.d().f(b3.h());
                return new zzas(b3.h());
            default:
                return super.o(str, zzh, list);
        }
    }
}
