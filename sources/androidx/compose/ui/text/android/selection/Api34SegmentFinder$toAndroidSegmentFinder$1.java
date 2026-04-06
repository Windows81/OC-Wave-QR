package androidx.compose.ui.text.android.selection;

import android.text.SegmentFinder;
import kotlin.Metadata;

@Metadata
public final class Api34SegmentFinder$toAndroidSegmentFinder$1 extends SegmentFinder {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SegmentFinder f18604a;

    public Api34SegmentFinder$toAndroidSegmentFinder$1(SegmentFinder segmentFinder) {
        this.f18604a = segmentFinder;
    }

    public int nextEndBoundary(int i2) {
        return this.f18604a.d(i2);
    }

    public int nextStartBoundary(int i2) {
        return this.f18604a.a(i2);
    }

    public int previousEndBoundary(int i2) {
        return this.f18604a.b(i2);
    }

    public int previousStartBoundary(int i2) {
        return this.f18604a.c(i2);
    }
}
