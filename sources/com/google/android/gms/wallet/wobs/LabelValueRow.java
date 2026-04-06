package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzf();

    /* renamed from: A  reason: collision with root package name */
    public String f27351A;

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f27352B;

    /* renamed from: z  reason: collision with root package name */
    public String f27353z;

    public final class Builder {
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.f27353z = str;
        this.f27351A = str2;
        this.f27352B = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.w(parcel, 2, this.f27353z, false);
        SafeParcelWriter.w(parcel, 3, this.f27351A, false);
        SafeParcelWriter.A(parcel, 4, this.f27352B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
