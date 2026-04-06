package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class F3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f9990A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9991B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f9992z;

    public /* synthetic */ F3(long j2, Function0 function0, boolean z2, boolean z3, int i2) {
        this.f9992z = j2;
        this.f9990A = function0;
        this.f9991B = z2;
        this.C = z3;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ModalBottomSheetKt.M(this.f9992z, this.f9990A, this.f9991B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
