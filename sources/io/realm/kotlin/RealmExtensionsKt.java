package io.realm.kotlin;

import kotlin.Metadata;

@Metadata
public final class RealmExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(io.realm.Realm r4, kotlin.coroutines.CoroutineContext r5, kotlin.jvm.functions.Function1 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1 r0 = (io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1 r0 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.C
            io.realm.Realm r4 = (io.realm.Realm) r4
            kotlin.ResultKt.b(r7)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.b(r7)
            io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2 r7 = new io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2
            r2 = 0
            r7.<init>(r4, r6, r2)
            r0.C = r4
            r0.E = r3
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.g(r5, r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r4.Q()
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.kotlin.RealmExtensionsKt.a(io.realm.Realm, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
