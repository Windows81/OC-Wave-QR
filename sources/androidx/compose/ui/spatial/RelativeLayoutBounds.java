package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RelativeLayoutBounds {

    /* renamed from: a  reason: collision with root package name */
    public final long f18178a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18179b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18180c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18181d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f18182e;

    /* renamed from: f  reason: collision with root package name */
    public final DelegatableNode f18183f;

    public /* synthetic */ RelativeLayoutBounds(long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, fArr, delegatableNode);
    }

    public RelativeLayoutBounds(long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode) {
        this.f18178a = j2;
        this.f18179b = j3;
        this.f18180c = j4;
        this.f18181d = j5;
        this.f18182e = fArr;
        this.f18183f = delegatableNode;
    }
}
