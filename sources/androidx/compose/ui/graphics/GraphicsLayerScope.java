package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@PlacementScopeMarker
@Metadata
public interface GraphicsLayerScope extends Density {

    @Metadata
    public static final class DefaultImpls {
    }

    float B();

    float K();

    void L(long j2) {
    }

    long N1();

    float O();

    float Q();

    void Q1(long j2);

    void R(boolean z2);

    float S();

    void T(long j2) {
    }

    float Y();

    long c() {
        return Size.f15876b.a();
    }

    void d(float f2);

    void e(float f2);

    void g(float f2);

    void h(float f2);

    void i(float f2);

    void j(float f2);

    void k(RenderEffect renderEffect) {
    }

    void l(float f2);

    void m(float f2);

    void n(float f2);

    float o();

    void p(float f2);

    void s1(Shape shape);

    void y(int i2) {
    }

    float z();
}
