package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BringIntoViewResponderNode$bringIntoView$parentRect$1 extends Lambda implements Function0<Rect> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f5407A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f5408B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BringIntoViewResponderNode f5409z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringIntoView$parentRect$1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0) {
        super(0);
        this.f5409z = bringIntoViewResponderNode;
        this.f5407A = layoutCoordinates;
        this.f5408B = function0;
    }

    /* renamed from: b */
    public final Rect invoke() {
        Rect Z2 = BringIntoViewResponderNode.a3(this.f5409z, this.f5407A, this.f5408B);
        if (Z2 != null) {
            return this.f5409z.b3().b1(Z2);
        }
        return null;
    }
}
