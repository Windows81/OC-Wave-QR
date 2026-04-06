package io.realm.kotlin;

import io.realm.Realm;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
@DebugMetadata(c = "io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2", f = "RealmExtensions.kt", l = {}, m = "invokeSuspend")
public final class RealmExtensionsKt$executeTransactionAwait$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Realm F;
    public final /* synthetic */ Function1 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealmExtensionsKt$executeTransactionAwait$2(Realm realm, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.F = realm;
        this.G = function1;
    }

    public static final void C(Function1 function1, Realm realm) {
        function1.invoke(realm);
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealmExtensionsKt$executeTransactionAwait$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RealmExtensionsKt$executeTransactionAwait$2 realmExtensionsKt$executeTransactionAwait$2 = new RealmExtensionsKt$executeTransactionAwait$2(this.F, this.G, continuation);
        realmExtensionsKt$executeTransactionAwait$2.E = obj;
        return realmExtensionsKt$executeTransactionAwait$2;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.E;
            Realm G0 = Realm.G0(this.F.E());
            Function1 function1 = this.G;
            try {
                if (CoroutineScopeKt.h(coroutineScope)) {
                    G0.t0(new a(function1));
                }
                Unit unit = Unit.f40552a;
                CloseableKt.a(G0, (Throwable) null);
                return Unit.f40552a;
            } catch (Throwable th) {
                CloseableKt.a(G0, th);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
