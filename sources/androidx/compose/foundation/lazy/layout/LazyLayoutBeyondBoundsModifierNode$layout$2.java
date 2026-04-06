package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
public final class LazyLayoutBeyondBoundsModifierNode$layout$2 implements BeyondBoundsLayout.BeyondBoundsScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutBeyondBoundsModifierNode f4794a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4795b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4796c;

    public LazyLayoutBeyondBoundsModifierNode$layout$2(LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode, Ref.ObjectRef objectRef, int i2) {
        this.f4794a = lazyLayoutBeyondBoundsModifierNode;
        this.f4795b = objectRef;
        this.f4796c = i2;
    }

    public boolean a() {
        return this.f4794a.b3((LazyLayoutBeyondBoundsInfo.Interval) this.f4795b.f40908z, this.f4796c);
    }
}
