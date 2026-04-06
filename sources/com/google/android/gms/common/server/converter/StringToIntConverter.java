package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* renamed from: A  reason: collision with root package name */
    public final HashMap f25065A = new HashMap();

    /* renamed from: B  reason: collision with root package name */
    public final SparseArray f25066B = new SparseArray();

    /* renamed from: z  reason: collision with root package name */
    public final int f25067z;

    public StringToIntConverter(int i2, ArrayList arrayList) {
        this.f25067z = i2;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zac zac = (zac) arrayList.get(i3);
            H(zac.f25070A, zac.f25071B);
        }
    }

    public StringToIntConverter H(String str, int i2) {
        this.f25065A.put(str, Integer.valueOf(i2));
        this.f25066B.put(i2, str);
        return this;
    }

    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        String str = (String) this.f25066B.get(((Integer) obj).intValue());
        return (str != null || !this.f25065A.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f25067z;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, i3);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f25065A.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f25065A.get(str)).intValue()));
        }
        SafeParcelWriter.A(parcel, 2, arrayList, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
