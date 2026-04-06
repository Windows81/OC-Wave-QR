package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {

    /* renamed from: b  reason: collision with root package name */
    public static final FlowColumnScopeInstance f3922b = new FlowColumnScopeInstance();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ColumnScopeInstance f3923a = ColumnScopeInstance.f3815a;

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f3923a.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.f3923a.b(modifier, horizontal);
    }
}
