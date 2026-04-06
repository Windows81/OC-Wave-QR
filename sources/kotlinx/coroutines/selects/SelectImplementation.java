package kotlinx.coroutines.selects;

import androidx.concurrent.futures.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;

@Metadata
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* renamed from: A  reason: collision with root package name */
    public List f41932A = new ArrayList(2);

    /* renamed from: B  reason: collision with root package name */
    public Object f41933B;
    public int C = -1;
    public Object D = SelectKt.f41948e;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f41945b;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f41934z;

    @Metadata
    public final class ClauseData {

        /* renamed from: a  reason: collision with root package name */
        public final Object f41935a;

        /* renamed from: b  reason: collision with root package name */
        public final Function3 f41936b;

        /* renamed from: c  reason: collision with root package name */
        public final Function3 f41937c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f41938d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f41939e;

        /* renamed from: f  reason: collision with root package name */
        public final Function3 f41940f;

        /* renamed from: g  reason: collision with root package name */
        public Object f41941g;

        /* renamed from: h  reason: collision with root package name */
        public int f41942h = -1;

        public ClauseData(Object obj, Function3 function3, Function3 function32, Object obj2, Object obj3, Function3 function33) {
            this.f41935a = obj;
            this.f41936b = function3;
            this.f41937c = function32;
            this.f41938d = obj2;
            this.f41939e = obj3;
            this.f41940f = function33;
        }

        public final Function3 a(SelectInstance selectInstance, Object obj) {
            Function3 function3 = this.f41940f;
            if (function3 != null) {
                return (Function3) function3.d(selectInstance, this.f41938d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f41941g;
            SelectImplementation selectImplementation = SelectImplementation.this;
            DisposableHandle disposableHandle = null;
            if (obj instanceof Segment) {
                ((Segment) obj).s(this.f41942h, (Throwable) null, selectImplementation.f());
                return;
            }
            if (obj instanceof DisposableHandle) {
                disposableHandle = (DisposableHandle) obj;
            }
            if (disposableHandle != null) {
                disposableHandle.d();
            }
        }

        public final Object c(Object obj, Continuation continuation) {
            Object obj2 = this.f41939e;
            if (this.f41938d == SelectKt.i()) {
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(continuation);
            }
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).m(obj, continuation);
        }

        public final Object d(Object obj) {
            return this.f41937c.d(this.f41935a, this.f41938d, obj);
        }

        public final boolean e(SelectImplementation selectImplementation) {
            this.f41936b.d(this.f41935a, selectImplementation, this.f41938d);
            return selectImplementation.D == SelectKt.f41948e;
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        this.f41934z = coroutineContext;
    }

    public static /* synthetic */ Object r(SelectImplementation selectImplementation, Continuation continuation) {
        return selectImplementation.v() ? selectImplementation.p(continuation) : selectImplementation.s(continuation);
    }

    private final boolean v() {
        return E.get(this) instanceof ClauseData;
    }

    public static /* synthetic */ void y(SelectImplementation selectImplementation, ClauseData clauseData, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            selectImplementation.x(clauseData, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    public final TrySelectDetailedResult A(Object obj, Object obj2) {
        return SelectKt.a(B(obj, obj2));
    }

    public final int B(Object obj, Object obj2) {
        while (true) {
            Object obj3 = E.get(this);
            if (obj3 instanceof CancellableContinuation) {
                ClauseData t2 = t(obj);
                if (t2 == null) {
                    continue;
                } else {
                    Function3 a2 = t2.a(this, obj2);
                    if (a.a(E, this, obj3, t2)) {
                        this.D = obj2;
                        if (SelectKt.j((CancellableContinuation) obj3, a2)) {
                            return 0;
                        }
                        this.D = SelectKt.f41948e;
                        return 2;
                    }
                }
            } else if (Intrinsics.d(obj3, SelectKt.f41946c) || (obj3 instanceof ClauseData)) {
                return 3;
            } else {
                if (Intrinsics.d(obj3, SelectKt.f41947d)) {
                    return 2;
                }
                if (Intrinsics.d(obj3, SelectKt.f41945b)) {
                    if (a.a(E, this, obj3, CollectionsKt.e(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (a.a(E, this, obj3, CollectionsKt.y0((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    public final Object C(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        AtomicReferenceFieldUpdater k2 = E;
        while (true) {
            Object obj = k2.get(this);
            if (obj == SelectKt.f41945b) {
                if (a.a(E, this, obj, cancellableContinuationImpl)) {
                    CancellableContinuationKt.c(cancellableContinuationImpl, this);
                    break;
                }
            } else if (obj instanceof List) {
                if (a.a(E, this, obj, SelectKt.f41945b)) {
                    for (Object m2 : (Iterable) obj) {
                        z(m2);
                    }
                }
            } else if (obj instanceof ClauseData) {
                cancellableContinuationImpl.w(Unit.f40552a, ((ClauseData) obj).a(this, this.D));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public void a(DisposableHandle disposableHandle) {
        this.f41933B = disposableHandle;
    }

    public void b(SelectClause0 selectClause0, Function1 function1) {
        y(this, new ClauseData(selectClause0.b(), selectClause0.a(), selectClause0.d(), SelectKt.i(), function1, selectClause0.c()), false, 1, (Object) null);
    }

    public void c(Segment segment, int i2) {
        this.f41933B = segment;
        this.C = i2;
    }

    public boolean d(Object obj, Object obj2) {
        return B(obj, obj2) == 0;
    }

    public void e(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater u2 = E;
        do {
            obj = u2.get(this);
            if (obj == SelectKt.f41946c) {
                return;
            }
        } while (!a.a(u2, this, obj, SelectKt.f41947d));
        List<ClauseData> list = this.f41932A;
        if (list != null) {
            for (ClauseData b2 : list) {
                b2.b();
            }
            this.D = SelectKt.f41948e;
            this.f41932A = null;
        }
    }

    public CoroutineContext f() {
        return this.f41934z;
    }

    public void g(SelectClause1 selectClause1, Function2 function2) {
        y(this, new ClauseData(selectClause1.b(), selectClause1.a(), selectClause1.d(), (Object) null, function2, selectClause1.c()), false, 1, (Object) null);
    }

    public void h(Object obj) {
        this.D = obj;
    }

    public final void n(Object obj) {
        List list = this.f41932A;
        Intrinsics.f(list);
        Iterable<ClauseData> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (ClauseData clauseData : iterable) {
                if (clauseData.f41935a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    public final void o(ClauseData clauseData) {
        List<ClauseData> list = this.f41932A;
        if (list != null) {
            for (ClauseData clauseData2 : list) {
                if (clauseData2 != clauseData) {
                    clauseData2.b();
                }
            }
            E.set(this, SelectKt.f41946c);
            this.D = SelectKt.f41948e;
            this.f41932A = null;
        }
    }

    public final Object p(Continuation continuation) {
        Object obj = E.get(this);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.D;
        o(clauseData);
        return clauseData.c(clauseData.d(obj2), continuation);
    }

    public Object q(Continuation continuation) {
        return r(this, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[PHI: r6 
      PHI: (r6v2 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:19:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r6)
            goto L_0x0057
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.C
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.ResultKt.b(r6)
            goto L_0x004b
        L_0x003c:
            kotlin.ResultKt.b(r6)
            r0.C = r5
            r0.F = r4
            java.lang.Object r6 = r5.C(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            r6 = 0
            r0.C = r6
            r0.F = r3
            java.lang.Object r6 = r2.p(r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.s(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlinx.coroutines.selects.SelectImplementation$ClauseData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.selects.SelectImplementation$ClauseData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlinx.coroutines.selects.SelectImplementation$ClauseData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.selects.SelectImplementation$ClauseData} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.selects.SelectImplementation.ClauseData t(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f41932A
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r3 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r3
            java.lang.Object r3 = r3.f41935a
            if (r3 != r5) goto L_0x000c
            r1 = r2
        L_0x001e:
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r1 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r1
            if (r1 == 0) goto L_0x0023
            return r1
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clause with object "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.t(java.lang.Object):kotlinx.coroutines.selects.SelectImplementation$ClauseData");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(kotlinx.coroutines.selects.SelectImplementation.ClauseData r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r7)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r7)
            java.lang.Object r6 = r5.d(r6)
            r0.E = r3
            java.lang.Object r7 = r5.c(r6, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.w(kotlinx.coroutines.selects.SelectImplementation$ClauseData, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void x(ClauseData clauseData, boolean z2) {
        if (!(E.get(this) instanceof ClauseData)) {
            if (!z2) {
                n(clauseData.f41935a);
            }
            if (clauseData.e(this)) {
                if (!z2) {
                    List list = this.f41932A;
                    Intrinsics.f(list);
                    list.add(clauseData);
                }
                clauseData.f41941g = this.f41933B;
                clauseData.f41942h = this.C;
                this.f41933B = null;
                this.C = -1;
                return;
            }
            E.set(this, clauseData);
        }
    }

    public final void z(Object obj) {
        ClauseData t2 = t(obj);
        Intrinsics.f(t2);
        t2.f41941g = null;
        t2.f41942h = -1;
        x(t2, true);
    }
}
