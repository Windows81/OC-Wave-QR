package com.hansecom.abt.data.useCases.lock;

import com.hansecom.abt.data.preferences.LockPreferences;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata
public final class ResetUnlockEndDateTimeUseCase {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f33978b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f33979c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final LockPreferences f33980a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ResetUnlockEndDateTimeUseCase(LockPreferences lockPreferences) {
        Intrinsics.i(lockPreferences, "lockPreferences");
        this.f33980a = lockPreferences;
    }

    public final Object a(Continuation continuation) {
        LocalDateTime plus = LocalDateTime.now().plus(30, ChronoUnit.SECONDS);
        Timber.Tree p2 = Timber.f44337a.p("LOCK");
        LocalTime localTime = plus.toLocalTime();
        p2.a("New endtime " + localTime, new Object[0]);
        Object i2 = this.f33980a.i(plus, continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }
}
