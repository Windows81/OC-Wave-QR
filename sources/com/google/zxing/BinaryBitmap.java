package com.google.zxing;

import com.google.zxing.common.BitMatrix;

public final class BinaryBitmap {

    /* renamed from: a  reason: collision with root package name */
    public final Binarizer f32436a;

    /* renamed from: b  reason: collision with root package name */
    public BitMatrix f32437b;

    public BitMatrix a() {
        if (this.f32437b == null) {
            this.f32437b = this.f32436a.a();
        }
        return this.f32437b;
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
