package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.e;
import androidx.privacysandbox.ads.adservices.common.AdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public abstract class CustomAudienceManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22703a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext4Impl extends CustomAudienceManager {

        /* renamed from: b  reason: collision with root package name */
        public final android.adservices.customaudience.CustomAudienceManager f22704b;

        public Object a(JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22704b.joinCustomAudience(j(joinCustomAudienceRequest), new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        public Object b(LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22704b.leaveCustomAudience(k(leaveCustomAudienceRequest), new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        public final List f(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AdData adData = (AdData) it.next();
                android.adservices.common.AdData a2 = y.a().setMetadata(adData.a()).setRenderUri(adData.b()).build();
                Intrinsics.h(a2, "Builder()\n              …                 .build()");
                arrayList.add(a2);
            }
            return arrayList;
        }

        public final AdTechIdentifier g(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier) {
            AdTechIdentifier a2 = AdTechIdentifier.fromString(adTechIdentifier.a());
            Intrinsics.h(a2, "fromString(input.identifier)");
            return a2;
        }

        public final AdSelectionSignals h(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            if (adSelectionSignals == null) {
                return null;
            }
            return AdSelectionSignals.fromString(adSelectionSignals.a());
        }

        public final CustomAudience i(CustomAudience customAudience) {
            CustomAudience a2 = u.a().setActivationTime(customAudience.a()).setAds(f(customAudience.b())).setBiddingLogicUri(customAudience.c()).setBuyer(g(customAudience.d())).setDailyUpdateUri(customAudience.e()).setExpirationTime(customAudience.f()).setName(customAudience.g()).setTrustedBiddingData(l(customAudience.h())).setUserBiddingSignals(h(customAudience.i())).build();
            Intrinsics.h(a2, "Builder()\n              …\n                .build()");
            return a2;
        }

        public final JoinCustomAudienceRequest j(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            JoinCustomAudienceRequest a2 = w.a().setCustomAudience(i(joinCustomAudienceRequest.a())).build();
            Intrinsics.h(a2, "Builder()\n              …\n                .build()");
            return a2;
        }

        public final LeaveCustomAudienceRequest k(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            LeaveCustomAudienceRequest a2 = v.a().setBuyer(g(leaveCustomAudienceRequest.a())).setName(leaveCustomAudienceRequest.b()).build();
            Intrinsics.h(a2, "Builder()\n              …\n                .build()");
            return a2;
        }

        public final TrustedBiddingData l(TrustedBiddingData trustedBiddingData) {
            if (trustedBiddingData == null) {
                return null;
            }
            return x.a().setTrustedBiddingKeys(trustedBiddingData.a()).setTrustedBiddingUri(trustedBiddingData.b()).build();
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

    public abstract Object a(JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation continuation);

    public abstract Object b(LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation continuation);
}
