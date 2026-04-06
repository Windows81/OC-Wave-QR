package com.google.pay.button;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum ButtonTheme {
    Dark(1),
    Light(2);
    

    /* renamed from: z  reason: collision with root package name */
    public final int f31925z;

    static {
        ButtonTheme[] d2;
        D = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    ButtonTheme(int i2) {
        this.f31925z = i2;
    }

    public final int f() {
        return this.f31925z;
    }
}
