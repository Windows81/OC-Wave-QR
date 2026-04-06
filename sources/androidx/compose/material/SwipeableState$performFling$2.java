package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class SwipeableState$performFling$2<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f8610A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8611z;

    public SwipeableState$performFling$2(SwipeableState swipeableState, float f2) {
        this.f8611z = swipeableState;
        this.f8610A = f2;
    }

    /* renamed from: a */
    public final Object c(Map map, Continuation continuation) {
        Float b2 = SwipeableKt.e(map, this.f8611z.p());
        Intrinsics.f(b2);
        float floatValue = b2.floatValue();
        Object obj = map.get(Boxing.b(SwipeableKt.c(((Number) this.f8611z.t().getValue()).floatValue(), floatValue, map.keySet(), this.f8611z.v(), this.f8610A, this.f8611z.w())));
        if (obj == null || !((Boolean) this.f8611z.o().invoke(obj)).booleanValue()) {
            SwipeableState swipeableState = this.f8611z;
            Object a2 = swipeableState.i(floatValue, swipeableState.n(), continuation);
            return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
        }
        Object k2 = SwipeableState.k(this.f8611z, obj, (AnimationSpec) null, continuation, 2, (Object) null);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }
}
