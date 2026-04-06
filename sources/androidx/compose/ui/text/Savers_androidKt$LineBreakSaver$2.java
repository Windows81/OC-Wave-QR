package androidx.compose.ui.text;

import androidx.compose.ui.text.style.LineBreak;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Savers_androidKt$LineBreakSaver$2 extends Lambda implements Function1<Object, LineBreak> {

    /* renamed from: z  reason: collision with root package name */
    public static final Savers_androidKt$LineBreakSaver$2 f18426z = new Savers_androidKt$LineBreakSaver$2();

    public Savers_androidKt$LineBreakSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final LineBreak invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return LineBreak.c(LineBreak.d(((Integer) obj).intValue()));
    }
}
