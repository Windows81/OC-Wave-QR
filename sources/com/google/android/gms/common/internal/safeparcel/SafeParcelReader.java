package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static double A(Parcel parcel, int i2) {
        P(parcel, i2, 8);
        return parcel.readDouble();
    }

    public static Double B(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        if (L == 0) {
            return null;
        }
        O(parcel, i2, L, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float C(Parcel parcel, int i2) {
        P(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static Float D(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        if (L == 0) {
            return null;
        }
        O(parcel, i2, L, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int E(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder F(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + L);
        return readStrongBinder;
    }

    public static int G(Parcel parcel, int i2) {
        P(parcel, i2, 4);
        return parcel.readInt();
    }

    public static Integer H(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        if (L == 0) {
            return null;
        }
        O(parcel, i2, L, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void I(Parcel parcel, int i2, List list, ClassLoader classLoader) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + L);
        }
    }

    public static long J(Parcel parcel, int i2) {
        P(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Long K(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        if (L == 0) {
            return null;
        }
        O(parcel, i2, L, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int L(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void M(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + L(parcel, i2));
    }

    public static int N(Parcel parcel) {
        int E = E(parcel);
        int L = L(parcel, E);
        int w2 = w(E);
        int dataPosition = parcel.dataPosition();
        if (w2 == 20293) {
            int i2 = L + dataPosition;
            if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
                return i2;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i2, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(E))), parcel);
    }

    public static void O(Parcel parcel, int i2, int i3, int i4) {
        if (i3 != i4) {
            String hexString = Integer.toHexString(i3);
            throw new ParseException("Expected size " + i4 + " got " + i3 + " (0x" + hexString + ")", parcel);
        }
    }

    public static void P(Parcel parcel, int i2, int i3) {
        int L = L(parcel, i2);
        if (L != i3) {
            String hexString = Integer.toHexString(L);
            throw new ParseException("Expected size " + i3 + " got " + L + " (0x" + hexString + ")", parcel);
        }
    }

    public static BigDecimal a(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + L);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigDecimal[] b(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i3] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + L);
        return bigDecimalArr;
    }

    public static BigInteger c(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + L);
        return new BigInteger(createByteArray);
    }

    public static BigInteger[] d(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + L);
        return bigIntegerArr;
    }

    public static boolean[] e(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + L);
        return createBooleanArray;
    }

    public static Bundle f(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + L);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + L);
        return createByteArray;
    }

    public static byte[][] h(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i3 = 0; i3 < readInt; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + L);
        return bArr;
    }

    public static double[] i(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + L);
        return createDoubleArray;
    }

    public static float[] j(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + L);
        return createFloatArray;
    }

    public static int[] k(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + L);
        return createIntArray;
    }

    public static ArrayList l(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + L);
        return arrayList;
    }

    public static long[] m(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + L);
        return createLongArray;
    }

    public static Parcel n(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, L);
        parcel.setDataPosition(dataPosition + L);
        return obtain;
    }

    public static Parcel[] o(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i3] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i3] = null;
            }
        }
        parcel.setDataPosition(dataPosition + L);
        return parcelArr;
    }

    public static Parcelable p(Parcel parcel, int i2, Parcelable.Creator creator) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + L);
        return parcelable;
    }

    public static String q(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + L);
        return readString;
    }

    public static String[] r(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + L);
        return createStringArray;
    }

    public static ArrayList s(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + L);
        return createStringArrayList;
    }

    public static Object[] t(Parcel parcel, int i2, Parcelable.Creator creator) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + L);
        return createTypedArray;
    }

    public static ArrayList u(Parcel parcel, int i2, Parcelable.Creator creator) {
        int L = L(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (L == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + L);
        return createTypedArrayList;
    }

    public static void v(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new ParseException("Overread allowed size end=" + i2, parcel);
        }
    }

    public static int w(int i2) {
        return (char) i2;
    }

    public static boolean x(Parcel parcel, int i2) {
        P(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean y(Parcel parcel, int i2) {
        int L = L(parcel, i2);
        if (L == 0) {
            return null;
        }
        O(parcel, i2, L, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte z(Parcel parcel, int i2) {
        P(parcel, i2, 4);
        return (byte) parcel.readInt();
    }
}
