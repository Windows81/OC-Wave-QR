package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Comparator;
import java.util.List;

public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();
    public static final Comparator D = zab.f25030z;

    /* renamed from: A  reason: collision with root package name */
    public final boolean f25025A;

    /* renamed from: B  reason: collision with root package name */
    public final String f25026B;
    public final String C;

    /* renamed from: z  reason: collision with root package name */
    public final List f25027z;

    public ApiFeatureRequest(List list, boolean z2, String str, String str2) {
        Preconditions.m(list);
        this.f25027z = list;
        this.f25025A = z2;
        this.f25026B = str;
        this.C = str2;
    }

    public List H() {
        return this.f25027z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f25025A == apiFeatureRequest.f25025A && Objects.a(this.f25027z, apiFeatureRequest.f25027z) && Objects.a(this.f25026B, apiFeatureRequest.f25026B) && Objects.a(this.C, apiFeatureRequest.C);
    }

    public final int hashCode() {
        return Objects.b(Boolean.valueOf(this.f25025A), this.f25027z, this.f25026B, this.C);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.A(parcel, 1, H(), false);
        SafeParcelWriter.c(parcel, 2, this.f25025A);
        SafeParcelWriter.w(parcel, 3, this.f25026B, false);
        SafeParcelWriter.w(parcel, 4, this.C, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
