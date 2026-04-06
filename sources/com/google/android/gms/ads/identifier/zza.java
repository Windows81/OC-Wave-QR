package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

final class zza extends Thread {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Map f24319z;

    public zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f24319z = map;
    }

    public final void run() {
        Map map = this.f24319z;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.a(buildUpon.build().toString());
    }
}
