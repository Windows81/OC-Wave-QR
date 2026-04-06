package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
final /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function1 f41598a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final Function2 f41599b = new c();

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    public static final Object d(Object obj) {
        return obj;
    }

    public static final Flow e(Flow flow) {
        return flow instanceof StateFlow ? flow : g(flow, f41598a, f41599b);
    }

    public static final Flow f(Flow flow, Function2 function2) {
        Function1 function1 = f41598a;
        Intrinsics.g(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return g(flow, function1, (Function2) TypeIntrinsics.e(function2, 2));
    }

    public static final Flow g(Flow flow, Function1 function1, Function2 function2) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.f41570A == function1 && distinctFlowImpl.f41571B == function2) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, function1, function2);
    }
}
