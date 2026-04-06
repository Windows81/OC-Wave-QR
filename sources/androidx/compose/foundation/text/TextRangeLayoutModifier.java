package androidx.compose.foundation.text;

import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class TextRangeLayoutModifier implements ParentDataModifier {

    /* renamed from: z  reason: collision with root package name */
    public final TextRangeScopeMeasurePolicy f6018z;

    public TextRangeLayoutModifier(TextRangeScopeMeasurePolicy textRangeScopeMeasurePolicy) {
        this.f6018z = textRangeScopeMeasurePolicy;
    }

    public final TextRangeScopeMeasurePolicy a() {
        return this.f6018z;
    }

    /* renamed from: b */
    public TextRangeLayoutModifier F(Density density, Object obj) {
        return this;
    }
}
