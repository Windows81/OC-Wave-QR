package androidx.compose.material3.carousel;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class p implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f11985A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KeylineList f11986z;

    public /* synthetic */ p(KeylineList keylineList, float f2) {
        this.f11986z = keylineList;
        this.f11985A = f2;
    }

    public final Object invoke(Object obj) {
        return StrategyKt.k(this.f11986z, this.f11985A, (KeylineListScope) obj);
    }
}
