package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.e;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
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
public abstract class MeasurementManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22735a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MeasurementManager a(Context context) {
            Intrinsics.i(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            AdServicesInfo adServicesInfo = AdServicesInfo.f22710a;
            sb.append(adServicesInfo.a());
            Log.d("MeasurementManager", sb.toString());
            if (adServicesInfo.a() >= 5) {
                return new Api33Ext5Impl(context);
            }
            return null;
        }

        public Companion() {
        }
    }

    public abstract Object a(DeletionRequest deletionRequest, Continuation continuation);

    public abstract Object b(Continuation continuation);

    public abstract Object c(Uri uri, InputEvent inputEvent, Continuation continuation);

    public abstract Object d(Uri uri, Continuation continuation);

    public abstract Object e(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation continuation);

    public abstract Object f(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation continuation);

    @Metadata
    public static final class Api33Ext5Impl extends MeasurementManager {

        /* renamed from: b  reason: collision with root package name */
        public final android.adservices.measurement.MeasurementManager f22736b;

        public Api33Ext5Impl(android.adservices.measurement.MeasurementManager measurementManager) {
            Intrinsics.i(measurementManager, "mMeasurementManager");
            this.f22736b = measurementManager;
        }

        public Object a(DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22736b.deleteRegistrations(k(deletionRequest), new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        public Object b(Continuation<? super Integer> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22736b.getMeasurementApiStatus(new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2;
        }

        public Object c(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22736b.registerSource(uri, inputEvent, new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        public Object d(Uri uri, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22736b.registerTrigger(uri, new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        public Object e(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22736b.registerWebSource(m(webSourceRegistrationRequest), new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        public Object f(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            this.f22736b.registerWebTrigger(o(webTriggerRegistrationRequest), new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        }

        public final DeletionRequest k(DeletionRequest deletionRequest) {
            DeletionRequest a2 = C0382d.a().setDeletionMode(deletionRequest.a()).setMatchBehavior(deletionRequest.d()).setStart(deletionRequest.f()).setEnd(deletionRequest.c()).setDomainUris(deletionRequest.b()).setOriginUris(deletionRequest.e()).build();
            Intrinsics.h(a2, "Builder()\n              …\n                .build()");
            return a2;
        }

        public final List l(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WebSourceParams webSourceParams = (WebSourceParams) it.next();
                C0381c.a();
                WebSourceParams a2 = C0380b.a(webSourceParams.b()).setDebugKeyAllowed(webSourceParams.a()).build();
                Intrinsics.h(a2, "Builder(param.registrati…                 .build()");
                arrayList.add(a2);
            }
            return arrayList;
        }

        public final WebSourceRegistrationRequest m(WebSourceRegistrationRequest webSourceRegistrationRequest) {
            C0384f.a();
            WebSourceRegistrationRequest a2 = C0383e.a(l(webSourceRegistrationRequest.f()), webSourceRegistrationRequest.c()).setWebDestination(webSourceRegistrationRequest.e()).setAppDestination(webSourceRegistrationRequest.a()).setInputEvent(webSourceRegistrationRequest.b()).setVerifiedDestination(webSourceRegistrationRequest.d()).build();
            Intrinsics.h(a2, "Builder(\n               …\n                .build()");
            return a2;
        }

        public final List n(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WebTriggerParams webTriggerParams = (WebTriggerParams) it.next();
                H.a();
                WebTriggerParams a2 = G.a(webTriggerParams.b()).setDebugKeyAllowed(webTriggerParams.a()).build();
                Intrinsics.h(a2, "Builder(param.registrati…                 .build()");
                arrayList.add(a2);
            }
            return arrayList;
        }

        public final WebTriggerRegistrationRequest o(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            C0386h.a();
            WebTriggerRegistrationRequest a2 = C0385g.a(n(webTriggerRegistrationRequest.b()), webTriggerRegistrationRequest.a()).build();
            Intrinsics.h(a2, "Builder(\n               …\n                .build()");
            return a2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Api33Ext5Impl(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.i(r2, r0)
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.measurement.B.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.Intrinsics.h(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = androidx.privacysandbox.ads.adservices.measurement.C.a(r2)
                r1.<init>((android.adservices.measurement.MeasurementManager) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.measurement.MeasurementManager.Api33Ext5Impl.<init>(android.content.Context):void");
        }
    }
}
