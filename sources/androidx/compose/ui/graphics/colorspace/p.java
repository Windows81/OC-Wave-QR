package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class p implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16272a;

    public /* synthetic */ p(TransferParameters transferParameters) {
        this.f16272a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.y(this.f16272a, d2);
    }
}
