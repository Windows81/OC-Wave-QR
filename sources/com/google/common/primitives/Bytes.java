package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public final class Bytes {

    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29129A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29130B;

        /* renamed from: z  reason: collision with root package name */
        public final byte[] f29131z;

        public ByteArrayAsList(byte[] bArr, int i2, int i3) {
            this.f29131z = bArr;
            this.f29129A = i2;
            this.f29130B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Byte) && Bytes.d(this.f29131z, ((Byte) obj).byteValue(), this.f29129A, this.f29130B) != -1;
        }

        /* renamed from: e */
        public Byte get(int i2) {
            Preconditions.o(i2, size());
            return Byte.valueOf(this.f29131z[this.f29129A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29131z[this.f29129A + i2] != byteArrayAsList.f29131z[byteArrayAsList.f29129A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Byte set(int i2, Byte b2) {
            Preconditions.o(i2, size());
            byte[] bArr = this.f29131z;
            int i3 = this.f29129A;
            byte b3 = bArr[i3 + i2];
            bArr[i3 + i2] = ((Byte) Preconditions.q(b2)).byteValue();
            return Byte.valueOf(b3);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29129A; i3 < this.f29130B; i3++) {
                i2 = (i2 * 31) + Bytes.c(this.f29131z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Byte) || (a2 = Bytes.d(this.f29131z, ((Byte) obj).byteValue(), this.f29129A, this.f29130B)) < 0) {
                return -1;
            }
            return a2 - this.f29129A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Byte) || (b2 = Bytes.e(this.f29131z, ((Byte) obj).byteValue(), this.f29129A, this.f29130B)) < 0) {
                return -1;
            }
            return b2 - this.f29129A;
        }

        public int size() {
            return this.f29130B - this.f29129A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            byte[] bArr = this.f29131z;
            int i4 = this.f29129A;
            return new ByteArrayAsList(bArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f29131z[this.f29129A]);
            int i2 = this.f29129A;
            while (true) {
                i2++;
                if (i2 < this.f29130B) {
                    sb.append(", ");
                    sb.append(this.f29131z[i2]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static int c(byte b2) {
        return b2;
    }

    public static int d(byte[] bArr, byte b2, int i2, int i3) {
        while (i2 < i3) {
            if (bArr[i2] == b2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int e(byte[] bArr, byte b2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (bArr[i4] == b2) {
                return i4;
            }
        }
        return -1;
    }
}
