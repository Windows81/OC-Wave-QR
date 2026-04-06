package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    public GetTopicsRequest c(GetTopicsRequest getTopicsRequest) {
        Intrinsics.i(getTopicsRequest, "request");
        GetTopicsRequest a2 = a.a().setAdsSdkName(getTopicsRequest.a()).setShouldRecordObservation(getTopicsRequest.b()).build();
        Intrinsics.h(a2, "Builder()\n            .s…ion)\n            .build()");
        return a2;
    }
}
