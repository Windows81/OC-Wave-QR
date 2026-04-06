package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.s7  reason: case insensitive filesystem */
public final /* synthetic */ class C0242s7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12697A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f12698B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f12699z;

    public /* synthetic */ C0242s7(Function2 function2, Function2 function22, Function3 function3, int i2) {
        this.f12699z = function2;
        this.f12697A = function22;
        this.f12698B = function3;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TimePickerDialogKt.d(this.f12699z, this.f12697A, this.f12698B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
