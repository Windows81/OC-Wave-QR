package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    public interface Types {
    }

    public abstract int H();

    public abstract long Q();

    public abstract String S();

    public final String toString() {
        long Q = Q();
        int H = H();
        String S = S();
        return Q + "\t" + H + "\t-1" + S;
    }
}
