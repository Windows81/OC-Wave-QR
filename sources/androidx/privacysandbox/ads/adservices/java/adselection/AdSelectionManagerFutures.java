package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
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
public abstract class AdSelectionManagerFutures {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22714a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {

        /* renamed from: b  reason: collision with root package name */
        public final AdSelectionManager f22715b;

        public ListenableFuture<Unit> b(ReportImpressionRequest reportImpressionRequest) {
            Intrinsics.i(reportImpressionRequest, "reportImpressionRequest");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public ListenableFuture<AdSelectionOutcome> c(AdSelectionConfig adSelectionConfig) {
            Intrinsics.i(adSelectionConfig, "adSelectionConfig");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
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
