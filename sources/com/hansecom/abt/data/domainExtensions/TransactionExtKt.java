package com.hansecom.abt.data.domainExtensions;

import com.hansecom.abt.util.DateParser;
import com.hansecom.mapi.models.Transaction;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransactionExtKt {
    public static final ZonedDateTime a(Transaction transaction) {
        Intrinsics.i(transaction, "<this>");
        ZonedDateTime a2 = DateParser.f39003a.a(transaction.e());
        if (a2 != null) {
            return a2.withZoneSameInstant(ZoneId.systemDefault());
        }
        return null;
    }
}
