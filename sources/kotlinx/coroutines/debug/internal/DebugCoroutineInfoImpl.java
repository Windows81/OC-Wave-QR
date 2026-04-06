package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.sequences.SequencesKt;

@Metadata
public final class DebugCoroutineInfoImpl {
    public volatile WeakReference<CoroutineStackFrame> _lastObservedFrame;
    public volatile String _state;

    /* renamed from: a  reason: collision with root package name */
    public final StackTraceFrame f41543a;

    /* renamed from: b  reason: collision with root package name */
    public final long f41544b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f41545c;
    public volatile Thread lastObservedThread;

    public final List b() {
        StackTraceFrame stackTraceFrame = this.f41543a;
        return stackTraceFrame == null ? CollectionsKt.m() : SequencesKt.D(SequencesKt.b(new DebugCoroutineInfoImpl$creationStackTrace$1(this, stackTraceFrame, (Continuation) null)));
    }

    public final CoroutineContext c() {
        return (CoroutineContext) this.f41545c.get();
    }

    public final StackTraceFrame d() {
        return this.f41543a;
    }

    public final List e() {
        return b();
    }

    public final CoroutineStackFrame f() {
        WeakReference<CoroutineStackFrame> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String g() {
        return this._state;
    }

    public final List h() {
        CoroutineStackFrame f2 = f();
        if (f2 == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        while (f2 != null) {
            StackTraceElement p2 = f2.p();
            if (p2 != null) {
                arrayList.add(p2);
            }
            f2 = f2.e();
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.sequences.SequenceScope r5, kotlin.coroutines.jvm.internal.CoroutineStackFrame r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r5 = r0.E
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r5 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r5
            java.lang.Object r6 = r0.D
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Object r2 = r0.C
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            kotlin.ResultKt.b(r7)
            goto L_0x005f
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003d:
            kotlin.ResultKt.b(r7)
            r7 = r6
            r6 = r4
        L_0x0042:
            if (r7 != 0) goto L_0x0047
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x0047:
            java.lang.StackTraceElement r2 = r7.p()
            if (r2 == 0) goto L_0x0062
            r0.C = r5
            r0.D = r7
            r0.E = r6
            r0.H = r3
            java.lang.Object r2 = r5.c(r2, r0)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r5
            r5 = r6
            r6 = r7
        L_0x005f:
            r7 = r6
            r6 = r5
            r5 = r2
        L_0x0062:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r7.e()
            if (r7 == 0) goto L_0x0069
            goto L_0x0042
        L_0x0069:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.i(kotlin.sequences.SequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
