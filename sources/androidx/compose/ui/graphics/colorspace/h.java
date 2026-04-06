package androidx.compose.ui.graphics.colorspace;

public final /* synthetic */ class h implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rgb f16265a;

    public /* synthetic */ h(Rgb rgb) {
        this.f16265a = rgb;
    }

    public final double a(double d2) {
        return Rgb.y(this.f16265a, d2);
    }
}
