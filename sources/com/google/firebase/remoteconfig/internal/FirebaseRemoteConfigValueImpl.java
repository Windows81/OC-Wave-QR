package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {

    /* renamed from: a  reason: collision with root package name */
    public final String f31360a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31361b;

    public FirebaseRemoteConfigValueImpl(String str, int i2) {
        this.f31360a = str;
        this.f31361b = i2;
    }

    public long a() {
        if (this.f31361b == 0) {
            return 0;
        }
        String f2 = f();
        try {
            return Long.valueOf(f2).longValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{f2, "long"}), e2);
        }
    }

    public int b() {
        return this.f31361b;
    }

    public double c() {
        if (this.f31361b == 0) {
            return 0.0d;
        }
        String f2 = f();
        try {
            return Double.valueOf(f2).doubleValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{f2, "double"}), e2);
        }
    }

    public String d() {
        if (this.f31361b == 0) {
            return "";
        }
        g();
        return this.f31360a;
    }

    public boolean e() {
        if (this.f31361b == 0) {
            return false;
        }
        String f2 = f();
        if (ConfigGetParameterHandler.f31303f.matcher(f2).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.f31304g.matcher(f2).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{f2, "boolean"}));
    }

    public final String f() {
        return d().trim();
    }

    public final void g() {
        if (this.f31360a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }
}
