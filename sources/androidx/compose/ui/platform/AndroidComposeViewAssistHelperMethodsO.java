package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import kotlin.Metadata;

@Metadata
final class AndroidComposeViewAssistHelperMethodsO {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewAssistHelperMethodsO f17582a = new AndroidComposeViewAssistHelperMethodsO();

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
