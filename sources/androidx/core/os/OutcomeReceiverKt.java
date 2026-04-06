package androidx.core.os;

import android.os.OutcomeReceiver;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class OutcomeReceiverKt {
    public static final OutcomeReceiver a(Continuation continuation) {
        return a.a(new ContinuationOutcomeReceiver(continuation));
    }
}
