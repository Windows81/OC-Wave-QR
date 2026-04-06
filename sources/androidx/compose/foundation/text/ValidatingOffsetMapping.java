package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

@Metadata
final class ValidatingOffsetMapping implements OffsetMapping {

    /* renamed from: b  reason: collision with root package name */
    public final OffsetMapping f6028b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6029c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6030d;

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i2, int i3) {
        this.f6028b = offsetMapping;
        this.f6029c = i2;
        this.f6030d = i3;
    }

    public int a(int i2) {
        int a2 = this.f6028b.a(i2);
        if (i2 >= 0 && i2 <= this.f6030d) {
            ValidatingOffsetMappingKt.h(a2, this.f6029c, i2);
        }
        return a2;
    }

    public int b(int i2) {
        int b2 = this.f6028b.b(i2);
        if (i2 >= 0 && i2 <= this.f6029c) {
            ValidatingOffsetMappingKt.g(b2, this.f6030d, i2);
        }
        return b2;
    }
}
