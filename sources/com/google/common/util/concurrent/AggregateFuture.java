package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import java.util.concurrent.Future;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    public static final Logger L = Logger.getLogger(AggregateFuture.class.getName());
    public ImmutableCollection K;

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public void G(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.q(releaseResourcesReason);
        this.K = null;
    }

    public final void m() {
        super.m();
        ImmutableCollection immutableCollection = this.K;
        G(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean F = F();
            UnmodifiableIterator o2 = immutableCollection.iterator();
            while (o2.hasNext()) {
                ((Future) o2.next()).cancel(F);
            }
        }
    }

    public final String y() {
        ImmutableCollection immutableCollection = this.K;
        if (immutableCollection == null) {
            return super.y();
        }
        String valueOf = String.valueOf(immutableCollection);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }
}
