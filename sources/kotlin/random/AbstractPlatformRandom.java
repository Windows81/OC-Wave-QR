package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class AbstractPlatformRandom extends Random {
    public int b(int i2) {
        return RandomKt.d(l().nextInt(), i2);
    }

    public boolean c() {
        return l().nextBoolean();
    }

    public byte[] d(byte[] bArr) {
        Intrinsics.i(bArr, "array");
        l().nextBytes(bArr);
        return bArr;
    }

    public double f() {
        return l().nextDouble();
    }

    public float g() {
        return l().nextFloat();
    }

    public int h() {
        return l().nextInt();
    }

    public int i(int i2) {
        return l().nextInt(i2);
    }

    public long k() {
        return l().nextLong();
    }

    public abstract Random l();
}
