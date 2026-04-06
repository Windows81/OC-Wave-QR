package kotlinx.coroutines.stream;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata
final class StreamFlow<T> implements Flow<T> {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41956A = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: z  reason: collision with root package name */
    public final Stream f41957z;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.stream.StreamFlow$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = (kotlinx.coroutines.stream.StreamFlow$collect$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.E
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r4 = r0.C
            kotlinx.coroutines.stream.StreamFlow r4 = (kotlinx.coroutines.stream.StreamFlow) r4
            kotlin.ResultKt.b(r8)     // Catch:{ all -> 0x0036 }
            r8 = r2
            goto L_0x0058
        L_0x0036:
            r7 = move-exception
            goto L_0x007b
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.ResultKt.b(r8)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = f41956A
            r2 = 0
            boolean r8 = r8.compareAndSet(r6, r2, r3)
            if (r8 == 0) goto L_0x0081
            java.util.stream.Stream r8 = r6.f41957z     // Catch:{ all -> 0x0079 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0079 }
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0058:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0036 }
            r0.C = r4     // Catch:{ all -> 0x0036 }
            r0.D = r8     // Catch:{ all -> 0x0036 }
            r0.E = r7     // Catch:{ all -> 0x0036 }
            r0.H = r3     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r8.c(r2, r0)     // Catch:{ all -> 0x0036 }
            if (r2 != r1) goto L_0x0058
            return r1
        L_0x0071:
            java.util.stream.Stream r7 = r4.f41957z
            r7.close()
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0079:
            r7 = move-exception
            r4 = r6
        L_0x007b:
            java.util.stream.Stream r8 = r4.f41957z
            r8.close()
            throw r7
        L_0x0081:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Stream.consumeAsFlow can be collected only once"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
