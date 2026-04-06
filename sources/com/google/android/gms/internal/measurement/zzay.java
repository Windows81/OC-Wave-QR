package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class zzay {

    /* renamed from: a  reason: collision with root package name */
    public final List f25352a = new ArrayList();

    public final zzaq a(String str) {
        if (this.f25352a.contains(zzg.c(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract zzaq b(String str, zzh zzh, List list);
}
