package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzam();

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f27315z;

    public final class Builder {
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.f27315z = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.y(parcel, 1, this.f27315z, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
