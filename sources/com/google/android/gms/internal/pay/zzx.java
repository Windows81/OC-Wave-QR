package com.google.android.gms.internal.pay;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.pay.Pay;
import com.google.android.gms.pay.PayClient;
import com.google.android.gms.pay.zzcb;
import com.google.android.gms.pay.zzcd;
import com.google.android.gms.pay.zzn;
import com.google.android.gms.pay.zzw;
import com.google.android.gms.tasks.Task;

public final class zzx extends GoogleApi implements PayClient {
    public zzx(Context context) {
        super(context, Pay.f27010f, Api.ApiOptions.f24414l, GoogleApi.Settings.f24436c);
    }

    public final void b(String str, Activity activity, int i2) {
        zzcb zzcb = new zzcb();
        zzcb.a(str);
        zzcd b2 = zzcb.b();
        zzz zzz = new zzz(activity, i2);
        f(TaskApiCall.a().b(new zzk(b2, zzz)).d(zzn.C).c(false).e(7295).a()).d(new zzl(zzz));
    }

    public final Task c(int i2) {
        zzw zzw = new zzw();
        zzw.a(i2);
        return f(TaskApiCall.a().b(new zzo(zzw.b())).d(zzn.f27111g).c(false).e(7289).a());
    }
}
