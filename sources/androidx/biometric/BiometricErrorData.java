package androidx.biometric;

import java.util.Arrays;

class BiometricErrorData {

    /* renamed from: a  reason: collision with root package name */
    public final int f1410a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1411b;

    public BiometricErrorData(int i2, CharSequence charSequence) {
        this.f1410a = i2;
        this.f1411b = charSequence;
    }

    public static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int b() {
        return this.f1410a;
    }

    public CharSequence c() {
        return this.f1411b;
    }

    public final boolean d(CharSequence charSequence) {
        String a2 = a(this.f1411b);
        String a3 = a(charSequence);
        return (a2 == null && a3 == null) || (a2 != null && a2.equals(a3));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BiometricErrorData)) {
            return false;
        }
        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
        return this.f1410a == biometricErrorData.f1410a && d(biometricErrorData.f1411b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1410a), a(this.f1411b)});
    }
}
