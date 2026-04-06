package coil.compose;

import android.os.SystemClock;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class CrossfadePainter extends Painter {
    public Painter F;
    public final Painter G;
    public final ContentScale H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final MutableIntState L = SnapshotIntStateKt.a(0);
    public long M = -1;
    public boolean N;
    public final MutableFloatState O = PrimitiveSnapshotStateKt.a(1.0f);
    public final MutableState P = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    public CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, int i2, boolean z2, boolean z3) {
        this.F = painter;
        this.G = painter2;
        this.H = contentScale;
        this.I = i2;
        this.J = z2;
        this.K = z3;
    }

    private final ColorFilter q() {
        return (ColorFilter) this.P.getValue();
    }

    private final void t(ColorFilter colorFilter) {
        this.P.setValue(colorFilter);
    }

    public boolean a(float f2) {
        v(f2);
        return true;
    }

    public boolean b(ColorFilter colorFilter) {
        t(colorFilter);
        return true;
    }

    public long k() {
        return o();
    }

    public void m(DrawScope drawScope) {
        if (this.N) {
            p(drawScope, this.G, s());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.M == -1) {
            this.M = uptimeMillis;
        }
        float f2 = ((float) (uptimeMillis - this.M)) / ((float) this.I);
        float n2 = RangesKt.n(f2, 0.0f, 1.0f) * s();
        float s2 = this.J ? s() - n2 : s();
        this.N = f2 >= 1.0f;
        p(drawScope, this.F, s2);
        p(drawScope, this.G, n2);
        if (this.N) {
            this.F = null;
        } else {
            u(r() + 1);
        }
    }

    public final long n(long j2, long j3) {
        Size.Companion companion = Size.f15876b;
        return (j2 != companion.a() && !Size.k(j2) && j3 != companion.a() && !Size.k(j3)) ? ScaleFactorKt.a(j2, this.H.a(j2, j3)) : j3;
    }

    public final long o() {
        Painter painter = this.F;
        long k2 = painter != null ? painter.k() : Size.f15876b.b();
        Painter painter2 = this.G;
        long k3 = painter2 != null ? painter2.k() : Size.f15876b.b();
        Size.Companion companion = Size.f15876b;
        boolean z2 = false;
        boolean z3 = k2 != companion.a();
        if (k3 != companion.a()) {
            z2 = true;
        }
        if (z3 && z2) {
            return SizeKt.a(Math.max(Size.i(k2), Size.i(k3)), Math.max(Size.g(k2), Size.g(k3)));
        }
        if (this.K) {
            if (z3) {
                return k2;
            }
            if (z2) {
                return k3;
            }
        }
        return companion.a();
    }

    public final void p(DrawScope drawScope, Painter painter, float f2) {
        if (painter != null && f2 > 0.0f) {
            long c2 = drawScope.c();
            long n2 = n(painter.k(), c2);
            if (c2 != Size.f15876b.a() && !Size.k(c2)) {
                float f3 = (float) 2;
                float i2 = (Size.i(c2) - Size.i(n2)) / f3;
                float g2 = (Size.g(c2) - Size.g(n2)) / f3;
                drawScope.G1().e().h(i2, g2, i2, g2);
                painter.j(drawScope, n2, f2, q());
                float f4 = -i2;
                float f5 = -g2;
                drawScope.G1().e().h(f4, f5, f4, f5);
                return;
            }
            painter.j(drawScope, n2, f2, q());
        }
    }

    public final int r() {
        return this.L.e();
    }

    public final float s() {
        return this.O.c();
    }

    public final void u(int i2) {
        this.L.k(i2);
    }

    public final void v(float f2) {
        this.O.j(f2);
    }
}
