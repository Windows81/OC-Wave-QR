package androidx.compose.runtime.internal;

import android.os.Looper;
import kotlin.Metadata;

@Metadata
public final class Thread_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f15155a;

    static {
        long j2;
        try {
            j2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j2 = -1;
        }
        f15155a = j2;
    }

    public static final long a() {
        return f15155a;
    }
}
