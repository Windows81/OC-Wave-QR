package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class TokenContents {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1694a;

    /* renamed from: b  reason: collision with root package name */
    public String f1695b;

    /* renamed from: c  reason: collision with root package name */
    public List f1696c;

    public TokenContents(byte[] bArr, String str, List list) {
        this.f1694a = bArr;
        this.f1695b = str;
        this.f1696c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f1696c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i2 = 0; i2 < Math.min(bArr.length, bArr2.length); i2++) {
            byte b2 = bArr[i2];
            byte b3 = bArr2[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    public static TokenContents c(String str, List list) {
        return new TokenContents(d(str, list), str, list);
    }

    public static byte[] d(String str, List list) {
        Collections.sort(list, new a());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] e(int i2) {
        g();
        List list = this.f1696c;
        if (list != null) {
            return Arrays.copyOf((byte[]) list.get(i2), ((byte[]) this.f1696c.get(i2)).length);
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TokenContents.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1694a, ((TokenContents) obj).f1694a);
    }

    public String f() {
        g();
        String str = this.f1695b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public final void g() {
        if (this.f1695b == null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f1694a));
            this.f1695b = dataInputStream.readUTF();
            int readInt = dataInputStream.readInt();
            this.f1696c = new ArrayList(readInt);
            int i2 = 0;
            while (i2 < readInt) {
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                if (dataInputStream.read(bArr) == readInt2) {
                    this.f1696c.add(bArr);
                    i2++;
                } else {
                    throw new IllegalStateException("Could not read fingerprint");
                }
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1694a);
    }
}
