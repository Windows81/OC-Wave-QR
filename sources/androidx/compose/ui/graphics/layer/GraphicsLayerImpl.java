package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public interface GraphicsLayerImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f16343a = Companion.f16344a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f16344a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final Function1 f16345b = GraphicsLayerImpl$Companion$DefaultDrawBlock$1.f16346z;

        public final Function1 a() {
            return f16345b;
        }
    }

    void A(long j2);

    float B();

    long C();

    long D();

    void E(int i2);

    Matrix F();

    boolean G() {
        return false;
    }

    float H();

    void I(Canvas canvas);

    float K();

    void L(long j2);

    float O();

    float Q();

    void R(boolean z2);

    float S();

    void T(long j2);

    float Y();

    float c();

    void d(float f2);

    void e(float f2);

    ColorFilter f();

    void g(float f2);

    void h(float f2);

    void i(float f2);

    void j(float f2);

    void k(RenderEffect renderEffect);

    void l(float f2);

    void m(float f2);

    void n(float f2);

    float o();

    void p(float f2);

    void q();

    boolean r() {
        return true;
    }

    int s();

    void t(boolean z2);

    RenderEffect u();

    void v(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1);

    void w(Outline outline, long j2);

    int x();

    void y(int i2, int i3, long j2);

    float z();
}
