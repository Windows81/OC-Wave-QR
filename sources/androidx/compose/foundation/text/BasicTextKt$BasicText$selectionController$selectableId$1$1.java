package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$BasicText$selectionController$selectableId$1$1 extends Lambda implements Function0<Long> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrar f5604z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$selectionController$selectableId$1$1(SelectionRegistrar selectionRegistrar) {
        super(0);
        this.f5604z = selectionRegistrar;
    }

    /* renamed from: b */
    public final Long invoke() {
        return Long.valueOf(this.f5604z.c());
    }
}
