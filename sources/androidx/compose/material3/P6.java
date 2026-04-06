package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class P6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10608A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f10609B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10610z;

    public /* synthetic */ P6(Function2 function2, Function2 function22, int i2) {
        this.f10610z = function2;
        this.f10608A = function22;
        this.f10609B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TabKt.c(this.f10610z, this.f10608A, this.f10609B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
