package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class F6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9995A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9996B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f9997z;

    public /* synthetic */ F6(Modifier modifier, Function2 function2, Function2 function22, boolean z2, Shape shape, long j2, long j3, long j4, long j5, Function2 function23, int i2, int i3) {
        this.f9997z = modifier;
        this.f9995A = function2;
        this.f9996B = function22;
        this.C = z2;
        this.D = shape;
        this.E = j2;
        this.F = j3;
        this.G = j4;
        this.H = j5;
        this.I = function23;
        this.J = i2;
        this.K = i3;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return SnackbarKt.k(this.f9997z, this.f9995A, this.f9996B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Composer) obj, intValue);
    }
}
