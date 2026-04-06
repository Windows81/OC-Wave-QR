package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class s implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16275a;

    public /* synthetic */ s(TransferParameters transferParameters) {
        this.f16275a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.B(this.f16275a, d2);
    }
}
