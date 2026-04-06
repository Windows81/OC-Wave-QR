package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultimap;

public final class zzjc {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25552a;

    public zzjc(zzjf zzjf) {
        Preconditions.r(zzjf, "BuildInfo must be non-null");
        this.f25552a = !zzjf.a();
    }

    public final boolean a(String str) {
        Preconditions.r(str, "flagName must not be null");
        if (!this.f25552a) {
            return true;
        }
        return ((ImmutableMultimap) zzje.f25554a.get()).containsValue(str);
    }
}
