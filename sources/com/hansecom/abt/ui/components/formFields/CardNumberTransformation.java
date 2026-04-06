package com.hansecom.abt.ui.components.formFields;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.hansecom.abt.util.StringExtKt;
import com.hansecom.abt.util.formatters.CardNumberValueFormater;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardNumberTransformation implements VisualTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final int f38262b;

    public CardNumberTransformation(int i2) {
        this.f38262b = i2;
    }

    public TransformedText a(AnnotatedString annotatedString) {
        Intrinsics.i(annotatedString, "text");
        return new TransformedText(new AnnotatedString(CardNumberValueFormater.f39044a.b(StringExtKt.a(annotatedString.k()), this.f38262b), (List) null, 2, (DefaultConstructorMarker) null), new CardNumberOffsetTranslator(this.f38262b));
    }
}
