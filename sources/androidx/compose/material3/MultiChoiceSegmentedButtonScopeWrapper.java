package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
final class MultiChoiceSegmentedButtonScopeWrapper implements MultiChoiceSegmentedButtonRowScope, RowScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RowScope f10381a;

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f10381a.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier) {
        return this.f10381a.b(modifier);
    }

    public Modifier d(Modifier modifier, Alignment.Vertical vertical) {
        return this.f10381a.d(modifier, vertical);
    }
}
