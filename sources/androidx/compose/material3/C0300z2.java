package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.z2  reason: case insensitive filesystem */
public final /* synthetic */ class C0300z2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f14508A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f14509B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ ScrollState D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ BorderStroke J;
    public final /* synthetic */ Function3 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuBoxScope f14510z;

    public /* synthetic */ C0300z2(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z2, Function0 function0, Modifier modifier, ScrollState scrollState, boolean z3, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3 function3, int i2, int i3, int i4) {
        this.f14510z = exposedDropdownMenuBoxScope;
        this.f14508A = z2;
        this.f14509B = function0;
        this.C = modifier;
        this.D = scrollState;
        this.E = z3;
        this.F = shape;
        this.G = j2;
        this.H = f2;
        this.I = f3;
        this.J = borderStroke;
        this.K = function3;
        this.L = i2;
        this.M = i3;
        this.N = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return ExposedDropdownMenuBoxScope.g(this.f14510z, this.f14508A, this.f14509B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (Composer) obj, intValue);
    }
}
