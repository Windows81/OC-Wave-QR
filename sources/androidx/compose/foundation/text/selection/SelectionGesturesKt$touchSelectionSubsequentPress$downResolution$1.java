package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {283}, m = "invokeSuspend")
public final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super DownResolution>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f6836B;
    public /* synthetic */ Object C;
    public final /* synthetic */ long D;
    public final /* synthetic */ Ref.LongRef E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j2, Ref.LongRef longRef, Continuation continuation) {
        super(2, continuation);
        this.D = j2;
        this.E = longRef;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.D, this.E, continuation);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.C = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    public final Object x(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.f6836B;
        if (i2 == 0) {
            ResultKt.b(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.C;
            long j2 = this.D;
            SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1(this.E);
            this.C = awaitPointerEventScope2;
            this.f6836B = 1;
            Object i3 = DragGestureDetectorKt.i(awaitPointerEventScope2, j2, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1, this);
            if (i3 == f2) {
                return f2;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = i3;
        } else if (i2 == 1) {
            awaitPointerEventScope = (AwaitPointerEventScope) this.C;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((PointerInputChange) obj) != null && (this.E.f40907z & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.e0(awaitPointerEventScope.l0().c());
        if (!PointerEventKt.d(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.a();
        return DownResolution.Up;
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
