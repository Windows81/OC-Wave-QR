package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FocusOrderToProperties implements FocusPropertiesScope {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15757z;

    public void a(FocusProperties focusProperties) {
        this.f15757z.invoke(new FocusOrder(focusProperties));
    }
}
