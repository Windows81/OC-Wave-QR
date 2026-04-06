package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
public final class StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 implements Sequence<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CharSequence f41184a;

    public StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(CharSequence charSequence) {
        this.f41184a = charSequence;
    }

    public Iterator iterator() {
        return new LinesIterator(this.f41184a);
    }
}
