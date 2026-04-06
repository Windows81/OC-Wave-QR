package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

final class zza extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f27141a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProviderInstaller.ProviderInstallListener f27142b;

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ProviderInstaller.a(this.f27141a);
            return 0;
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.a());
        } catch (GooglePlayServicesNotAvailableException e3) {
            return Integer.valueOf(e3.f24395z);
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f27142b.a();
            return;
        }
        this.f27142b.b(num.intValue(), ProviderInstaller.f27137a.d(this.f27141a, num.intValue(), "pi"));
    }
}
