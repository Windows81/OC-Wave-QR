package androidx.compose.material3.pulltorefresh;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f12640A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12641B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FloatProducer f12642z;

    public /* synthetic */ k(FloatProducer floatProducer, long j2, int i2) {
        this.f12642z = floatProducer;
        this.f12640A = j2;
        this.f12641B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PullToRefreshKt.k(this.f12642z, this.f12640A, this.f12641B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
