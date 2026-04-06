package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.l4  reason: case insensitive filesystem */
public final /* synthetic */ class C0176l4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f12509A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12510B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ FloatProducer G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f12511z;

    public /* synthetic */ C0176l4(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, FloatProducer floatProducer, Function3 function3, int i2, int i3) {
        this.f12511z = drawerPredictiveBackState;
        this.f12509A = windowInsets;
        this.f12510B = modifier;
        this.C = shape;
        this.D = j2;
        this.E = j3;
        this.F = f2;
        this.G = floatProducer;
        this.H = function3;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return NavigationDrawerKt.k(this.f12511z, this.f12509A, this.f12510B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
