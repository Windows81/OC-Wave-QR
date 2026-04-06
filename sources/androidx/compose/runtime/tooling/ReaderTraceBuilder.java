package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotReader;
import kotlin.Metadata;

@Metadata
public final class ReaderTraceBuilder extends ComposeStackTraceBuilder {

    /* renamed from: b  reason: collision with root package name */
    public final SlotReader f15408b;

    public ReaderTraceBuilder(SlotReader slotReader) {
        this.f15408b = slotReader;
    }

    public int d(Anchor anchor) {
        SlotReader slotReader = this.f15408b;
        return slotReader.D(slotReader.z().g(anchor));
    }

    public GroupSourceInformation g(Anchor anchor) {
        return this.f15408b.z().M(this.f15408b.z().g(anchor));
    }
}
