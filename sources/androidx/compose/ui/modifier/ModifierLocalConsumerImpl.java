package androidx.compose.ui.modifier;

import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f17183A;

    public void H0(ModifierLocalReadScope modifierLocalReadScope) {
        this.f17183A.invoke(modifierLocalReadScope);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ModifierLocalConsumerImpl) && ((ModifierLocalConsumerImpl) obj).f17183A == this.f17183A;
    }

    public int hashCode() {
        return this.f17183A.hashCode();
    }
}
