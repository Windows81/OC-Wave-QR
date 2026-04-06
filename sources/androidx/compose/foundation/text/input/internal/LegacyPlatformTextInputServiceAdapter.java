package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

@Metadata
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {

    /* renamed from: a  reason: collision with root package name */
    public LegacyPlatformTextInputNode f6238a;

    @Metadata
    public interface LegacyPlatformTextInputNode {
        Job C0(Function2 function2);

        LayoutCoordinates N();

        TextFieldSelectionManager W0();

        SoftwareKeyboardController getSoftwareKeyboardController();

        ViewConfiguration getViewConfiguration();

        LegacyTextFieldState h2();
    }

    public final void b() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f6238a;
        if (legacyPlatformTextInputNode != null && (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) != null) {
            softwareKeyboardController.b();
        }
    }

    public final void d() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f6238a;
        if (legacyPlatformTextInputNode != null && (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) != null) {
            softwareKeyboardController.a();
        }
    }

    public final LegacyPlatformTextInputNode i() {
        return this.f6238a;
    }

    public final void j(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.f6238a == null)) {
            InlineClassHelperKt.c("Expected textInputModifierNode to be null");
        }
        this.f6238a = legacyPlatformTextInputNode;
    }

    public abstract void k();

    public final void l(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.f6238a == legacyPlatformTextInputNode)) {
            InlineClassHelperKt.c("Expected textInputModifierNode to be " + legacyPlatformTextInputNode + " but was " + this.f6238a);
        }
        this.f6238a = null;
    }
}
