package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class q implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16273a;

    public /* synthetic */ q(TransferParameters transferParameters) {
        this.f16273a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.z(this.f16273a, d2);
    }
}
