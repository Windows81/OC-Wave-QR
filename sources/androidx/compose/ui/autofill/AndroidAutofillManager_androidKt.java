package androidx.compose.ui.autofill;

import androidx.collection.MutableScatterMap;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.Metadata;

@Metadata
public final class AndroidAutofillManager_androidKt {
    public static final boolean d(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.q().b(SemanticsActions.f18056a.k());
    }

    public static final boolean e(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.q().b(SemanticsProperties.f18102a.e());
    }

    public static final boolean f(SemanticsConfiguration semanticsConfiguration) {
        if (!semanticsConfiguration.q().b(SemanticsActions.f18056a.k())) {
            MutableScatterMap q2 = semanticsConfiguration.q();
            SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
            return q2.b(semanticsProperties.e()) || semanticsConfiguration.q().b(semanticsProperties.c());
        }
    }
}
