package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2 implements DragAndDropTarget {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f3221A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ReceiveContentConfiguration f3222z;

    public ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2(ReceiveContentConfiguration receiveContentConfiguration, Function1 function1) {
        this.f3222z = receiveContentConfiguration;
        this.f3221A = function1;
    }

    public void M1(DragAndDropEvent dragAndDropEvent) {
        this.f3222z.a().c();
    }

    public void N0(DragAndDropEvent dragAndDropEvent) {
        this.f3222z.a().b();
    }

    public boolean d0(DragAndDropEvent dragAndDropEvent) {
        this.f3221A.invoke(dragAndDropEvent);
        TransferableContent b2 = ReceiveContentDragAndDropNode_androidKt.b(dragAndDropEvent);
        return !Intrinsics.d(b2, this.f3222z.a().e(b2));
    }

    public void f0(DragAndDropEvent dragAndDropEvent) {
        this.f3222z.a().a();
    }

    public void r2(DragAndDropEvent dragAndDropEvent) {
        this.f3222z.a().d();
    }
}
