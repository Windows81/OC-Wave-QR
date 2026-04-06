package com.hansecom.abt.ui.components.formFields;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

@Metadata
final class CardNumberOffsetTranslator implements OffsetMapping {

    /* renamed from: b  reason: collision with root package name */
    public final int f38261b;

    public CardNumberOffsetTranslator(int i2) {
        this.f38261b = Math.min((i2 - 1) / 4, 4);
    }

    public int a(int i2) {
        return i2 - Math.min(i2 / 5, this.f38261b);
    }

    public int b(int i2) {
        return i2 + Math.min(i2 / 4, this.f38261b);
    }
}
