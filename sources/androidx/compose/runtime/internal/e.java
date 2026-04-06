package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15169A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f15170B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f15171z;

    public /* synthetic */ e(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f15171z = composableLambdaImpl;
        this.f15169A = obj;
        this.f15170B = obj2;
        this.C = obj3;
        this.D = obj4;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ComposableLambdaImpl.w(this.f15171z, this.f15169A, this.f15170B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
