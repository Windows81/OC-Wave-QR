package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.l3  reason: case insensitive filesystem */
public final /* synthetic */ class C0175l3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MotionScheme f12506A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shapes f12507B;
    public final /* synthetic */ Typography C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ColorScheme f12508z;

    public /* synthetic */ C0175l3(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, Function2 function2, int i2, int i3) {
        this.f12508z = colorScheme;
        this.f12506A = motionScheme;
        this.f12507B = shapes;
        this.C = typography;
        this.D = function2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MaterialThemeKt.i(this.f12508z, this.f12506A, this.f12507B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
