package androidx.compose.ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VectorResources_androidKt {
    public static final ImageVectorCache.ImageVectorEntry a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i2) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, (DefaultConstructorMarker) null);
        ImageVector.Builder a2 = XmlVectorParser_androidKt.a(androidVectorParser, resources, theme, asAttributeSet);
        int i3 = 0;
        while (!XmlVectorParser_androidKt.d(xmlResourceParser)) {
            i3 = XmlVectorParser_androidKt.g(androidVectorParser, resources, asAttributeSet, theme, a2, i3);
            xmlResourceParser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(a2.f(), i2);
    }
}
