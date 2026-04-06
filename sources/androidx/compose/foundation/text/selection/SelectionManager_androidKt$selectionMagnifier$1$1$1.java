package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager_androidKt$selectionMagnifier$1$1$1 extends Lambda implements Function0<Offset> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f6926A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6927z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$selectionMagnifier$1$1$1(SelectionManager selectionManager, MutableState mutableState) {
        super(0);
        this.f6927z = selectionManager;
        this.f6926A = mutableState;
    }

    public final long b() {
        return SelectionManagerKt.c(this.f6927z, SelectionManager_androidKt$selectionMagnifier$1.f(this.f6926A));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.d(b());
    }
}
