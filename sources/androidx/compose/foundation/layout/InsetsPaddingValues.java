package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class InsetsPaddingValues implements PaddingValues {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsets f4053a;

    /* renamed from: b  reason: collision with root package name */
    public final Density f4054b;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density) {
        this.f4053a = windowInsets;
        this.f4054b = density;
    }

    public float a() {
        Density density = this.f4054b;
        return density.D(this.f4053a.c(density));
    }

    public float b(LayoutDirection layoutDirection) {
        Density density = this.f4054b;
        return density.D(this.f4053a.d(density, layoutDirection));
    }

    public float c(LayoutDirection layoutDirection) {
        Density density = this.f4054b;
        return density.D(this.f4053a.b(density, layoutDirection));
    }

    public float d() {
        Density density = this.f4054b;
        return density.D(this.f4053a.a(density));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return Intrinsics.d(this.f4053a, insetsPaddingValues.f4053a) && Intrinsics.d(this.f4054b, insetsPaddingValues.f4054b);
    }

    public int hashCode() {
        return (this.f4053a.hashCode() * 31) + this.f4054b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f4053a + ", density=" + this.f4054b + ')';
    }
}
