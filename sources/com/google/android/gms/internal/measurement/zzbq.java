package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbq extends zzay {
    public final zzaq b(String str, zzh zzh, List list) {
        if (str == null || str.isEmpty() || !zzh.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        zzaq c2 = zzh.c(str);
        if (c2 instanceof zzal) {
            return ((zzal) c2).a(zzh, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
