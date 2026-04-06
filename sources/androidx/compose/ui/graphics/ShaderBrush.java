package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ShaderBrush extends Brush {

    /* renamed from: c  reason: collision with root package name */
    public Shader f16114c;

    /* renamed from: d  reason: collision with root package name */
    public long f16115d = Size.f15876b.a();

    public ShaderBrush() {
        super((DefaultConstructorMarker) null);
    }

    public final void a(long j2, Paint paint, float f2) {
        Shader shader = this.f16114c;
        if (shader == null || !Size.f(this.f16115d, j2)) {
            if (Size.k(j2)) {
                shader = null;
                this.f16114c = null;
                this.f16115d = Size.f15876b.a();
            } else {
                shader = c(j2);
                this.f16114c = shader;
                this.f16115d = j2;
            }
        }
        long g2 = paint.g();
        Color.Companion companion = Color.f15975b;
        if (!Color.n(g2, companion.a())) {
            paint.I(companion.a());
        }
        if (!Intrinsics.d(paint.z(), shader)) {
            paint.y(shader);
        }
        if (paint.c() != f2) {
            paint.d(f2);
        }
    }

    public abstract Shader c(long j2);
}
