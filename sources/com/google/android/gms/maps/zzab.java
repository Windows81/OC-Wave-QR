package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class zzab implements Parcelable.Creator<GoogleMapOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        byte b2 = -1;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        int i2 = 0;
        CameraPosition cameraPosition = null;
        Float f2 = null;
        Float f3 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    b2 = SafeParcelReader.z(parcel2, E);
                    break;
                case 3:
                    b3 = SafeParcelReader.z(parcel2, E);
                    break;
                case 4:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.p(parcel2, E, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = SafeParcelReader.z(parcel2, E);
                    break;
                case 7:
                    b5 = SafeParcelReader.z(parcel2, E);
                    break;
                case 8:
                    b6 = SafeParcelReader.z(parcel2, E);
                    break;
                case 9:
                    b7 = SafeParcelReader.z(parcel2, E);
                    break;
                case 10:
                    b8 = SafeParcelReader.z(parcel2, E);
                    break;
                case 11:
                    b9 = SafeParcelReader.z(parcel2, E);
                    break;
                case 12:
                    b10 = SafeParcelReader.z(parcel2, E);
                    break;
                case 14:
                    b11 = SafeParcelReader.z(parcel2, E);
                    break;
                case 15:
                    b12 = SafeParcelReader.z(parcel2, E);
                    break;
                case 16:
                    f2 = SafeParcelReader.D(parcel2, E);
                    break;
                case 17:
                    f3 = SafeParcelReader.D(parcel2, E);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.p(parcel2, E, LatLngBounds.CREATOR);
                    break;
                case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                    b13 = SafeParcelReader.z(parcel2, E);
                    break;
                case 20:
                    num = SafeParcelReader.H(parcel2, E);
                    break;
                case 21:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new GoogleMapOptions(b2, b3, i2, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f2, f3, latLngBounds, b13, num, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleMapOptions[i2];
    }
}
