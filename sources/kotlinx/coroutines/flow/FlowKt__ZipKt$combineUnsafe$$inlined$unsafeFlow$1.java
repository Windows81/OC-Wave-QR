package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f41735A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow[] f41736z;

    @Metadata
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object C;
        public int D;
        public final /* synthetic */ FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 E;

        public final Object x(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return this.E.a((FlowCollector) null, this);
        }
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Flow[] flowArr = this.f41736z;
        Function0 a2 = FlowKt__ZipKt.f();
        Intrinsics.n();
        Object a3 = CombineKt.a(flowCollector, flowArr, a2, new FlowKt__ZipKt$combineUnsafe$1$1(this.f41735A, (Continuation) null), continuation);
        return a3 == IntrinsicsKt.f() ? a3 : Unit.f40552a;
    }
}
