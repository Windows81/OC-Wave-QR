package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class y implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f15430A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f15431B;
    public final /* synthetic */ List C;
    public final /* synthetic */ List D;
    public final /* synthetic */ MutableScatterSet E;
    public final /* synthetic */ List F;
    public final /* synthetic */ MutableScatterSet G;
    public final /* synthetic */ Set H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Recomposer f15432z;

    public /* synthetic */ y(Recomposer recomposer, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, List list, List list2, MutableScatterSet mutableScatterSet3, List list3, MutableScatterSet mutableScatterSet4, Set set) {
        this.f15432z = recomposer;
        this.f15430A = mutableScatterSet;
        this.f15431B = mutableScatterSet2;
        this.C = list;
        this.D = list2;
        this.E = mutableScatterSet3;
        this.F = list3;
        this.G = mutableScatterSet4;
        this.H = set;
    }

    public final Object invoke(Object obj) {
        return Recomposer$runRecomposeAndApplyChanges$2.E(this.f15432z, this.f15430A, this.f15431B, this.C, this.D, this.E, this.F, this.G, this.H, ((Long) obj).longValue());
    }
}
