package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function4 f41722A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow[] f41723z;

    @Metadata
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;
        public /* synthetic */ Object F;

        /* renamed from: A */
        public final Object d(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(continuation, function4);
            r0.E = flowCollector;
            r0.F = objArr;
            return r0.x(Unit.f40552a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.FlowCollector} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.D
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.b(r8)
                goto L_0x0056
            L_0x0012:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001a:
                java.lang.Object r1 = r7.E
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.b(r8)
                goto L_0x004a
            L_0x0022:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.E
                r1 = r8
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r8 = r7.F
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                kotlin.jvm.functions.Function4 r4 = r4
                r5 = 0
                r5 = r8[r5]
                r6 = r8[r3]
                r8 = r8[r2]
                r7.E = r1
                r7.D = r3
                r3 = 6
                kotlin.jvm.internal.InlineMarker.c(r3)
                java.lang.Object r8 = r4.j(r5, r6, r8, r7)
                r3 = 7
                kotlin.jvm.internal.InlineMarker.c(r3)
                if (r8 != r0) goto L_0x004a
                return r0
            L_0x004a:
                r3 = 0
                r7.E = r3
                r7.D = r2
                java.lang.Object r8 = r1.c(r8, r7)
                if (r8 != r0) goto L_0x0056
                return r0
            L_0x0056:
                kotlin.Unit r8 = kotlin.Unit.f40552a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.x(java.lang.Object):java.lang.Object");
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(Flow[] flowArr, Function4 function4) {
        this.f41723z = flowArr;
        this.f41722A = function4;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Flow[] flowArr = this.f41723z;
        Function0 a2 = FlowKt__ZipKt.f();
        final Function4 function4 = this.f41722A;
        Object a3 = CombineKt.a(flowCollector, flowArr, a2, new AnonymousClass2((Continuation) null), continuation);
        return a3 == IntrinsicsKt.f() ? a3 : Unit.f40552a;
    }
}
