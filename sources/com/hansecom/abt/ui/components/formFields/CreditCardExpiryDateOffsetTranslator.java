package com.hansecom.abt.ui.components.formFields;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
final class CreditCardExpiryDateOffsetTranslator implements OffsetMapping {

    /* renamed from: b  reason: collision with root package name */
    public final String f38316b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38317c;

    public CreditCardExpiryDateOffsetTranslator(String str, String str2) {
        Intrinsics.i(str, "transformedText");
        Intrinsics.i(str2, "text");
        this.f38316b = str;
        this.f38317c = str2;
    }

    public int a(int i2) {
        Character k1;
        Character k12 = StringsKt.k1(this.f38316b, 0);
        return (k12 != null && k12.charValue() == '0' && ((k1 = StringsKt.k1(this.f38317c, 0)) == null || k1.charValue() != '0') && this.f38316b.length() > 1 && i2 > 1) ? i2 - 2 : i2 > 2 ? i2 - 1 : i2;
    }

    public int b(int i2) {
        Character k1;
        Character k12 = StringsKt.k1(this.f38316b, 0);
        return (k12 != null && k12.charValue() == '0' && ((k1 = StringsKt.k1(this.f38317c, 0)) == null || k1.charValue() != '0') && this.f38316b.length() > 1 && i2 > 0) ? i2 + 2 : i2 > 1 ? i2 + 1 : i2;
    }
}
