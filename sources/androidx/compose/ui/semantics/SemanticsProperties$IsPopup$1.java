package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SemanticsProperties$IsPopup$1 extends Lambda implements Function2<Unit, Unit, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final SemanticsProperties$IsPopup$1 f18134z = new SemanticsProperties$IsPopup$1();

    public SemanticsProperties$IsPopup$1() {
        super(2);
    }

    /* renamed from: b */
    public final Unit m(Unit unit, Unit unit2) {
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
