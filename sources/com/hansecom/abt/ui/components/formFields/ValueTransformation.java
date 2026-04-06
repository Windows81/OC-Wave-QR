package com.hansecom.abt.ui.components.formFields;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
final class ValueTransformation implements VisualTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final long f38347b;

    public /* synthetic */ ValueTransformation(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public TransformedText a(AnnotatedString annotatedString) {
        AnnotatedString annotatedString2 = annotatedString;
        Intrinsics.i(annotatedString2, "text");
        String str = (String) CollectionsKt.h0(StringsKt.M0(annotatedString, new char[]{ValueFieldKt.f38341a}, false, 0, 6, (Object) null), 0);
        String str2 = (String) CollectionsKt.h0(StringsKt.M0(annotatedString, new char[]{ValueFieldKt.f38341a}, false, 0, 6, (Object) null), 1);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, (DefaultConstructorMarker) null);
        builder.k("$");
        if (str != null && str.length() != 0) {
            builder.k(str);
        } else if (StringsKt.Q0(annotatedString2, ValueFieldKt.f38341a, false, 2, (Object) null)) {
            builder.k("0");
        } else {
            int q2 = builder.q(new SpanStyle(this.f38347b, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.k("0");
                Unit unit = Unit.f40552a;
            } finally {
                builder.p(q2);
            }
        }
        if (str2 != null) {
            builder.append(ValueFieldKt.f38341a);
            builder.k(str2);
            if (str2.length() < ValueFieldKt.f38342b) {
                int q3 = builder.q(new SpanStyle(this.f38347b, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.k("0");
                    if (str2.length() == 0) {
                        builder.k("0");
                    }
                    Unit unit2 = Unit.f40552a;
                    builder.p(q3);
                } catch (Throwable th) {
                    builder.p(q3);
                    throw th;
                }
            }
        }
        return new TransformedText(builder.r(), new ValueOffsetTranslator(annotatedString.k()));
    }

    public ValueTransformation(long j2) {
        this.f38347b = j2;
    }
}
