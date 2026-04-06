package coil.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;

@Metadata
/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
public final class Lifecycles {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.lifecycle.Lifecycle r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles$awaitStarted$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            coil.util.-Lifecycles$awaitStarted$1 r0 = (coil.util.Lifecycles$awaitStarted$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            coil.util.-Lifecycles$awaitStarted$1 r0 = new coil.util.-Lifecycles$awaitStarted$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.D
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r0 = r0.C
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            kotlin.ResultKt.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x008c
        L_0x0031:
            r7 = move-exception
            goto L_0x0098
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.ResultKt.b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.b()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.f(r2)
            if (r7 == 0) goto L_0x004d
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x004d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.C = r6     // Catch:{ all -> 0x0081 }
            r0.D = r7     // Catch:{ all -> 0x0081 }
            r0.F = r3     // Catch:{ all -> 0x0081 }
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch:{ all -> 0x0081 }
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch:{ all -> 0x0081 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0081 }
            r2.G()     // Catch:{ all -> 0x0081 }
            coil.util.-Lifecycles$awaitStarted$2$1 r3 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch:{ all -> 0x0081 }
            r3.<init>(r2)     // Catch:{ all -> 0x0081 }
            r7.f40908z = r3     // Catch:{ all -> 0x0081 }
            kotlin.jvm.internal.Intrinsics.f(r3)     // Catch:{ all -> 0x0081 }
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3     // Catch:{ all -> 0x0081 }
            r6.a(r3)     // Catch:{ all -> 0x0081 }
            java.lang.Object r2 = r2.A()     // Catch:{ all -> 0x0081 }
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch:{ all -> 0x0081 }
            if (r2 != r3) goto L_0x0087
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L_0x0098
        L_0x0087:
            if (r2 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r0 = r6
            r6 = r7
        L_0x008c:
            java.lang.Object r6 = r6.f40908z
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L_0x0095
            r0.d(r6)
        L_0x0095:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0098:
            java.lang.Object r6 = r6.f40908z
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L_0x00a1
            r0.d(r6)
        L_0x00a1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.a(androidx.lifecycle.Lifecycle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.d(lifecycleObserver);
        lifecycle.a(lifecycleObserver);
    }
}
