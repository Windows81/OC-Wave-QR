package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 extends Lambda implements Function1<ObserverNodeOwnerScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 f17421z = new ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1();

    public ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1() {
        super(1);
    }

    public final void b(ObserverNodeOwnerScope observerNodeOwnerScope) {
        if (observerNodeOwnerScope.v0()) {
            observerNodeOwnerScope.b().L1();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ObserverNodeOwnerScope) obj);
        return Unit.f40552a;
    }
}
