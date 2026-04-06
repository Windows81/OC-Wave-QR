package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15163A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f15164B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f15165z;

    public /* synthetic */ c(ComposableLambdaImpl composableLambdaImpl, Object obj, int i2) {
        this.f15165z = composableLambdaImpl;
        this.f15163A = obj;
        this.f15164B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ComposableLambdaImpl.t(this.f15165z, this.f15163A, this.f15164B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
