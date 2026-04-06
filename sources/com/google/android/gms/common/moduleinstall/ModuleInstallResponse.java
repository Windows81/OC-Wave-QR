package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f25018A;

    /* renamed from: z  reason: collision with root package name */
    public final int f25019z;

    public ModuleInstallResponse(int i2, boolean z2) {
        this.f25019z = i2;
        this.f25018A = z2;
    }

    public int H() {
        return this.f25019z;
    }

    public final boolean Q() {
        return this.f25018A;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, H());
        SafeParcelWriter.c(parcel, 2, this.f25018A);
        SafeParcelWriter.b(parcel, a2);
    }
}
