package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class zzai implements zzaq {

    /* renamed from: z  reason: collision with root package name */
    public final Double f25329z;

    public zzai(Double d2) {
        if (d2 == null) {
            this.f25329z = Double.valueOf(Double.NaN);
        } else {
            this.f25329z = d2;
        }
    }

    public final zzaq c() {
        return new zzai(this.f25329z);
    }

    public final Boolean e() {
        return Boolean.valueOf(!Double.isNaN(this.f25329z.doubleValue()) && this.f25329z.doubleValue() != 0.0d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        return this.f25329z.equals(((zzai) obj).f25329z);
    }

    public final Double g() {
        return this.f25329z;
    }

    public final String h() {
        if (Double.isNaN(this.f25329z.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f25329z.doubleValue())) {
            return this.f25329z.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.f25329z.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : a.a(valueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.f25329z.hashCode();
    }

    public final Iterator i() {
        return null;
    }

    public final zzaq o(String str, zzh zzh, List list) {
        if ("toString".equals(str)) {
            return new zzas(h());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{h(), str}));
    }

    public final String toString() {
        return h();
    }
}
