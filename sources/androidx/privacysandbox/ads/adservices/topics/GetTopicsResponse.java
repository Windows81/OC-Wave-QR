package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetTopicsResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f22751a;

    public GetTopicsResponse(List list) {
        Intrinsics.i(list, "topics");
        this.f22751a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (this.f22751a.size() != getTopicsResponse.f22751a.size()) {
            return false;
        }
        return Intrinsics.d(new HashSet(this.f22751a), new HashSet(getTopicsResponse.f22751a));
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f22751a});
    }

    public String toString() {
        return "Topics=" + this.f22751a;
    }
}
