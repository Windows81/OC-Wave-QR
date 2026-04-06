package com.google.zxing;

import com.google.zxing.common.BitMatrix;

public abstract class Binarizer {

    /* renamed from: a  reason: collision with root package name */
    public final LuminanceSource f32435a;

    public abstract BitMatrix a();

    public final LuminanceSource b() {
        return this.f32435a;
    }
}
