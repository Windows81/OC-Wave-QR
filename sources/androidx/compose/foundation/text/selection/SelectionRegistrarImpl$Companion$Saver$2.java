package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionRegistrarImpl$Companion$Saver$2 extends Lambda implements Function1<Long, SelectionRegistrarImpl> {

    /* renamed from: z  reason: collision with root package name */
    public static final SelectionRegistrarImpl$Companion$Saver$2 f6953z = new SelectionRegistrarImpl$Companion$Saver$2();

    public SelectionRegistrarImpl$Companion$Saver$2() {
        super(1);
    }

    public final SelectionRegistrarImpl b(long j2) {
        return new SelectionRegistrarImpl(j2, (DefaultConstructorMarker) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).longValue());
    }
}
