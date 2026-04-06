package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

@Metadata
final /* synthetic */ class FlowKt__ZipKt {
    public static final Flow b(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt.J(flow, flow2, function3);
    }

    public static final Flow c(Flow flow, Flow flow2, Flow flow3, Function4 function4) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2, flow3}, function4);
    }

    public static final Flow d(Flow flow, Flow flow2, Function4 function4) {
        return FlowKt.I(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2}, (Continuation) null, function4));
    }

    public static final Flow e(Flow flow, Flow flow2, Function3 function3) {
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, flow2, function3);
    }

    public static final Function0 f() {
        return FlowKt__ZipKt$nullArrayFactory$1.f41741z;
    }
}
