package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class D6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f9635A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9636B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f9637z;

    public /* synthetic */ D6(SnackbarData snackbarData, Modifier modifier, boolean z2, Shape shape, long j2, long j3, long j4, long j5, long j6, int i2, int i3) {
        this.f9637z = snackbarData;
        this.f9635A = modifier;
        this.f9636B = z2;
        this.C = shape;
        this.D = j2;
        this.E = j3;
        this.F = j4;
        this.G = j5;
        this.H = j6;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return SnackbarKt.l(this.f9637z, this.f9635A, this.f9636B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, intValue);
    }
}
