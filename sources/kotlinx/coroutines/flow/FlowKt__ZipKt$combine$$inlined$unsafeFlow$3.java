package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f41733A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow[] f41734z;

    @Metadata
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object C;
        public int D;
        public final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 E;

        public final Object x(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return this.E.a((FlowCollector) null, this);
        }
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Flow[] flowArr = this.f41734z;
        Intrinsics.n();
        FlowKt__ZipKt$combine$6$1 flowKt__ZipKt$combine$6$1 = new FlowKt__ZipKt$combine$6$1(this.f41734z);
        Intrinsics.n();
        Object a2 = CombineKt.a(flowCollector, flowArr, flowKt__ZipKt$combine$6$1, new FlowKt__ZipKt$combine$6$2(this.f41733A, (Continuation) null), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
