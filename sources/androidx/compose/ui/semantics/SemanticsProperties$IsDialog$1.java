package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SemanticsProperties$IsDialog$1 extends Lambda implements Function2<Unit, Unit, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final SemanticsProperties$IsDialog$1 f18133z = new SemanticsProperties$IsDialog$1();

    public SemanticsProperties$IsDialog$1() {
        super(2);
    }

    /* renamed from: b */
    public final Unit m(Unit unit, Unit unit2) {
        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
    }
}
