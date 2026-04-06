package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class TopicsManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22755a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public abstract Object a(GetTopicsRequest getTopicsRequest, Continuation continuation);
}
