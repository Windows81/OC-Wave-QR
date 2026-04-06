package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15157A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f15158B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f15159z;

    public /* synthetic */ a(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, int i2) {
        this.f15159z = composableLambdaImpl;
        this.f15157A = obj;
        this.f15158B = obj2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ComposableLambdaImpl.u(this.f15159z, this.f15157A, this.f15158B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
