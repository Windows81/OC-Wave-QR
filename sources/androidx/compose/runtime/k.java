package androidx.compose.runtime;

import kotlin.jvm.functions.Function2;

public final /* synthetic */ class k implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f15175A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f15176B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProvidedValue[] f15177z;

    public /* synthetic */ k(ProvidedValue[] providedValueArr, Function2 function2, int i2) {
        this.f15177z = providedValueArr;
        this.f15175A = function2;
        this.f15176B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CompositionLocalKt.e(this.f15177z, this.f15175A, this.f15176B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
