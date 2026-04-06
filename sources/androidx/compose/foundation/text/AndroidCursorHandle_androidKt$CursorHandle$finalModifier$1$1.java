package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f5467z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1(OffsetProvider offsetProvider) {
        super(1);
        this.f5467z = offsetProvider;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SelectionHandlesKt.d(), new SelectionHandleInfo(Handle.Cursor, this.f5467z.a(), SelectionHandleAnchor.Middle, true, (DefaultConstructorMarker) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
