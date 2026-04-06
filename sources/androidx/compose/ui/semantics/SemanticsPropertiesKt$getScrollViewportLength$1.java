package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SemanticsPropertiesKt$getScrollViewportLength$1 extends Lambda implements Function1<List<Float>, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f18147z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemanticsPropertiesKt$getScrollViewportLength$1(Function0 function0) {
        super(1);
        this.f18147z = function0;
    }

    /* renamed from: b */
    public final Boolean invoke(List list) {
        boolean z2;
        Float f2 = (Float) this.f18147z.invoke();
        if (f2 == null) {
            z2 = false;
        } else {
            list.add(f2);
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
