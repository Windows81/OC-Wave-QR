package com.hansecom.abt.util.formatters;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class CurrencyValueFormater {

    /* renamed from: a  reason: collision with root package name */
    public static final CurrencyValueFormater f39045a = new CurrencyValueFormater();

    /* renamed from: b  reason: collision with root package name */
    public static final Currency f39046b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f39047c = 8;

    static {
        Currency instance = Currency.getInstance("USD");
        Intrinsics.h(instance, "getInstance(...)");
        f39046b = instance;
    }

    public static /* synthetic */ String c(CurrencyValueFormater currencyValueFormater, Number number, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return currencyValueFormater.a(number, z2);
    }

    public static /* synthetic */ String d(CurrencyValueFormater currencyValueFormater, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return currencyValueFormater.b(str, z2);
    }

    public final String a(Number number, boolean z2) {
        String str;
        if (number != null) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
            currencyInstance.setCurrency(f39046b);
            currencyInstance.setMinimumFractionDigits(z2 ? 2 : 0);
            str = currencyInstance.format(number);
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final String b(String str, boolean z2) {
        return a(str != null ? StringsKt.o(str) : null, z2);
    }

    public final Currency e() {
        return f39046b;
    }
}
