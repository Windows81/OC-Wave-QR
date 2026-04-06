package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class VectorPainter extends Painter {
    public static final int M = 8;
    public final MutableState F = SnapshotStateKt__SnapshotStateKt.e(Size.c(Size.f15876b.b()), (SnapshotMutationPolicy) null, 2, (Object) null);
    public final MutableState G = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    public final VectorComponent H;
    public final MutableIntState I;
    public float J;
    public ColorFilter K;
    public int L;

    public VectorPainter(GroupComponent groupComponent) {
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.o(new VectorPainter$vector$1$1(this));
        this.H = vectorComponent;
        this.I = SnapshotIntStateKt.a(0);
        this.J = 1.0f;
        this.L = -1;
    }

    public boolean a(float f2) {
        this.J = f2;
        return true;
    }

    public boolean b(ColorFilter colorFilter) {
        this.K = colorFilter;
        return true;
    }

    public long k() {
        return s();
    }

    public void m(DrawScope drawScope) {
        VectorComponent vectorComponent = this.H;
        ColorFilter colorFilter = this.K;
        if (colorFilter == null) {
            colorFilter = vectorComponent.k();
        }
        if (!q() || drawScope.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent.i(drawScope, this.J, colorFilter);
        } else {
            long T1 = drawScope.T1();
            DrawContext G1 = drawScope.G1();
            long c2 = G1.c();
            G1.j().o();
            try {
                G1.e().g(-1.0f, 1.0f, T1);
                vectorComponent.i(drawScope, this.J, colorFilter);
            } finally {
                G1.j().t();
                G1.f(c2);
            }
        }
        this.L = r();
    }

    public final boolean q() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    public final int r() {
        return this.I.e();
    }

    public final long s() {
        return ((Size) this.F.getValue()).m();
    }

    public final void t(boolean z2) {
        this.G.setValue(Boolean.valueOf(z2));
    }

    public final void u(ColorFilter colorFilter) {
        this.H.n(colorFilter);
    }

    public final void v(int i2) {
        this.I.k(i2);
    }

    public final void w(String str) {
        this.H.p(str);
    }

    public final void x(long j2) {
        this.F.setValue(Size.c(j2));
    }

    public final void y(long j2) {
        this.H.q(j2);
    }
}
