package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class n implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16270a;

    public /* synthetic */ n(TransferParameters transferParameters) {
        this.f16270a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.v(this.f16270a, d2);
    }
}
