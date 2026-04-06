package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$LayoutWithLinksAndInlineContent$5$1 extends Lambda implements Function0<List<? extends Rect>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f5610z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$5$1(MutableState mutableState) {
        super(0);
        this.f5610z = mutableState;
    }

    /* renamed from: b */
    public final List invoke() {
        MutableState mutableState = this.f5610z;
        if (mutableState != null) {
            return (List) mutableState.getValue();
        }
        return null;
    }
}
