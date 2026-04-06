package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adid.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public class TopicsManagerImplCommon extends TopicsManager {

    /* renamed from: b  reason: collision with root package name */
    public final TopicsManager f22756b;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.C
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r4
            kotlin.ResultKt.b(r6)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.C = r4
            r0.F = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.e.a(r6)
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.e(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object a(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        return e(this, getTopicsRequest, continuation);
    }

    public GetTopicsRequest c(GetTopicsRequest getTopicsRequest) {
        Intrinsics.i(getTopicsRequest, "request");
        GetTopicsRequest a2 = a.a().setAdsSdkName(getTopicsRequest.a()).build();
        Intrinsics.h(a2, "Builder()\n            .s…ame)\n            .build()");
        return a2;
    }

    public final GetTopicsResponse d(GetTopicsResponse getTopicsResponse) {
        Intrinsics.i(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (Object a2 : getTopicsResponse.getTopics()) {
            Topic a3 = g.a(a2);
            arrayList.add(new Topic(a3.getTaxonomyVersion(), a3.getModelVersion(), a3.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    public final Object f(GetTopicsRequest getTopicsRequest, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        this.f22756b.getTopics(getTopicsRequest, new e(), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }
}
