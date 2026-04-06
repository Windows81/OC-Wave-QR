package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.net.Uri;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public abstract class AdSelectionManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22679a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4Impl extends AdSelectionManager {

        /* renamed from: b  reason: collision with root package name */
        public final android.adservices.adselection.AdSelectionManager f22680b;

        public Object a(ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22680b.reportImpression(i(reportImpressionRequest), new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object b(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                if (r0 == 0) goto L_0x0013
                r0 = r6
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1) r0
                int r1 = r0.F
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.F = r1
                goto L_0x0018
            L_0x0013:
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.D
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.F
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r5 = r0.C
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl r5 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl) r5
                kotlin.ResultKt.b(r6)
                goto L_0x0048
            L_0x002d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0035:
                kotlin.ResultKt.b(r6)
                android.adservices.adselection.AdSelectionConfig r5 = r4.e(r5)
                r0.C = r4
                r0.F = r3
                java.lang.Object r6 = r4.k(r5, r0)
                if (r6 != r1) goto L_0x0047
                return r1
            L_0x0047:
                r5 = r4
            L_0x0048:
                android.adservices.adselection.AdSelectionOutcome r6 = androidx.privacysandbox.ads.adservices.adselection.j.a(r6)
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = r5.j(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.b(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final AdSelectionConfig e(AdSelectionConfig adSelectionConfig) {
            AdSelectionConfig a2 = m.a().setAdSelectionSignals(f(adSelectionConfig.a())).setCustomAudienceBuyers(g(adSelectionConfig.b())).setDecisionLogicUri(adSelectionConfig.c()).setSeller(AdTechIdentifier.fromString(adSelectionConfig.e().a())).setPerBuyerSignals(h(adSelectionConfig.d())).setSellerSignals(f(adSelectionConfig.f())).setTrustedScoringSignalsUri(adSelectionConfig.g()).build();
            Intrinsics.h(a2, "Builder()\n              …\n                .build()");
            return a2;
        }

        public final AdSelectionSignals f(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            AdSelectionSignals a2 = AdSelectionSignals.fromString(adSelectionSignals.a());
            Intrinsics.h(a2, "fromString(request.signals)");
            return a2;
        }

        public final List g(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AdTechIdentifier a2 = AdTechIdentifier.fromString(((androidx.privacysandbox.ads.adservices.common.AdTechIdentifier) it.next()).a());
                Intrinsics.h(a2, "fromString(buyer.identifier)");
                arrayList.add(a2);
            }
            return arrayList;
        }

        public final Map h(Map map) {
            AdSelectionSignals adSelectionSignals;
            HashMap hashMap = new HashMap();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map.keySet()) {
                AdTechIdentifier a2 = AdTechIdentifier.fromString(adTechIdentifier.a());
                Intrinsics.h(a2, "fromString(key.identifier)");
                if (map.get(adTechIdentifier) != null) {
                    Object obj = map.get(adTechIdentifier);
                    Intrinsics.f(obj);
                    adSelectionSignals = f((androidx.privacysandbox.ads.adservices.common.AdSelectionSignals) obj);
                } else {
                    adSelectionSignals = null;
                }
                hashMap.put(a2, adSelectionSignals);
            }
            return hashMap;
        }

        public final ReportImpressionRequest i(ReportImpressionRequest reportImpressionRequest) {
            l.a();
            return k.a(reportImpressionRequest.b(), e(reportImpressionRequest.a()));
        }

        public final AdSelectionOutcome j(AdSelectionOutcome adSelectionOutcome) {
            long a2 = adSelectionOutcome.getAdSelectionId();
            Uri a3 = adSelectionOutcome.getRenderUri();
            Intrinsics.h(a3, "response.renderUri");
            return new AdSelectionOutcome(a2, a3);
        }

        public final Object k(AdSelectionConfig adSelectionConfig, Continuation continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22680b.selectAds(adSelectionConfig, new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2;
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

    public abstract Object a(ReportImpressionRequest reportImpressionRequest, Continuation continuation);

    public abstract Object b(AdSelectionConfig adSelectionConfig, Continuation continuation);
}
