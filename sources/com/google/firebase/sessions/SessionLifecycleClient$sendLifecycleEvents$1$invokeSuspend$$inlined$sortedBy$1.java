package com.google.firebase.sessions;

import android.os.Message;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
public final class SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
