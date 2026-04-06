package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.api.Service;
import java.util.ArrayList;
import java.util.List;

public final class zzo implements Parcelable.Creator<zzp> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i3 = 0;
        long j9 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        int i4 = 100;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 3:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 4:
                    str3 = SafeParcelReader.q(parcel2, E);
                    break;
                case 5:
                    str4 = SafeParcelReader.q(parcel2, E);
                    break;
                case 6:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 7:
                    j3 = SafeParcelReader.J(parcel2, E);
                    break;
                case 8:
                    str5 = SafeParcelReader.q(parcel2, E);
                    break;
                case 9:
                    z2 = SafeParcelReader.x(parcel2, E);
                    break;
                case 10:
                    z4 = SafeParcelReader.x(parcel2, E);
                    break;
                case 11:
                    j9 = SafeParcelReader.J(parcel2, E);
                    break;
                case 12:
                    str6 = SafeParcelReader.q(parcel2, E);
                    break;
                case 13:
                    j4 = SafeParcelReader.J(parcel2, E);
                    break;
                case 14:
                    j5 = SafeParcelReader.J(parcel2, E);
                    break;
                case 15:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                case 16:
                    z3 = SafeParcelReader.x(parcel2, E);
                    break;
                case 18:
                    z5 = SafeParcelReader.x(parcel2, E);
                    break;
                case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                    str7 = SafeParcelReader.q(parcel2, E);
                    break;
                case 21:
                    bool = SafeParcelReader.y(parcel2, E);
                    break;
                case 22:
                    j6 = SafeParcelReader.J(parcel2, E);
                    break;
                case 23:
                    arrayList = SafeParcelReader.s(parcel2, E);
                    break;
                case Service.METRICS_FIELD_NUMBER /*24*/:
                    str8 = SafeParcelReader.q(parcel2, E);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                    str11 = SafeParcelReader.q(parcel2, E);
                    break;
                case Service.BILLING_FIELD_NUMBER /*26*/:
                    str12 = SafeParcelReader.q(parcel2, E);
                    break;
                case 27:
                    str9 = SafeParcelReader.q(parcel2, E);
                    break;
                case Service.MONITORING_FIELD_NUMBER /*28*/:
                    z6 = SafeParcelReader.x(parcel2, E);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /*29*/:
                    j7 = SafeParcelReader.J(parcel2, E);
                    break;
                case 30:
                    i4 = SafeParcelReader.G(parcel2, E);
                    break;
                case 31:
                    str13 = SafeParcelReader.q(parcel2, E);
                    break;
                case 32:
                    i3 = SafeParcelReader.G(parcel2, E);
                    break;
                case 34:
                    j8 = SafeParcelReader.J(parcel2, E);
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
                    str10 = SafeParcelReader.q(parcel2, E);
                    break;
                case 36:
                    str14 = SafeParcelReader.q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new zzp(str, str2, str3, str4, j2, j3, str5, z2, z4, j9, str6, j4, j5, i2, z3, z5, str7, bool, j6, (List) arrayList, str8, str11, str12, str9, z6, j7, i4, str13, i3, j8, str10, str14);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzp[i2];
    }
}
