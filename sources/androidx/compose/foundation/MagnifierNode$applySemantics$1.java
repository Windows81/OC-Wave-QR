package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MagnifierNode$applySemantics$1 extends Lambda implements Function0<Offset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MagnifierNode f3100z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierNode$applySemantics$1(MagnifierNode magnifierNode) {
        super(0);
        this.f3100z = magnifierNode;
    }

    public final long b() {
        return this.f3100z.c0;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.d(b());
    }
}
