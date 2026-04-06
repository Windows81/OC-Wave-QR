package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposedModifierKt$materializeImpl$1 extends Lambda implements Function1<Modifier.Element, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposedModifierKt$materializeImpl$1 f15482z = new ComposedModifierKt$materializeImpl$1();

    public ComposedModifierKt$materializeImpl$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(Modifier.Element element) {
        return Boolean.valueOf(!(element instanceof ComposedModifier));
    }
}
