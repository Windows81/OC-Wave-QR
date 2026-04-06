package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionRegistrarImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, SelectionRegistrarImpl, Long> {

    /* renamed from: z  reason: collision with root package name */
    public static final SelectionRegistrarImpl$Companion$Saver$1 f6952z = new SelectionRegistrarImpl$Companion$Saver$1();

    public SelectionRegistrarImpl$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Long m(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
        return Long.valueOf(selectionRegistrarImpl.f6943d.get());
    }
}
