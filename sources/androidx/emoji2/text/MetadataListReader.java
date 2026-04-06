package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class MetadataListReader {

    public static class ByteBufferReader implements OpenTypeReader {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f21331a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f21331a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public void B(int i2) {
            ByteBuffer byteBuffer = this.f21331a;
            byteBuffer.position(byteBuffer.position() + i2);
        }

        public int C() {
            return this.f21331a.getInt();
        }

        public long D() {
            return MetadataListReader.c(this.f21331a.getInt());
        }

        public long getPosition() {
            return (long) this.f21331a.position();
        }

        public int readUnsignedShort() {
            return MetadataListReader.d(this.f21331a.getShort());
        }
    }

    public static class InputStreamOpenTypeReader implements OpenTypeReader {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21332a;

        /* renamed from: b  reason: collision with root package name */
        public final ByteBuffer f21333b;

        /* renamed from: c  reason: collision with root package name */
        public final InputStream f21334c;

        /* renamed from: d  reason: collision with root package name */
        public long f21335d;

        public void B(int i2) {
            while (i2 > 0) {
                int skip = (int) this.f21334c.skip((long) i2);
                if (skip >= 1) {
                    i2 -= skip;
                    this.f21335d += (long) skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }

        public int C() {
            this.f21333b.position(0);
            a(4);
            return this.f21333b.getInt();
        }

        public long D() {
            this.f21333b.position(0);
            a(4);
            return MetadataListReader.c(this.f21333b.getInt());
        }

        public final void a(int i2) {
            if (this.f21334c.read(this.f21332a, 0, i2) == i2) {
                this.f21335d += (long) i2;
                return;
            }
            throw new IOException("read failed");
        }

        public long getPosition() {
            return this.f21335d;
        }

        public int readUnsignedShort() {
            this.f21333b.position(0);
            a(2);
            return MetadataListReader.d(this.f21333b.getShort());
        }
    }

    public static class OffsetInfo {

        /* renamed from: a  reason: collision with root package name */
        public final long f21336a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21337b;

        public OffsetInfo(long j2, long j3) {
            this.f21336a = j2;
            this.f21337b = j3;
        }

        public long a() {
            return this.f21336a;
        }
    }

    public interface OpenTypeReader {
        void B(int i2);

        int C();

        long D();

        long getPosition();

        int readUnsignedShort();
    }

    public static OffsetInfo a(OpenTypeReader openTypeReader) {
        long j2;
        openTypeReader.B(4);
        int readUnsignedShort = openTypeReader.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            openTypeReader.B(6);
            int i2 = 0;
            while (true) {
                if (i2 >= readUnsignedShort) {
                    j2 = -1;
                    break;
                }
                int C = openTypeReader.C();
                openTypeReader.B(4);
                j2 = openTypeReader.D();
                openTypeReader.B(4);
                if (1835365473 == C) {
                    break;
                }
                i2++;
            }
            if (j2 != -1) {
                openTypeReader.B((int) (j2 - openTypeReader.getPosition()));
                openTypeReader.B(12);
                long D = openTypeReader.D();
                for (int i3 = 0; ((long) i3) < D; i3++) {
                    int C2 = openTypeReader.C();
                    long D2 = openTypeReader.D();
                    long D3 = openTypeReader.D();
                    if (1164798569 == C2 || 1701669481 == C2) {
                        return new OffsetInfo(D2 + j2, D3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static MetadataList b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new ByteBufferReader(duplicate)).a());
        return MetadataList.i(duplicate);
    }

    public static long c(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static int d(short s2) {
        return s2 & 65535;
    }
}
