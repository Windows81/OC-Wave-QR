package com.google.pay.button;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum ButtonType {
    Book(2),
    Buy(1),
    Checkout(3),
    Donate(4),
    Order(5),
    Pay(6),
    Plain(8),
    Subscribe(7);
    

    /* renamed from: z  reason: collision with root package name */
    public final int f31928z;

    static {
        ButtonType[] d2;
        J = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    ButtonType(int i2) {
        this.f31928z = i2;
    }

    public final int f() {
        return this.f31928z;
    }
}
