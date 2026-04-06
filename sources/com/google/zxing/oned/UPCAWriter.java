package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

public final class UPCAWriter implements Writer {

    /* renamed from: a  reason: collision with root package name */
    public final EAN13Writer f32726a = new EAN13Writer();

    public BitMatrix a(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map map) {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f32726a.a("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
