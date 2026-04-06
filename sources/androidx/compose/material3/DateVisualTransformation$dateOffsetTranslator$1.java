package androidx.compose.material3;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

@Metadata
public final class DateVisualTransformation$dateOffsetTranslator$1 implements OffsetMapping {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DateVisualTransformation f9822b;

    public DateVisualTransformation$dateOffsetTranslator$1(DateVisualTransformation dateVisualTransformation) {
        this.f9822b = dateVisualTransformation;
    }

    public int a(int i2) {
        return i2 <= this.f9822b.f9818c + -1 ? i2 : i2 <= this.f9822b.f9819d + -1 ? i2 - 1 : i2 <= this.f9822b.f9820e + 1 ? i2 - 2 : this.f9822b.f9820e;
    }

    public int b(int i2) {
        if (i2 < this.f9822b.f9818c) {
            return i2;
        }
        if (i2 < this.f9822b.f9819d) {
            return i2 + 1;
        }
        if (i2 > this.f9822b.f9820e) {
            i2 = this.f9822b.f9820e;
        }
        return i2 + 2;
    }
}
