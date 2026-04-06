package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15166A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f15167B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f15168z;

    public /* synthetic */ d(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.f15168z = composableLambdaImpl;
        this.f15166A = obj;
        this.f15167B = obj2;
        this.C = obj3;
        this.D = obj4;
        this.E = obj5;
        this.F = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ComposableLambdaImpl.x(this.f15168z, this.f15166A, this.f15167B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
