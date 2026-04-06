package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata
final class LazyActorCoroutine<E> extends ActorCoroutine<E> {
    public Continuation D;

    public Object L(Object obj) {
        start();
        return super.L(obj);
    }

    public Object O(Object obj, Continuation continuation) {
        start();
        Object O = super.O(obj, continuation);
        return O == IntrinsicsKt.f() ? O : Unit.f40552a;
    }

    public void b1() {
        CancellableKt.b(this.D, this);
    }

    public SelectClause2 s() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.I;
        Intrinsics.g(lazyActorCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new SelectClause2Impl(this, (Function3) TypeIntrinsics.e(lazyActorCoroutine$onSend$1, 3), super.s().d(), (Function3) null, 8, (DefaultConstructorMarker) null);
    }

    public final void y1(SelectInstance selectInstance, Object obj) {
        b1();
        super.s().a().d(this, selectInstance, obj);
    }

    public boolean z(Throwable th) {
        boolean z2 = super.z(th);
        start();
        return z2;
    }
}
