package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PaddingValuesImpl implements PaddingValues {

    /* renamed from: a  reason: collision with root package name */
    public final float f4127a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4128b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4129c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4130d;

    public /* synthetic */ PaddingValuesImpl(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    public float a() {
        return this.f4130d;
    }

    public float b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f4127a : this.f4129c;
    }

    public float c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f4129c : this.f4127a;
    }

    public float d() {
        return this.f4128b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.o(this.f4127a, paddingValuesImpl.f4127a) && Dp.o(this.f4128b, paddingValuesImpl.f4128b) && Dp.o(this.f4129c, paddingValuesImpl.f4129c) && Dp.o(this.f4130d, paddingValuesImpl.f4130d);
    }

    public int hashCode() {
        return (((((Dp.p(this.f4127a) * 31) + Dp.p(this.f4128b)) * 31) + Dp.p(this.f4129c)) * 31) + Dp.p(this.f4130d);
    }

    public String toString() {
        return "PaddingValues(start=" + Dp.r(this.f4127a) + ", top=" + Dp.r(this.f4128b) + ", end=" + Dp.r(this.f4129c) + ", bottom=" + Dp.r(this.f4130d) + ')';
    }

    public PaddingValuesImpl(float f2, float f3, float f4, float f5) {
        this.f4127a = f2;
        this.f4128b = f3;
        this.f4129c = f4;
        this.f4130d = f5;
        if (!((f2 >= 0.0f) & (f3 >= 0.0f) & (f4 >= 0.0f)) || !(f5 >= 0.0f)) {
            InlineClassHelperKt.a("Padding must be non-negative");
        }
    }
}
