package com.hansecom.abt.ui.components.formFields;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class CardExpiryDateTransformation implements VisualTransformation {
    public TransformedText a(AnnotatedString annotatedString) {
        Intrinsics.i(annotatedString, "text");
        String a2 = CreditCarExpiryDateFieldKt.b(annotatedString.k());
        return new TransformedText(new AnnotatedString(a2, (List) null, 2, (DefaultConstructorMarker) null), new CreditCardExpiryDateOffsetTranslator(a2, annotatedString.k()));
    }
}
