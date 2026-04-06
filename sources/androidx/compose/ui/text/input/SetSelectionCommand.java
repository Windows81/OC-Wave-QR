package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class SetSelectionCommand implements EditCommand {

    /* renamed from: a  reason: collision with root package name */
    public final int f18890a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18891b;

    public SetSelectionCommand(int i2, int i3) {
        this.f18890a = i2;
        this.f18891b = i3;
    }

    public void a(EditingBuffer editingBuffer) {
        int o2 = RangesKt.o(this.f18890a, 0, editingBuffer.h());
        int o3 = RangesKt.o(this.f18891b, 0, editingBuffer.h());
        if (o2 < o3) {
            editingBuffer.p(o2, o3);
        } else {
            editingBuffer.p(o3, o2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.f18890a == setSelectionCommand.f18890a && this.f18891b == setSelectionCommand.f18891b;
    }

    public int hashCode() {
        return (this.f18890a * 31) + this.f18891b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f18890a + ", end=" + this.f18891b + ')';
    }
}
