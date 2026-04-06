package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements OffsetProvider, FunctionAdapter {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f6821z;

    public SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(Function0 function0) {
        this.f6821z = function0;
    }

    public final /* synthetic */ long a() {
        return ((Offset) this.f6821z.invoke()).t();
    }

    public final Function d() {
        return this.f6821z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OffsetProvider) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
