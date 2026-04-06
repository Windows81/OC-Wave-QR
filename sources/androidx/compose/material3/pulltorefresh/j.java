package androidx.compose.material3.pulltorefresh;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class j implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f12637A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12638B;
    public final /* synthetic */ Path C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FloatProducer f12639z;

    public /* synthetic */ j(FloatProducer floatProducer, State state, long j2, Path path) {
        this.f12639z = floatProducer;
        this.f12637A = state;
        this.f12638B = j2;
        this.C = path;
    }

    public final Object invoke(Object obj) {
        return PullToRefreshKt.j(this.f12639z, this.f12637A, this.f12638B, this.C, (DrawScope) obj);
    }
}
