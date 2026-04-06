package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class J3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Animatable f10162A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f10163B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Modifier E;
    public final /* synthetic */ SheetState F;
    public final /* synthetic */ float G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Shape I;
    public final /* synthetic */ long J;
    public final /* synthetic */ long K;
    public final /* synthetic */ float L;
    public final /* synthetic */ Function2 M;
    public final /* synthetic */ Function2 N;
    public final /* synthetic */ Function3 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BoxScope f10164z;

    public /* synthetic */ J3(BoxScope boxScope, Animatable animatable, CoroutineScope coroutineScope, Function0 function0, Function1 function1, Modifier modifier, SheetState sheetState, float f2, boolean z2, Shape shape, long j2, long j3, float f3, Function2 function2, Function2 function22, Function3 function3, int i2, int i3, int i4) {
        this.f10164z = boxScope;
        this.f10162A = animatable;
        this.f10163B = coroutineScope;
        this.C = function0;
        this.D = function1;
        this.E = modifier;
        this.F = sheetState;
        this.G = f2;
        this.H = z2;
        this.I = shape;
        this.J = j2;
        this.K = j3;
        this.L = f3;
        this.M = function2;
        this.N = function22;
        this.O = function3;
        this.P = i2;
        this.Q = i3;
        this.R = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return ModalBottomSheetKt.y(this.f10164z, this.f10162A, this.f10163B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (Composer) obj, intValue);
    }
}
