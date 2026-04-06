package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ElementTypesAreNonnullByDefault
public final class ByteStreams {

    /* renamed from: a  reason: collision with root package name */
    public static final OutputStream f28985a = new OutputStream() {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i2) {
        }

        public void write(byte[] bArr) {
            Preconditions.q(bArr);
        }

        public void write(byte[] bArr, int i2, int i3) {
            Preconditions.q(bArr);
            Preconditions.v(i2, i3 + i2, bArr.length);
        }
    };

    public static InputStream a(InputStream inputStream, long j2) {
        return new LimitedInputStream(inputStream, j2);
    }

    public static int b(InputStream inputStream, byte[] bArr, int i2, int i3) {
        Preconditions.q(inputStream);
        Preconditions.q(bArr);
        if (i3 >= 0) {
            Preconditions.v(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (i4 < i3) {
                int read = inputStream.read(bArr, i2 + i4, i3 - i4);
                if (read == -1) {
                    break;
                }
                i4 += read;
            }
            return i4;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", new Object[]{Integer.valueOf(i3)}));
    }

    public static void c(InputStream inputStream, byte[] bArr) {
        d(inputStream, bArr, 0, bArr.length);
    }

    public static void d(InputStream inputStream, byte[] bArr, int i2, int i3) {
        int b2 = b(inputStream, bArr, i2, i3);
        if (b2 != i3) {
            StringBuilder sb = new StringBuilder(81);
            sb.append("reached end of stream after reading ");
            sb.append(b2);
            sb.append(" bytes; ");
            sb.append(i3);
            sb.append(" bytes expected");
            throw new EOFException(sb.toString());
        }
    }

    public static long e(InputStream inputStream, long j2) {
        int available = inputStream.available();
        if (available == 0) {
            return 0;
        }
        return inputStream.skip(Math.min((long) available, j2));
    }

    public static long f(InputStream inputStream, long j2) {
        byte[] bArr = null;
        long j3 = 0;
        while (j3 < j2) {
            long j4 = j2 - j3;
            long e2 = e(inputStream, j4);
            if (e2 == 0) {
                int min = (int) Math.min(j4, 8192);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                e2 = (long) inputStream.read(bArr, 0, min);
                if (e2 == -1) {
                    break;
                }
            }
            j3 += e2;
        }
        return j3;
    }

    public static class ByteArrayDataInputStream implements ByteArrayDataInput {

        /* renamed from: z  reason: collision with root package name */
        public final DataInput f28986z;

        public boolean readBoolean() {
            try {
                return this.f28986z.readBoolean();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public byte readByte() {
            try {
                return this.f28986z.readByte();
            } catch (EOFException e2) {
                throw new IllegalStateException(e2);
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }

        public char readChar() {
            try {
                return this.f28986z.readChar();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public double readDouble() {
            try {
                return this.f28986z.readDouble();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public float readFloat() {
            try {
                return this.f28986z.readFloat();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public void readFully(byte[] bArr) {
            try {
                this.f28986z.readFully(bArr);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public int readInt() {
            try {
                return this.f28986z.readInt();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public String readLine() {
            try {
                return this.f28986z.readLine();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public long readLong() {
            try {
                return this.f28986z.readLong();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public short readShort() {
            try {
                return this.f28986z.readShort();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public String readUTF() {
            try {
                return this.f28986z.readUTF();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public int readUnsignedByte() {
            try {
                return this.f28986z.readUnsignedByte();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public int readUnsignedShort() {
            try {
                return this.f28986z.readUnsignedShort();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public int skipBytes(int i2) {
            try {
                return this.f28986z.skipBytes(i2);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public void readFully(byte[] bArr, int i2, int i3) {
            try {
                this.f28986z.readFully(bArr, i2, i3);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {

        /* renamed from: z  reason: collision with root package name */
        public final DataOutput f28987z;

        public void write(int i2) {
            try {
                this.f28987z.write(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeBoolean(boolean z2) {
            try {
                this.f28987z.writeBoolean(z2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeByte(int i2) {
            try {
                this.f28987z.writeByte(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeBytes(String str) {
            try {
                this.f28987z.writeBytes(str);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeChar(int i2) {
            try {
                this.f28987z.writeChar(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeChars(String str) {
            try {
                this.f28987z.writeChars(str);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeDouble(double d2) {
            try {
                this.f28987z.writeDouble(d2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeFloat(float f2) {
            try {
                this.f28987z.writeFloat(f2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeInt(int i2) {
            try {
                this.f28987z.writeInt(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeLong(long j2) {
            try {
                this.f28987z.writeLong(j2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeShort(int i2) {
            try {
                this.f28987z.writeShort(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void writeUTF(String str) {
            try {
                this.f28987z.writeUTF(str);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void write(byte[] bArr) {
            try {
                this.f28987z.write(bArr);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public void write(byte[] bArr, int i2, int i3) {
            try {
                this.f28987z.write(bArr, i2, i3);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static final class LimitedInputStream extends FilterInputStream {

        /* renamed from: A  reason: collision with root package name */
        public long f28988A = -1;

        /* renamed from: z  reason: collision with root package name */
        public long f28989z;

        public LimitedInputStream(InputStream inputStream, long j2) {
            super(inputStream);
            Preconditions.q(inputStream);
            Preconditions.e(j2 >= 0, "limit must be non-negative");
            this.f28989z = j2;
        }

        public int available() {
            return (int) Math.min((long) this.in.available(), this.f28989z);
        }

        public synchronized void mark(int i2) {
            this.in.mark(i2);
            this.f28988A = this.f28989z;
        }

        public int read() {
            if (this.f28989z == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f28989z--;
            }
            return read;
        }

        public synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f28988A != -1) {
                this.in.reset();
                this.f28989z = this.f28988A;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j2) {
            long skip = this.in.skip(Math.min(j2, this.f28989z));
            this.f28989z -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i2, int i3) {
            long j2 = this.f28989z;
            if (j2 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i2, (int) Math.min((long) i3, j2));
            if (read != -1) {
                this.f28989z -= (long) read;
            }
            return read;
        }
    }
}
