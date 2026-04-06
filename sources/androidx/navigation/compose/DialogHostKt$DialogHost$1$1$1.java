package androidx.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DialogHostKt$DialogHost$1$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22477A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f22478z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$1$1(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry) {
        super(0);
        this.f22478z = dialogNavigator;
        this.f22477A = navBackStackEntry;
    }

    public final void invoke() {
        this.f22478z.m(this.f22477A);
    }
}
