package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import android.os.IInterface;
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

public interface zzf extends IInterface {
    void B2(Status status, zzcr zzcr);

    void F0(zzbm zzbm);

    void F1(zzi zzi);

    void F2(Status status, long j2);

    void O2(Status status);

    void S1(Status status, zzo zzo);

    void S2(Status status, zzaa zzaa);

    void T(Status status, int i2);

    void V2(Status status, zzu zzu);

    void X0(Status status, EmoneyReadiness emoneyReadiness);

    void Z1(Status status, zzao zzao);

    void a0(Status status, zzai zzai);

    void a1(Status status, zzs zzs);

    void d1(Status status, zzct zzct);

    void e2(Status status, zzak zzak);

    void k0(Status status, zzam zzam);

    void m0(Status status, zzac zzac);

    void o1(Status status, zzau zzau);

    void p2(Status status, byte[] bArr);

    void r1(Status status, PendingIntent pendingIntent);

    void r2(Status status, boolean z2);

    void s2(Status status, zzq zzq);

    void t1(Status status);

    void w0(Status status, zzaq zzaq);

    void w1(Status status, zzbv zzbv);
}
