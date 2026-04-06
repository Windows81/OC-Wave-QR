package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextLayoutResult {

    /* renamed from: g  reason: collision with root package name */
    public static final int f18478g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final TextLayoutInput f18479a;

    /* renamed from: b  reason: collision with root package name */
    public final MultiParagraph f18480b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18481c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18482d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18483e;

    /* renamed from: f  reason: collision with root package name */
    public final List f18484f;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j2);
    }

    public static /* synthetic */ TextLayoutResult b(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textLayoutInput = textLayoutResult.f18479a;
        }
        if ((i2 & 2) != 0) {
            j2 = textLayoutResult.f18481c;
        }
        return textLayoutResult.a(textLayoutInput, j2);
    }

    public static /* synthetic */ int p(TextLayoutResult textLayoutResult, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayoutResult.o(i2, z2);
    }

    public final List A() {
        return this.f18484f;
    }

    public final long B() {
        return this.f18481c;
    }

    public final long C(int i2) {
        return this.f18480b.E(i2);
    }

    public final boolean D(int i2) {
        return this.f18480b.F(i2);
    }

    public final TextLayoutResult a(TextLayoutInput textLayoutInput, long j2) {
        return new TextLayoutResult(textLayoutInput, this.f18480b, j2, (DefaultConstructorMarker) null);
    }

    public final ResolvedTextDirection c(int i2) {
        return this.f18480b.c(i2);
    }

    public final Rect d(int i2) {
        return this.f18480b.d(i2);
    }

    public final Rect e(int i2) {
        return this.f18480b.e(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return Intrinsics.d(this.f18479a, textLayoutResult.f18479a) && Intrinsics.d(this.f18480b, textLayoutResult.f18480b) && IntSize.e(this.f18481c, textLayoutResult.f18481c) && this.f18482d == textLayoutResult.f18482d && this.f18483e == textLayoutResult.f18483e && Intrinsics.d(this.f18484f, textLayoutResult.f18484f);
    }

    public final boolean f() {
        return this.f18480b.f() || ((float) ((int) (this.f18481c & 4294967295L))) < this.f18480b.h();
    }

    public final boolean g() {
        return ((float) ((int) (this.f18481c >> 32))) < this.f18480b.D();
    }

    public final float h() {
        return this.f18482d;
    }

    public int hashCode() {
        return (((((((((this.f18479a.hashCode() * 31) + this.f18480b.hashCode()) * 31) + IntSize.h(this.f18481c)) * 31) + Float.hashCode(this.f18482d)) * 31) + Float.hashCode(this.f18483e)) * 31) + this.f18484f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i2, boolean z2) {
        return this.f18480b.i(i2, z2);
    }

    public final float k() {
        return this.f18483e;
    }

    public final TextLayoutInput l() {
        return this.f18479a;
    }

    public final float m(int i2) {
        return this.f18480b.l(i2);
    }

    public final int n() {
        return this.f18480b.m();
    }

    public final int o(int i2, boolean z2) {
        return this.f18480b.n(i2, z2);
    }

    public final int q(int i2) {
        return this.f18480b.p(i2);
    }

    public final int r(float f2) {
        return this.f18480b.q(f2);
    }

    public final float s(int i2) {
        return this.f18480b.s(i2);
    }

    public final float t(int i2) {
        return this.f18480b.t(i2);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f18479a + ", multiParagraph=" + this.f18480b + ", size=" + IntSize.i(this.f18481c) + ", firstBaseline=" + this.f18482d + ", lastBaseline=" + this.f18483e + ", placeholderRects=" + this.f18484f + ')';
    }

    public final int u(int i2) {
        return this.f18480b.u(i2);
    }

    public final float v(int i2) {
        return this.f18480b.v(i2);
    }

    public final MultiParagraph w() {
        return this.f18480b;
    }

    public final int x(long j2) {
        return this.f18480b.x(j2);
    }

    public final ResolvedTextDirection y(int i2) {
        return this.f18480b.y(i2);
    }

    public final Path z(int i2, int i3) {
        return this.f18480b.A(i2, i3);
    }

    public TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2) {
        this.f18479a = textLayoutInput;
        this.f18480b = multiParagraph;
        this.f18481c = j2;
        this.f18482d = multiParagraph.g();
        this.f18483e = multiParagraph.k();
        this.f18484f = multiParagraph.B();
    }
}
