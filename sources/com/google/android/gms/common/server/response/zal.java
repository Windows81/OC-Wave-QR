package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();

    /* renamed from: A  reason: collision with root package name */
    public final String f25093A;

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f25094B;

    /* renamed from: z  reason: collision with root package name */
    public final int f25095z;

    public zal(int i2, String str, ArrayList arrayList) {
        this.f25095z = i2;
        this.f25093A = str;
        this.f25094B = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f25095z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        SafeParcelWriter.w(parcel, 2, this.f25093A, false);
        SafeParcelWriter.A(parcel, 3, this.f25094B, false);
        SafeParcelWriter.b(parcel, a2);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f25095z = 1;
        this.f25093A = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f25094B = arrayList;
    }
}
