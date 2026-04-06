package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

class ProfileTranscoder {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f22783a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f22784b = {112, 114, 109, 0};

    public static void A(byte[] bArr, int i2, int i3, DexProfileData dexProfileData) {
        int m2 = m(i2, i3, dexProfileData.f22774g);
        int i4 = m2 / 8;
        bArr[i4] = (byte) ((1 << (m2 % 8)) | bArr[i4]);
    }

    public static void B(InputStream inputStream) {
        Encoding.h(inputStream);
        int j2 = Encoding.j(inputStream);
        if (j2 != 6 && j2 != 7) {
            while (j2 > 0) {
                Encoding.j(inputStream);
                for (int j3 = Encoding.j(inputStream); j3 > 0; j3--) {
                    Encoding.h(inputStream);
                }
                j2--;
            }
        }
    }

    public static boolean C(OutputStream outputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) {
        if (Arrays.equals(bArr, ProfileVersion.f22796a)) {
            P(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.f22797b)) {
            O(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.f22799d)) {
            M(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.f22798c)) {
            N(outputStream, dexProfileDataArr);
            return true;
        } else if (!Arrays.equals(bArr, ProfileVersion.f22800e)) {
            return false;
        } else {
            L(outputStream, dexProfileDataArr);
            return true;
        }
    }

    public static void D(OutputStream outputStream, DexProfileData dexProfileData) {
        int[] iArr = dexProfileData.f22775h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            Encoding.p(outputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
    }

    public static WritableFileSection E(DexProfileData[] dexProfileDataArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Encoding.p(byteArrayOutputStream, dexProfileDataArr.length);
            int i2 = 2;
            for (DexProfileData dexProfileData : dexProfileDataArr) {
                Encoding.q(byteArrayOutputStream, dexProfileData.f22770c);
                Encoding.q(byteArrayOutputStream, dexProfileData.f22771d);
                Encoding.q(byteArrayOutputStream, (long) dexProfileData.f22774g);
                String j2 = j(dexProfileData.f22768a, dexProfileData.f22769b, ProfileVersion.f22796a);
                int k2 = Encoding.k(j2);
                Encoding.p(byteArrayOutputStream, k2);
                i2 = i2 + 14 + k2;
                Encoding.n(byteArrayOutputStream, j2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i2 == byteArray.length) {
                WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, i2, byteArray, false);
                byteArrayOutputStream.close();
                return writableFileSection;
            }
            throw Encoding.c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void F(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f22783a);
        outputStream.write(bArr);
    }

    public static void G(OutputStream outputStream, DexProfileData dexProfileData) {
        K(outputStream, dexProfileData);
        D(outputStream, dexProfileData);
        I(outputStream, dexProfileData);
    }

    public static void H(OutputStream outputStream, DexProfileData dexProfileData, String str) {
        Encoding.p(outputStream, Encoding.k(str));
        Encoding.p(outputStream, dexProfileData.f22772e);
        Encoding.q(outputStream, (long) dexProfileData.f22773f);
        Encoding.q(outputStream, dexProfileData.f22770c);
        Encoding.q(outputStream, (long) dexProfileData.f22774g);
        Encoding.n(outputStream, str);
    }

    public static void I(OutputStream outputStream, DexProfileData dexProfileData) {
        byte[] bArr = new byte[k(dexProfileData.f22774g)];
        for (Map.Entry entry : dexProfileData.f22776i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                A(bArr, 2, intValue, dexProfileData);
            }
            if ((intValue2 & 4) != 0) {
                A(bArr, 4, intValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    public static void J(OutputStream outputStream, int i2, DexProfileData dexProfileData) {
        byte[] bArr = new byte[l(i2, dexProfileData.f22774g)];
        for (Map.Entry entry : dexProfileData.f22776i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (!(i4 == 1 || (i4 & i2) == 0)) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (dexProfileData.f22774g * i3) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        outputStream.write(bArr);
    }

    public static void K(OutputStream outputStream, DexProfileData dexProfileData) {
        int i2 = 0;
        for (Map.Entry entry : dexProfileData.f22776i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Encoding.p(outputStream, intValue - i2);
                Encoding.p(outputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static void L(OutputStream outputStream, DexProfileData[] dexProfileDataArr) {
        Encoding.p(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String j2 = j(dexProfileData.f22768a, dexProfileData.f22769b, ProfileVersion.f22800e);
            Encoding.p(outputStream, Encoding.k(j2));
            Encoding.p(outputStream, dexProfileData.f22776i.size());
            Encoding.p(outputStream, dexProfileData.f22775h.length);
            Encoding.q(outputStream, dexProfileData.f22770c);
            Encoding.n(outputStream, j2);
            for (Integer intValue : dexProfileData.f22776i.keySet()) {
                Encoding.p(outputStream, intValue.intValue());
            }
            for (int p2 : dexProfileData.f22775h) {
                Encoding.p(outputStream, p2);
            }
        }
    }

    public static void M(OutputStream outputStream, DexProfileData[] dexProfileDataArr) {
        Encoding.r(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String j2 = j(dexProfileData.f22768a, dexProfileData.f22769b, ProfileVersion.f22799d);
            Encoding.p(outputStream, Encoding.k(j2));
            Encoding.p(outputStream, dexProfileData.f22775h.length);
            Encoding.q(outputStream, (long) (dexProfileData.f22776i.size() * 4));
            Encoding.q(outputStream, dexProfileData.f22770c);
            Encoding.n(outputStream, j2);
            for (Integer intValue : dexProfileData.f22776i.keySet()) {
                Encoding.p(outputStream, intValue.intValue());
                Encoding.p(outputStream, 0);
            }
            for (int p2 : dexProfileData.f22775h) {
                Encoding.p(outputStream, p2);
            }
        }
    }

    public static void N(OutputStream outputStream, DexProfileData[] dexProfileDataArr) {
        byte[] b2 = b(dexProfileDataArr, ProfileVersion.f22798c);
        Encoding.r(outputStream, dexProfileDataArr.length);
        Encoding.m(outputStream, b2);
    }

    public static void O(OutputStream outputStream, DexProfileData[] dexProfileDataArr) {
        byte[] b2 = b(dexProfileDataArr, ProfileVersion.f22797b);
        Encoding.r(outputStream, dexProfileDataArr.length);
        Encoding.m(outputStream, b2);
    }

    public static void P(OutputStream outputStream, DexProfileData[] dexProfileDataArr) {
        Q(outputStream, dexProfileDataArr);
    }

    public static void Q(OutputStream outputStream, DexProfileData[] dexProfileDataArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(dexProfileDataArr));
        arrayList.add(c(dexProfileDataArr));
        arrayList.add(d(dexProfileDataArr));
        long length2 = ((long) ProfileVersion.f22796a.length) + ((long) f22783a.length) + 4 + ((long) (arrayList.size() * 16));
        Encoding.q(outputStream, (long) arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            WritableFileSection writableFileSection = (WritableFileSection) arrayList.get(i2);
            Encoding.q(outputStream, writableFileSection.f22803a.f());
            Encoding.q(outputStream, length2);
            if (writableFileSection.f22806d) {
                byte[] bArr = writableFileSection.f22805c;
                byte[] b2 = Encoding.b(bArr);
                arrayList2.add(b2);
                Encoding.q(outputStream, (long) b2.length);
                Encoding.q(outputStream, (long) bArr.length);
                length = b2.length;
            } else {
                arrayList2.add(writableFileSection.f22805c);
                Encoding.q(outputStream, (long) writableFileSection.f22805c.length);
                Encoding.q(outputStream, 0);
                length = writableFileSection.f22805c.length;
            }
            length2 += (long) length;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            outputStream.write((byte[]) arrayList2.get(i3));
        }
    }

    public static int a(DexProfileData dexProfileData) {
        int i2 = 0;
        for (Map.Entry value : dexProfileData.f22776i.entrySet()) {
            i2 |= ((Integer) value.getValue()).intValue();
        }
        return i2;
    }

    public static byte[] b(DexProfileData[] dexProfileDataArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            i3 += Encoding.k(j(dexProfileData.f22768a, dexProfileData.f22769b, bArr)) + 16 + (dexProfileData.f22772e * 2) + dexProfileData.f22773f + k(dexProfileData.f22774g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, ProfileVersion.f22798c)) {
            int length = dexProfileDataArr.length;
            while (i2 < length) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i2];
                H(byteArrayOutputStream, dexProfileData2, j(dexProfileData2.f22768a, dexProfileData2.f22769b, bArr));
                G(byteArrayOutputStream, dexProfileData2);
                i2++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                H(byteArrayOutputStream, dexProfileData3, j(dexProfileData3.f22768a, dexProfileData3.f22769b, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i2 < length2) {
                G(byteArrayOutputStream, dexProfileDataArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw Encoding.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static WritableFileSection c(DexProfileData[] dexProfileDataArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        int i3 = 0;
        while (i2 < dexProfileDataArr.length) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i2];
                Encoding.p(byteArrayOutputStream, i2);
                Encoding.p(byteArrayOutputStream, dexProfileData.f22772e);
                i3 = i3 + 4 + (dexProfileData.f22772e * 2);
                D(byteArrayOutputStream, dexProfileData);
                i2++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.CLASSES, i3, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    public static WritableFileSection d(DexProfileData[] dexProfileDataArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        int i3 = 0;
        while (i2 < dexProfileDataArr.length) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i2];
                int a2 = a(dexProfileData);
                byte[] e2 = e(a2, dexProfileData);
                byte[] f2 = f(dexProfileData);
                Encoding.p(byteArrayOutputStream, i2);
                int length = e2.length + 2 + f2.length;
                Encoding.q(byteArrayOutputStream, (long) length);
                Encoding.p(byteArrayOutputStream, a2);
                byteArrayOutputStream.write(e2);
                byteArrayOutputStream.write(f2);
                i3 = i3 + 6 + length;
                i2++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.METHODS, i3, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    public static byte[] e(int i2, DexProfileData dexProfileData) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i2, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(DexProfileData dexProfileData) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static DexProfileData i(DexProfileData[] dexProfileDataArr, String str) {
        if (dexProfileDataArr.length <= 0) {
            return null;
        }
        String h2 = h(str);
        for (int i2 = 0; i2 < dexProfileDataArr.length; i2++) {
            if (dexProfileDataArr[i2].f22769b.equals(h2)) {
                return dexProfileDataArr[i2];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a2 = ProfileVersion.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a2);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a2);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + ProfileVersion.a(bArr) + str2;
    }

    public static int k(int i2) {
        return z(i2 * 2) / 8;
    }

    public static int l(int i2, int i3) {
        return z(Integer.bitCount(i2 & -2) * i3) / 8;
    }

    public static int m(int i2, int i3, int i4) {
        if (i2 == 1) {
            throw Encoding.c("HOT methods are not stored in the bitmap");
        } else if (i2 == 2) {
            return i3;
        } else {
            if (i2 == 4) {
                return i3 + i4;
            }
            throw Encoding.c("Unexpected flag: " + i2);
        }
    }

    public static int[] n(InputStream inputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += Encoding.h(inputStream);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static int o(BitSet bitSet, int i2, int i3) {
        int i4 = 2;
        if (!bitSet.get(m(2, i2, i3))) {
            i4 = 0;
        }
        return bitSet.get(m(4, i2, i3)) ? i4 | 4 : i4;
    }

    public static byte[] p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, Encoding.d(inputStream, bArr.length))) {
            return Encoding.d(inputStream, ProfileVersion.f22797b.length);
        }
        throw Encoding.c("Invalid magic");
    }

    public static void q(InputStream inputStream, DexProfileData dexProfileData) {
        int available = inputStream.available() - dexProfileData.f22773f;
        int i2 = 0;
        while (inputStream.available() > available) {
            i2 += Encoding.h(inputStream);
            dexProfileData.f22776i.put(Integer.valueOf(i2), 1);
            for (int h2 = Encoding.h(inputStream); h2 > 0; h2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw Encoding.c("Read too much data during profile line parse");
        }
    }

    public static DexProfileData[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) {
        if (Arrays.equals(bArr, ProfileVersion.f22801f)) {
            if (!Arrays.equals(ProfileVersion.f22796a, bArr2)) {
                return s(inputStream, bArr, dexProfileDataArr);
            }
            throw Encoding.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, ProfileVersion.f22802g)) {
            return u(inputStream, bArr2, dexProfileDataArr);
        } else {
            throw Encoding.c("Unsupported meta version");
        }
    }

    public static DexProfileData[] s(InputStream inputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) {
        if (Arrays.equals(bArr, ProfileVersion.f22801f)) {
            int j2 = Encoding.j(inputStream);
            byte[] e2 = Encoding.e(inputStream, (int) Encoding.i(inputStream), (int) Encoding.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e2);
                try {
                    DexProfileData[] t2 = t(byteArrayInputStream, j2, dexProfileDataArr);
                    byteArrayInputStream.close();
                    return t2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw Encoding.c("Content found after the end of file");
            }
        } else {
            throw Encoding.c("Unsupported meta version");
        }
        throw th;
    }

    public static DexProfileData[] t(InputStream inputStream, int i2, DexProfileData[] dexProfileDataArr) {
        int i3 = 0;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 == dexProfileDataArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                int h2 = Encoding.h(inputStream);
                iArr[i4] = Encoding.h(inputStream);
                strArr[i4] = Encoding.f(inputStream, h2);
            }
            while (i3 < i2) {
                DexProfileData dexProfileData = dexProfileDataArr[i3];
                if (dexProfileData.f22769b.equals(strArr[i3])) {
                    int i5 = iArr[i3];
                    dexProfileData.f22772e = i5;
                    dexProfileData.f22775h = n(inputStream, i5);
                    i3++;
                } else {
                    throw Encoding.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.c("Mismatched number of dex files found in metadata");
    }

    public static DexProfileData[] u(InputStream inputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) {
        int h2 = Encoding.h(inputStream);
        byte[] e2 = Encoding.e(inputStream, (int) Encoding.i(inputStream), (int) Encoding.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e2);
            try {
                DexProfileData[] v2 = v(byteArrayInputStream, bArr, h2, dexProfileDataArr);
                byteArrayInputStream.close();
                return v2;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw Encoding.c("Content found after the end of file");
        }
        throw th;
    }

    public static DexProfileData[] v(InputStream inputStream, byte[] bArr, int i2, DexProfileData[] dexProfileDataArr) {
        int i3 = 0;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 == dexProfileDataArr.length) {
            while (i3 < i2) {
                Encoding.h(inputStream);
                String f2 = Encoding.f(inputStream, Encoding.h(inputStream));
                long i4 = Encoding.i(inputStream);
                int h2 = Encoding.h(inputStream);
                DexProfileData i5 = i(dexProfileDataArr, f2);
                if (i5 != null) {
                    i5.f22771d = i4;
                    int[] n2 = n(inputStream, h2);
                    if (Arrays.equals(bArr, ProfileVersion.f22800e)) {
                        i5.f22772e = h2;
                        i5.f22775h = n2;
                    }
                    i3++;
                } else {
                    throw Encoding.c("Missing profile key: " + f2);
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.c("Mismatched number of dex files found in metadata");
    }

    public static void w(InputStream inputStream, DexProfileData dexProfileData) {
        BitSet valueOf = BitSet.valueOf(Encoding.d(inputStream, Encoding.a(dexProfileData.f22774g * 2)));
        int i2 = 0;
        while (true) {
            int i3 = dexProfileData.f22774g;
            if (i2 < i3) {
                int o2 = o(valueOf, i2, i3);
                if (o2 != 0) {
                    Integer num = (Integer) dexProfileData.f22776i.get(Integer.valueOf(i2));
                    if (num == null) {
                        num = 0;
                    }
                    dexProfileData.f22776i.put(Integer.valueOf(i2), Integer.valueOf(o2 | num.intValue()));
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static DexProfileData[] x(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, ProfileVersion.f22797b)) {
            int j2 = Encoding.j(inputStream);
            byte[] e2 = Encoding.e(inputStream, (int) Encoding.i(inputStream), (int) Encoding.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e2);
                try {
                    DexProfileData[] y2 = y(byteArrayInputStream, str, j2);
                    byteArrayInputStream.close();
                    return y2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw Encoding.c("Content found after the end of file");
            }
        } else {
            throw Encoding.c("Unsupported version");
        }
        throw th;
    }

    public static DexProfileData[] y(InputStream inputStream, String str, int i2) {
        InputStream inputStream2 = inputStream;
        int i3 = i2;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int h2 = Encoding.h(inputStream);
            int h3 = Encoding.h(inputStream);
            String str2 = str;
            int[] iArr = new int[h3];
            dexProfileDataArr[i4] = new DexProfileData(str2, Encoding.f(inputStream2, h2), Encoding.i(inputStream), 0, h3, (int) Encoding.i(inputStream), (int) Encoding.i(inputStream), iArr, new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            DexProfileData dexProfileData = dexProfileDataArr[i5];
            q(inputStream2, dexProfileData);
            dexProfileData.f22775h = n(inputStream2, dexProfileData.f22772e);
            w(inputStream2, dexProfileData);
        }
        return dexProfileDataArr;
    }

    public static int z(int i2) {
        return (i2 + 7) & -8;
    }
}
