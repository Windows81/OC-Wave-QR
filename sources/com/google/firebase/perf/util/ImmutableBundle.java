package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.AndroidLogger;

public final class ImmutableBundle {

    /* renamed from: b  reason: collision with root package name */
    public static final AndroidLogger f31120b = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f31121a;

    public ImmutableBundle() {
        this(new Bundle());
    }

    public boolean a(String str) {
        return str != null && this.f31121a.containsKey(str);
    }

    public Optional b(String str) {
        if (!a(str)) {
            return Optional.a();
        }
        try {
            return Optional.b((Boolean) this.f31121a.get(str));
        } catch (ClassCastException e2) {
            f31120b.b("Metadata key %s contains type other than boolean: %s", str, e2.getMessage());
            return Optional.a();
        }
    }

    public Optional c(String str) {
        if (!a(str)) {
            return Optional.a();
        }
        Object obj = this.f31121a.get(str);
        if (obj == null) {
            return Optional.a();
        }
        if (obj instanceof Float) {
            return Optional.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return Optional.e((Double) obj);
        }
        f31120b.b("Metadata key %s contains type other than double: %s", str);
        return Optional.a();
    }

    public final Optional d(String str) {
        if (!a(str)) {
            return Optional.a();
        }
        try {
            return Optional.b((Integer) this.f31121a.get(str));
        } catch (ClassCastException e2) {
            f31120b.b("Metadata key %s contains type other than int: %s", str, e2.getMessage());
            return Optional.a();
        }
    }

    public Optional e(String str) {
        Optional d2 = d(str);
        return d2.d() ? Optional.e(Long.valueOf((long) ((Integer) d2.c()).intValue())) : Optional.a();
    }

    public ImmutableBundle(Bundle bundle) {
        this.f31121a = (Bundle) bundle.clone();
    }
}
