package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class r implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16274a;

    public /* synthetic */ r(TransferParameters transferParameters) {
        this.f16274a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.A(this.f16274a, d2);
    }
}
