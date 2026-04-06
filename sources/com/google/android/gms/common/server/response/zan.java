package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    /* renamed from: A  reason: collision with root package name */
    public final HashMap f25099A;

    /* renamed from: B  reason: collision with root package name */
    public final String f25100B;

    /* renamed from: z  reason: collision with root package name */
    public final int f25101z;

    public zan(int i2, ArrayList arrayList, String str) {
        this.f25101z = i2;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zal zal = (zal) arrayList.get(i3);
            String str2 = zal.f25093A;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.m(zal.f25094B)).size();
            for (int i4 = 0; i4 < size2; i4++) {
                zam zam = (zam) zal.f25094B.get(i4);
                hashMap2.put(zam.f25096A, zam.f25097B);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f25099A = hashMap;
        this.f25100B = (String) Preconditions.m(str);
        S();
    }

    public final String H() {
        return this.f25100B;
    }

    public final Map Q(String str) {
        return (Map) this.f25099A.get(str);
    }

    public final void S() {
        for (String str : this.f25099A.keySet()) {
            Map map = (Map) this.f25099A.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).o0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f25099A.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f25099A.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, this.f25101z);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f25099A.keySet()) {
            arrayList.add(new zal(str, (Map) this.f25099A.get(str)));
        }
        SafeParcelWriter.A(parcel, 2, arrayList, false);
        SafeParcelWriter.w(parcel, 3, this.f25100B, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
