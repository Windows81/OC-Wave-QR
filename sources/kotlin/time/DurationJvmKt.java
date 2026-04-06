package kotlin.time;

import kotlin.Metadata;

@Metadata
public final class DurationJvmKt {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f41209a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal[] f41210b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i2 = 0; i2 < 4; i2++) {
            threadLocalArr[i2] = new ThreadLocal();
        }
        f41210b = threadLocalArr;
    }

    public static final boolean a() {
        return f41209a;
    }
}
