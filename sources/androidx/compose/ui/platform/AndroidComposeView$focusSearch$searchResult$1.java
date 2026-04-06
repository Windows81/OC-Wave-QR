package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AndroidComposeView$focusSearch$searchResult$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f17507z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$focusSearch$searchResult$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f17507z = objectRef;
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        this.f17507z.f40908z = focusTargetNode;
        return Boolean.TRUE;
    }
}
