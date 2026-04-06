package androidx.privacysandbox.ads.adservices.java.appsetid;

import androidx.privacysandbox.ads.adservices.appsetid.AppSetId;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
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
public abstract class AppSetIdManagerFutures {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22716a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {

        /* renamed from: b  reason: collision with root package name */
        public final AppSetIdManager f22717b;

        public ListenableFuture<AppSetId> b() {
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
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
