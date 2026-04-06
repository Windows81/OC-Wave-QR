package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SingleRowTopAppBarOverrideScope {

    /* renamed from: a  reason: collision with root package name */
    public final Modifier f11032a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f11033b;

    /* renamed from: c  reason: collision with root package name */
    public final TextStyle f11034c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f11035d;

    /* renamed from: e  reason: collision with root package name */
    public final TextStyle f11036e;

    /* renamed from: f  reason: collision with root package name */
    public final Alignment.Horizontal f11037f;

    /* renamed from: g  reason: collision with root package name */
    public final Function2 f11038g;

    /* renamed from: h  reason: collision with root package name */
    public final Function3 f11039h;

    /* renamed from: i  reason: collision with root package name */
    public final float f11040i;

    /* renamed from: j  reason: collision with root package name */
    public final WindowInsets f11041j;

    /* renamed from: k  reason: collision with root package name */
    public final TopAppBarColors f11042k;

    /* renamed from: l  reason: collision with root package name */
    public final TopAppBarScrollBehavior f11043l;

    public /* synthetic */ SingleRowTopAppBarOverrideScope(Modifier modifier, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Alignment.Horizontal horizontal, Function2 function23, Function3 function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, function2, textStyle, function22, textStyle2, horizontal, function23, function3, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }

    public final Function3 a() {
        return this.f11039h;
    }

    public final TopAppBarColors b() {
        return this.f11042k;
    }

    public final float c() {
        return this.f11040i;
    }

    public final Modifier d() {
        return this.f11032a;
    }

    public final Function2 e() {
        return this.f11038g;
    }

    public final TopAppBarScrollBehavior f() {
        return this.f11043l;
    }

    public final Function2 g() {
        return this.f11035d;
    }

    public final TextStyle h() {
        return this.f11036e;
    }

    public final Function2 i() {
        return this.f11033b;
    }

    public final Alignment.Horizontal j() {
        return this.f11037f;
    }

    public final TextStyle k() {
        return this.f11034c;
    }

    public final WindowInsets l() {
        return this.f11041j;
    }

    public SingleRowTopAppBarOverrideScope(Modifier modifier, Function2 function2, TextStyle textStyle, Function2 function22, TextStyle textStyle2, Alignment.Horizontal horizontal, Function2 function23, Function3 function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.f11032a = modifier;
        this.f11033b = function2;
        this.f11034c = textStyle;
        this.f11035d = function22;
        this.f11036e = textStyle2;
        this.f11037f = horizontal;
        this.f11038g = function23;
        this.f11039h = function3;
        this.f11040i = f2;
        this.f11041j = windowInsets;
        this.f11042k = topAppBarColors;
        this.f11043l = topAppBarScrollBehavior;
    }
}
