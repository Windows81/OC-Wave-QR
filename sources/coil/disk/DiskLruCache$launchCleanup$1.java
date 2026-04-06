package coil.disk;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
public final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ DiskLruCache E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, Continuation continuation) {
        super(2, continuation);
        this.E = diskLruCache;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DiskLruCache$launchCleanup$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DiskLruCache$launchCleanup$1(this.E, continuation);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|13|14|15|16|(1:18)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        coil.disk.DiskLruCache.r(r3, true);
        coil.disk.DiskLruCache.m(r3, okio.Okio.c(okio.Okio.b()));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0040=Splitter:B:24:0x0040, B:13:0x0021=Splitter:B:13:0x0021, B:15:0x0024=Splitter:B:15:0x0024} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r3) {
        /*
            r2 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r2.D
            if (r0 != 0) goto L_0x0046
            kotlin.ResultKt.b(r3)
            coil.disk.DiskLruCache r3 = r2.E
            monitor-enter(r3)
            boolean r0 = r3.M     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r3.N     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001a
            goto L_0x0040
        L_0x001a:
            r0 = 1
            r3.c0()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0024
        L_0x001f:
            r0 = move-exception
            goto L_0x0044
        L_0x0021:
            r3.O = r0     // Catch:{ all -> 0x001f }
        L_0x0024:
            boolean r1 = r3.H()     // Catch:{ IOException -> 0x002e }
            if (r1 == 0) goto L_0x003c
            r3.f0()     // Catch:{ IOException -> 0x002e }
            goto L_0x003c
        L_0x002e:
            r3.P = r0     // Catch:{ all -> 0x001f }
            okio.Sink r0 = okio.Okio.b()     // Catch:{ all -> 0x001f }
            okio.BufferedSink r0 = okio.Okio.c(r0)     // Catch:{ all -> 0x001f }
            r3.K = r0     // Catch:{ all -> 0x001f }
        L_0x003c:
            monitor-exit(r3)
            kotlin.Unit r3 = kotlin.Unit.f40552a
            return r3
        L_0x0040:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x001f }
            monitor-exit(r3)
            return r0
        L_0x0044:
            monitor-exit(r3)
            throw r0
        L_0x0046:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache$launchCleanup$1.x(java.lang.Object):java.lang.Object");
    }
}
