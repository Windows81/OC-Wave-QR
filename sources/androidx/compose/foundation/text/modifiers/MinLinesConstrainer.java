package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class MinLinesConstrainer {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f6599h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f6600i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static MinLinesConstrainer f6601j;

    /* renamed from: a  reason: collision with root package name */
    public final LayoutDirection f6602a;

    /* renamed from: b  reason: collision with root package name */
    public final TextStyle f6603b;

    /* renamed from: c  reason: collision with root package name */
    public final Density f6604c;

    /* renamed from: d  reason: collision with root package name */
    public final FontFamily.Resolver f6605d;

    /* renamed from: e  reason: collision with root package name */
    public final TextStyle f6606e;

    /* renamed from: f  reason: collision with root package name */
    public float f6607f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f6608g = Float.NaN;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MinLinesConstrainer a(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.g() && Intrinsics.d(TextStyleKt.d(textStyle, layoutDirection), minLinesConstrainer.f()) && density.getDensity() == minLinesConstrainer.d().getDensity() && resolver == minLinesConstrainer.e()) {
                return minLinesConstrainer;
            }
            MinLinesConstrainer a2 = MinLinesConstrainer.f6601j;
            if (a2 != null && layoutDirection == a2.g() && Intrinsics.d(TextStyleKt.d(textStyle, layoutDirection), a2.f()) && density.getDensity() == a2.d().getDensity() && resolver == a2.e()) {
                return a2;
            }
            MinLinesConstrainer minLinesConstrainer2 = new MinLinesConstrainer(layoutDirection, TextStyleKt.d(textStyle, layoutDirection), DensityKt.a(density.getDensity(), density.u1()), resolver);
            MinLinesConstrainer.f6601j = minLinesConstrainer2;
            return minLinesConstrainer2;
        }

        public Companion() {
        }
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.f6602a = layoutDirection;
        this.f6603b = textStyle;
        this.f6604c = density;
        this.f6605d = resolver;
        this.f6606e = TextStyleKt.d(textStyle, layoutDirection);
    }

    public final long c(long j2, int i2) {
        int i3 = i2;
        float f2 = this.f6608g;
        float f3 = this.f6607f;
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            String a2 = MinLinesConstrainerKt.f6609a;
            TextStyle textStyle = this.f6606e;
            long b2 = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);
            Density density = this.f6604c;
            FontFamily.Resolver resolver = this.f6605d;
            TextOverflow.Companion companion = TextOverflow.f19125b;
            float a3 = ParagraphKt.b(a2, textStyle, b2, density, resolver, (List) null, (List) null, 1, companion.a(), 96, (Object) null).a();
            float a4 = ParagraphKt.b(MinLinesConstrainerKt.f6610b, this.f6606e, ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null), this.f6604c, this.f6605d, (List) null, (List) null, 2, companion.a(), 96, (Object) null).a() - a3;
            this.f6608g = a3;
            this.f6607f = a4;
            float f4 = a3;
            f3 = a4;
            f2 = f4;
        }
        return ConstraintsKt.a(Constraints.n(j2), Constraints.l(j2), i3 != 1 ? RangesKt.j(RangesKt.e(Math.round(f2 + (f3 * ((float) (i3 - 1)))), 0), Constraints.k(j2)) : Constraints.m(j2), Constraints.k(j2));
    }

    public final Density d() {
        return this.f6604c;
    }

    public final FontFamily.Resolver e() {
        return this.f6605d;
    }

    public final TextStyle f() {
        return this.f6603b;
    }

    public final LayoutDirection g() {
        return this.f6602a;
    }
}
