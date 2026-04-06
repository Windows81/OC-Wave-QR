package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class ParagraphInfo {

    /* renamed from: a  reason: collision with root package name */
    public final Paragraph f18309a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18310b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18311c;

    /* renamed from: d  reason: collision with root package name */
    public int f18312d;

    /* renamed from: e  reason: collision with root package name */
    public int f18313e;

    /* renamed from: f  reason: collision with root package name */
    public float f18314f;

    /* renamed from: g  reason: collision with root package name */
    public float f18315g;

    public ParagraphInfo(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3) {
        this.f18309a = paragraph;
        this.f18310b = i2;
        this.f18311c = i3;
        this.f18312d = i4;
        this.f18313e = i5;
        this.f18314f = f2;
        this.f18315g = f3;
    }

    public static /* synthetic */ long l(ParagraphInfo paragraphInfo, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return paragraphInfo.k(j2, z2);
    }

    public final float a() {
        return this.f18315g;
    }

    public final int b() {
        return this.f18311c;
    }

    public final int c() {
        return this.f18313e;
    }

    public final int d() {
        return this.f18311c - this.f18310b;
    }

    public final Paragraph e() {
        return this.f18309a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return Intrinsics.d(this.f18309a, paragraphInfo.f18309a) && this.f18310b == paragraphInfo.f18310b && this.f18311c == paragraphInfo.f18311c && this.f18312d == paragraphInfo.f18312d && this.f18313e == paragraphInfo.f18313e && Float.compare(this.f18314f, paragraphInfo.f18314f) == 0 && Float.compare(this.f18315g, paragraphInfo.f18315g) == 0;
    }

    public final int f() {
        return this.f18310b;
    }

    public final int g() {
        return this.f18312d;
    }

    public final float h() {
        return this.f18314f;
    }

    public int hashCode() {
        return (((((((((((this.f18309a.hashCode() * 31) + Integer.hashCode(this.f18310b)) * 31) + Integer.hashCode(this.f18311c)) * 31) + Integer.hashCode(this.f18312d)) * 31) + Integer.hashCode(this.f18313e)) * 31) + Float.hashCode(this.f18314f)) * 31) + Float.hashCode(this.f18315g);
    }

    public final Rect i(Rect rect) {
        return rect.B(Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f18314f)) & 4294967295L)));
    }

    public final Path j(Path path) {
        path.v(Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f18314f)) & 4294967295L)));
        return path;
    }

    public final long k(long j2, boolean z2) {
        if (z2) {
            TextRange.Companion companion = TextRange.f18496b;
            if (TextRange.g(j2, companion.a())) {
                return companion.a();
            }
        }
        return TextRangeKt.b(m(TextRange.n(j2)), m(TextRange.i(j2)));
    }

    public final int m(int i2) {
        return i2 + this.f18310b;
    }

    public final int n(int i2) {
        return i2 + this.f18312d;
    }

    public final float o(float f2) {
        return f2 + this.f18314f;
    }

    public final Rect p(Rect rect) {
        return rect.B(Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-this.f18314f)) & 4294967295L)));
    }

    public final long q(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - this.f18314f)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32));
    }

    public final int r(int i2) {
        return RangesKt.o(i2, this.f18310b, this.f18311c) - this.f18310b;
    }

    public final int s(int i2) {
        return i2 - this.f18312d;
    }

    public final float t(float f2) {
        return f2 - this.f18314f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f18309a + ", startIndex=" + this.f18310b + ", endIndex=" + this.f18311c + ", startLineIndex=" + this.f18312d + ", endLineIndex=" + this.f18313e + ", top=" + this.f18314f + ", bottom=" + this.f18315g + ')';
    }
}
