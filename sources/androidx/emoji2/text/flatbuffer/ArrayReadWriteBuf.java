package androidx.emoji2.text.flatbuffer;

public class ArrayReadWriteBuf implements ReadWriteBuf {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f21362a;

    /* renamed from: b  reason: collision with root package name */
    public int f21363b;

    public ArrayReadWriteBuf(byte[] bArr, int i2) {
        this.f21362a = bArr;
        this.f21363b = i2;
    }

    public String a(int i2, int i3) {
        return Utf8Safe.b(this.f21362a, i2, i3);
    }

    public byte get(int i2) {
        return this.f21362a[i2];
    }

    public double getDouble(int i2) {
        return Double.longBitsToDouble(getLong(i2));
    }

    public float getFloat(int i2) {
        return Float.intBitsToFloat(getInt(i2));
    }

    public int getInt(int i2) {
        byte[] bArr = this.f21362a;
        return (bArr[i2] & 255) | (bArr[i2 + 3] << 24) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
    }

    public long getLong(int i2) {
        byte[] bArr = this.f21362a;
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    public short getShort(int i2) {
        byte[] bArr = this.f21362a;
        return (short) ((bArr[i2] & 255) | (bArr[i2 + 1] << 8));
    }
}
