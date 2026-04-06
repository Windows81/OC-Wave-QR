package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SolidColor extends Brush {

    /* renamed from: c  reason: collision with root package name */
    public final long f16124c;

    public /* synthetic */ SolidColor(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public void a(long j2, Paint paint, float f2) {
        long j3;
        paint.d(1.0f);
        if (f2 == 1.0f) {
            j3 = this.f16124c;
        } else {
            long j4 = this.f16124c;
            j3 = Color.l(j4, Color.o(j4) * f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        }
        paint.I(j3);
        if (paint.z() != null) {
            paint.y((Shader) null);
        }
    }

    public final long c() {
        return this.f16124c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.n(this.f16124c, ((SolidColor) obj).f16124c);
    }

    public int hashCode() {
        return Color.t(this.f16124c);
    }

    public String toString() {
        return "SolidColor(value=" + Color.u(this.f16124c) + ')';
    }

    public SolidColor(long j2) {
        super((DefaultConstructorMarker) null);
        this.f16124c = j2;
    }
}
