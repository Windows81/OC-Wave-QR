package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContextualFlowColumnScopeImpl implements ColumnScope, ContextualFlowColumnScope {

    /* renamed from: a  reason: collision with root package name */
    public final int f3832a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3833b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3834c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3835d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ColumnScopeInstance f3836e;

    public /* synthetic */ ContextualFlowColumnScopeImpl(int i2, int i3, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f2, f3);
    }

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f3836e.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.f3836e.b(modifier, horizontal);
    }

    public ContextualFlowColumnScopeImpl(int i2, int i3, float f2, float f3) {
        this.f3832a = i2;
        this.f3833b = i3;
        this.f3834c = f2;
        this.f3835d = f3;
        this.f3836e = ColumnScopeInstance.f3815a;
    }
}
