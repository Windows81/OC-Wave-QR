package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {

    /* renamed from: A  reason: collision with root package name */
    public final Function3 f15481A;

    public ComposedModifier(Function1 function1, Function3 function3) {
        super(function1);
        this.f15481A = function3;
    }

    public final Function3 a() {
        return this.f15481A;
    }
}
