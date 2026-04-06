package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2 extends Lambda implements Function0<Selection.AnchorInfo> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6791A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f6792B;
    public final /* synthetic */ SelectionLayout C;
    public final /* synthetic */ Lazy D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectableInfo f6793z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2(SelectableInfo selectableInfo, int i2, int i3, SelectionLayout selectionLayout, Lazy lazy) {
        super(0);
        this.f6793z = selectableInfo;
        this.f6791A = i2;
        this.f6792B = i3;
        this.C = selectionLayout;
        this.D = lazy;
    }

    /* renamed from: b */
    public final Selection.AnchorInfo invoke() {
        return SelectionAdjustmentKt.k(this.f6793z, SelectionAdjustmentKt.m(this.D), this.f6791A, this.f6792B, this.C.a(), this.C.j() == CrossStatus.CROSSED);
    }
}
