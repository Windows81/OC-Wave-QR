package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public interface DeviceRenderNode {
    void A(float f2);

    void B(float f2);

    void C(int i2);

    void D(Outline outline);

    int E();

    void F(int i2);

    boolean G();

    void H(boolean z2);

    void I(CanvasHolder canvasHolder, Path path, Function1 function1);

    boolean J(boolean z2);

    void K(int i2);

    void L(Matrix matrix);

    float M();

    int a();

    int b();

    float c();

    void d(float f2);

    void e(float f2);

    void g(float f2);

    void h(float f2);

    void i(float f2);

    void j(float f2);

    void k(RenderEffect renderEffect);

    void l(float f2);

    void m(float f2);

    void n(float f2);

    int o();

    boolean p();

    void q();

    boolean r();

    int s();

    void t(int i2);

    int u();

    void v(Canvas canvas);

    void w(float f2);

    void x(boolean z2);

    void y(int i2);

    boolean z(int i2, int i3, int i4, int i5);
}
