package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata
final class LinesSequence implements Sequence<String> {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f40797a;

    public Iterator iterator() {
        return new LinesSequence$iterator$1(this);
    }
}
