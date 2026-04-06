package androidx.privacysandbox.ads.adservices.java.customaudience;

import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

@Metadata
public abstract class CustomAudienceManagerFutures {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22718a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {

        /* renamed from: b  reason: collision with root package name */
        public final CustomAudienceManager f22719b;

        public ListenableFuture<Unit> b(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            Intrinsics.i(joinCustomAudienceRequest, "request");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, joinCustomAudienceRequest, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public ListenableFuture<Unit> c(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            Intrinsics.i(leaveCustomAudienceRequest, "request");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, leaveCustomAudienceRequest, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
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
