package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.api.Service;
import java.util.List;

public abstract class zzga extends zzbx implements zzgb {
    public zzga() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                zzbw.f(parcel);
                Y((zzbh) zzbw.a(parcel, zzbh.CREATOR), (zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzbw.f(parcel);
                G2((zzok) zzbw.a(parcel, zzok.CREATOR), (zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zzbw.f(parcel);
                z0((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbw.f(parcel);
                V((zzbh) zzbw.a(parcel, zzbh.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbw.f(parcel);
                P1((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean h2 = zzbw.h(parcel);
                zzbw.f(parcel);
                List S0 = S0((zzp) zzbw.a(parcel, zzp.CREATOR), h2);
                parcel2.writeNoException();
                parcel2.writeTypedList(S0);
                return true;
            case 9:
                String readString3 = parcel.readString();
                zzbw.f(parcel);
                byte[] X = X((zzbh) zzbw.a(parcel, zzbh.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(X);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbw.f(parcel);
                e1(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbw.f(parcel);
                String k1 = k1((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(k1);
                return true;
            case 12:
                zzbw.f(parcel);
                d0((zzaf) zzbw.a(parcel, zzaf.CREATOR), (zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzbw.f(parcel);
                g1((zzaf) zzbw.a(parcel, zzaf.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbw.f(parcel);
                List D2 = D2(parcel.readString(), parcel.readString(), zzbw.h(parcel), (zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(D2);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean h3 = zzbw.h(parcel);
                zzbw.f(parcel);
                List u0 = u0(readString7, readString8, readString9, h3);
                parcel2.writeNoException();
                parcel2.writeTypedList(u0);
                return true;
            case 16:
                zzbw.f(parcel);
                List n0 = n0(parcel.readString(), parcel.readString(), (zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(n0);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzbw.f(parcel);
                List l1 = l1(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(l1);
                return true;
            case 18:
                zzbw.f(parcel);
                B0((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                zzbw.f(parcel);
                W((Bundle) zzbw.a(parcel, Bundle.CREATOR), (zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                zzbw.f(parcel);
                z2((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                zzbw.f(parcel);
                zzak N0 = N0((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                zzbw.g(parcel2, N0);
                return true;
            case Service.METRICS_FIELD_NUMBER /*24*/:
                zzbw.f(parcel);
                List f1 = f1((zzp) zzbw.a(parcel, zzp.CREATOR), (Bundle) zzbw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(f1);
                return true;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                zzbw.f(parcel);
                m2((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case Service.BILLING_FIELD_NUMBER /*26*/:
                zzbw.f(parcel);
                R2((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                zzbw.f(parcel);
                Z((zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case Service.MONITORING_FIELD_NUMBER /*28*/:
                zzbw.f(parcel);
                m1((Bundle) zzbw.a(parcel, Bundle.CREATOR), (zzp) zzbw.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
