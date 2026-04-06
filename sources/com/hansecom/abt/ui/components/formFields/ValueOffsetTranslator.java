package com.hansecom.abt.ui.components.formFields;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
final class ValueOffsetTranslator implements OffsetMapping {

    /* renamed from: b  reason: collision with root package name */
    public final String f38346b;

    public ValueOffsetTranslator(String str) {
        Intrinsics.i(str, "originalText");
        this.f38346b = str;
    }

    public int a(int i2) {
        return this.f38346b.length();
    }

    public int b(int i2) {
        return this.f38346b.length() + 1 + (StringsKt.Q0(this.f38346b, ValueFieldKt.f38341a, false, 2, (Object) null) ? 1 : 0);
    }
}
