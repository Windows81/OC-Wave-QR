package androidx.compose.ui.modifier;

import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;

@Metadata
public final class ModifierLocalProviderKt$modifierLocalProvider$1 extends InspectorValueInfo implements ModifierLocalProvider<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final ProvidableModifierLocal f17194A;

    /* renamed from: B  reason: collision with root package name */
    public final State f17195B;

    public ProvidableModifierLocal getKey() {
        return this.f17194A;
    }

    public Object getValue() {
        return this.f17195B.getValue();
    }
}
