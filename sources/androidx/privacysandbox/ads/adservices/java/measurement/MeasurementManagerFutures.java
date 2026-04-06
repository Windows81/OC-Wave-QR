package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
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
public abstract class MeasurementManagerFutures {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22724a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* renamed from: b  reason: collision with root package name */
        public final MeasurementManager f22725b;

        public Api33Ext5JavaImpl(MeasurementManager measurementManager) {
            Intrinsics.i(measurementManager, "mMeasurementManager");
            this.f22725b = measurementManager;
        }

        public ListenableFuture<Integer> b() {
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public ListenableFuture<Unit> c(Uri uri) {
            Intrinsics.i(uri, "trigger");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, uri, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public ListenableFuture<Unit> e(DeletionRequest deletionRequest) {
            Intrinsics.i(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public ListenableFuture<Unit> f(Uri uri, InputEvent inputEvent) {
            Intrinsics.i(uri, "attributionSource");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, uri, inputEvent, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public ListenableFuture<Unit> g(WebSourceRegistrationRequest webSourceRegistrationRequest) {
            Intrinsics.i(webSourceRegistrationRequest, "request");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, webSourceRegistrationRequest, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public ListenableFuture<Unit> h(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            Intrinsics.i(webTriggerRegistrationRequest, "request");
            return CoroutineAdapterKt.c(BuildersKt__Builders_commonKt.b(CoroutineScopeKt.a(Dispatchers.a()), (CoroutineContext) null, (CoroutineStart) null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, webTriggerRegistrationRequest, (Continuation) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MeasurementManagerFutures a(Context context) {
            Intrinsics.i(context, "context");
            MeasurementManager a2 = MeasurementManager.f22735a.a(context);
            if (a2 != null) {
                return new Api33Ext5JavaImpl(a2);
            }
            return null;
        }

        public Companion() {
        }
    }

    public static final MeasurementManagerFutures a(Context context) {
        return f22724a.a(context);
    }

    public abstract ListenableFuture b();

    public abstract ListenableFuture c(Uri uri);
}
