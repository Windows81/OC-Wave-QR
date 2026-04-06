package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f19827a = versionedParcel.p(iconCompat.f19827a, 1);
        iconCompat.f19829c = versionedParcel.j(iconCompat.f19829c, 2);
        iconCompat.f19830d = versionedParcel.r(iconCompat.f19830d, 3);
        iconCompat.f19831e = versionedParcel.p(iconCompat.f19831e, 4);
        iconCompat.f19832f = versionedParcel.p(iconCompat.f19832f, 5);
        iconCompat.f19833g = (ColorStateList) versionedParcel.r(iconCompat.f19833g, 6);
        iconCompat.f19835i = versionedParcel.t(iconCompat.f19835i, 7);
        iconCompat.f19836j = versionedParcel.t(iconCompat.f19836j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.k(versionedParcel.f());
        int i2 = iconCompat.f19827a;
        if (-1 != i2) {
            versionedParcel.F(i2, 1);
        }
        byte[] bArr = iconCompat.f19829c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f19830d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i3 = iconCompat.f19831e;
        if (i3 != 0) {
            versionedParcel.F(i3, 4);
        }
        int i4 = iconCompat.f19832f;
        if (i4 != 0) {
            versionedParcel.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f19833g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f19835i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f19836j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
