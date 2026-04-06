package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zziv extends zzir<Long> {
    public zziv(zziz zziz, String str, Long l2, boolean z2) {
        super(zziz, str, l2);
    }

    /* renamed from: p */
    public final Long h(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k2 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid long value for " + k2 + ": " + valueOf);
        return null;
    }
}
