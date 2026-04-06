package androidx.compose.runtime;

import kotlin.jvm.functions.Function2;

public final /* synthetic */ class j implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f15172A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f15173B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProvidedValue f15174z;

    public /* synthetic */ j(ProvidedValue providedValue, Function2 function2, int i2) {
        this.f15174z = providedValue;
        this.f15172A = function2;
        this.f15173B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CompositionLocalKt.f(this.f15174z, this.f15172A, this.f15173B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
