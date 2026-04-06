package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SourceInformationSlotTableGroupIdentity {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14916a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14917b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return false;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        return Intrinsics.d(this.f14916a, sourceInformationSlotTableGroupIdentity.f14916a) && this.f14917b == sourceInformationSlotTableGroupIdentity.f14917b;
    }

    public int hashCode() {
        return (this.f14916a.hashCode() * 31) + Integer.hashCode(this.f14917b);
    }

    public String toString() {
        return "SourceInformationSlotTableGroupIdentity(parentIdentity=" + this.f14916a + ", index=" + this.f14917b + ')';
    }
}
