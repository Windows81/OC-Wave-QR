package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import java.util.Collections;
import java.util.Map;

public class zzkp {

    /* renamed from: b  reason: collision with root package name */
    public static volatile zzkp f25599b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzkp f25600c = new zzkp(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map f25601a = Collections.emptyMap();

    public static final class zza {

        /* renamed from: a  reason: collision with root package name */
        public final Object f25602a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25603b;

        public zza(Object obj, int i2) {
            this.f25602a = obj;
            this.f25603b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return this.f25602a == zza.f25602a && this.f25603b == zza.f25603b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f25602a) * 65535) + this.f25603b;
        }
    }

    public zzkp(boolean z2) {
    }

    public static zzkp a() {
        zzkp zzkp = f25599b;
        if (zzkp != null) {
            return zzkp;
        }
        synchronized (zzkp.class) {
            try {
                zzkp zzkp2 = f25599b;
                if (zzkp2 != null) {
                    return zzkp2;
                }
                zzkp b2 = zzla.b(zzkp.class);
                f25599b = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzlc.zzf b(zzml zzml, int i2) {
        return (zzlc.zzf) this.f25601a.get(new zza(zzml, i2));
    }
}
