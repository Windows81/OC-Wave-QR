package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class w implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Throwable f15427A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Recomposer f15428z;

    public /* synthetic */ w(Recomposer recomposer, Throwable th) {
        this.f15428z = recomposer;
        this.f15427A = th;
    }

    public final Object invoke(Object obj) {
        return Recomposer.v0(this.f15428z, this.f15427A, (Throwable) obj);
    }
}
