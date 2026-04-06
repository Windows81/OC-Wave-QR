package androidx.compose.material3.internal;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 implements FloatProducer, FunctionAdapter {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f12368z;

    public TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(Function0 function0) {
        this.f12368z = function0;
    }

    public final Function d() {
        return this.f12368z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FloatProducer) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final /* synthetic */ float invoke() {
        return ((Number) this.f12368z.invoke()).floatValue();
    }
}
