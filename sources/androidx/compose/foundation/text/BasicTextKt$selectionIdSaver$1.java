package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$selectionIdSaver$1 extends Lambda implements Function2<SaverScope, Long, Long> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrar f5618z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(SelectionRegistrar selectionRegistrar) {
        super(2);
        this.f5618z = selectionRegistrar;
    }

    public final Long b(SaverScope saverScope, long j2) {
        if (SelectionRegistrarKt.b(this.f5618z, j2)) {
            return Long.valueOf(j2);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SaverScope) obj, ((Number) obj2).longValue());
    }
}
