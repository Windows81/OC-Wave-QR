package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class m implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16269a;

    public /* synthetic */ m(TransferParameters transferParameters) {
        this.f16269a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.u(this.f16269a, d2);
    }
}
