package com.google.firebase.encoders.proto;

import java.io.OutputStream;

final class LengthCountingOutputStream extends OutputStream {

    /* renamed from: z  reason: collision with root package name */
    public long f30723z = 0;

    public long a() {
        return this.f30723z;
    }

    public void write(int i2) {
        this.f30723z++;
    }

    public void write(byte[] bArr) {
        this.f30723z += (long) bArr.length;
    }

    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || (i4 = i2 + i3) > bArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f30723z += (long) i3;
    }
}
