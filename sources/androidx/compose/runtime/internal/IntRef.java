package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata
public final class IntRef {

    /* renamed from: a  reason: collision with root package name */
    public int f15132a;

    public IntRef(int i2) {
        this.f15132a = i2;
    }

    public final int a() {
        return this.f15132a;
    }

    public final void b(int i2) {
        this.f15132a = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.f15132a);
        sb.append(")@");
        String num = Integer.toString(hashCode(), CharsKt.a(16));
        Intrinsics.h(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntRef(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
