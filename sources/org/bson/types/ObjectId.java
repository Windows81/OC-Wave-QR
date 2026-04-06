package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import org.bson.assertions.Assertions;

public final class ObjectId implements Comparable<ObjectId>, Serializable {
    public static final int D;
    public static final short E;
    public static final AtomicInteger F = new AtomicInteger(new SecureRandom().nextInt());
    public static final char[] G = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: A  reason: collision with root package name */
    public final int f44040A;

    /* renamed from: B  reason: collision with root package name */
    public final int f44041B;
    public final short C;

    /* renamed from: z  reason: collision with root package name */
    public final int f44042z;

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            D = secureRandom.nextInt(16777216);
            E = (short) secureRandom.nextInt(32768);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    public static int f(Date date) {
        return (int) (date.getTime() / 1000);
    }

    public static byte h(int i2) {
        return (byte) i2;
    }

    public static byte j(int i2) {
        return (byte) (i2 >> 8);
    }

    public static byte k(int i2) {
        return (byte) (i2 >> 16);
    }

    public static byte l(int i2) {
        return (byte) (i2 >> 24);
    }

    public static boolean m(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 24) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] n(int i2, int i3, int i4) {
        return new byte[]{l(i2), k(i2), j(i2), h(i2), l(i3), k(i3), j(i3), h(i3), l(i4), k(i4), j(i4), h(i4)};
    }

    public static int o(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static short p(byte b2, byte b3) {
        return (short) (((b2 & 255) << 8) | (b3 & 255));
    }

    public static byte[] r(String str) {
        if (m(str)) {
            byte[] bArr = new byte[12];
            for (int i2 = 0; i2 < 12; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) Integer.parseInt(str.substring(i3, i3 + 2), 16);
            }
            return bArr;
        }
        throw new IllegalArgumentException("invalid hexadecimal representation of an ObjectId: [" + str + "]");
    }

    public static byte x(short s2) {
        return (byte) s2;
    }

    public static byte y(short s2) {
        return (byte) (s2 >> 8);
    }

    public String A() {
        char[] cArr = new char[24];
        int i2 = 0;
        for (byte b2 : z()) {
            int i3 = i2 + 1;
            char[] cArr2 = G;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public int compareTo(ObjectId objectId) {
        objectId.getClass();
        byte[] z2 = z();
        byte[] z3 = objectId.z();
        for (int i2 = 0; i2 < 12; i2++) {
            byte b2 = z2[i2];
            byte b3 = z3[i2];
            if (b2 != b3) {
                return (b2 & 255) < (b3 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        return this.f44040A == objectId.f44040A && this.f44042z == objectId.f44042z && this.f44041B == objectId.f44041B && this.C == objectId.C;
    }

    public int hashCode() {
        return (((((this.f44042z * 31) + this.f44040A) * 31) + this.f44041B) * 31) + this.C;
    }

    public void t(ByteBuffer byteBuffer) {
        Assertions.d("buffer", byteBuffer);
        Assertions.c("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        byteBuffer.put(l(this.f44042z));
        byteBuffer.put(k(this.f44042z));
        byteBuffer.put(j(this.f44042z));
        byteBuffer.put(h(this.f44042z));
        byteBuffer.put(k(this.f44041B));
        byteBuffer.put(j(this.f44041B));
        byteBuffer.put(h(this.f44041B));
        byteBuffer.put(y(this.C));
        byteBuffer.put(x(this.C));
        byteBuffer.put(k(this.f44040A));
        byteBuffer.put(j(this.f44040A));
        byteBuffer.put(h(this.f44040A));
    }

    public String toString() {
        return A();
    }

    public byte[] z() {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        t(allocate);
        return allocate.array();
    }

    public ObjectId(Date date) {
        this(f(date), F.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i2) {
        this(f(date), i2, true);
    }

    @Deprecated
    public ObjectId(Date date, int i2, short s2, int i3) {
        this(f(date), i2, s2, i3);
    }

    @Deprecated
    public ObjectId(int i2, int i3, short s2, int i4) {
        this(i2, i3, s2, i4, true);
    }

    public ObjectId(int i2, int i3) {
        this(i2, i3, true);
    }

    private ObjectId(int i2, int i3, boolean z2) {
        this(i2, D, E, i3, z2);
    }

    private ObjectId(int i2, int i3, short s2, int i4, boolean z2) {
        if ((i3 & -16777216) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        } else if (!z2 || (i4 & -16777216) == 0) {
            this.f44042z = i2;
            this.f44040A = 16777215 & i4;
            this.f44041B = i3;
            this.C = s2;
        } else {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
    }

    public ObjectId(String str) {
        this(r(str));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap((byte[]) Assertions.b("bytes has length of 12", bArr, ((byte[]) Assertions.d("bytes", bArr)).length == 12)));
    }

    public ObjectId(int i2, int i3, int i4) {
        this(n(i2, i3, i4));
    }

    public ObjectId(ByteBuffer byteBuffer) {
        Assertions.d("buffer", byteBuffer);
        Assertions.c("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.f44042z = o(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.f44041B = o((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.C = p(byteBuffer.get(), byteBuffer.get());
        this.f44040A = o((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }
}
