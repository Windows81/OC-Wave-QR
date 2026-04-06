package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class TextLinkScope$shapeForRange$1$1 implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Path f6004a;

    public TextLinkScope$shapeForRange$1$1(Path path) {
        this.f6004a = path;
    }

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        return new Outline.Generic(this.f6004a);
    }
}
