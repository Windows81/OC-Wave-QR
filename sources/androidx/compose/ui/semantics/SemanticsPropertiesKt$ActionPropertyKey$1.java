package androidx.compose.ui.semantics;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements Function2<AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>> {

    /* renamed from: z  reason: collision with root package name */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f18146z = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    /* renamed from: b */
    public final AccessibilityAction m(AccessibilityAction accessibilityAction, AccessibilityAction accessibilityAction2) {
        String str;
        Function function;
        if (accessibilityAction == null || (str = accessibilityAction.b()) == null) {
            str = accessibilityAction2.b();
        }
        if (accessibilityAction == null || (function = accessibilityAction.a()) == null) {
            function = accessibilityAction2.a();
        }
        return new AccessibilityAction(str, function);
    }
}
