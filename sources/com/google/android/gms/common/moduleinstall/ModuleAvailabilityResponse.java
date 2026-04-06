package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new zaa();

    /* renamed from: A  reason: collision with root package name */
    public final int f25015A;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f25016z;

    @Retention(RetentionPolicy.CLASS)
    public @interface AvailabilityStatus {
    }

    public ModuleAvailabilityResponse(boolean z2, int i2) {
        this.f25016z = z2;
        this.f25015A = i2;
    }

    public boolean H() {
        return this.f25016z;
    }

    public int Q() {
        return this.f25015A;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, H());
        SafeParcelWriter.n(parcel, 2, Q());
        SafeParcelWriter.b(parcel, a2);
    }
}
