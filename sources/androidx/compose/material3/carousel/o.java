package androidx.compose.material3.carousel;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class o implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f11982A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11983B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ KeylineList f11984z;

    public /* synthetic */ o(KeylineList keylineList, int i2, int i3) {
        this.f11984z = keylineList;
        this.f11982A = i2;
        this.f11983B = i3;
    }

    public final Object invoke(Object obj) {
        return StrategyKt.u(this.f11984z, this.f11982A, this.f11983B, (KeylineListScope) obj);
    }
}
