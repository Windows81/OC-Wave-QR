package io.realm.kotlin;

import io.realm.Realm;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "io.realm.kotlin.RealmExtensionsKt", f = "RealmExtensions.kt", l = {142}, m = "executeTransactionAwait")
public final class RealmExtensionsKt$executeTransactionAwait$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public RealmExtensionsKt$executeTransactionAwait$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return RealmExtensionsKt.a((Realm) null, (CoroutineContext) null, (Function1) null, this);
    }
}
