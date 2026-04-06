package androidx.compose.foundation.layout;

import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ConsumedInsetsModifier implements ModifierLocalConsumer {

    /* renamed from: A  reason: collision with root package name */
    public WindowInsets f3816A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3817z;

    public ConsumedInsetsModifier(Function1 function1) {
        this.f3817z = function1;
    }

    public void H0(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.b(WindowInsetsPaddingKt.c());
        if (!Intrinsics.d(windowInsets, this.f3816A)) {
            this.f3816A = windowInsets;
            this.f3817z.invoke(windowInsets);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumedInsetsModifier)) {
            return false;
        }
        return ((ConsumedInsetsModifier) obj).f3817z == this.f3817z;
    }

    public int hashCode() {
        return this.f3817z.hashCode();
    }
}
