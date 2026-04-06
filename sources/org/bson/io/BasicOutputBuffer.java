package org.bson.io;

import java.io.OutputStream;

public class BasicOutputBuffer extends OutputBuffer {

    /* renamed from: A  reason: collision with root package name */
    public int f43903A;

    /* renamed from: z  reason: collision with root package name */
    public byte[] f43904z;

    public BasicOutputBuffer() {
        this(1024);
    }

    public int a(OutputStream outputStream) {
        l();
        outputStream.write(this.f43904z, 0, this.f43903A);
        return this.f43903A;
    }

    public void close() {
        this.f43904z = null;
    }

    public void d(int i2, int i3) {
        l();
        if (i2 < 0) {
            throw new IllegalArgumentException(String.format("position must be >= 0 but was %d", new Object[]{Integer.valueOf(i2)}));
        } else if (i2 <= this.f43903A - 1) {
            this.f43904z[i2] = (byte) (i3 & 255);
        } else {
            throw new IllegalArgumentException(String.format("position must be <= %d but was %d", new Object[]{Integer.valueOf(this.f43903A - 1), Integer.valueOf(i2)}));
        }
    }

    public void d0(byte[] bArr, int i2, int i3) {
        l();
        k(i3);
        System.arraycopy(bArr, i2, this.f43904z, this.f43903A, i3);
        this.f43903A += i3;
    }

    public int e() {
        l();
        return this.f43903A;
    }

    public int getPosition() {
        l();
        return this.f43903A;
    }

    public void i0(int i2) {
        l();
        if (i2 > this.f43903A || i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.f43903A = i2;
    }

    public final void k(int i2) {
        int i3 = this.f43903A;
        int i4 = i2 + i3;
        byte[] bArr = this.f43904z;
        if (i4 > bArr.length) {
            int length = bArr.length * 2;
            if (length < i4) {
                length = i4 + 128;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i3);
            this.f43904z = bArr2;
        }
    }

    public final void l() {
        if (this.f43904z == null) {
            throw new IllegalStateException("The output is closed");
        }
    }

    public byte[] m() {
        return this.f43904z;
    }

    public void write(byte[] bArr) {
        l();
        write(bArr, 0, bArr.length);
    }

    public void writeByte(int i2) {
        l();
        k(1);
        byte[] bArr = this.f43904z;
        int i3 = this.f43903A;
        this.f43903A = i3 + 1;
        bArr[i3] = (byte) (i2 & 255);
    }

    public BasicOutputBuffer(int i2) {
        this.f43904z = new byte[1024];
        this.f43904z = new byte[i2];
    }
}
