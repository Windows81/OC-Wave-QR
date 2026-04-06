package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

public final /* synthetic */ class l implements DoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransferParameters f16268a;

    public /* synthetic */ l(TransferParameters transferParameters) {
        this.f16268a = transferParameters;
    }

    public final double a(double d2) {
        return Rgb.Companion.t(this.f16268a, d2);
    }
}
