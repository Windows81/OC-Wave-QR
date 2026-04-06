package com.google.common.io;

import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;

@ElementTypesAreNonnullByDefault
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    public final byte a() {
        int read = this.in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    public byte readByte() {
        return (byte) readUnsignedByte();
    }

    public char readChar() {
        return (char) readUnsignedShort();
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr) {
        ByteStreams.c(this, bArr);
    }

    public int readInt() {
        byte a2 = a();
        byte a3 = a();
        return Ints.f(a(), a(), a3, a2);
    }

    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    public long readLong() {
        byte a2 = a();
        byte a3 = a();
        byte a4 = a();
        byte a5 = a();
        byte a6 = a();
        byte a7 = a();
        return Longs.d(a(), a(), a7, a6, a5, a4, a3, a2);
    }

    public short readShort() {
        return (short) readUnsignedShort();
    }

    public String readUTF() {
        return new DataInputStream(this.in).readUTF();
    }

    public int readUnsignedByte() {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public int readUnsignedShort() {
        return Ints.f((byte) 0, (byte) 0, a(), a());
    }

    public int skipBytes(int i2) {
        return (int) this.in.skip((long) i2);
    }

    public void readFully(byte[] bArr, int i2, int i3) {
        ByteStreams.d(this, bArr, i2, i3);
    }
}
