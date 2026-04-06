package androidx.privacysandbox.ads.adservices.java.topics;

import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

@Metadata
public abstract class TopicsManagerFutures {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22726a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {

        /* renamed from: b  reason: collision with root package name */
        public final TopicsManager f22727b;

        public ListenableFuture<GetTopicsResponse> b(GetTopicsRequest getTopicsRequest) {
            Intrinsics.i(getTopicsRequest, "request");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.c()), (CoroutineContext) null, (CoroutineStart) null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, getTopicsRequest, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
