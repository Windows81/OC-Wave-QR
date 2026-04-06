package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ActivityResultContract<I, O> {

    @Metadata
    public static final class SynchronousResult<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f259a;

        public SynchronousResult(Object obj) {
            this.f259a = obj;
        }

        public final Object a() {
            return this.f259a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public SynchronousResult b(Context context, Object obj) {
        Intrinsics.i(context, "context");
        return null;
    }

    public abstract Object c(int i2, Intent intent);
}
