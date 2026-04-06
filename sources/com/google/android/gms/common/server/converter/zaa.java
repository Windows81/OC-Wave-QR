package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* renamed from: A  reason: collision with root package name */
    public final StringToIntConverter f25068A;

    /* renamed from: z  reason: collision with root package name */
    public final int f25069z;

    public zaa(int i2, StringToIntConverter stringToIntConverter) {
        this.f25069z = i2;
        this.f25068A = stringToIntConverter;
    }

    public static zaa H(FastJsonResponse.FieldConverter fieldConverter) {
        if (fieldConverter instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) fieldConverter);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.FieldConverter Q() {
        StringToIntConverter stringToIntConverter = this.f25068A;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f25069z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.v(parcel, 2, this.f25068A, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f25069z = 1;
        this.f25068A = stringToIntConverter;
    }
}
