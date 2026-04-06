package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

@Metadata
public interface Selectable {
    LayoutCoordinates N();

    AnnotatedString b();

    Rect d(int i2);

    float e(int i2);

    float f(int i2);

    float h(int i2);

    int i();

    float j(int i2);

    long k();

    Selection l();

    void m(SelectionLayoutBuilder selectionLayoutBuilder);

    long n(int i2);

    long o(Selection selection, boolean z2);
}
