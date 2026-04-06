package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class ImeEditCommand_androidKt$setComposingRegion$1 extends Lambda implements Function1<TextFieldBuffer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6203A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f6204z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImeEditCommand_androidKt$setComposingRegion$1(int i2, int i3) {
        super(1);
        this.f6204z = i2;
        this.f6203A = i3;
    }

    public final void b(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.m()) {
            textFieldBuffer.d();
        }
        int o2 = RangesKt.o(this.f6204z, 0, textFieldBuffer.j());
        int o3 = RangesKt.o(this.f6203A, 0, textFieldBuffer.j());
        if (o2 == o3) {
            return;
        }
        if (o2 < o3) {
            TextFieldBuffer.u(textFieldBuffer, o2, o3, (List) null, 4, (Object) null);
        } else {
            TextFieldBuffer.u(textFieldBuffer, o3, o2, (List) null, 4, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldBuffer) obj);
        return Unit.f40552a;
    }
}
