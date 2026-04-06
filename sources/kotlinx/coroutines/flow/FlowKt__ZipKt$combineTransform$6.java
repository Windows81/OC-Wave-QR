package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", l = {247}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combineTransform$6 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Flow[] F;
    public final /* synthetic */ Function3 G;

    @Metadata
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", l = {247}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;
        public /* synthetic */ Object F;

        /* renamed from: A */
        public final Object d(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            Intrinsics.n();
            AnonymousClass2 r0 = new AnonymousClass2(function3, continuation);
            r0.E = flowCollector;
            r0.F = objArr;
            return r0.x(Unit.f40552a);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Function3 function3 = function3;
                this.E = null;
                this.D = 1;
                if (function3.d((FlowCollector) this.E, (Object[]) this.F, this) == f2) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$6(Flow[] flowArr, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.F = flowArr;
        this.G = function3;
    }

    /* renamed from: A */
    public final Object m(FlowCollector flowCollector, Continuation continuation) {
        return ((FlowKt__ZipKt$combineTransform$6) s(flowCollector, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new FlowKt__ZipKt$combineTransform$6(this.F, this.G, continuation);
        flowKt__ZipKt$combineTransform$6.E = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Flow[] flowArr = this.F;
            Intrinsics.n();
            final Flow[] flowArr2 = this.F;
            AnonymousClass1 r3 = new Function0<Object[]>() {
                /* renamed from: b */
                public final Object[] invoke() {
                    int length = flowArr2.length;
                    Intrinsics.o(0, "T?");
                    return new Object[length];
                }
            };
            Intrinsics.n();
            final Function3 function3 = this.G;
            AnonymousClass2 r4 = new AnonymousClass2((Continuation) null);
            this.D = 1;
            if (CombineKt.a((FlowCollector) this.E, flowArr, r3, r4, this) == f2) {
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
