package androidx.compose.ui.modifier;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class ModifierLocal<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f17182a;

    public /* synthetic */ ModifierLocal(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public final Function0 a() {
        return this.f17182a;
    }

    public ModifierLocal(Function0 function0) {
        this.f17182a = function0;
    }
}
