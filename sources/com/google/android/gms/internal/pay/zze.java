package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.EmoneyReadiness;
import com.google.android.gms.pay.zzaa;
import com.google.android.gms.pay.zzac;
import com.google.android.gms.pay.zzai;
import com.google.android.gms.pay.zzak;
import com.google.android.gms.pay.zzam;
import com.google.android.gms.pay.zzao;
import com.google.android.gms.pay.zzaq;
import com.google.android.gms.pay.zzau;
import com.google.android.gms.pay.zzbm;
import com.google.android.gms.pay.zzbv;
import com.google.android.gms.pay.zzcr;
import com.google.android.gms.pay.zzct;
import com.google.android.gms.pay.zzi;
import com.google.android.gms.pay.zzo;
import com.google.android.gms.pay.zzq;
import com.google.android.gms.pay.zzs;
import com.google.android.gms.pay.zzu;
import com.google.api.Service;

public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.pay.internal.IPayServiceCallbacks");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z2 = false;
        switch (i2) {
            case 2:
                zzc.b(parcel);
                O2((Status) zzc.a(parcel, Status.CREATOR));
                break;
            case 3:
                zzc.b(parcel);
                m0((Status) zzc.a(parcel, Status.CREATOR), (zzac) zzc.a(parcel, zzac.CREATOR));
                break;
            case 4:
                zzc.b(parcel);
                r1((Status) zzc.a(parcel, Status.CREATOR), (PendingIntent) zzc.a(parcel, PendingIntent.CREATOR));
                break;
            case 5:
                zzc.b(parcel);
                w1((Status) zzc.a(parcel, Status.CREATOR), (zzbv) zzc.a(parcel, zzbv.CREATOR));
                break;
            case 6:
                zzc.b(parcel);
                F1((zzi) zzc.a(parcel, zzi.CREATOR));
                break;
            case 7:
                zzc.b(parcel);
                e2((Status) zzc.a(parcel, Status.CREATOR), (zzak) zzc.a(parcel, zzak.CREATOR));
                break;
            case 8:
                Status status = (Status) zzc.a(parcel, Status.CREATOR);
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                zzc.b(parcel);
                r2(status, z2);
                break;
            case 9:
                zzc.b(parcel);
                k0((Status) zzc.a(parcel, Status.CREATOR), (zzam) zzc.a(parcel, zzam.CREATOR));
                break;
            case 10:
                zzc.b(parcel);
                F0((zzbm) zzc.a(parcel, zzbm.CREATOR));
                break;
            case 11:
                zzc.b(parcel);
                a1((Status) zzc.a(parcel, Status.CREATOR), (zzs) zzc.a(parcel, zzs.CREATOR));
                break;
            case 12:
                zzc.b(parcel);
                S1((Status) zzc.a(parcel, Status.CREATOR), (zzo) zzc.a(parcel, zzo.CREATOR));
                break;
            case 13:
                zzc.b(parcel);
                S2((Status) zzc.a(parcel, Status.CREATOR), (zzaa) zzc.a(parcel, zzaa.CREATOR));
                break;
            case 14:
                zzc.b(parcel);
                d1((Status) zzc.a(parcel, Status.CREATOR), (zzct) zzc.a(parcel, zzct.CREATOR));
                break;
            case 15:
                byte[] createByteArray = parcel.createByteArray();
                zzc.b(parcel);
                p2((Status) zzc.a(parcel, Status.CREATOR), createByteArray);
                break;
            case 16:
                zzc.b(parcel);
                V2((Status) zzc.a(parcel, Status.CREATOR), (zzu) zzc.a(parcel, zzu.CREATOR));
                break;
            case 17:
                long readLong = parcel.readLong();
                zzc.b(parcel);
                F2((Status) zzc.a(parcel, Status.CREATOR), readLong);
                break;
            case 18:
                zzc.b(parcel);
                t1((Status) zzc.a(parcel, Status.CREATOR));
                break;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                zzc.b(parcel);
                o1((Status) zzc.a(parcel, Status.CREATOR), (zzau) zzc.a(parcel, zzau.CREATOR));
                break;
            case 20:
                int readInt = parcel.readInt();
                zzc.b(parcel);
                T((Status) zzc.a(parcel, Status.CREATOR), readInt);
                break;
            case 21:
                zzc.b(parcel);
                Z1((Status) zzc.a(parcel, Status.CREATOR), (zzao) zzc.a(parcel, zzao.CREATOR));
                break;
            case 22:
                zzc.b(parcel);
                w0((Status) zzc.a(parcel, Status.CREATOR), (zzaq) zzc.a(parcel, zzaq.CREATOR));
                break;
            case 23:
                zzc.b(parcel);
                a0((Status) zzc.a(parcel, Status.CREATOR), (zzai) zzc.a(parcel, zzai.CREATOR));
                break;
            case Service.METRICS_FIELD_NUMBER /*24*/:
                zzc.b(parcel);
                B2((Status) zzc.a(parcel, Status.CREATOR), (zzcr) zzc.a(parcel, zzcr.CREATOR));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                zzc.b(parcel);
                s2((Status) zzc.a(parcel, Status.CREATOR), (zzq) zzc.a(parcel, zzq.CREATOR));
                break;
            case Service.BILLING_FIELD_NUMBER /*26*/:
                zzc.b(parcel);
                X0((Status) zzc.a(parcel, Status.CREATOR), (EmoneyReadiness) zzc.a(parcel, EmoneyReadiness.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
