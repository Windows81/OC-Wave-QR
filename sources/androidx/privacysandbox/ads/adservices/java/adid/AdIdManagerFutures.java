package androidx.privacysandbox.ads.adservices.java.adid;

import androidx.privacysandbox.ads.adservices.adid.AdId;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

@Metadata
public abstract class AdIdManagerFutures {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22712a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4JavaImpl extends AdIdManagerFutures {

        /* renamed from: b  reason: collision with root package name */
        public final AdIdManager f22713b;

        public ListenableFuture<AdId> b() {
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
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
