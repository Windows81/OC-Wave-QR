package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 implements ColorProducer, FunctionAdapter {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11398z;

    public TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(Function0 function0) {
        this.f11398z = function0;
    }

    public final /* synthetic */ long a() {
        return ((Color) this.f11398z.invoke()).v();
    }

    public final Function d() {
        return this.f11398z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ColorProducer) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
