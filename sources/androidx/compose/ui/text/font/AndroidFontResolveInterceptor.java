package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {

    /* renamed from: b  reason: collision with root package name */
    public final int f18668b;

    public AndroidFontResolveInterceptor(int i2) {
        this.f18668b = i2;
    }

    public FontWeight a(FontWeight fontWeight) {
        int i2 = this.f18668b;
        return (i2 == 0 || i2 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(RangesKt.o(fontWeight.y() + this.f18668b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.f18668b == ((AndroidFontResolveInterceptor) obj).f18668b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f18668b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f18668b + ')';
    }
}
