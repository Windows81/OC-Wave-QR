package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    /* renamed from: A  reason: collision with root package name */
    public final Uri f24816A;

    /* renamed from: B  reason: collision with root package name */
    public final int f24817B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final int f24818z;

    public WebImage(int i2, Uri uri, int i3, int i4) {
        this.f24818z = i2;
        this.f24816A = uri;
        this.f24817B = i3;
        this.C = i4;
    }

    public int H() {
        return this.C;
    }

    public Uri Q() {
        return this.f24816A;
    }

    public int S() {
        return this.f24817B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return Objects.a(this.f24816A, webImage.f24816A) && this.f24817B == webImage.f24817B && this.C == webImage.C;
        }
    }

    public int hashCode() {
        return Objects.b(this.f24816A, Integer.valueOf(this.f24817B), Integer.valueOf(this.C));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f24817B), Integer.valueOf(this.C), this.f24816A.toString()});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f24818z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.v(parcel, 2, Q(), i2, false);
        SafeParcelWriter.n(parcel, 3, S());
        SafeParcelWriter.n(parcel, 4, H());
        SafeParcelWriter.b(parcel, a2);
    }
}
