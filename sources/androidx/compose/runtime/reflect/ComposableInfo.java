package androidx.compose.runtime.reflect;

import kotlin.Metadata;

@Metadata
public final class ComposableInfo {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15188a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15189b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15190c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15191d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) obj;
        return this.f15188a == composableInfo.f15188a && this.f15189b == composableInfo.f15189b && this.f15190c == composableInfo.f15190c && this.f15191d == composableInfo.f15191d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f15188a) * 31) + Integer.hashCode(this.f15189b)) * 31) + Integer.hashCode(this.f15190c)) * 31) + Integer.hashCode(this.f15191d);
    }

    public String toString() {
        return "ComposableInfo(isComposable=" + this.f15188a + ", realParamsCount=" + this.f15189b + ", changedParams=" + this.f15190c + ", defaultParams=" + this.f15191d + ')';
    }
}
