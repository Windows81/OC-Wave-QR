package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AndroidComposeView$requestFocus$focusSearchResult$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f17522A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f17523z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$requestFocus$focusSearchResult$1(Ref.BooleanRef booleanRef, int i2) {
        super(1);
        this.f17523z = booleanRef;
        this.f17522A = i2;
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        this.f17523z.f40901z = true;
        return Boolean.valueOf(focusTargetNode.c0(this.f17522A));
    }
}
