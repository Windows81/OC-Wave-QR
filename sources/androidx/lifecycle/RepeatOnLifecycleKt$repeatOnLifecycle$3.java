package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata
@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Lifecycle F;
    public final /* synthetic */ Lifecycle.State G;
    public final /* synthetic */ Function2 H;

    @Metadata
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public Object I;
        public int J;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(lifecycle, state, coroutineScope, function2, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r1.J
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r4) goto L_0x0030
                java.lang.Object r0 = r1.I
                kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                java.lang.Object r0 = r1.H
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                java.lang.Object r0 = r1.G
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r1.F
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r1.E
                r2 = r0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                java.lang.Object r0 = r1.D
                r5 = r0
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
                kotlin.ResultKt.b(r17)     // Catch:{ all -> 0x002d }
                goto L_0x00b1
            L_0x002d:
                r0 = move-exception
                goto L_0x00c9
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                kotlin.ResultKt.b(r17)
                androidx.lifecycle.Lifecycle r2 = r4
                androidx.lifecycle.Lifecycle$State r2 = r2.b()
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r5) goto L_0x0048
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x0048:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
                r13.<init>()
                androidx.lifecycle.Lifecycle$State r5 = r5     // Catch:{ all -> 0x00a8 }
                androidx.lifecycle.Lifecycle r14 = r4     // Catch:{ all -> 0x00a8 }
                kotlinx.coroutines.CoroutineScope r8 = r6     // Catch:{ all -> 0x00a8 }
                kotlin.jvm.functions.Function2 r12 = r7     // Catch:{ all -> 0x00a8 }
                r1.D = r2     // Catch:{ all -> 0x00a8 }
                r1.E = r13     // Catch:{ all -> 0x00a8 }
                r1.F = r5     // Catch:{ all -> 0x00a8 }
                r1.G = r14     // Catch:{ all -> 0x00a8 }
                r1.H = r8     // Catch:{ all -> 0x00a8 }
                r1.I = r12     // Catch:{ all -> 0x00a8 }
                r1.J = r4     // Catch:{ all -> 0x00a8 }
                kotlinx.coroutines.CancellableContinuationImpl r15 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch:{ all -> 0x00a8 }
                kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r16)     // Catch:{ all -> 0x00a8 }
                r15.<init>(r6, r4)     // Catch:{ all -> 0x00a8 }
                r15.G()     // Catch:{ all -> 0x00a8 }
                androidx.lifecycle.Lifecycle$Event$Companion r6 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch:{ all -> 0x00a8 }
                androidx.lifecycle.Lifecycle$Event r7 = r6.c(r5)     // Catch:{ all -> 0x00a8 }
                androidx.lifecycle.Lifecycle$Event r9 = r6.a(r5)     // Catch:{ all -> 0x00a8 }
                r5 = 0
                kotlinx.coroutines.sync.Mutex r11 = kotlinx.coroutines.sync.MutexKt.b(r5, r4, r3)     // Catch:{ all -> 0x00a8 }
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r10 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x00a8 }
                r5 = r10
                r6 = r7
                r7 = r2
                r3 = r10
                r10 = r15
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00a8 }
                r13.f40908z = r3     // Catch:{ all -> 0x00a8 }
                java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                kotlin.jvm.internal.Intrinsics.g(r3, r5)     // Catch:{ all -> 0x00a8 }
                r10 = r3
                androidx.lifecycle.LifecycleEventObserver r10 = (androidx.lifecycle.LifecycleEventObserver) r10     // Catch:{ all -> 0x00a8 }
                r14.a(r10)     // Catch:{ all -> 0x00a8 }
                java.lang.Object r3 = r15.A()     // Catch:{ all -> 0x00a8 }
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch:{ all -> 0x00a8 }
                if (r3 != r5) goto L_0x00ac
                kotlin.coroutines.jvm.internal.DebugProbesKt.c(r16)     // Catch:{ all -> 0x00a8 }
                goto L_0x00ac
            L_0x00a8:
                r0 = move-exception
                r5 = r2
                r2 = r13
                goto L_0x00c9
            L_0x00ac:
                if (r3 != r0) goto L_0x00af
                return r0
            L_0x00af:
                r5 = r2
                r2 = r13
            L_0x00b1:
                java.lang.Object r0 = r5.f40908z
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                if (r0 == 0) goto L_0x00bb
                r3 = 0
                kotlinx.coroutines.Job.DefaultImpls.a(r0, r3, r4, r3)
            L_0x00bb:
                java.lang.Object r0 = r2.f40908z
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 == 0) goto L_0x00c6
                androidx.lifecycle.Lifecycle r2 = r4
                r2.d(r0)
            L_0x00c6:
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x00c9:
                java.lang.Object r3 = r5.f40908z
                kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
                if (r3 == 0) goto L_0x00d3
                r5 = 0
                kotlinx.coroutines.Job.DefaultImpls.a(r3, r5, r4, r5)
            L_0x00d3:
                java.lang.Object r2 = r2.f40908z
                androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
                if (r2 == 0) goto L_0x00de
                androidx.lifecycle.Lifecycle r3 = r4
                r3.d(r2)
            L_0x00de:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = lifecycle;
        this.G = state;
        this.H = function2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.F, this.G, this.H, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.E = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            MainCoroutineDispatcher H0 = Dispatchers.c().H0();
            final Lifecycle lifecycle = this.F;
            final Lifecycle.State state = this.G;
            final Function2 function2 = this.H;
            AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (BuildersKt.g(H0, r3, this) == f2) {
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
