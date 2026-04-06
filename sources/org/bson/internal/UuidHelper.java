package org.bson.internal;

import java.util.UUID;
import org.bson.BSONException;
import org.bson.BsonBinarySubType;
import org.bson.BsonSerializationException;
import org.bson.UuidRepresentation;

public final class UuidHelper {

    /* renamed from: org.bson.internal.UuidHelper$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43902a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.bson.UuidRepresentation[] r0 = org.bson.UuidRepresentation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43902a = r0
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.C_SHARP_LEGACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43902a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.JAVA_LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43902a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.PYTHON_LEGACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43902a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.STANDARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.internal.UuidHelper.AnonymousClass1.<clinit>():void");
        }
    }

    public static UUID a(byte[] bArr, byte b2, UuidRepresentation uuidRepresentation) {
        if (bArr.length == 16) {
            if (b2 == BsonBinarySubType.UUID_LEGACY.d()) {
                int i2 = AnonymousClass1.f43902a[uuidRepresentation.ordinal()];
                if (i2 == 1) {
                    d(bArr, 0, 4);
                    d(bArr, 4, 2);
                    d(bArr, 6, 2);
                } else if (i2 == 2) {
                    d(bArr, 0, 8);
                    d(bArr, 8, 8);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new BSONException("Unexpected UUID representation: " + uuidRepresentation);
                    }
                    throw new BSONException("Can not decode a subtype 3 (UUID legacy) BSON binary when the decoder is configured to use the standard UUID representation");
                }
            }
            return new UUID(c(bArr, 0), c(bArr, 8));
        }
        throw new BsonSerializationException(String.format("Expected length to be 16, not %d.", new Object[]{Integer.valueOf(bArr.length)}));
    }

    public static byte[] b(UUID uuid, UuidRepresentation uuidRepresentation) {
        byte[] bArr = new byte[16];
        e(bArr, 0, uuid.getMostSignificantBits());
        e(bArr, 8, uuid.getLeastSignificantBits());
        int i2 = AnonymousClass1.f43902a[uuidRepresentation.ordinal()];
        if (i2 == 1) {
            d(bArr, 0, 4);
            d(bArr, 4, 2);
            d(bArr, 6, 2);
        } else if (i2 == 2) {
            d(bArr, 0, 8);
            d(bArr, 8, 8);
        } else if (!(i2 == 3 || i2 == 4)) {
            throw new BSONException("Unexpected UUID representation: " + uuidRepresentation);
        }
        return bArr;
    }

    public static long c(byte[] bArr, int i2) {
        return ((((long) bArr[i2]) & 255) << 56) | (((long) bArr[i2 + 7]) & 255) | ((((long) bArr[i2 + 6]) & 255) << 8) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2 + 2]) & 255) << 40) | ((((long) bArr[i2 + 1]) & 255) << 48);
    }

    public static void d(byte[] bArr, int i2, int i3) {
        for (int i4 = (i3 + i2) - 1; i2 < i4; i4--) {
            byte b2 = bArr[i2];
            bArr[i2] = bArr[i4];
            bArr[i4] = b2;
            i2++;
        }
    }

    public static void e(byte[] bArr, int i2, long j2) {
        bArr[i2 + 7] = (byte) ((int) (j2 & 255));
        bArr[i2 + 6] = (byte) ((int) ((j2 >> 8) & 255));
        bArr[i2 + 5] = (byte) ((int) ((j2 >> 16) & 255));
        bArr[i2 + 4] = (byte) ((int) ((j2 >> 24) & 255));
        bArr[i2 + 3] = (byte) ((int) ((j2 >> 32) & 255));
        bArr[i2 + 2] = (byte) ((int) ((j2 >> 40) & 255));
        bArr[i2 + 1] = (byte) ((int) ((j2 >> 48) & 255));
        bArr[i2] = (byte) ((int) ((j2 >> 56) & 255));
    }
}
