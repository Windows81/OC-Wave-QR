package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowInsetsHolder f4241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4242b;

    public WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1(WindowInsetsHolder windowInsetsHolder, View view) {
        this.f4241a = windowInsetsHolder;
        this.f4242b = view;
    }

    public void d() {
        this.f4241a.b(this.f4242b);
    }
}
