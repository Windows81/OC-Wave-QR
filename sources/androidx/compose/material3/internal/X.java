package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class X implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12383A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12384B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f12385z;

    public /* synthetic */ X(long j2, Function2 function2, int i2) {
        this.f12385z = j2;
        this.f12383A = function2;
        this.f12384B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TextFieldImplKt.v(this.f12385z, this.f12383A, this.f12384B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
