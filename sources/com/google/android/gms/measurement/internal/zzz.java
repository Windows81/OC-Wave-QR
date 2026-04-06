package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzlc;
import java.util.ArrayList;
import java.util.List;

final class zzz {

    /* renamed from: a  reason: collision with root package name */
    public zzgn.zzf f26997a;

    /* renamed from: b  reason: collision with root package name */
    public Long f26998b;

    /* renamed from: c  reason: collision with root package name */
    public long f26999c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzv f27000d;

    public final zzgn.zzf a(String str, zzgn.zzf zzf) {
        Object obj;
        String Y = zzf.Y();
        List Z = zzf.Z();
        this.f27000d.o();
        Long l2 = (Long) zzol.g0(zzf, "_eid");
        boolean z2 = l2 != null;
        if (z2 && Y.equals("_ep")) {
            Preconditions.m(l2);
            this.f27000d.o();
            Y = (String) zzol.g0(zzf, "_en");
            if (TextUtils.isEmpty(Y)) {
                this.f27000d.m().I().b("Extra parameter without an event name. eventId", l2);
                return null;
            }
            if (this.f26997a == null || this.f26998b == null || l2.longValue() != this.f26998b.longValue()) {
                Pair H = this.f27000d.q().H(str, l2);
                if (H == null || (obj = H.first) == null) {
                    this.f27000d.m().I().c("Extra parameter without existing main event. eventName, eventId", Y, l2);
                    return null;
                }
                this.f26997a = (zzgn.zzf) obj;
                this.f26999c = ((Long) H.second).longValue();
                this.f27000d.o();
                this.f26998b = (Long) zzol.g0(this.f26997a, "_eid");
            }
            long j2 = this.f26999c - 1;
            this.f26999c = j2;
            if (j2 <= 0) {
                zzam q2 = this.f27000d.q();
                q2.n();
                q2.m().K().b("Clearing complex main event info. appId", str);
                try {
                    q2.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e2) {
                    q2.m().G().b("Error clearing complex main event", e2);
                }
            } else {
                this.f27000d.q().n0(str, l2, this.f26999c, this.f26997a);
            }
            ArrayList arrayList = new ArrayList();
            for (zzgn.zzh zzh : this.f26997a.Z()) {
                this.f27000d.o();
                if (zzol.F(zzf, zzh.a0()) == null) {
                    arrayList.add(zzh);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(Z);
                Z = arrayList;
            } else {
                this.f27000d.m().I().b("No unique parameters in main event. eventName", Y);
            }
        } else if (z2) {
            this.f26998b = l2;
            this.f26997a = zzf;
            this.f27000d.o();
            long longValue = ((Long) zzol.J(zzf, "_epc", 0L)).longValue();
            this.f26999c = longValue;
            if (longValue <= 0) {
                this.f27000d.m().I().b("Complex event with zero extra param count. eventName", Y);
            } else {
                this.f27000d.q().n0(str, (Long) Preconditions.m(l2), this.f26999c, zzf);
            }
        }
        return (zzgn.zzf) ((zzlc) ((zzgn.zzf.zza) zzf.z()).L(Y).R().K(Z).F());
    }

    public zzz(zzv zzv) {
        this.f27000d = zzv;
    }
}
