package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class o implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16271a;

    public /* synthetic */ o(TransferParameters transferParameters) {
        this.f16271a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.w(this.f16271a, d2);
    }
}
