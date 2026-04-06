package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Bullet implements AnnotatedString.Annotation {

    /* renamed from: a  reason: collision with root package name */
    public final Shape f18252a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18253b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18254c;

    /* renamed from: d  reason: collision with root package name */
    public final Brush f18255d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18256e;

    /* renamed from: f  reason: collision with root package name */
    public final DrawStyle f18257f;

    public /* synthetic */ Bullet(Shape shape, long j2, long j3, Brush brush, float f2, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j2, j3, brush, f2, drawStyle);
    }

    public final float a() {
        return this.f18256e;
    }

    public final Brush b() {
        return this.f18255d;
    }

    public final DrawStyle c() {
        return this.f18257f;
    }

    public final long d() {
        return this.f18254c;
    }

    public final Shape e() {
        return this.f18252a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Bullet)) {
            Bullet bullet = (Bullet) obj;
            return Intrinsics.d(this.f18252a, bullet.f18252a) && TextUnit.e(this.f18253b, bullet.f18253b) && TextUnit.e(this.f18254c, bullet.f18254c) && Intrinsics.d(this.f18255d, bullet.f18255d) && this.f18256e == bullet.f18256e && Intrinsics.d(this.f18257f, bullet.f18257f);
        }
        return false;
    }

    public final long f() {
        return this.f18253b;
    }

    public int hashCode() {
        int hashCode = ((((this.f18252a.hashCode() * 31) + TextUnit.i(this.f18253b)) * 31) + TextUnit.i(this.f18254c)) * 31;
        Brush brush = this.f18255d;
        return ((((hashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.f18256e)) * 31) + this.f18257f.hashCode();
    }

    public String toString() {
        return "Bullet(shape=" + this.f18252a + ", size=" + TextUnit.l(this.f18253b) + ", padding=" + TextUnit.l(this.f18254c) + ", brush=" + this.f18255d + ", alpha=" + this.f18256e + ", drawStyle=" + this.f18257f + ')';
    }

    public Bullet(Shape shape, long j2, long j3, Brush brush, float f2, DrawStyle drawStyle) {
        this.f18252a = shape;
        this.f18253b = j2;
        this.f18254c = j3;
        this.f18255d = brush;
        this.f18256e = f2;
        this.f18257f = drawStyle;
    }
}
