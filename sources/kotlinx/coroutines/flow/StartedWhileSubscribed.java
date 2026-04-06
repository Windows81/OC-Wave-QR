package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata
final class StartedWhileSubscribed implements SharingStarted {

    /* renamed from: b  reason: collision with root package name */
    public final long f41767b;

    /* renamed from: c  reason: collision with root package name */
    public final long f41768c;

    public StartedWhileSubscribed(long j2, long j3) {
        this.f41767b = j2;
        this.f41768c = j3;
        if (j2 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j2 + " ms) cannot be negative").toString());
        } else if (j3 < 0) {
            throw new IllegalArgumentException(("replayExpiration(" + j3 + " ms) cannot be negative").toString());
        }
    }

    public Flow a(StateFlow stateFlow) {
        return FlowKt.u(FlowKt.x(FlowKt.h0(stateFlow, new StartedWhileSubscribed$command$1(this, (Continuation) null)), new StartedWhileSubscribed$command$2((Continuation) null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            return this.f41767b == startedWhileSubscribed.f41767b && this.f41768c == startedWhileSubscribed.f41768c;
        }
    }

    public int hashCode() {
        return (Long.hashCode(this.f41767b) * 31) + Long.hashCode(this.f41768c);
    }

    public String toString() {
        List d2 = CollectionsKt.d(2);
        if (this.f41767b > 0) {
            d2.add("stopTimeout=" + this.f41767b + "ms");
        }
        if (this.f41768c < Long.MAX_VALUE) {
            d2.add("replayExpiration=" + this.f41768c + "ms");
        }
        List a2 = CollectionsKt.a(d2);
        return "SharingStarted.WhileSubscribed(" + CollectionsKt.n0(a2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ')';
    }
}
