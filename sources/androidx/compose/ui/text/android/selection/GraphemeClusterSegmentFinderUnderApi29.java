package androidx.compose.ui.text.android.selection;

import java.text.BreakIterator;
import kotlin.Metadata;

@Metadata
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18607a;

    /* renamed from: b  reason: collision with root package name */
    public final BreakIterator f18608b;

    public GraphemeClusterSegmentFinderUnderApi29(CharSequence charSequence) {
        this.f18607a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f18608b = characterInstance;
    }

    public int e(int i2) {
        return this.f18608b.following(i2);
    }

    public int f(int i2) {
        return this.f18608b.preceding(i2);
    }
}
