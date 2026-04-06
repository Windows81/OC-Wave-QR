package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class u implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f15422A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f15423B;
    public final /* synthetic */ ProduceFrameSignal C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Recomposer f15424z;

    public /* synthetic */ u(Recomposer recomposer, List list, List list2, ProduceFrameSignal produceFrameSignal) {
        this.f15424z = recomposer;
        this.f15422A = list;
        this.f15423B = list2;
        this.C = produceFrameSignal;
    }

    public final Object invoke(Object obj) {
        return Recomposer.Z0(this.f15424z, this.f15422A, this.f15423B, this.C, ((Long) obj).longValue());
    }
}
