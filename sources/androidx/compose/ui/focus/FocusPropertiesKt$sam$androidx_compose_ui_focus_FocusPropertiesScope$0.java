package androidx.compose.ui.focus;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, FunctionAdapter {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15800z;

    public final /* synthetic */ void a(FocusProperties focusProperties) {
        this.f15800z.invoke(focusProperties);
    }

    public final Function d() {
        return this.f15800z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FocusPropertiesScope) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
