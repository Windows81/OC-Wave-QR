package org.bson.codecs;

import java.math.BigDecimal;
import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.types.Decimal128;

final class NumberCodecHelper {

    /* renamed from: org.bson.codecs.NumberCodecHelper$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43747a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43747a = r0
                org.bson.BsonType r1 = org.bson.BsonType.INT32     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43747a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonType r1 = org.bson.BsonType.INT64     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43747a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonType r1 = org.bson.BsonType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43747a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.codecs.NumberCodecHelper.AnonymousClass1.<clinit>():void");
        }
    }

    public static double a(BsonReader bsonReader) {
        BsonType C1 = bsonReader.C1();
        int i2 = AnonymousClass1.f43747a[C1.ordinal()];
        if (i2 == 1) {
            return (double) bsonReader.i();
        }
        Class<Double> cls = Double.class;
        if (i2 == 2) {
            long n2 = bsonReader.n();
            double d2 = (double) n2;
            if (n2 == ((long) d2)) {
                return d2;
            }
            throw d(cls, Long.valueOf(n2));
        } else if (i2 == 3) {
            return bsonReader.readDouble();
        } else {
            if (i2 == 4) {
                Decimal128 K = bsonReader.K();
                try {
                    double doubleValue = K.doubleValue();
                    if (K.equals(new Decimal128(new BigDecimal(doubleValue)))) {
                        return doubleValue;
                    }
                    throw d(cls, K);
                } catch (NumberFormatException unused) {
                    throw d(cls, K);
                }
            } else {
                throw new BsonInvalidOperationException(String.format("Invalid numeric type, found: %s", new Object[]{C1}));
            }
        }
    }

    public static int b(BsonReader bsonReader) {
        int i2;
        BsonType C1 = bsonReader.C1();
        int i3 = AnonymousClass1.f43747a[C1.ordinal()];
        if (i3 == 1) {
            return bsonReader.i();
        }
        Class<Integer> cls = Integer.class;
        if (i3 == 2) {
            long n2 = bsonReader.n();
            i2 = (int) n2;
            if (n2 != ((long) i2)) {
                throw d(cls, Long.valueOf(n2));
            }
        } else if (i3 == 3) {
            double readDouble = bsonReader.readDouble();
            i2 = (int) readDouble;
            if (readDouble != ((double) i2)) {
                throw d(cls, Double.valueOf(readDouble));
            }
        } else if (i3 == 4) {
            Decimal128 K = bsonReader.K();
            int intValue = K.intValue();
            if (K.equals(new Decimal128((long) intValue))) {
                return intValue;
            }
            throw d(cls, K);
        } else {
            throw new BsonInvalidOperationException(String.format("Invalid numeric type, found: %s", new Object[]{C1}));
        }
        return i2;
    }

    public static long c(BsonReader bsonReader) {
        BsonType C1 = bsonReader.C1();
        int i2 = AnonymousClass1.f43747a[C1.ordinal()];
        if (i2 == 1) {
            return (long) bsonReader.i();
        }
        if (i2 == 2) {
            return bsonReader.n();
        }
        Class<Long> cls = Long.class;
        if (i2 == 3) {
            double readDouble = bsonReader.readDouble();
            long j2 = (long) readDouble;
            if (readDouble == ((double) j2)) {
                return j2;
            }
            throw d(cls, Double.valueOf(readDouble));
        } else if (i2 == 4) {
            Decimal128 K = bsonReader.K();
            long longValue = K.longValue();
            if (K.equals(new Decimal128(longValue))) {
                return longValue;
            }
            throw d(cls, K);
        } else {
            throw new BsonInvalidOperationException(String.format("Invalid numeric type, found: %s", new Object[]{C1}));
        }
    }

    public static BsonInvalidOperationException d(Class cls, Number number) {
        return new BsonInvalidOperationException(String.format("Could not convert `%s` to a %s without losing precision", new Object[]{number, cls}));
    }
}
