package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class zzl {

    /* renamed from: a  reason: collision with root package name */
    public Map f25618a = new HashMap();

    public final zzaq a(String str) {
        if (!this.f25618a.containsKey(str)) {
            return zzaq.f25336m;
        }
        try {
            return (zzaq) ((Callable) this.f25618a.get(str)).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable callable) {
        this.f25618a.put(str, callable);
    }
}
