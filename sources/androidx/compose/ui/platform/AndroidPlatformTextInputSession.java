package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, CoroutineScope {

    /* renamed from: A  reason: collision with root package name */
    public final TextInputService f17626A;

    /* renamed from: B  reason: collision with root package name */
    public final CoroutineScope f17627B;
    public final AtomicReference C = SessionMutex.a();

    /* renamed from: z  reason: collision with root package name */
    public final View f17628z;

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, CoroutineScope coroutineScope) {
        this.f17628z = view;
        this.f17626A = textInputService;
        this.f17627B = coroutineScope;
    }

    public final InputConnection c(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.d(this.C);
        if (inputMethodSession != null) {
            return inputMethodSession.c(editorInfo);
        }
        return null;
    }

    public final boolean d() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.d(this.C);
        return inputMethodSession != null && inputMethodSession.e();
    }

    public CoroutineContext getCoroutineContext() {
        return this.f17627B.getCoroutineContext();
    }

    public View r() {
        return this.f17628z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object s(androidx.compose.ui.platform.PlatformTextInputMethodRequest r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            kotlin.ResultKt.b(r7)
            goto L_0x004a
        L_0x0031:
            kotlin.ResultKt.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.C
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r5, r4)
            r0.E = r3
            java.lang.Object r6 = androidx.compose.ui.SessionMutex.h(r7, r2, r6, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.s(androidx.compose.ui.platform.PlatformTextInputMethodRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
