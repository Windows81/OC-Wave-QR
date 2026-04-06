package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

@Metadata
public final class BoxScopeInstance implements BoxScope {

    /* renamed from: a  reason: collision with root package name */
    public static final BoxScopeInstance f3797a = new BoxScopeInstance();

    public Modifier a(Modifier modifier) {
        return modifier.o0(new BoxChildDataElement(Alignment.f15444a.e(), true, InspectableValueKt.b() ? new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1() : InspectableValueKt.a()));
    }

    public Modifier g(Modifier modifier, Alignment alignment) {
        return modifier.o0(new BoxChildDataElement(alignment, false, InspectableValueKt.b() ? new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(alignment) : InspectableValueKt.a()));
    }
}
