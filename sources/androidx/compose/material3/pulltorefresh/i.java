package androidx.compose.material3.pulltorefresh;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FloatProducer f12636z;

    public /* synthetic */ i(FloatProducer floatProducer) {
        this.f12636z = floatProducer;
    }

    public final Object invoke(Object obj) {
        return PullToRefreshKt.i(this.f12636z, (SemanticsPropertyReceiver) obj);
    }
}
