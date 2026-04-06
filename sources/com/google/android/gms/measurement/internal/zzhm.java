package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzb;

final class zzhm extends LruCache<String, zzb> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ zzhg f26459j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzhm(zzhg zzhg, int i2) {
        super(20);
        this.f26459j = zzhg;
    }

    public final /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        Preconditions.g(str);
        return zzhg.z(this.f26459j, str);
    }
}
