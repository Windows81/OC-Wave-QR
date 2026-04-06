package androidx.compose.foundation.text;

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
public final class CoreTextFieldKt$TextFieldCursorHandle$3$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f5724z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$3$1(long j2) {
        super(1);
        this.f5724z = j2;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SelectionHandlesKt.d(), new SelectionHandleInfo(Handle.Cursor, this.f5724z, SelectionHandleAnchor.Middle, true, (DefaultConstructorMarker) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
