package androidx.compose.runtime.tooling;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComposeStackTraceFrame {

    /* renamed from: a  reason: collision with root package name */
    public final SourceInformation f15390a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f15391b;

    public ComposeStackTraceFrame(SourceInformation sourceInformation, Integer num) {
        this.f15390a = sourceInformation;
        this.f15391b = num;
    }

    public static /* synthetic */ ComposeStackTraceFrame b(ComposeStackTraceFrame composeStackTraceFrame, SourceInformation sourceInformation, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sourceInformation = composeStackTraceFrame.f15390a;
        }
        if ((i2 & 2) != 0) {
            num = composeStackTraceFrame.f15391b;
        }
        return composeStackTraceFrame.a(sourceInformation, num);
    }

    public final ComposeStackTraceFrame a(SourceInformation sourceInformation, Integer num) {
        return new ComposeStackTraceFrame(sourceInformation, num);
    }

    public final Integer c() {
        return this.f15391b;
    }

    public final SourceInformation d() {
        return this.f15390a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) obj;
        return Intrinsics.d(this.f15390a, composeStackTraceFrame.f15390a) && Intrinsics.d(this.f15391b, composeStackTraceFrame.f15391b);
    }

    public int hashCode() {
        int hashCode = this.f15390a.hashCode() * 31;
        Integer num = this.f15391b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.f15390a + ", groupOffset=" + this.f15391b + ')';
    }
}
