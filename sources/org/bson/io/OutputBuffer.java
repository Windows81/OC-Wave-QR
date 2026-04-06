package org.bson.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bson.BsonSerializationException;

public abstract class OutputBuffer extends OutputStream implements BsonOutput {
    public void F0(String str) {
        f(str, true);
    }

    public abstract int a(OutputStream outputStream);

    public int b() {
        return e();
    }

    public byte[] c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(b());
            a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException("should be impossible", e2);
        }
    }

    public void close() {
    }

    public abstract void d(int i2, int i3);

    public final int f(String str, boolean z2) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(str, i2);
            if (!z2 || codePointAt != 0) {
                if (codePointAt < 128) {
                    write((int) (byte) codePointAt);
                    i3++;
                } else if (codePointAt < 2048) {
                    write((int) (byte) ((codePointAt >> 6) + 192));
                    write((int) (byte) ((codePointAt & 63) + 128));
                    i3 += 2;
                } else if (codePointAt < 65536) {
                    write((int) (byte) ((codePointAt >> 12) + 224));
                    write((int) (byte) (((codePointAt >> 6) & 63) + 128));
                    write((int) (byte) ((codePointAt & 63) + 128));
                    i3 += 3;
                } else {
                    write((int) (byte) ((codePointAt >> 18) + 240));
                    write((int) (byte) (((codePointAt >> 12) & 63) + 128));
                    write((int) (byte) (((codePointAt >> 6) & 63) + 128));
                    write((int) (byte) ((codePointAt & 63) + 128));
                    i3 += 4;
                }
                i2 += Character.charCount(codePointAt);
            } else {
                throw new BsonSerializationException(String.format("BSON cstring '%s' is not valid because it contains a null character at index %d", new Object[]{str, Integer.valueOf(i2)}));
            }
        }
        write(0);
        return i3 + 1;
    }

    public void g(int i2) {
        q(i2);
    }

    public void j(long j2) {
        z(j2);
    }

    public void o(int i2, int i3) {
        d(i2, i3);
        d(i2 + 1, i3 >> 8);
        d(i2 + 2, i3 >> 16);
        d(i2 + 3, i3 >> 24);
    }

    public void p(String str) {
        g(0);
        int f2 = f(str, false);
        o((getPosition() - f2) - 4, f2);
    }

    public void q(int i2) {
        write(i2);
        write(i2 >> 8);
        write(i2 >> 16);
        write(i2 >> 24);
    }

    public String toString() {
        return getClass().getName() + " size: " + b() + " pos: " + getPosition();
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void writeBytes(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    public void writeDouble(double d2) {
        j(Double.doubleToRawLongBits(d2));
    }

    public void z(long j2) {
        write((int) (byte) ((int) (j2 & 255)));
        write((int) (byte) ((int) ((j2 >> 8) & 255)));
        write((int) (byte) ((int) ((j2 >> 16) & 255)));
        write((int) (byte) ((int) ((j2 >> 24) & 255)));
        write((int) (byte) ((int) ((j2 >> 32) & 255)));
        write((int) (byte) ((int) ((j2 >> 40) & 255)));
        write((int) (byte) ((int) ((j2 >> 48) & 255)));
        write((int) (byte) ((int) ((j2 >> 56) & 255)));
    }

    public void write(byte[] bArr, int i2, int i3) {
        d0(bArr, i2, i3);
    }

    public void write(int i2) {
        writeByte(i2);
    }
}
