package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.button.zzc;
import com.google.android.gms.wallet.zzau;

public abstract class zzp extends zzb implements zzq {
    public zzp() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                zzc.b(parcel);
                h1(parcel.readInt(), (MaskedWallet) zzc.a(parcel, MaskedWallet.CREATOR), (Bundle) zzc.a(parcel, Bundle.CREATOR));
                return true;
            case 2:
                zzc.b(parcel);
                K2(parcel.readInt(), (FullWallet) zzc.a(parcel, FullWallet.CREATOR), (Bundle) zzc.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                zzc.b(parcel);
                A0(parcel.readInt(), zzc.e(parcel), (Bundle) zzc.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                zzc.b(parcel);
                j2(parcel.readInt(), (Bundle) zzc.a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                parcel.readInt();
                zzc.e(parcel);
                Bundle bundle = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 7:
                Status status = (Status) zzc.a(parcel, Status.CREATOR);
                zze zze = (zze) zzc.a(parcel, zze.CREATOR);
                Bundle bundle2 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 8:
                Status status2 = (Status) zzc.a(parcel, Status.CREATOR);
                Bundle bundle3 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 9:
                zzc.b(parcel);
                p0((Status) zzc.a(parcel, Status.CREATOR), zzc.e(parcel), (Bundle) zzc.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Status status3 = (Status) zzc.a(parcel, Status.CREATOR);
                zzg zzg = (zzg) zzc.a(parcel, zzg.CREATOR);
                Bundle bundle4 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 11:
                Status status4 = (Status) zzc.a(parcel, Status.CREATOR);
                Bundle bundle5 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 12:
                Status status5 = (Status) zzc.a(parcel, Status.CREATOR);
                zzau zzau = (zzau) zzc.a(parcel, zzau.CREATOR);
                Bundle bundle6 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 13:
                Status status6 = (Status) zzc.a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 14:
                zzc.b(parcel);
                W1((Status) zzc.a(parcel, Status.CREATOR), (PaymentData) zzc.a(parcel, PaymentData.CREATOR), (Bundle) zzc.a(parcel, Bundle.CREATOR));
                return true;
            case 15:
                Status status7 = (Status) zzc.a(parcel, Status.CREATOR);
                zzm zzm = (zzm) zzc.a(parcel, zzm.CREATOR);
                Bundle bundle8 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 16:
                Status status8 = (Status) zzc.a(parcel, Status.CREATOR);
                zzi zzi = (zzi) zzc.a(parcel, zzi.CREATOR);
                Bundle bundle9 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 17:
                Status status9 = (Status) zzc.a(parcel, Status.CREATOR);
                zzk zzk = (zzk) zzc.a(parcel, zzk.CREATOR);
                Bundle bundle10 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle11 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                zzc.b(parcel);
                C0((Status) zzc.a(parcel, Status.CREATOR), (PaymentCardRecognitionIntentResponse) zzc.a(parcel, PaymentCardRecognitionIntentResponse.CREATOR), (Bundle) zzc.a(parcel, Bundle.CREATOR));
                return true;
            case 20:
                Status status10 = (Status) zzc.a(parcel, Status.CREATOR);
                zzc zzc = (zzc) zzc.a(parcel, zzc.CREATOR);
                Bundle bundle12 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.b(parcel);
                return true;
            default:
                return false;
        }
    }
}
