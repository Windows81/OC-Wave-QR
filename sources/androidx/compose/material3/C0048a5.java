package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.a5  reason: case insensitive filesystem */
public final /* synthetic */ class C0048a5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f11856A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f11857B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11858z;

    public /* synthetic */ C0048a5(Function0 function0, Modifier modifier, long j2, long j3, int i2, float f2, Function1 function1, int i3, int i4) {
        this.f11858z = function0;
        this.f11856A = modifier;
        this.f11857B = j2;
        this.C = j3;
        this.D = i2;
        this.E = f2;
        this.F = function1;
        this.G = i3;
        this.H = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return ProgressIndicatorKt.w(this.f11858z, this.f11856A, this.f11857B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
