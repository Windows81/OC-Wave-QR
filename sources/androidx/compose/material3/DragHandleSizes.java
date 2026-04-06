package androidx.compose.material3;

import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DragHandleSizes {

    /* renamed from: a  reason: collision with root package name */
    public final long f9871a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9872b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9873c;

    public /* synthetic */ DragHandleSizes(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleSizes)) {
            return false;
        }
        DragHandleSizes dragHandleSizes = (DragHandleSizes) obj;
        return DpSize.h(this.f9871a, dragHandleSizes.f9871a) && DpSize.h(this.f9872b, dragHandleSizes.f9872b) && DpSize.h(this.f9873c, dragHandleSizes.f9873c);
    }

    public int hashCode() {
        return (((DpSize.k(this.f9871a) * 31) + DpSize.k(this.f9872b)) * 31) + DpSize.k(this.f9873c);
    }

    public DragHandleSizes(long j2, long j3, long j4) {
        this.f9871a = j2;
        this.f9872b = j3;
        this.f9873c = j4;
    }
}
