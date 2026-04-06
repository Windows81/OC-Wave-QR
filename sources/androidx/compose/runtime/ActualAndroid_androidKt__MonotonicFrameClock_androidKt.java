package androidx.compose.runtime;

import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

@Metadata
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f14532a = LazyKt.b(new C0306a());

    public static final MonotonicFrameClock b() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.f14641z : FallbackFrameClock.f14662z;
    }
}
