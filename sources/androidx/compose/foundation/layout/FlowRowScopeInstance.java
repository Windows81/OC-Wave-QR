package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class FlowRowScopeInstance implements RowScope, FlowRowScope {

    /* renamed from: b  reason: collision with root package name */
    public static final FlowRowScopeInstance f4042b = new FlowRowScopeInstance();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RowScopeInstance f4043a = RowScopeInstance.f4150a;

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f4043a.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier) {
        return this.f4043a.b(modifier);
    }

    public Modifier d(Modifier modifier, Alignment.Vertical vertical) {
        return this.f4043a.d(modifier, vertical);
    }
}
