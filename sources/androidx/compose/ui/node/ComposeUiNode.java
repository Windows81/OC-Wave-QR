package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public interface ComposeUiNode {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f17222h = Companion.f17223a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f17223a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final Function0 f17224b = LayoutNode.r0.a();

        /* renamed from: c  reason: collision with root package name */
        public static final Function0 f17225c = ComposeUiNode$Companion$VirtualConstructor$1.f17240z;

        /* renamed from: d  reason: collision with root package name */
        public static final Function2 f17226d = ComposeUiNode$Companion$SetModifier$1.f17237z;

        /* renamed from: e  reason: collision with root package name */
        public static final Function2 f17227e = ComposeUiNode$Companion$SetDensity$1.f17234z;

        /* renamed from: f  reason: collision with root package name */
        public static final Function2 f17228f = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.f17238z;

        /* renamed from: g  reason: collision with root package name */
        public static final Function2 f17229g = ComposeUiNode$Companion$SetMeasurePolicy$1.f17236z;

        /* renamed from: h  reason: collision with root package name */
        public static final Function2 f17230h = ComposeUiNode$Companion$SetLayoutDirection$1.f17235z;

        /* renamed from: i  reason: collision with root package name */
        public static final Function2 f17231i = ComposeUiNode$Companion$SetViewConfiguration$1.f17239z;

        /* renamed from: j  reason: collision with root package name */
        public static final Function2 f17232j = ComposeUiNode$Companion$SetCompositeKeyHash$1.f17233z;

        public final Function0 a() {
            return f17224b;
        }

        public final Function2 b() {
            return f17232j;
        }

        public final Function2 c() {
            return f17229g;
        }

        public final Function2 d() {
            return f17226d;
        }

        public final Function2 e() {
            return f17228f;
        }

        public final Function0 f() {
            return f17225c;
        }
    }

    void a(Density density);

    void d(LayoutDirection layoutDirection);

    void e(MeasurePolicy measurePolicy);

    void f(int i2);

    void h(Modifier modifier);

    void k(ViewConfiguration viewConfiguration);

    void l(CompositionLocalMap compositionLocalMap);
}
