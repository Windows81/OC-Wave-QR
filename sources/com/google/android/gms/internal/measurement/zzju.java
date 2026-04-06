package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class zzju implements Comparator<zzjs> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjs zzjs = (zzjs) obj;
        zzjs zzjs2 = (zzjs) obj2;
        zzjy zzjy = (zzjy) zzjs.iterator();
        zzjy zzjy2 = (zzjy) zzjs2.iterator();
        while (zzjy.hasNext() && zzjy2.hasNext()) {
            int compare = Integer.compare(zzjs.h(zzjy.a()), zzjs.h(zzjy2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzjs.u(), zzjs2.u());
    }
}
