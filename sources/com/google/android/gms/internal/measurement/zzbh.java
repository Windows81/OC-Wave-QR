package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

final class zzbh implements Comparator<zzaq> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzh f25362A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzal f25363z;

    public zzbh(zzal zzal, zzh zzh) {
        this.f25363z = zzal;
        this.f25362A = zzh;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaq zzaq = (zzaq) obj;
        zzaq zzaq2 = (zzaq) obj2;
        zzal zzal = this.f25363z;
        zzh zzh = this.f25362A;
        if (zzaq instanceof zzax) {
            return !(zzaq2 instanceof zzax) ? 1 : 0;
        }
        if (zzaq2 instanceof zzax) {
            return -1;
        }
        if (zzal == null) {
            return zzaq.h().compareTo(zzaq2.h());
        }
        return (int) zzg.a(zzal.a(zzh, Arrays.asList(new zzaq[]{zzaq, zzaq2})).g().doubleValue());
    }
}
