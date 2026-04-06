package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import java.util.Map;

public interface Writer {
    BitMatrix a(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map map);
}
