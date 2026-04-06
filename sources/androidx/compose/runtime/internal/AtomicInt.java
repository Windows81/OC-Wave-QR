package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata
public final class AtomicInt extends AtomicInteger {
    public AtomicInt(int i2) {
        super(i2);
    }

    public final int a(int i2) {
        return addAndGet(i2);
    }

    public byte b() {
        return (byte) intValue();
    }

    public final /* bridge */ byte byteValue() {
        return b();
    }

    public /* bridge */ double c() {
        return super.doubleValue();
    }

    public /* bridge */ float d() {
        return super.floatValue();
    }

    public final /* bridge */ double doubleValue() {
        return c();
    }

    public /* bridge */ int e() {
        return super.intValue();
    }

    public /* bridge */ long f() {
        return super.longValue();
    }

    public final /* bridge */ float floatValue() {
        return d();
    }

    public short g() {
        return (short) intValue();
    }

    public final /* bridge */ int intValue() {
        return e();
    }

    public final /* bridge */ long longValue() {
        return f();
    }

    public final /* bridge */ short shortValue() {
        return g();
    }
}
