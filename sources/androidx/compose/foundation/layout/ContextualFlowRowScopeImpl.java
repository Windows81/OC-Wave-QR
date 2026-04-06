package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContextualFlowRowScopeImpl implements RowScope, ContextualFlowRowScope {

    /* renamed from: a  reason: collision with root package name */
    public final int f3862a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3863b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3864c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3865d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RowScopeInstance f3866e;

    public /* synthetic */ ContextualFlowRowScopeImpl(int i2, int i3, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f2, f3);
    }

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f3866e.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier) {
        return this.f3866e.b(modifier);
    }

    public Modifier d(Modifier modifier, Alignment.Vertical vertical) {
        return this.f3866e.d(modifier, vertical);
    }

    public ContextualFlowRowScopeImpl(int i2, int i3, float f2, float f3) {
        this.f3862a = i2;
        this.f3863b = i3;
        this.f3864c = f2;
        this.f3865d = f3;
        this.f3866e = RowScopeInstance.f4150a;
    }
}
