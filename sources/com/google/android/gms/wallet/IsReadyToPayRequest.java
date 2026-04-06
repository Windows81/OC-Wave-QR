package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzq();

    /* renamed from: A  reason: collision with root package name */
    public String f27273A;

    /* renamed from: B  reason: collision with root package name */
    public String f27274B;
    public ArrayList C;
    public boolean D;
    public String E;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f27275z;

    @Deprecated
    public final class Builder {
        public /* synthetic */ Builder(zzp zzp) {
        }

        public IsReadyToPayRequest a() {
            return IsReadyToPayRequest.this;
        }
    }

    public IsReadyToPayRequest() {
    }

    public static IsReadyToPayRequest H(String str) {
        Builder Q = Q();
        IsReadyToPayRequest.this.E = (String) Preconditions.n(str, "isReadyToPayRequestJson cannot be null!");
        return Q.a();
    }

    public static Builder Q() {
        return new Builder((zzp) null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.p(parcel, 2, this.f27275z, false);
        SafeParcelWriter.w(parcel, 4, this.f27273A, false);
        SafeParcelWriter.w(parcel, 5, this.f27274B, false);
        SafeParcelWriter.p(parcel, 6, this.C, false);
        SafeParcelWriter.c(parcel, 7, this.D);
        SafeParcelWriter.w(parcel, 8, this.E, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z2, String str3) {
        this.f27275z = arrayList;
        this.f27273A = str;
        this.f27274B = str2;
        this.C = arrayList2;
        this.D = z2;
        this.E = str3;
    }
}
