package com.google.android.gms.measurement.internal;

enum zzal {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');
    

    /* renamed from: z  reason: collision with root package name */
    public final char f26185z;

    /* access modifiers changed from: public */
    zzal(char c2) {
        this.f26185z = c2;
    }

    public static zzal f(char c2) {
        for (zzal zzal : values()) {
            if (zzal.f26185z == c2) {
                return zzal;
            }
        }
        return UNSET;
    }
}
