package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcv> CREATOR = new zzcw();

    /* renamed from: A  reason: collision with root package name */
    public String f27082A;

    /* renamed from: B  reason: collision with root package name */
    public String f27083B;
    public zza C;
    public PendingIntent D;

    /* renamed from: z  reason: collision with root package name */
    public zza f27084z;

    public zzcv(zza zza, String str, String str2, zza zza2, PendingIntent pendingIntent) {
        this.f27084z = zza;
        this.f27082A = str;
        this.f27083B = str2;
        this.C = zza2;
        this.D = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcv) {
            zzcv zzcv = (zzcv) obj;
            return Objects.a(this.f27084z, zzcv.f27084z) && Objects.a(this.f27082A, zzcv.f27082A) && Objects.a(this.f27083B, zzcv.f27083B) && Objects.a(this.C, zzcv.C) && Objects.a(this.D, zzcv.D);
        }
    }

    public final int hashCode() {
        return Objects.b(this.f27084z, this.f27082A, this.f27083B, this.C, this.D);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.v(parcel, 1, this.f27084z, i2, false);
        SafeParcelWriter.w(parcel, 2, this.f27082A, false);
        SafeParcelWriter.w(parcel, 3, this.f27083B, false);
        SafeParcelWriter.v(parcel, 4, this.C, i2, false);
        SafeParcelWriter.v(parcel, 5, this.D, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
