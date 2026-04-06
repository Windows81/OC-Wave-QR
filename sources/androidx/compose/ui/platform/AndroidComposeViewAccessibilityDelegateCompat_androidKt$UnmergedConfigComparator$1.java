package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1 extends Lambda implements Function2<SemanticsNode, SemanticsNode, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1 f17576z = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1();

    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1() {
        super(2);
    }

    /* renamed from: b */
    public final Integer m(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        return Integer.valueOf(Float.compare(((Number) w2.o(semanticsProperties.L(), AnonymousClass1.f17577z)).floatValue(), ((Number) semanticsNode2.w().o(semanticsProperties.L(), AnonymousClass2.f17578z)).floatValue()));
    }
}
