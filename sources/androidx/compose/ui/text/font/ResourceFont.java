package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ResourceFont implements Font {

    /* renamed from: b  reason: collision with root package name */
    public final int f18756b;

    /* renamed from: c  reason: collision with root package name */
    public final FontWeight f18757c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18758d;

    /* renamed from: e  reason: collision with root package name */
    public final FontVariation.Settings f18759e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18760f;

    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, fontWeight, i3, settings, i4);
    }

    public FontWeight a() {
        return this.f18757c;
    }

    public int b() {
        return this.f18760f;
    }

    public int c() {
        return this.f18758d;
    }

    public final int d() {
        return this.f18756b;
    }

    public final FontVariation.Settings e() {
        return this.f18759e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.f18756b == resourceFont.f18756b && Intrinsics.d(a(), resourceFont.a()) && FontStyle.f(c(), resourceFont.c()) && Intrinsics.d(this.f18759e, resourceFont.f18759e) && FontLoadingStrategy.f(b(), resourceFont.b());
    }

    public int hashCode() {
        return (((((((this.f18756b * 31) + a().hashCode()) * 31) + FontStyle.g(c())) * 31) + FontLoadingStrategy.g(b())) * 31) + this.f18759e.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f18756b + ", weight=" + a() + ", style=" + FontStyle.h(c()) + ", loadingStrategy=" + FontLoadingStrategy.h(b()) + ')';
    }

    public ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4) {
        this.f18756b = i2;
        this.f18757c = fontWeight;
        this.f18758d = i3;
        this.f18759e = settings;
        this.f18760f = i4;
    }
}
