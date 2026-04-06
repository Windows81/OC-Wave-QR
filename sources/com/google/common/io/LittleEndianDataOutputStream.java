package com.google.common.io;

import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;

@ElementTypesAreNonnullByDefault
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public void close() {
        this.out.close();
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.out.write(bArr, i2, i3);
    }

    public void writeBoolean(boolean z2) {
        ((DataOutputStream) this.out).writeBoolean(z2);
    }

    public void writeByte(int i2) {
        ((DataOutputStream) this.out).writeByte(i2);
    }

    public void writeBytes(String str) {
        ((DataOutputStream) this.out).writeBytes(str);
    }

    public void writeChar(int i2) {
        writeShort(i2);
    }

    public void writeChars(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            writeChar(str.charAt(i2));
        }
    }

    public void writeDouble(double d2) {
        writeLong(Double.doubleToLongBits(d2));
    }

    public void writeFloat(float f2) {
        writeInt(Float.floatToIntBits(f2));
    }

    public void writeInt(int i2) {
        this.out.write(i2 & 255);
        this.out.write((i2 >> 8) & 255);
        this.out.write((i2 >> 16) & 255);
        this.out.write((i2 >> 24) & 255);
    }

    public void writeLong(long j2) {
        byte[] h2 = Longs.h(Long.reverseBytes(j2));
        write(h2, 0, h2.length);
    }

    public void writeShort(int i2) {
        this.out.write(i2 & 255);
        this.out.write((i2 >> 8) & 255);
    }

    public void writeUTF(String str) {
        ((DataOutputStream) this.out).writeUTF(str);
    }
}
