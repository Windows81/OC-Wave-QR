package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
final class RectManager$currentRectInfo$1 extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DelegatableNode f18174A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ RectManager f18175B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f18176z;

    public final void b(int i2, int i3, int i4, int i5) {
        this.f18176z.f40908z = ThrottledCallbacksKt.a(this.f18174A, (((long) i2) << 32) | (((long) i3) & 4294967295L), (((long) i4) << 32) | (((long) i5) & 4294967295L), this.f18175B.f18165c.m(), this.f18175B.f18165c.k(), this.f18175B.f18165c.l());
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
