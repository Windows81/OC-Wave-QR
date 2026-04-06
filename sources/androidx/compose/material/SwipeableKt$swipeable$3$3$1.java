package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", l = {602}, m = "invokeSuspend")
public final class SwipeableKt$swipeable$3$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SwipeableState E;
    public final /* synthetic */ Map F;
    public final /* synthetic */ ResistanceConfig G;
    public final /* synthetic */ Density H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ float J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3$3$1(SwipeableState swipeableState, Map map, ResistanceConfig resistanceConfig, Density density, Function2 function2, float f2, Continuation continuation) {
        super(2, continuation);
        this.E = swipeableState;
        this.F = map;
        this.G = resistanceConfig;
        this.H = density;
        this.I = function2;
        this.J = f2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SwipeableKt$swipeable$3$3$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SwipeableKt$swipeable$3$3$1(this.E, this.F, this.G, this.H, this.I, this.J, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map m2 = this.E.m();
            this.E.B(this.F);
            this.E.E(this.G);
            SwipeableState swipeableState = this.E;
            final Map map = this.F;
            final Function2 function2 = this.I;
            final Density density = this.H;
            swipeableState.F(new Function2<Float, Float, Float>() {
                public final Float b(float f2, float f3) {
                    return Float.valueOf(((ThresholdConfig) function2.m(MapsKt.i(map, Float.valueOf(f2)), MapsKt.i(map, Float.valueOf(f3)))).a(density, f2, f3));
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    return b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }
            });
            this.E.G(this.H.B1(this.J));
            SwipeableState swipeableState2 = this.E;
            Map map2 = this.F;
            this.D = 1;
            if (swipeableState2.A(m2, map2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
