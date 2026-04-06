package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;

public final /* synthetic */ class c implements TextRangeScopeMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6040a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f6041b;

    public /* synthetic */ c(TextLinkScope textLinkScope, AnnotatedString.Range range) {
        this.f6040a = textLinkScope;
        this.f6041b = range;
    }

    public final TextRangeLayoutMeasureResult a(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        return TextLinkScope.u(this.f6040a, this.f6041b, textRangeLayoutMeasureScope);
    }
}
