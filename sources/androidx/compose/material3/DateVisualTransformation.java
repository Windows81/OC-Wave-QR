package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata
final class DateVisualTransformation implements VisualTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final DateInputFormat f9817b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9818c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9819d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9820e;

    /* renamed from: f  reason: collision with root package name */
    public final DateVisualTransformation$dateOffsetTranslator$1 f9821f = new DateVisualTransformation$dateOffsetTranslator$1(this);

    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.f9817b = dateInputFormat;
        this.f9818c = StringsKt.i0(dateInputFormat.b(), dateInputFormat.a(), 0, false, 6, (Object) null);
        this.f9819d = StringsKt.p0(dateInputFormat.b(), dateInputFormat.a(), 0, false, 6, (Object) null);
        this.f9820e = dateInputFormat.c().length();
    }

    public TransformedText a(AnnotatedString annotatedString) {
        int i2 = 0;
        String T0 = annotatedString.k().length() > this.f9820e ? StringsKt.T0(annotatedString.k(), RangesKt.v(0, this.f9820e)) : annotatedString.k();
        String str = "";
        int i3 = 0;
        while (i2 < T0.length()) {
            int i4 = i3 + 1;
            str = str + T0.charAt(i2);
            if (i4 == this.f9818c || i3 + 2 == this.f9819d) {
                str = str + this.f9817b.a();
            }
            i2++;
            i3 = i4;
        }
        return new TransformedText(new AnnotatedString(str, (List) null, 2, (DefaultConstructorMarker) null), this.f9821f);
    }
}
