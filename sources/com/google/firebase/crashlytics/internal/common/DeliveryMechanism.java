package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: z  reason: collision with root package name */
    public final int f30075z;

    /* access modifiers changed from: public */
    DeliveryMechanism(int i2) {
        this.f30075z = i2;
    }

    public static DeliveryMechanism f(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int h() {
        return this.f30075z;
    }

    public String toString() {
        return Integer.toString(this.f30075z);
    }
}
