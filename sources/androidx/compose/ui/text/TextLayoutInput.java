package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextLayoutInput {

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f18467a;

    /* renamed from: b  reason: collision with root package name */
    public final TextStyle f18468b;

    /* renamed from: c  reason: collision with root package name */
    public final List f18469c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18470d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18471e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18472f;

    /* renamed from: g  reason: collision with root package name */
    public final Density f18473g;

    /* renamed from: h  reason: collision with root package name */
    public final LayoutDirection f18474h;

    /* renamed from: i  reason: collision with root package name */
    public final FontFamily.Resolver f18475i;

    /* renamed from: j  reason: collision with root package name */
    public final long f18476j;

    /* renamed from: k  reason: collision with root package name */
    public Font.ResourceLoader f18477k;

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, list, i2, z2, i3, density, layoutDirection, resolver, j2);
    }

    public final long a() {
        return this.f18476j;
    }

    public final Density b() {
        return this.f18473g;
    }

    public final FontFamily.Resolver c() {
        return this.f18475i;
    }

    public final LayoutDirection d() {
        return this.f18474h;
    }

    public final int e() {
        return this.f18470d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return Intrinsics.d(this.f18467a, textLayoutInput.f18467a) && Intrinsics.d(this.f18468b, textLayoutInput.f18468b) && Intrinsics.d(this.f18469c, textLayoutInput.f18469c) && this.f18470d == textLayoutInput.f18470d && this.f18471e == textLayoutInput.f18471e && TextOverflow.h(this.f18472f, textLayoutInput.f18472f) && Intrinsics.d(this.f18473g, textLayoutInput.f18473g) && this.f18474h == textLayoutInput.f18474h && Intrinsics.d(this.f18475i, textLayoutInput.f18475i) && Constraints.f(this.f18476j, textLayoutInput.f18476j);
    }

    public final int f() {
        return this.f18472f;
    }

    public final List g() {
        return this.f18469c;
    }

    public final boolean h() {
        return this.f18471e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f18467a.hashCode() * 31) + this.f18468b.hashCode()) * 31) + this.f18469c.hashCode()) * 31) + this.f18470d) * 31) + Boolean.hashCode(this.f18471e)) * 31) + TextOverflow.i(this.f18472f)) * 31) + this.f18473g.hashCode()) * 31) + this.f18474h.hashCode()) * 31) + this.f18475i.hashCode()) * 31) + Constraints.o(this.f18476j);
    }

    public final TextStyle i() {
        return this.f18468b;
    }

    public final AnnotatedString j() {
        return this.f18467a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + this.f18467a + ", style=" + this.f18468b + ", placeholders=" + this.f18469c + ", maxLines=" + this.f18470d + ", softWrap=" + this.f18471e + ", overflow=" + TextOverflow.j(this.f18472f) + ", density=" + this.f18473g + ", layoutDirection=" + this.f18474h + ", fontFamilyResolver=" + this.f18475i + ", constraints=" + Constraints.q(this.f18476j) + ')';
    }

    public TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j2) {
        this.f18467a = annotatedString;
        this.f18468b = textStyle;
        this.f18469c = list;
        this.f18470d = i2;
        this.f18471e = z2;
        this.f18472f = i3;
        this.f18473g = density;
        this.f18474h = layoutDirection;
        this.f18475i = resolver;
        this.f18476j = j2;
        this.f18477k = resourceLoader;
    }

    public TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        this(annotatedString, textStyle, list, i2, z2, i3, density, layoutDirection, (Font.ResourceLoader) null, resolver, j2);
    }
}
