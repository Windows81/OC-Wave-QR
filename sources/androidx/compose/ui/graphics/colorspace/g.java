package androidx.compose.ui.graphics.colorspace;

public final /* synthetic */ class g implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rgb f16264a;

    public /* synthetic */ g(Rgb rgb) {
        this.f16264a = rgb;
    }

    public final double a(double d2) {
        return Rgb.K(this.f16264a, d2);
    }
}
