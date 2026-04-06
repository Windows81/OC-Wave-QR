package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DelayKt;

@Metadata
final class OnTimeout {

    /* renamed from: a  reason: collision with root package name */
    public final long f41919a;

    public OnTimeout(long j2) {
        this.f41919a = j2;
    }

    public static final void e(SelectInstance selectInstance, OnTimeout onTimeout) {
        selectInstance.d(onTimeout, Unit.f40552a);
    }

    public final SelectClause0 c() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.I;
        Intrinsics.g(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new SelectClause0Impl(this, (Function3) TypeIntrinsics.e(onTimeout$selectClause$1, 3), (Function3) null, 4, (DefaultConstructorMarker) null);
    }

    public final void d(SelectInstance selectInstance, Object obj) {
        if (this.f41919a <= 0) {
            selectInstance.h(Unit.f40552a);
            return;
        }
        a aVar = new a(selectInstance, this);
        Intrinsics.g(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
        CoroutineContext f2 = selectImplementation.f();
        selectImplementation.a(DelayKt.d(f2).O(this.f41919a, aVar, f2));
    }
}
