package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2 extends Lambda implements Function0<Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6794A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectableInfo f6795z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2(SelectableInfo selectableInfo, int i2) {
        super(0);
        this.f6795z = selectableInfo;
        this.f6794A = i2;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.f6795z.k().q(this.f6794A));
    }
}
