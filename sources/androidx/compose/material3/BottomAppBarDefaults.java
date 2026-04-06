package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.DockedToolbarTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class BottomAppBarDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final BottomAppBarDefaults f9254a = new BottomAppBarDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9255b = Dp.m((float) 0);

    /* renamed from: c  reason: collision with root package name */
    public static final PaddingValues f9256c = PaddingKt.e(AppBarKt.f9182a, AppBarKt.O(), AppBarKt.f9182a, 0.0f, 8, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final PaddingValues f9257d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f9258e;

    /* renamed from: f  reason: collision with root package name */
    public static final Arrangement.Horizontal f9259f;

    /* renamed from: g  reason: collision with root package name */
    public static final Arrangement.Horizontal f9260g;

    static {
        DockedToolbarTokens dockedToolbarTokens = DockedToolbarTokens.f13054a;
        f9257d = PaddingKt.e(dockedToolbarTokens.b(), 0.0f, dockedToolbarTokens.d(), 0.0f, 10, (Object) null);
        f9258e = dockedToolbarTokens.a();
        Arrangement arrangement = Arrangement.f3739a;
        f9259f = arrangement.d();
        f9260g = arrangement.o(dockedToolbarTokens.c(), Alignment.f15444a.g());
    }
}
