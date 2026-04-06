package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1 extends Lambda implements Function1<List<? extends Rect>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f5614z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1(MutableState mutableState) {
        super(1);
        this.f5614z = mutableState;
    }

    public final void b(List list) {
        MutableState mutableState = this.f5614z;
        if (mutableState != null) {
            mutableState.setValue(list);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((List) obj);
        return Unit.f40552a;
    }
}
