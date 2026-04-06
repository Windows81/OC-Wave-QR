package androidx.compose.ui.text;

import android.text.Editable;
import android.text.Html;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

@Metadata
public final class Html_androidKt$TagHandler$1 implements Html.TagHandler {
    public void handleTag(boolean z2, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader != null && editable != null && z2 && Intrinsics.d(str, "ContentHandlerReplacementTag")) {
            xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
        }
    }
}
