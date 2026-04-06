package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zziu extends zzir<Boolean> {
    public zziu(zziz zziz, String str, Boolean bool, boolean z2) {
        super(zziz, str, bool);
    }

    public final /* synthetic */ Object h(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzhq.f25485c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzhq.f25486d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String k2 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + k2 + ": " + valueOf);
        return null;
    }
}
