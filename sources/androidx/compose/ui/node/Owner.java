package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public interface Owner extends PositionCalculator {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f17427i = Companion.f17428a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f17428a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static boolean f17429b;

        public final boolean a() {
            return f17429b;
        }
    }

    @Metadata
    public interface OnLayoutCompletedListener {
        void c();
    }

    static /* synthetic */ void O(Owner owner, LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            if ((i2 & 8) != 0) {
                z4 = true;
            }
            owner.r(layoutNode, z2, z3, z4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    static /* synthetic */ void d(Owner owner, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            owner.b(z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    static /* synthetic */ void i(Owner owner, LayoutNode layoutNode, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            owner.h(layoutNode, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    static /* synthetic */ OwnedLayer v(Owner owner, Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                graphicsLayer = null;
            }
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            return owner.H(function2, function0, graphicsLayer, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
    }

    static /* synthetic */ void x(Owner owner, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            owner.u(layoutNode, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    void A(LayoutNode layoutNode);

    void E(LayoutNode layoutNode);

    void F(Function0 function0);

    void G(OnLayoutCompletedListener onLayoutCompletedListener);

    OwnedLayer H(Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, boolean z2);

    void I(LayoutNode layoutNode);

    void J();

    void K();

    void L(LayoutNode layoutNode);

    void M() {
    }

    Object P(Function2 function2, Continuation continuation);

    void b(boolean z2);

    void e(LayoutNode layoutNode, long j2);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillManager getAutofillManager();

    AutofillTree getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    CoroutineContext getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.b(this);
    }

    PointerIconService getPointerIconService();

    RectManager getRectManager();

    LayoutNode getRoot();

    SemanticsOwner getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void h(LayoutNode layoutNode, boolean z2, boolean z3);

    long m(long j2);

    void n(LayoutNode layoutNode);

    void o(LayoutNode layoutNode, int i2) {
    }

    long p(long j2);

    void q(LayoutNode layoutNode, int i2) {
    }

    void r(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4);

    void s(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z2);

    void t(View view);

    void u(LayoutNode layoutNode, boolean z2);

    void y() {
    }

    void z(LayoutNode layoutNode);
}
