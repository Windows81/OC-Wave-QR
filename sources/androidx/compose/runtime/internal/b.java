package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15160A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f15161B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f15162z;

    public /* synthetic */ b(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i2) {
        this.f15162z = composableLambdaImpl;
        this.f15160A = obj;
        this.f15161B = obj2;
        this.C = obj3;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ComposableLambdaImpl.v(this.f15162z, this.f15160A, this.f15161B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
