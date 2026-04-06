package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ResourceIdCache {

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntObjectMap f17995a = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);

    public final void a() {
        synchronized (this) {
            this.f17995a.g();
            Unit unit = Unit.f40552a;
        }
    }

    public final TypedValue b(Resources resources, int i2) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = (TypedValue) this.f17995a.b(i2);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                this.f17995a.n(i2, typedValue);
            }
        }
        return typedValue;
    }
}
