package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function5 f41724A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow[] f41725z;

    @Metadata
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;
        public /* synthetic */ Object F;

        /* renamed from: A */
        public final Object d(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(continuation, function5);
            r0.E = flowCollector;
            r0.F = objArr;
            return r0.x(Unit.f40552a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.FlowCollector} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.D
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.b(r11)
                goto L_0x005a
            L_0x0012:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                java.lang.Object r1 = r10.E
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.b(r11)
                goto L_0x004e
            L_0x0022:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.E
                r1 = r11
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r11 = r10.F
                java.lang.Object[] r11 = (java.lang.Object[]) r11
                kotlin.jvm.functions.Function5 r4 = r4
                r5 = 0
                r5 = r11[r5]
                r6 = r11[r3]
                r7 = r11[r2]
                r8 = 3
                r8 = r11[r8]
                r10.E = r1
                r10.D = r3
                r11 = 6
                kotlin.jvm.internal.InlineMarker.c(r11)
                r9 = r10
                java.lang.Object r11 = r4.n(r5, r6, r7, r8, r9)
                r3 = 7
                kotlin.jvm.internal.InlineMarker.c(r3)
                if (r11 != r0) goto L_0x004e
                return r0
            L_0x004e:
                r3 = 0
                r10.E = r3
                r10.D = r2
                java.lang.Object r11 = r1.c(r11, r10)
                if (r11 != r0) goto L_0x005a
                return r0
            L_0x005a:
                kotlin.Unit r11 = kotlin.Unit.f40552a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2.x(java.lang.Object):java.lang.Object");
        }
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Flow[] flowArr = this.f41725z;
        Function0 a2 = FlowKt__ZipKt.f();
        final Function5 function5 = this.f41724A;
        Object a3 = CombineKt.a(flowCollector, flowArr, a2, new AnonymousClass2((Continuation) null), continuation);
        return a3 == IntrinsicsKt.f() ? a3 : Unit.f40552a;
    }
}
