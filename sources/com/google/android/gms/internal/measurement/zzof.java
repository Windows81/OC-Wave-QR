package com.google.android.gms.internal.measurement;

public enum zzof {
    DOUBLE(zzop.DOUBLE, 1),
    FLOAT(zzop.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzop.BOOLEAN, 0),
    STRING(zzop.STRING, (zzop) null),
    GROUP(r19, (zzop) null),
    MESSAGE(r19, (zzop) null),
    BYTES(zzop.BYTE_STRING, (zzop) null),
    UINT32(r11, 0),
    ENUM(zzop.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: A  reason: collision with root package name */
    public final int f25731A;

    /* renamed from: z  reason: collision with root package name */
    public final zzop f25732z;

    public final int a() {
        return this.f25731A;
    }

    public final zzop d() {
        return this.f25732z;
    }

    /* access modifiers changed from: public */
    zzof(zzop zzop, int i2) {
        this.f25732z = zzop;
        this.f25731A = i2;
    }
}
