package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

@Metadata
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {

    /* renamed from: A  reason: collision with root package name */
    public int f41779A;

    /* renamed from: B  reason: collision with root package name */
    public int f41780B;
    public SubscriptionCountStateFlow C;

    /* renamed from: z  reason: collision with root package name */
    public AbstractSharedFlowSlot[] f41781z;

    public final AbstractSharedFlowSlot f() {
        AbstractSharedFlowSlot abstractSharedFlowSlot;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                AbstractSharedFlowSlot[] abstractSharedFlowSlotArr = this.f41781z;
                if (abstractSharedFlowSlotArr == null) {
                    abstractSharedFlowSlotArr = l(2);
                    this.f41781z = abstractSharedFlowSlotArr;
                } else if (this.f41779A >= abstractSharedFlowSlotArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractSharedFlowSlotArr, abstractSharedFlowSlotArr.length * 2);
                    Intrinsics.h(copyOf, "copyOf(...)");
                    this.f41781z = (AbstractSharedFlowSlot[]) copyOf;
                    abstractSharedFlowSlotArr = (AbstractSharedFlowSlot[]) copyOf;
                }
                int i2 = this.f41780B;
                do {
                    abstractSharedFlowSlot = abstractSharedFlowSlotArr[i2];
                    if (abstractSharedFlowSlot == null) {
                        abstractSharedFlowSlot = j();
                        abstractSharedFlowSlotArr[i2] = abstractSharedFlowSlot;
                    }
                    i2++;
                    if (i2 >= abstractSharedFlowSlotArr.length) {
                        i2 = 0;
                    }
                    Intrinsics.g(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractSharedFlowSlot.a(this));
                this.f41780B = i2;
                this.f41779A++;
                subscriptionCountStateFlow = this.C;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.b0(1);
        }
        return abstractSharedFlowSlot;
    }

    public abstract AbstractSharedFlowSlot j();

    public final StateFlow k() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.C;
            if (subscriptionCountStateFlow == null) {
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(this.f41779A);
                this.C = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }

    public abstract AbstractSharedFlowSlot[] l(int i2);

    public final void m(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i2;
        Continuation[] b2;
        synchronized (this) {
            try {
                int i3 = this.f41779A - 1;
                this.f41779A = i3;
                subscriptionCountStateFlow = this.C;
                if (i3 == 0) {
                    this.f41780B = 0;
                }
                Intrinsics.g(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b2 = abstractSharedFlowSlot.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b2) {
            if (continuation != null) {
                Result.Companion companion = Result.f40519A;
                continuation.q(Result.b(Unit.f40552a));
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.b0(-1);
        }
    }

    public final int n() {
        return this.f41779A;
    }

    public final AbstractSharedFlowSlot[] o() {
        return this.f41781z;
    }
}
