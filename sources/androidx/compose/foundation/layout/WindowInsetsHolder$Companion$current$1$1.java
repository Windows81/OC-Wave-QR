package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsHolder$Companion$current$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f4243A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsetsHolder f4244z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsHolder$Companion$current$1$1(WindowInsetsHolder windowInsetsHolder, View view) {
        super(1);
        this.f4244z = windowInsetsHolder;
        this.f4243A = view;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f4244z.p(this.f4243A);
        return new WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1(this.f4244z, this.f4243A);
    }
}
