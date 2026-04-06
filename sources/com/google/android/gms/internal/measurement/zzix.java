package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzix extends zzir<Double> {
    public zzix(zziz zziz, String str, Double d2, boolean z2) {
        super(zziz, str, d2);
    }

    /* renamed from: p */
    public final Double h(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k2 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid double value for " + k2 + ": " + valueOf);
        return null;
    }
}
